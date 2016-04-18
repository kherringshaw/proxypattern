package com.practice.patterns;


//"real" object
public class realsubject implements subject{


    private String fileName;

    public realsubject(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display(){
        System.out.println("DISPLAYING: "+fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("LOADING: "+fileName);
    }
}
