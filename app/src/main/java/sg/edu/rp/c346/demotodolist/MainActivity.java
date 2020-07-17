package sg.edu.rp.c346.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvToDo;
    ArrayAdapter aa;
    ArrayList<ToDoItem> al;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = (ListView)this.findViewById(R.id.listViewToDo);
        al = new ArrayList<ToDoItem>();

        Calendar c = Calendar.getInstance();
        c.set(2020, 8, 1);
        Calendar c1 = Calendar.getInstance();
        c1.set(2020, 8, 2);

        ToDoItem item1 = new ToDoItem("Go for movie", c);
        ToDoItem item2 = new ToDoItem("Go for haircut", c1);
        al.add(item1);
        al.add(item2);

        adapter = new CustomAdapter(this, R.layout.row, al);
        lvToDo.setAdapter(adapter);

    }
}
