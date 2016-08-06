package com.example.leszek.coffeina;

/**
 * Created by Leszek on 2016-08-02.
 */
public class Drink
{
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[]drinks = {
        new Drink("Latte", "Czarne espresso z mlekiem.", R.drawable.latte),
                new Drink("Cappuccino", "Espresso z mlekiem.", R.drawable.cappuccino),
                new Drink("Espresso", "Czarna kawa.", R.drawable.espresso)
    };

    private Drink(String name, String description, int imageResourceId)
    {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription()
    {
        return this.description;
    }

    public String getName()
    {
        return this.name;
    }

    public int getImageResourceId()
    {
        return this.imageResourceId;
    }

    public String toString()
    {
        return this.getName();
    }

}

