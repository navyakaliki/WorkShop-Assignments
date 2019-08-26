import java.io.*;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the File name");
      try {
            FileReader fileInput= new FileReader(scanner.nextLine());
            BufferedReader buffInput= new BufferedReader((fileInput));
            String linesinFile=buffInput.readLine();
            while (linesinFile!=null){
                System.out.println(linesinFile);
                linesinFile=buffInput.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("invalid file name");
        } catch (IOException e) {
            System.out.println("something went wrong");
        }
    }
    }

