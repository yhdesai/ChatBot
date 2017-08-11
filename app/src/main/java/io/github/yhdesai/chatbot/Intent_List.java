package io.github.yhdesai.chatbot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Intent_List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent__list);

    }

    public void callActivity(View view) {
        Intent intent = new Intent(Intent_List.this, Call.class);
        startActivity(intent);
    }


    public void browser(View view) {
        Intent intent = new Intent(Intent_List.this, browser_list.class);
        startActivity(intent);
    }






}
