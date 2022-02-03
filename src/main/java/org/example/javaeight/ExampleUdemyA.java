package org.example.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExampleUdemyA {

    public static void main(String[] args) {
       var s =  IntStream.rangeClosed(0, 100)
               .parallel()
               .sum();
        System.out.println("java 8 : " + s);


        var imperitiveList =  Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9);
        var sortedList = new ArrayList<Integer>();

        //sort the imperitive list

        for (var Int: imperitiveList){
            if(!sortedList.contains(Int))
                sortedList.add(Int);
        }

        System.out.println(sortedList  +"         " +sortedList.hashCode() );

        var sortedListDeclarive = imperitiveList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(sortedListDeclarive  +"         " +sortedListDeclarive.hashCode() );


    }
}
