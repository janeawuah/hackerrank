package main.com.hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HackFunctions {


    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> brokenRecords = new ArrayList<>();
        int minimumScore = scores.get(0);
        int maximumScore = scores.get(0);
        int minCounter = 0;
        int maxCounter = 0;

        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > maximumScore) {
                maxCounter += 1;
                maximumScore = scores.get(i);
            }
            if (scores.get(i) < minimumScore) {
                minCounter += 1;
                minimumScore = scores.get(i);
            }
        }
        brokenRecords.add(maxCounter);
        brokenRecords.add(minCounter);

        return brokenRecords;
    }


    //day 3
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int numOfDivisiblePairs = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (((ar.get(i) + ar.get(j)) % k) == 0) {
                    System.out.println(ar.get(i) + ar.get(j));
                    numOfDivisiblePairs = numOfDivisiblePairs + 1;
                }
            }
        }
        return numOfDivisiblePairs;
    }


    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here

        List <Integer> numberOfMatchedStrings = new ArrayList<>();
        for(int i=0;i< queries.size();i++)
        {
            int numOfOccurrence = 0;
            for(int j=0;j< strings.size();j++)
            {
                if((queries.get(i)).equals(strings.get(j)))
                {
                    numOfOccurrence= numOfOccurrence+1;
                }
            }
            numberOfMatchedStrings.add(numOfOccurrence);
            System.out.println(numOfOccurrence);
        }

        return numberOfMatchedStrings;

    }


    public static int findMedian(List<Integer> arr) {
        // Write your code here
        int median =0;
        int listSize = arr.size();
        int halfSize = listSize/2;

        arr.sort(Comparator.naturalOrder());
        System.out.println(arr);

        if(listSize%2 ==0)
        {
            median = (arr.get(halfSize) + arr.get(halfSize-1))/2;
        }
        else{
            median = arr.get(halfSize);
        }

        return median;

    }


    public static int lonelyinteger(List<Integer> arr) {
        // Write your code here
        int lonelyNum = 0;
        for(int num: arr)
        {
            lonelyNum = lonelyNum ^ num;
        }
        return lonelyNum;

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int absDifferrence = 0;
        int counter = arr.size()-1;
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;

        for(int i = 0 ; i< arr.size();i++){
            sumDiagonal1+=arr.get(i).get(i);
            sumDiagonal2+=arr.get(i).get(counter);
            counter-=1;
        }

        absDifferrence= Math.abs(sumDiagonal1-sumDiagonal2);
        //System.out.println(absDifferrence);
        return absDifferrence;

    }


    public static void staircase(int n) {
        // Write your code here
        for(int i=1;i<n+1;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }

            for(int k=0;k<i;k++){
                System.out.print("#");
            }

            System.out.println("");
        }



    }


    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long maxSum =0 ;
        long minSum = 0;
        arr.sort(Comparator.naturalOrder());

        for (int i = 1; i < arr.size(); i++) {
            maxSum+=arr.get(i);
        }

        for (int i = 0; i < arr.size()-1; i++) {
            minSum+=arr.get(i);
        }

        System.out.println(minSum + " " + maxSum);

    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        float positiveTotal = 0;
        float negativeTotal = 0;
        float zeroTotal = 0;

        float numTotal = arr.size();

        for (Integer integer : arr) {
            if(integer > 0){
                positiveTotal+=1;
            }else if(integer < 0)
            {
                negativeTotal+=1;
            }else{
                zeroTotal+=1;
            }
        }



        System.out.format("%.5f",positiveTotal/numTotal);
        System.out.println(" ");
        System.out.format("%.5f",negativeTotal/numTotal);
        System.out.println(" ");
        System.out.format("%.5f",zeroTotal/numTotal);


    }

    public static String timeConversion(String s) {
        // Write your code here

        StringBuilder militaryTime= new StringBuilder();
        String [] numbers = s.split(":");
        String meridiem = s.substring(8,10);
        System.out.println(meridiem);
        int hours = Integer.parseInt(numbers[0]);

        if(meridiem.equals("PM") && hours == 12){
            militaryTime.append(s.substring(0, 8));
        }
        else if(hours==12){
            militaryTime.append("00");
            militaryTime.append(s.substring(2,8));
        }else if(meridiem.equals("AM")){
            militaryTime.append(s.substring(0, 8));
        }
        else{
            militaryTime.append(hours+12);
            militaryTime.append(s.substring(2,8));
        }
        ;


        return militaryTime.toString();

    }




    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        List<Integer> newGrades = new ArrayList<>();
        for(Integer integer: grades){
            if((integer>=38)&& (5-(integer%5)<3)){
                newGrades.add(integer +(5-(integer%5)));
                System.out.println(integer +(5-(integer%5)));
            }
            else{
                newGrades.add(integer);
                System.out.println(integer);
            }
        }

        return newGrades;



    }



    public static int countingValleys(int steps, String path) {
        // Write your code here
        int numOfValleys = 0;
        int currentLevel = 0;

        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'U') {
                currentLevel = currentLevel +1;

                if(currentLevel == 0){
                    numOfValleys = numOfValleys + 1;
                }
            } else{
                currentLevel = currentLevel - 1;
            }

        }



        return numOfValleys;
    }


    public static void countApplesAndOranges(int s, int t, int appleTree, int orangeTree, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        long applesOnRoof = 0;
        long orangesOnRoof = 0;
        int positionApple = 0;
        int positionOrange  = 0;

        for (int apple : apples) {
            positionApple = appleTree + apple;
            if(positionApple >= s && positionApple <= t){
                applesOnRoof++;
            }
        }
        System.out.println(applesOnRoof);


        for (int orange : oranges) {
            positionOrange = orangeTree + orange;
            if(positionOrange >= s && positionOrange <= t){
                orangesOnRoof = orangesOnRoof + 1;
            }
        }
        System.out.println(orangesOnRoof);

    }




    // arr.sort(Comparator.naturalOrder());
    // System.out.println(arr);

    // if(listSize == 1)
    // {
    //     lonelyNum = arr.get(0);
    // }else{
    //        for (int i = 1; i < listSize; i++) {
    //              if((arr.get(i)!=arr.get(i-1))) {
    //                 lonelyNum = arr.get(i);
    //                 System.out.println(lonelyNum);
    //      }
    //     }
    // }




}