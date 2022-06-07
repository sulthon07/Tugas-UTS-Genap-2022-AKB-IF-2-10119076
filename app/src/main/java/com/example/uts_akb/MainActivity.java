package com.example.uts_akb;
//Nama : Sulthon Naufal Akmal
//        Kelas : IF2
//        Nim : 10119076
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        adapter = new MyAdapter(this);
        viewPager.setAdapter(adapter);
    }
}