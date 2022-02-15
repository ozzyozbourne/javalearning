package org.example;

import org.junit.Test;
import java.util.*;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        Map<String, List<String>> a = new HashMap<>();
        a.put("2", Arrays.asList("a", "b", "c"));
        a.put("3", Arrays.asList("d", "e", "f"));
        a.put("4", Arrays.asList("g", "h", "i"));
        a.put("5", Arrays.asList("j", "k", "l"));
        a.put("6", Arrays.asList("m", "n", "o"));
        a.put("7", Arrays.asList("p", "q", "r", "s"));
        a.put("8", Arrays.asList("t","u","v"));
        a.put("9", Arrays.asList("w","x","y","z"));
        a.forEach((s,t)-> { System.out.println("key -> " + s);System.out.println("value are -> ");
            t.forEach(System.out::println);
            System.out.println();});

    }

    void recusivelyGet2dArrayIndexes(List<String> one , List<String> two,List<String> three  ,int row, int coloum ){
        if(row < one.size()){
            if(coloum < two.size()){
                concactTheIndexes(one, two, three, row, coloum);
                recusivelyGet2dArrayIndexes(one, two, three, row, ++coloum);
            }else {
                recusivelyGet2dArrayIndexes(one, two, three, ++row,  0);
            }
        }
    }

    void concactTheIndexes(List<String> one , List<String> two, List<String> three, int row, int coloum){
        three.add(one.get(row) + two.get(coloum));
    }

    @Test
    public void vasd(){
        List<String> three = new ArrayList<>();

        var one = Arrays.asList("a", "b", "c");
        var two = Arrays.asList("d" ,"e", "f");

        recusivelyGet2dArrayIndexes(one, two, three , 0, 0);
        three.forEach(System.out::println);

    }

}
