package Exercise16;

import java.io.File;
import java.util.Scanner;

//how to open a file in java. There are following ways to open a file in java
//Java desktop class, Java FileInputStream class, Java BufferedReader class, Java FileReader class
//Java Scanner class, Java nio package
//Below is an example of Java Scanner class
public class Example1 {

    public static void main(String[] args) {

        try{
            File file = new File("C:\\input.txt");
            Scanner sc = new Scanner(file);//file to be scanned
            while(sc.hasNextLine())
                System.out.print(sc.nextLine());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
