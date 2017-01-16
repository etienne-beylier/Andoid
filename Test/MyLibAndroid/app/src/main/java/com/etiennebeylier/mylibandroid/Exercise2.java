package com.etiennebeylier.mylibandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Utilisateur on 09/01/2017.
 */

public class Exercise2 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_2);

        Button btn = (Button) findViewById(R.id.button_exercice_2);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });
    }
}