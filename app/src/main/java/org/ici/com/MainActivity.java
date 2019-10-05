package org.ici.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtNoidung;
    Button btnClick;
    EditText userName;
    Button btnGen;
    EditText minText;
    EditText maxText;
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
        btnGen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoiMin = minText.getText().toString();
                String chuoiMax = maxText.getText().toString();
                if(chuoiMin.isEmpty() || chuoiMax.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter all number needed", Toast.LENGTH_SHORT).show();
                } else {
                    int minNum = Integer.parseInt(chuoiMin);
                    int maxNum = Integer.parseInt(chuoiMax);
                    if(maxNum - minNum > 0) {
                        String ranNum = String.valueOf(randomnum(minNum, maxNum));
                        userName.setText(ranNum);
                    } else {
                        Toast.makeText(MainActivity.this, "Min number equals to max number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void init() {
        txtNoidung = (TextView) findViewById(R.id.txtNoidung);
        btnClick = (Button) findViewById(R.id.btnClick);
        btnGen = findViewById(R.id.btnGen);
        userName = (EditText) findViewById(R.id.username);
        minText = findViewById(R.id.min);
        maxText = findViewById(R.id.max);
        userName.setText("Android Khoa Pham");
    }
    private int randomnum(int min, int max){
        Random random = new Random();
        int rannum = random.nextInt(max - min + 1) + min;
        return rannum;
    }
}
