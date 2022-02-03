package org.example.interfaces;

public class First {
    public static void main(String[] args) {

        System.out.println(digital_root(59));

        System.out.println(digital_root(1));
    }

    public static int digital_root(int n) {
        if(n<10)return n;
        return digital_root(recursion(n));
    }

    private static int recursion(int n){
        if(n/10 == 0 ) return n;
        else return n%10 + recursion(n/10);
    }

}
