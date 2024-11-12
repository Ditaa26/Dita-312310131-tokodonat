package com.example.tokodonat;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.os.Bundle;
import android.content.Intent;

public class profile extends AppCompatActivity {
    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

        backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(profile.this, homepage.class);
            startActivity(intent);
            finish(); // Menutup MainActivity setelah pindah ke homepage
        });
    }
}
