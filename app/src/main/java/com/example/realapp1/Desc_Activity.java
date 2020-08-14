package com.example.realapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Desc_Activity extends AppCompatActivity {
    private static final String BOOK_ACT="fortrans";

    private TextView bookname,authorname,longDescription;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_);
        bookname=findViewById(R.id.bookname);
        authorname=findViewById(R.id.authorname);
        longDescription=findViewById(R.id.longDescription);
        imageView=findViewById(R.id.imageView);
        Intent intent = getIntent();
        Book book =intent.getParcelableExtra(BOOK_ACT);
        bookname.setText(book.getName());
        authorname.setText(book. getAuthor());
        longDescription.setText(book.getLongDesc());
        Glide.with(this)
                .asBitmap()
                .load(book.getImageURL())
                .into(imageView);


    }
}