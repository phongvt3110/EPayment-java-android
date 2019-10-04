package org.ici.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtNoidung;
    Button btnClick;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNoidung = (TextView) findViewById(R.id.txtNoidung);
        txtNoidung.setText("Đăng nhập hệ thống");
        btnClick = (Button) findViewById(R.id.btnClick);
        editText = (EditText) findViewById(R.id.username);
        editText.setText("Android Khoa Pham");
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNoidung.setText("Đang xử lý ...");
                Toast.makeText(MainActivity.this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
