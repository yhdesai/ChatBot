package io.github.yhdesai.chatbot;

import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.

public class Call extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
    }


    public void call(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("+91" + "8484923472"));
        startActivity(intent);
    }


}
















