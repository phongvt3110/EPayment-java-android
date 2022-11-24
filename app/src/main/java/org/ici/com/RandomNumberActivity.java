package org.ici.com;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class RandomNumberActivity extends AppCompatActivity {
    Button btnGen;
    EditText minText;
    EditText maxText;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number);
        init();
        btnGen.setOnClickListener(view -> {
            String chuoiMin = minText.getText().toString();
            String chuoiMax = maxText.getText().toString();
            if(chuoiMin.isEmpty() || chuoiMax.isEmpty()) {
                Toast.makeText(RandomNumberActivity.this, "Please enter all number needed", Toast.LENGTH_SHORT).show();
            } else {
                int minNum = Integer.parseInt(chuoiMin);
                int maxNum = Integer.parseInt(chuoiMax);
                if(maxNum - minNum > 0) {
                    String ranNum = String.valueOf(genRandomNumber(minNum, maxNum));
                    result.setText(ranNum);
                } else {
                    Toast.makeText(RandomNumberActivity.this, "Min number equals to max number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void init() {
        findViewById(R.id.android);
        result = findViewById(R.id.textView);
        btnGen = findViewById(R.id.btnGen);
        minText = findViewById(R.id.min);
        maxText = findViewById(R.id.max);
        String str = getAppName(this.getApplicationContext());
        this.setTitle("Random number generator");
    }

    private int genRandomNumber(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    private String getAppName(Context context){
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int appNameId = applicationInfo.labelRes;
        return appNameId == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(appNameId);
    }
}
