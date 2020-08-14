package com.example.realapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private Button button1,button2,button3;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializer();
        seeallbooks();
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                licence lc = new licence();
                lc.show(getSupportFragmentManager(),"licence dialog");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WebActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initializer()
    {
        image=findViewById(R.id.image);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
       // button4=findViewById(R.id.button4);



    }

    private void seeallbooks()
    {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,All_book_Activity.class);
                startActivity(i);
            }
        });
    }
}