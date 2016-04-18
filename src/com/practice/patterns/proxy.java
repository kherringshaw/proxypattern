package com.practice.patterns;


//this is the "representation or placeholder" of the "real" subject
public class proxy implements subject{

    private realsubject realImage;
    private String fileName;

    public proxy(String fileName){
        this.fileName  = fileName;
    }

    @Override
    public void display(){

        if(realImage == null)
            realImage = new realsubject(fileName);

        realImage.display();
    }

}
