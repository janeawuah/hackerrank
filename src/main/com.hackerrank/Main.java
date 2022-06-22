package main.com.hackerrank;


import org.w3c.dom.ls.LSOutput;

import java.text.NumberFormat;
import java.util.Locale;
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



        ///formatting curency
        double payment = 12324.134;

        Locale locale = new Locale ("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(locale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);



        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));


        //series
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            double total = a + (Math.pow(2,0) *b);
            System.out.print((int )total);


            for(int j = 1; j < n; j++){
                System.out.print(" ");
                total += Math.pow(2,j) *b;
                System.out.print((int )total);

            }

            System.out.println("");
        }
        in.close();

    }

    public static int superDigit(String n, int k) {

        int superSum = stringSum(n) * k;

        if(superSum>9){
            superSum = stringSum(String.valueOf(superSum));
        }


        return superSum;

    }

    public static int stringSum(String num){
        if(num.length() == 1){
            return Integer.parseInt(num);
        }
        else{
            int sum = 0;
            for (int i = 0; i < num.length(); i++) {
                sum+= Integer.parseInt(String.valueOf(num.charAt(i)));
            }

            return stringSum(String.valueOf(sum));
        }
    }
    
    

}

