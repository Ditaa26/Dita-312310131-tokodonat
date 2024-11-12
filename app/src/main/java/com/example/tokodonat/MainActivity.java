package com.example.tokodonat;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private ImageView profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.loginButton).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, homepage.class);
            startActivity(intent);
        });

    }
}