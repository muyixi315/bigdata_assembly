package com.kylin.assembly.spark.sql;

import java.io.Serializable;

/**
 * Created by wb-yangbin.d on 2015/11/19.
 */
public class Person implements Serializable
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
