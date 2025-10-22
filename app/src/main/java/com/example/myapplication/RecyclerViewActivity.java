package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<MyListData> myListData;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler_view);
        recyclerView=findViewById(R.id.rvlist);
        myListData = new ArrayList<>();
        myListData.add(new MyListData("Elon Musk","CEO of Tesla and X",R.drawable.elon_musk));
        myListData.add(new MyListData("Sundar Pichai","CEO of Google",R.drawable.sundar_pichai));
        myListData.add(new MyListData("Mark Zuckerberg","CEO of Facebook",R.drawable.mark_zuckerberg));
        myListData.add(new MyListData("Alan Turing","Invented Turing Test",R.drawable.alan_turing));
        myListData.add(new MyListData("Thomas Alva Edison","Inventor of Electric Bulb",R.drawable.thomas_edison));
        myListData.add(new MyListData("Tim Cook","CEO of MacBook",R.drawable.tim_cook));
        myListData.add(new MyListData("Stephen Hawking","English theoretical physicist and cosmologist",R.drawable.stephen_hawking));
        myListData.add(new MyListData("A.P.J.Abdul Kalam","Scientist and former President of India",R.drawable.abdul_kalam));
        myListData.add(new MyListData("Donald Trump","45th and 47th U.S. President",R.drawable.donald_trump));
        myListData.add(new MyListData("Steve Jobs","Former CEO of Apple",R.drawable.steve_jobs));
        myListData.add(new MyListData("J.K.Rowling","British author and philanthropist",R.drawable.rowling));
        myListData.add(new MyListData("Ton Roosendaal","CEO of Blender",R.drawable.ton_roosendaal));
        myListData.add(new MyListData("Satya Nadella","CEO of Microsoft",R.drawable.satya_nadella));
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, GridLayoutManager.chooseSize(2,2,2)));
        recyclerView.setAdapter(adapter);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}