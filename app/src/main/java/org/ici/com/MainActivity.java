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
                String ranNum = String.valueOf(randomnum(minText.getText().toString(), maxText.getText().toString()));
                userName.setText(ranNum);
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
    private int randomnum(String min, String max){
        Random random = new Random();
        int minnum = Integer.parseInt(min);
        int maxnum = Integer.parseInt(max);
        int rannum = random.nextInt(maxnum - minnum + 1) + minnum;
        return rannum;
    }
}
