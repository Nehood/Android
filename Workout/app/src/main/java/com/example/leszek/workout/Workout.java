package com.example.leszek.workout;

/**
 * Created by Leszek on 2016-08-03.
 */
public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts =
        {
            new Workout("Rozciaganie konczyn", "5 pompek w staniu na rękach, " + "\n10 przysiadów na jednej nodze, \n15 podciągnięć."),
            new Workout("Ogólna agonia", "100 podciągnięć, \n100 pompek, \n100 brzuszków, \n100 przysiadów."),
            new Workout("Tylko dla mięczaków", "5 podciągnięc, \n10 pompek, \n15 przysiadów"),
            new Workout("Siła i dystans", "bieg na 500 metrów, \n21 wydźwignięć ciężarka, \n21 podciągnięć")
        };

    private Workout(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getName()
    {
        return this.name;
    }

    public String getDescription()
    {
        return this.description;
    }

    public String toString()
    {
        return getName();
    }
}
