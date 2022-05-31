package main.com.hackerrank;


import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
//        HackFunctions hackfuns = new HackFunctions();

//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d  = scan.nextDouble();
//        scan.nextLine();
//        String s = scan.nextLine();
//        // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//        scan.close();


        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1,x);
        }
        System.out.println("================================");



    }
}
