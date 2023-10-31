package collection_framework;

import java.util.Scanner;

public class myScanner
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d\n%d\n%d\n%d\n",a+b,a-b,a*b,a/b);
        
       
    }
}
