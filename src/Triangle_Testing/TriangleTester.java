package Triangle_Testing;

import Triangle_Testing.Triangle;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TriangleTester {
    public static void main(String args[])
    {
        String Line;
        Scanner streamReader;
        try
        {
            streamReader = new Scanner("test.txt");
            while(streamReader.hasNext())
            {
                Line = streamReader.nextLine();

            }
        }
        catch(Exception ex)
        {
            System.out.printf("Ошибка чтения файла:%s\n", ex);
        }
    }
}
