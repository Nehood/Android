package com.example.leszek.doradcapiwny;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leszek on 2016-07-23.
 */
public class BeerExpert
{
    List<String> getBrands(String color)
    {
       List<String> brands = new ArrayList<String>();
       if (color.equals("bursztynowe")){
           brands.add("Jack Amber");
           brands.add("Red Moose");
       } else {
           brands.add("Jail Pale Ale");
           brands.add("Gout Stout");
       }
        return brands;
    }
}
