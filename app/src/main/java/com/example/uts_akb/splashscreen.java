package com.example.uts_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
//Nama : Sulthon Naufal Akmal
//        Kelas : IF2
//        Nim : 10119076
public class splashscreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Thread thread = new Thread(){

            public void run() {
                try{
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                } finally{
                    startActivity(new Intent(splashscreen.this,MainActivity .class));
                    finish();
                }
            }
        };
        thread.start();
    }
}