import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

    public class InputReadArrayList {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the File name");
            try {
                FileInputStream fileInput= new FileInputStream(scanner.nextLine());
                Scanner filescanner=new Scanner(fileInput);
                ArrayList<String> fileArray= new ArrayList<>();
                String linesinFile=null;

                while (filescanner.hasNext()){
                   linesinFile=filescanner.nextLine();
                   fileArray.add(linesinFile);
                }
            } catch (FileNotFoundException e) {
                System.out.println("invalid file name");
            }
        }
    }

