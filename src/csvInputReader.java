import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class csvInputReader{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the File name");
            try {
                FileInputStream fileInput= new FileInputStream(scanner.nextLine());
                Scanner filescanner=new Scanner(fileInput);
                ArrayList<String[]> fileArray= new ArrayList<>();
                String linesinFile=null;
                while (filescanner.hasNext()){
                   linesinFile=filescanner.nextLine();
                   fileArray.add(linesinFile.split(","));
                }
                fileArray.forEach(cells->{
                    for(String cell:cells) {
                        System.out.println(cell + " ");
                    }
                    System.out.println();
                });
            } catch (FileNotFoundException e) {
                System.out.println("invalid file name");
            }
        }
    }

