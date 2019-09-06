package com.example.loginfage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomePage extends AppCompatActivity implements View.OnClickListener{
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        imageView = (ImageView) findViewById(R.id.imageViewId);
        imageView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
    if (v.getId()== R.id.imageViewId){
        Intent intent = new Intent(HomePage.this,SecondActivity.class);
        startActivity(intent);
}
    }
}
