package com.example.realapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class All_book_Activity extends AppCompatActivity {

    private RecyclerView booksRecView;
    private BookRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_book_);
        booksRecView=findViewById(R.id.booksRecView);
        adapter = new BookRecViewAdapter(this);

        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1,"1Q84","Haruki Murakami",1350,"https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1483103331i/10357575._UY453_SS453_.jpg",
                "A work of maddening Brilliance","Long Description"));
        books.add(new Book(2,"The Myth of Sisyphus","Albert Camus",250,"https://miro.medium.com/max/500/1*DDsOx6D3oe8ZxcA-OTfIDA.jpeg","One of the most influential work of this century","Long Description"));

        adapter.setBooks(books);
    }
}