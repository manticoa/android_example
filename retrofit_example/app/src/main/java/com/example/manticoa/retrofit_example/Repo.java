package com.example.manticoa.retrofit_example;

import java.util.Objects;

/**
 * Created by manticoa on 16. 2. 24..
 */
public class Repo {
    int id;
    String name;
    String full_name;
    //Objects owner;

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getFull_name(){
        return full_name;
    }


}
