/*
*
* import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Files {
    public static List<Movie> read(String filePath) {
        List<Movie> movies = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read each line from the file
            while ((line = br.readLine()) != null) {
                // Skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] movieData = line.split(",");
                // Validate line structure
                if (movieData.length < 3) {
                    System.err.println("Skipping malformed line: " + line);
                    continue;
                }

                try {
                    // Parse data fields
                    int movieID = Integer.parseInt(movieData[0].trim());
                    String title = movieData[1].trim();
                    String releaseDate = movieData[2].trim();

                    // Create a new Movie object and add it to the list
                    movies.add(new Movie(movieID, title, releaseDate));
                } catch (NumberFormatException e) {
                    System.err.println("Skipping line due to number format issue: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return movies;
    }


    // Method to write movies to a file
    public static void write(String filePath, List<Movie> movies) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Movie movie : movies) {
                // Write each movie's details in the same format
                bw.write(movie.getMovieID() + "," + movie.getTitle() + "," + movie.getReleaseDate());
                bw.newLine();
            }
            System.out.println("Movies have been successfully written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }


    public static List<User> readUsers(String filePath) {
        List<User> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;

            // Read each line from the file
            while ((line = br.readLine()) != null) {
                lineNumber++;
                String[] userData = line.split(",");

                // Validate the number of fields in the line
                if (userData.length < 7) {
                    System.err.println("Skipping malformed line " + lineNumber + ": " + line);
                    continue; // Skip to the next line
                }

                try {
                    // Parse data fields
                    String username = userData[0];
                    String password = userData[1];
                    int userId = Integer.parseInt(userData[2]);
                    String firstName = userData[3];
                    String lastName = userData[4];
                    String gender = userData[5];

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate subscriptionEndDate = LocalDate.parse(userData[6], formatter);

                    // Create a new User object and add it to the list
                    users.add(new User(username, password, userId, firstName, lastName, gender, subscriptionEndDate));
                } catch (Exception e) {
                    System.err.println("Error parsing line " + lineNumber + ": " + line + " - " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return users;
    }


    // Method to write users to a file
    public static void writeUsers(String filePath, List<User> users) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (User user : users) {

                // Write each user's details in the same format
                bw.write(user.getUserName() + "," + user.account.getPassword() + "," + user.getUserId() + "," +
                        user.getFirstName() + "," + user.getLastName() + "," + user.getGender() + "," +
                        "," + user.subscription.toString());
                bw.newLine();
            }
            System.out.println("Users have been successfully written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}




* */