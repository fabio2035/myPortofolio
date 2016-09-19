package com.fabio.monster.myappportofolio;

import android.app.Fragment;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popMovies(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Popular Movies app";
        Toast toast = Toast.makeText(context,text,Toast.LENGTH_LONG);
        toast.show();

    }

    public void stockHawk(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Stock Hawk app";
        Toast toast = Toast.makeText(context,text,Toast.LENGTH_LONG);
        toast.show();
    }

    public void buildBig(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Build it Bigger app";
        Toast toast = Toast.makeText(context,text,Toast.LENGTH_LONG);
        toast.show();
    }

    public void makeMat(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Make your app Material app";
        Toast toast = Toast.makeText(context,text,Toast.LENGTH_LONG);
        toast.show();
    }

    public void goUbiq(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Go ubiquitous app";
        Toast toast = Toast.makeText(context,text,Toast.LENGTH_LONG);
        toast.show();
    }

    public void capStone(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone app";
        Toast toast = Toast.makeText(context,text,Toast.LENGTH_LONG);
        toast.show();
    }
}
