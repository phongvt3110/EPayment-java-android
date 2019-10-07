package org.ici.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.ici.com.ui.login.LoginActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtNoidung;
    Button btnClick;
    EditText userName;
    Button btnRandomNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNoidung.setText("Đang xử lý ...");
            }
        });
        btnRandomNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RandomNumberActivity.class));
            }
        });
    }

    private void init() {
        txtNoidung = (TextView) findViewById(R.id.txtNoidung);
        btnClick = (Button) findViewById(R.id.btnClick);
        userName = (EditText) findViewById(R.id.username);
        userName.setText("Android Khoa Pham");
        btnRandomNumber = findViewById(R.id.btnRandom);
    }
    private int randomnum(int min, int max){
        Random random = new Random();
        int rannum = random.nextInt(max - min + 1) + min;
        return rannum;
    }
}
