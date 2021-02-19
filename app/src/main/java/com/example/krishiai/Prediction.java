package com.example.krishiai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Prediction extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediction);
        TextView textView;
        ImageView imageView;
        imageView = findViewById(R.id.imageView4);
        textView = findViewById(R.id.textView);
        Intent intent =getIntent();
        String prediction = intent.getStringExtra("proba");
        textView.setText(prediction);
        if(prediction.equalsIgnoreCase("fungus blast")){

            String uri = "@drawable/ppp";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            Drawable res = getResources().getDrawable(imageResource);
            imageView.setImageDrawable(res);

        }else{

            String uri = "@drawable/brn";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            Drawable res = getResources().getDrawable(imageResource);
            imageView.setImageDrawable(res);


        }

    }
}