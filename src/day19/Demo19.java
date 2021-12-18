package day19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Demo19
{
    public static void main(String[] args) throws IOException
    {
        System.setIn(new FileInputStream("Demo.java"));
        System.setOut(new PrintStream("Demo.txt"));
    }
}
