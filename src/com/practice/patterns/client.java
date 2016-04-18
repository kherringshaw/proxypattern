package com.practice.patterns;


//test client
public class client {

    public static void main(String[] args) {

        subject image = new proxy("cat.jpg");
        image.display();
    }
}
