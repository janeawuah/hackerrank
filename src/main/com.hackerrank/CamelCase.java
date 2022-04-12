package main.com.hackerrank;

import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner readIn = new Scanner(System.in);
        String eachLine = readIn.nextLine();



        while(eachLine!=null)
        {
            String splitBySemiColon[] = eachLine.split(";");
            String splitBySpace[] = splitBySemiColon[2].split(" ");
            StringBuilder newLine = new StringBuilder();

            if(splitBySemiColon[0].equals("S"))
            {
                //split
                newLine.append(Character.toLowerCase(splitBySemiColon[2].charAt(0)));
                for (int i = 1; i < splitBySemiColon[2].length(); i++) {
                    if((Character.compare(splitBySemiColon[2].charAt(i),'(')==0)|| (Character.compare(splitBySemiColon[2].charAt(i),')')==0))
                    {

                    }
                    else{
                        if(Character.isUpperCase(splitBySemiColon[2].charAt(i))){
                            newLine.append(" ");
                            newLine.append(Character.toLowerCase(splitBySemiColon[2].charAt(i)));

                        }
                        else{
                            newLine.append(splitBySemiColon[2].charAt(i));
                        }

                    }

                }

            }
            else{
                // combine
                if(splitBySemiColon[1].equals("M")){
                    newLine.append(splitBySpace[0].substring(0,1).toLowerCase());
                    newLine.append(splitBySpace[0].substring(1,splitBySpace[0].length()).toLowerCase());
                    for (int i = 1; i < splitBySpace.length; i++) {
                        newLine.append(splitBySpace[i].substring(0,1).toUpperCase());
                        newLine.append(splitBySpace[i].substring(1,splitBySpace[i].length()).toLowerCase());
                    }
                    newLine.append("()");
                }else if(splitBySemiColon[1].equals("V")){
                    newLine.append(splitBySpace[0].substring(0,1).toLowerCase());
                    newLine.append(splitBySpace[0].substring(1,splitBySpace[0].length()).toLowerCase());
                    for (int i = 1; i < splitBySpace.length; i++) {
                        newLine.append(splitBySpace[i].substring(0,1).toUpperCase());
                        newLine.append(splitBySpace[i].substring(1,splitBySpace[i].length()).toLowerCase());
                    }
                }else{
                    newLine.append(splitBySpace[0].substring(0,1).toUpperCase());
                    newLine.append(splitBySpace[0].substring(1,splitBySpace[0].length()).toLowerCase());
                    for (int i = 1; i < splitBySpace.length; i++) {
                        newLine.append(splitBySpace[i].substring(0,1).toUpperCase());
                        newLine.append(splitBySpace[i].substring(1,splitBySpace[i].length()).toLowerCase());
                    }
                }
            }
            System.out.println(newLine.toString());
            if(readIn.hasNextLine())
            {
                eachLine = readIn.nextLine();
            }
            else{
                eachLine=null;
            }

        }

    }


    /* to test
    * Sample Input
S;M;plasticCup()
C;V;mobile phone
C;C;coffee machine
S;C;LargeSoftwareBook
C;M;white sheet of paper
S;V;pictureFrame
Sample Output
plastic cup
mobilePhone
CoffeeMachine
large software book
whiteSheetOfPaper()
picture frame*/


}

