package org.ici.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import org.ici.com.controlls.*;

public class DashboardActivity extends AppCompatActivity {
    Button imageView;
    Button btnBottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        init();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, ImageViewActivity.class));
            }
        });
        btnBottomNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, BottomNavigation.class));
            }
        });
    }
    private void init() {
        imageView = findViewById(R.id.btnImageView);
        btnBottomNavigation = findViewById(R.id.btnBottomNavigation);
    }
}
