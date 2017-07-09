package io.github.yhdesai.chatbot;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void intentList(View view) {
        Intent intent = new Intent(MainActivity.this, Intent_List.class);
        startActivity(intent);
    }




}
