package com.example;

public class Main {
    public static void main(String[] args) {
        int n=100;
        MioThread t1=new MioThread(n);
        MioThread t2=new MioThread(n);
        t1.start();
        t2.start();
    }
}