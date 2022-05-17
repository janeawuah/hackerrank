package main.com.hackerrank;

import java.math.BigInteger;
import java.util.*;

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



    public static int findDigits(int n) {
        // Write your code here

        int numDivisible = 0;
        int numToEdit = n;
        while(numToEdit > 0){
            if(numToEdit % 10 != 0 && n % (numToEdit % 10) == 0){
                numDivisible++;
            }
            numToEdit = numToEdit / 10;
        }
        return numDivisible;

    }


    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger factorial = new BigInteger("1");

        for(int i = 2;i<=n; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);

    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        int fine;
        if(d1 <= d2 && m1 <= m2 && y1 <= y2){
            fine = 0;
            System.out.println("first condition");
        }

        else if(d1 > d2 && m1 == m2 && y1 == y2){
            fine = 15 * (d1 - d2);
            System.out.println("second condition " + fine);
        }
        else if(m1 > m2 && y1 == y2){
            fine = 500 * (m1 - m2);
            System.out.println("third condition");
        }
        else if (y1 > y2){
            fine = 10000;
            System.out.println("last condition");
        }else{
            fine = 0;
        }

        return fine;
    }


    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here

        List <Integer> stickList = new ArrayList<>();
        int smallest = 0;
        int arraySize = arr.size();

        while(arr.size() > 0){
            stickList.add(arraySize);

            arr.sort(Comparator.naturalOrder());
            smallest = arr.get(0);

            System.out.print(arr+ "   " + smallest + " ");

            for(int i = 0; i < arr.size(); i++){
                arr.set(i, arr.get(i)-smallest);
                // if(arr.get(i) == 0){
                //     arr.remove(i);
                //     System.out.println(i);
                // }
            }

            Iterator iterator =  arr.iterator();

            while(iterator.hasNext()){
                int num = (Integer) iterator.next();
                if(num == 0){
                    iterator.remove();
                }
            }

//            public static List<Integer> breakingRecords(List<Integer> scores) {
//                // Write your code here
//
//                List <Integer> records = new ArrayList<>();
//                int minRecord = scores.get(0);
//                int maxRecord = scores.get(0);
//                int countMin = 0;
//                int countMax = 0;
//
//
//                for (Integer integer : scores) {
//                    if(integer > maxRecord){
//                        maxRecord = integer;
//                        countMax++;
//                    }else if(integer < minRecord){
//                        minRecord = integer;
//                        countMin++;
//                    }
//                }
//
//                records.add(countMax);
//                records.add(countMin);
//
//                return records;
//
//            }


            // for (int i = 0; i < arr.size()-1; i++) {
            //     if(arr.get(i) == 0){
            //         arr.remove(i);
            //     }
            // }

            // for (Integer integer : arr) {
            //     if(integer == 0){
            //         arr.remove(arr.indexOf(integer));
            //     }

            // }

            System.out.println(arr);
            arraySize = arr.size();
        }


        return stickList;
    }

    public static int camelcase(String s) {
        // Write your code here
        int numOfWords = 1;

        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                numOfWords++;
            }
        }

        return numOfWords;
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





//    int r = n;
//    int count = 0;
//    while(r > 0){
//        if(r % 10 != 0 && n % (r % 10) == 0)
//            count++;
//        r = r / 10;
//    }
//    return count;

//}


    public static int minimumLoss(List<Long> prices) {
        Map <Long, Integer> map = new HashMap<>();
        int listSize = prices.size();
        Long [] price = new Long [listSize];
        for (int i = 0; i <listSize; i++) {
            price[i] = prices.get(i);
        }

        long min = Long.MAX_VALUE;
        for(int i = 0; i < price.length; i++) {
            map.put(price[i], i);
        }
        Arrays.sort(price);
        for(int i = 1; i < price.length; i++) {
            long year = map.get(price[i]);
            long year2 = map.get(price[i-1]);
            long loss = price[i] - price[i-1];
            if(year2 > year && loss < min) {
                min = loss;
            }
        }
        return (int) min;
    }
//     {
//     // Write your code here
//     Long leastLoss = price.get(0) ;
//     int listSize = price.size();
//     Long currentLoss =0L;
//     List <Long> priceDifferences = new ArrayList<>();

//     for (int i = 0; i < listSize; i++) {
//         for (int j = i+1; j < listSize; j++){
//             // if((price.get(i) - price.get(j)) > 0){
//             //     priceDifferences.add(price.get(i) - price.get(j));
//             // }
//             currentLoss = price.get(i) - price.get(j);
//             if(currentLoss > 0 && currentLoss < leastLoss ){
//                 priceDifferences.add( currentLoss);
//             }

//         }
//     }

//     return Collections.min(priceDifferences).intValue();
// //    price.sort(Comparator.reverseOrder());

//     // for (int i = 0; i < listSize -1; i++) {
//     //     currentLoss = Math.abs(price.get(i) - price.get(i+1));
//     //     priceDifferences.add(currentLoss);
//     //     // System.out.println(currentLoss);
//     //     // if(currentLoss > 0){
//     //     //     priceDifferences.add(currentLoss);
//     //     // }
//     // }
//     // }

//     // priceDifferences.sort(Comparator.naturalOrder());
//     // System.out.println(priceDifferences);
//     // leastLoss = priceDifferences.get(0);
//     // return leastLoss.intValue();

//     }

}
