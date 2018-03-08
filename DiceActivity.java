package com.example.pc.dice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

/**
 * Created by pc on 06/03/2018.
 */

public class DiceActivity extends Activity implements View.OnClickListener {
    private TextView textResult;
     private int max;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice);
         max = getIntent().getIntExtra("max", 0);

        TextView textTitle = (TextView) findViewById(R.id.textTitle);
        textTitle.setText(max +"sided dice");

        textResult = ((TextView) findViewById(R.id.textResult));
        textResult.setText(max +"Sided Dice");

        Button buttonRoll = (Button) findViewById(R.id.buttonRoll);
        buttonRoll.setOnClickListener(this);
    }

@Override
    public void onClick(View v) {
        SecureRandom random = new SecureRandom();
        int result = random.nextInt(max) + 1;
        textResult.setText(String.valueOf(result));
    }
}
