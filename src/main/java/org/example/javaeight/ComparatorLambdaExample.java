package org.example.javaeight;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        var Compare = new Comparator<Integer>(){
            @Override
                public int compare(Integer a, Integer b){
                return a.compareTo(b);
            }
        };

        System.out.println("Compare : "  + Compare.compare(1,2));

        //lambda way

        Comparator<Integer> comparator = Integer::compareTo;

        System.out.println("Compare : "  + comparator.compare(2,1));
    }
}
