package com.example.leszek.coffeina;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKNO = "drinkNo";
    int drinkNo;
    Drink drink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        drinkNo = (Integer) getIntent().getExtras().get(EXTRA_DRINKNO);
        drink = Drink.drinks[drinkNo];

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());
    }
}
