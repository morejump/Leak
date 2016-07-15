package com.example.huynh.leak;

import java.util.Random;

/**
 * Created by huynh on 16-Jul-16.
 */
public class PersonInfo {
    private String name;
    private String age;
    private int idImage;
    private int[] randomImageList = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,
            R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.k,R.drawable.l};


    public PersonInfo(String name, String age, int ran) {
        this.name = name;
        this.age = age;
        this.idImage =randomImageList[ran];
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdImage() {
        return idImage;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
