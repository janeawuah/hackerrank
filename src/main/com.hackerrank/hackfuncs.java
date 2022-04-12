package main.com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class hackfuncs {


    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> brokenRecords = new ArrayList<>();
        int minimumScore = scores.get(0);
        int maximumScore = scores.get(0);
        int minCounter = 0;
        int maxCounter = 0;

        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > maximumScore) {
                maxCounter +=1;
                maximumScore = scores.get(i) ;
            }
            if (scores.get(i)  < minimumScore) {
                minCounter +=1;
                minimumScore = scores.get(i) ;
            }
        }
        brokenRecords.add(maxCounter);
        brokenRecords.add(minCounter);

        return brokenRecords;
    }



}