import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoviesFiles {
    public static List<Movie> movies = new ArrayList();

    public static double stringTodouble(String s)
    {
        int integerPart = s.charAt(0)-'0';
        int i = 1;
        for(;i<s.length()&&s.charAt(i)!='.';i++) {
            int k = s.charAt(i) - '0';
            integerPart = integerPart * 10 + k;
        }
        double decimalPart = 0;
        if(i+1<s.length()) {
            {
                decimalPart = s.charAt(i+1)-'0';
                return decimalPart/10+integerPart;
            }
        }
        return decimalPart+integerPart;
    }


    public static List<Movie> ReadFromFile(String FilePath)
    {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(FilePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String []arr = new String[12];
        String build = "";
        int idx;

        while(line != null)
        {
            idx=0;
            for(int i = 0; i < line.length(); i++)
            {
                if(line.charAt(i)!= ',')
                {
                    build+=line.charAt(i);
                }
                else {
                    arr[idx] = build;
                    build = "";
                    idx++;
                }
            }
            arr[idx] = build;
            build = "";

            movies.add(new Movie(arr[0], arr[1], arr[2], arr[3], stringTodouble(arr[4]), arr[5], arr[6], arr[7], arr[8], arr[9], stringTodouble(arr[10]), stringTodouble(arr[11])));
            try {
                line = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return movies;
    }


    public static void search()
    {
        char x='1';
        Scanner scan = new Scanner(System.in);
        String h ="";
        while(x!='2')
        {
            x = scan.next().charAt(0);
            x=Character.toLowerCase(x);
            h+=x;
            for(Movie m:movies)
            {
                String t = m.getTitle();
                t= t.toLowerCase();
                if(t.startsWith(h))
                    System.out.println((m.getTitle()));
            }
        }
    }

}
