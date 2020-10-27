package com.example.donorhub;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    RatingBar rb;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        rb = (RatingBar) findViewById(R.id.ratingBar);
        tv = (TextView) findViewById(R.id.textView2);

        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                tv.setText(String.valueOf(v));
                Toast.makeText(getApplicationContext(), "THANK YOU FOR RATING US", Toast.LENGTH_LONG).show();
            }
        });
    }
}