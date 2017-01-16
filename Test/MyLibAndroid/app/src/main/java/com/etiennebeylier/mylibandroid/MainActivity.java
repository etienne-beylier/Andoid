package com.etiennebeylier.mylibandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button_main_1);
        Button btn2 = (Button) findViewById(R.id.button_main_2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Bundle bundle1 = new Bundle();
        Intent intent = null;

        switch (v.getId()){

            case (R.id.button_main_1):
                intent = new Intent(this, Exercise1.class);
                break;

            case (R.id.button_main_2):
                intent = new Intent(this, Exercise2.class);
                break;

            default:
                System.out.println("Button id error");
        }

        if (intent != null)
            startActivity(intent);
    }

}
