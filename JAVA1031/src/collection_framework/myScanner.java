package collection_framework;

import java.util.Scanner;

public class myScanner
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
 
        int i = 0;
 
        while(scanner.hasNextInt())
        {
            int num = scanner.nextInt();
            i += num;
        }
 
        System.out.println("total : " + i);
    }
}
