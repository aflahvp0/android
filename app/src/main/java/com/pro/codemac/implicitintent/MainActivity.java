package com.pro.codemac.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText search;
    String sear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search=(EditText)findViewById(R.id.et_search);
    }

    public void click(View view ){
        sear=search.getText().toString();

        Uri link=Uri.parse("http://www.google.co.in/search?q="+sear);
        Intent intent=new Intent(Intent.ACTION_VIEW,link);
        startActivity(intent);
    }
}
