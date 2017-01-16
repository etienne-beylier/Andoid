package com.etiennebeylier.mylibandroid;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * Created by Utilisateur on 09/01/2017.
 */

public class Exercise1 extends Activity implements View.OnClickListener{
    LinearLayout ll;
    String backgroundColor = "white";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_1);

        Button btn = (Button) findViewById(R.id.button_exercice_1);

        ll = (LinearLayout)findViewById(R.id.linear_layout_ex1);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (backgroundColor){

            case ("red"):
                backgroundColor = "black";
                ll.setBackgroundColor(Color.BLACK);
                break;

            case ("black"):
                backgroundColor = "white";
                ll.setBackgroundColor(Color.WHITE);
                break;

            default:
                backgroundColor = "red";
                ll.setBackgroundColor(Color.RED);
                break;
        }
    }
}