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
                "A work of maddening Brilliance","A young woman named Aomame follows a taxi driver’s enigmatic suggestion and begins to notice puzzling discrepancies in the world around her. She has entered, she realizes, a parallel existence, which she calls 1Q84 —“Q is for ‘question mark.’ A world that bears a question.” Meanwhile, an aspiring writer named Tengo takes on a suspect ghostwriting project. He becomes so wrapped up with the work and its unusual author that, soon, his previously placid life begins to come unraveled. "));
        books.add(new Book(2,"The Myth of Sisyphus","Albert Camus",250,"https://miro.medium.com/max/500/1*DDsOx6D3oe8ZxcA-OTfIDA.jpeg","One of the most influential work of this century","In The Myth of Sisyphus Camus elucidates this concept of the absurd. The absurd comes with the realization that the world is not rational: “At this point of his effort man stands face to face with the irrational. He feels within him his longing for happiness and for reason."));
        books.add(new Book(3,"The Lion, the Witch, and the Wardrobe"," C.S. Lewis.",400,"https://cdn.lifehack.org/wp-content/uploads/2015/05/31061458/3-The-Lion-the-Witch-and-the-Wardrobe-HarperCollins-Edition.jpg","The Cronicals of narniya CS Lewis","When Peter, Susan, Edmund, and Lucy slip into the magical land of Narnia, befriending talking animals and battling the White Witch, they discover the bonds of family and the value of bravery. This is more than a story about an entire world tucked away in an old piece of furniture. It’s a novel about the boundlessness of the human imagination. Set against the backdrop of World War II England, the land of Narnia represents the timeless hope in a better, brighter future."));
        books.add(new Book(4,"Little Women","Louisa May Alcott",600,"https://cdn.lifehack.org/wp-content/uploads/2015/05/31060847/14-Louisa-May-Alcott-Little-Women-Penguin-Classics.jpg","A richly written novel with a cast of memorable characters, Little Women invites us into the warm, comfortable home of a 19th-century American family.","Everyone can find a character trait that resonates with them, whether Jo’s temper, Meg’s vanity, Amy’s mischievousness, or Beth’s shyness. The novel is a coming-of-age story that follows four sisters (the March girls) from girlhood to womanhood in Civil War America. Together they learn about the harsh realities of poverty, illness, and death, and how to dream, love, and laugh through it all. This is a heartwarming, timeless classic about the importance of family and the simple, home-spun comfort of never being alone.")) ;
        books.add(new Book(5,"Pride and Prejudice","Jane Austen",200,"https://cdn.lifehack.org/wp-content/uploads/2015/05/31055941/8-Pride-and-Prejudice-Penguin-Classics-Deluxe-Edition.jpg","It is a truth universally acknowledged that a single man in possession of a good fortune must be in want of a wife","Yet Jane Austen’s most famous work is more than a comedy of manners about the marriage market and the maneuvers of navigating polite society in 19th-century England. Pride and Prejudice remains one of the most enduring works of English Literature not because we find such rewarding pleasure in watching sparks fly between Elizabeth Bennet and Mr. Darcy (though that’s certainly reason enough). Readers embrace the novel because Austen candidly captures the human character with all of its beauties and its imperfections. "));
        books.add(new Book(6,"The Reader","Bernhard Schlink",340,"https://cdn.lifehack.org/wp-content/uploads/2015/05/31060850/16-The-Reader-Tandem-Edition.jpg","Hannah teaches Michael to read the human character","Set in late-20th Century Germany, this novel boldly confronts long-standing German national guilt over the Nazi war crimes of the Holocaust through the strange, intergenerational relationship between 15 year-old Michael Berg and 36 year-old Hannah Schmitt, an illiterate tram operator and former Auschwitz prison guard. As Michael teaches Hannah to read books, Hannah teaches Michael to read the human character, and he comes to learn about the nuances between good and evil and of living with the consequences of one’s choices. "));
        //books.add(new Book(7))

        adapter.setBooks(books);
    }
}