import java.awt.*;
import java.io.File;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static java.lang.Math.pow;

class mariakahyana
{



}
public class Main {
    public static void main(String[] args) {
        MoviesFiles.ReadFromFile("MoviesData.txt");
        MoviesFiles.search();
        //  String inputFilePath = "movies.txt";
        //  String outputFilePath = "movies_output.txt";
        String in  ="users.txt";
        String out = "SavedUsers.txt";
       /* List<Movie>movies = Files.read(inputFilePath);
        for(Movie m:movies){
            if(m.getTitle().startsWith("F")){
                System.out.println(m.getTitle());
            }
        }
        Files.write(outputFilePath , movies);
        //String Date = new String("2024-12-03");
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       // LocalDate localDate = LocalDate.parse(Date , formatter);
        // System.out.println( localDate.getMonth());
        List<User>users = Files.readUsers(in);
        for(User u:users){
            if(u.getUserName().startsWith("j")){
                System.out.println(u.getUserName());
            }
        }
        Files.writeUsers(out , users);
*/


    }
}
