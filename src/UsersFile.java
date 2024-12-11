import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsersFile {
    public static List<User> users = new ArrayList();

    public static List<User> ReadFromFile(String FilePath)
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
        String []arr = new String[10];
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
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate subscriptionEndDate = LocalDate.parse(arr[6], formatter);
            build = "";
            users.add(new User(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], subscriptionEndDate ,arr[7] ,arr[8] , arr[9]));
            try {
                line = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return users;
    }


    public static void search()
    {
        char x;
        Scanner scan = new Scanner(System.in);
        x = scan.next().charAt(0);
        String h ="";
        h+=x;
        for(User user:users)
        {
            if(user.getFirstName().startsWith(h))
                System.out.println(user.getFirstName());
        }
    }
}