package Exception_Handle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String line = br.readLine();
        System.out.println(line);
        br.close();
    }
}