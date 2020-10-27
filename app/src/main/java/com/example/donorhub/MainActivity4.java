package com.example.donorhub;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.donorhub.R;

class MainActivity4 extends AppCompatActivity {

    ImageView eyes;
    ImageView body;
    ImageView brain;
    ImageView heart;
    ImageView kidney;
    ImageView liver;
    ImageView lungs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        eyes=(ImageView)findViewById(R.id.eyes);
        body=(ImageView)findViewById(R.id.body);
        brain= (ImageView)findViewById(R.id.brain);
        heart=(ImageView)findViewById(R.id.heart);
        kidney=(ImageView)findViewById(R.id.kidney);
        liver=(ImageView)findViewById(R.id.liver);
        lungs=(ImageView)findViewById(R.id.lungs);

        eyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(MainActivity4.this,MainActivity7.class);
                startActivity(intentLoadNewActivity);
            }
        });

        body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(MainActivity4.this,MainActivity7.class);
                startActivity(intentLoadNewActivity);
            }
        });


        brain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(MainActivity4.this,MainActivity7.class);
                startActivity(intentLoadNewActivity);
            }
        });

        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(MainActivity4.this,MainActivity7.class);
                startActivity(intentLoadNewActivity);
            }
        });

        kidney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(MainActivity4.this,MainActivity7.class);
                startActivity(intentLoadNewActivity);
            }
        });

        liver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(MainActivity4.this,MainActivity7.class);
                startActivity(intentLoadNewActivity);
            }
        });

        lungs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(MainActivity4.this,MainActivity7.class);
                startActivity(intentLoadNewActivity);
            }
        });



    }
    public boolean onCreateOptionsMenu (Menu menu)
    {
        getMenuInflater().inflate(R.menu.options,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.profile:
                //Toast.makeText(getApplicationContext(),"you selected Profile", Toast.LENGTH_LONG).show();
                //Log.d("option","you selected Profile");
                Intent intent=new Intent(MainActivity4.this,MainActivity4.class);
                startActivity(intent);
                return true;
            case R.id.donor_form:
                //Toast.makeText(getApplicationContext(),"you selected donor_form", Toast.LENGTH_LONG).show();
                //Log.d("option","you selected donor_form");
                intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);
                return true;
            case R.id.facts:
                //Toast.makeText(getApplicationContext(),"you selected facts", Toast.LENGTH_LONG).show();
                //Log.d("option","you selected facts");
                intent = new Intent(MainActivity4.this, facts.class);
                startActivity(intent);
                return true;
            case R.id.receipt:
                //Toast.makeText(getApplicationContext(),"you selected receipt", Toast.LENGTH_LONG).show();
                Log.d("option","you selected receipt");
                intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);
                return true;
            case R.id.feedback:
                //Toast.makeText(getApplicationContext(),"you selected feedback", Toast.LENGTH_LONG).show();
                //Log.d("option","you selected feedback");
                intent = new Intent(MainActivity4.this, MainActivity6.class);
                startActivity(intent);
                return true;
            case R.id.about_us:
                //Toast.makeText(getApplicationContext(),"you selected Aboutus", Toast.LENGTH_LONG).show();
                //Log.d("option","you selected Aboutus");
                intent = new Intent(MainActivity4.this, Aboutus.class);
                startActivity(intent);
                return true;
            case R.id.contact:
                //Toast.makeText(getApplicationContext(),"you selected contact", Toast.LENGTH_LONG).show();
                //Log.d("option","you selected contact");
                intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
