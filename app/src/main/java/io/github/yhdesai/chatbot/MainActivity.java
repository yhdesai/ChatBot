package io.github.yhdesai.chatbot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void intent(View view) {
        Intent intent = new Intent(MainActivity.this, Intent.class);
        startActivity(intent);
    }




}
