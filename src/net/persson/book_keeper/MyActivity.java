package net.persson.book_keeper;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.example.book_keeper.R;

import java.util.List;

public class MyActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        DatabaseHandler db = new DatabaseHandler(this);

        db.addBook(new Book("1111111111111", "Sleep Deprived", "Heather Persson", 1, 1, "01/01/2014", "great book"));
        db.addBook(new Book("2222222222222", "Four More Days Off", "Heather Persson", 1, 1, "01/01/2014", "ok book"));
        db.addBook(new Book("3333333333333", "Coffee 101", "Heather Persson", 1, 1, "01/01/2014", "terrific book"));
        db.addBook(new Book("444444444444444", "Really Tired", "Heather Persson", 1, 1, "01/01/2014", "stupid book"));



        Book abc = new Book("123", "Sleep Deprived", "Heather Persson", 1, 1, "01/01/2014", "great book");

        db.updateBook(1, abc);

        db.detletBook(2);

        List<Book> books = db.getAllBooks();


        Log.d("books", books.toString());

        Log.d("TESTING", "Count: " + db.getAllBooks().size());


    }
}
