package com.company;

public class Main {

    public static void main(String[] args) {
	    LazyInitialization i= LazyInitialization.getInstance();
        System.out.println(i.hashCode());

    }
}
