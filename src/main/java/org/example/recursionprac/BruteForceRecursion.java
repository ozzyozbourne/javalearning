package org.example.recursionprac;

import java.util.ArrayList;
import java.util.List;

public class BruteForceRecursion {

    private static final List<Double> listOfSums = new ArrayList<>();
    private static final int [] array  = {1, 3, 2, 6, -1, 4, 1, 8, 2};

    public static int addRecursively(int pos, int end, int sum){
        if(pos <= end-1)sum += array[pos] +  addRecursively( ++pos,  end, sum);
        return sum;
    }

    public static void loopRecursively(int pos, int windowSize){
        if(pos <= array.length - windowSize){
           listOfSums.add(addRecursively(pos,windowSize + pos, 0)/(double) windowSize);
           loopRecursively(++pos,  windowSize);}
    }

    public static void main(String[] args) {
        loopRecursively(0,  5);
        System.out.println(listOfSums);
    }
}
