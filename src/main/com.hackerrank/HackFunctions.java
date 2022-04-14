package main.com.hackerrank;

import java.util.ArrayList;
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


}