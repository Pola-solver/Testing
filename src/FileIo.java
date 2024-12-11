import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIo {
public static void main (String [] args){

    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Heloow w are in deep shittt ");
        writer.close();

    }catch (IOException e){
        e.printStackTrace();
    }



 }

}
