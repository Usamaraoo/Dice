package com.example.rao.dicee;

import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button roll_button;
final int[] dicearray={R.drawable.dice1,
        R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5
        ,R.drawable.dice6};
        roll_button=(Button) findViewById(R.id.buttonRoll);
       final ImageView leftDice=(ImageView) findViewById(R.id.imageViewLeftdice);
        final ImageView rightDice=(ImageView) findViewById(R.id.imageViewrightdice);
        roll_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dice","butoon has been pressed");
                Random random_number_generator=new Random();
                int number=random_number_generator.nextInt(6);//store the random number in var
                leftDice.setImageResource(dicearray[number]);
                number=random_number_generator.nextInt(6);
                rightDice.setImageResource(dicearray[number]);
            }
        });
    }
}
 