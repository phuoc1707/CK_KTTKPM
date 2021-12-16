package com.company;

public class LazyInitialization {
    private static  LazyInitialization instance;

    private LazyInitialization() {
    }

    public synchronized static LazyInitialization getInstance(){
        if(instance == null){
            instance= new LazyInitialization();
        }
        return instance;
    }
}
