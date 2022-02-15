package org.example.javaeight;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Consume {
    public static void main(String[] args) {

       /*
       get the List student obj and print the name and activities field only for those
       who have a gpa and grade level greater than 3
        */

        //get all the student objects wrapped in a list
            Supplier<List<Student>> a = StudentDataBase::getAllStudents;

        //define behavior
        Consumer<Student> a1 = student -> System.out.println(student.getName());
        Consumer<Student> a2 = student -> System.out.println(student.getActivities());

        //apply filter condition and then behavior
        a.get().stream()
                .filter(s -> s.getGradeLevel() >= 3 && s.getGpa() >=3.9)
                .forEach(a1.andThen(a2));

        Function<Integer, String> ad = Integer -> null;


    }
}

