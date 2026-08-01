package com.kunal.easy;

public class Nto1 {
    public static void main(String[] args) {
       // fun(5);
       // funrev(5);
       // funBoth(5);

       concept(5);

    }

    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+ " ");
        fun(n-1);
    }

    //will print the reverse because it will first call the function and then execute the print, so it unwinds from n=1 back to n=5
    static void funrev(int n){
        if(n == 0){
            return;
        }
        funrev(n-1);
        System.out.println(n);
    }

    //lets see what will happen if we did both at the same time 
    static void funBoth(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        funBoth(n-1);
        System.out.print(n+" ");
    }

    //pre-decrement vs post-decrement in recursion
    static void concept(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
       // concept(n--); gives infinite recursion / stackoverflow, because n-- passes old value first, n never actually becomes 0 in the call
       concept(--n); // --n decreases first then passes, so n properly reaches 0 and recursion stops
    }
}