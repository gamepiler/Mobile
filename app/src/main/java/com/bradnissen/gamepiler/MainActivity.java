package com.bradnissen.gamepiler;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callTextView(View view) {
        //get the id of the view
        TextView tv = findViewById(R.id.textview);
        //change the text
        tv.setText("You clicked the login button");
    }

    public void callTextView2(View view) {
        //get the id of the view
        TextView tv = findViewById(R.id.textview);
        //change the text
        tv.setText("You clicked the Signup button");

        ImageView signupButton = findViewById(R.id.signup);
        //signupButton.setColorFilter(Color.);
    }
}
