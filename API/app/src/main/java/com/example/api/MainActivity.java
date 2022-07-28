package com.example.api;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.ListView;
import android.R;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

    private ProgressDialog pDialog;
    private ListView lv;

    // URL to get contacts JSON
    private static String url = "https://api.androidhive.info/contacts/";

    ArrayList<HashMap<String, String>> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);

        contactList = new ArrayList<>();

        lv = (ListView) findViewById(R.id.list);

        new GetContacts().execute();
    }
}