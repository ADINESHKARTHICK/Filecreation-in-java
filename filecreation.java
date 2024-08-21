import java.io.File;
import java.io.IOException;

public class Createfile {
        public static void main(String[] args) {
        try {
            File myObj = new File("Google.txt");
            
            // Attempt to create the file
            if (myObj.createNewFile()) {
                System.out.println("File is created successfully: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
