package org.ici.com.controlls;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.ici.com.R;

import java.util.ArrayList;
import java.util.Random;

public class ImageViewActivity extends AppCompatActivity {
    ImageView imageView;
    RelativeLayout relativeLayout;
    Button changeBackground;
    Button BtnCheckbox;
    ImageButton imageButton;
    ArrayList<Integer> arrayImage;
    Switch swWifi;
    CheckBox android;
    CheckBox ios;
    CheckBox php;
    RadioGroup checkTime;
    Button btnChectime;
    RadioButton rbSang;
    RadioButton rbTrua;
    RadioButton rbChieu;
    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.penguin);
        changeBackground = findViewById(R.id.btnChangeBackground);
        relativeLayout = findViewById(R.id.imageViewScreen);
        changeBackground.setOnClickListener(view -> relativeLayout.setBackgroundResource(R.drawable.images1));
        imageButton = findViewById(R.id.imageButton);
        arrayImage = new ArrayList<>();
        arrayImage.add(R.drawable.images);
        arrayImage.add(R.drawable.images1);
        arrayImage.add(R.drawable.image3);
        imageButton.setOnClickListener(view -> {
            Random random = new Random();
            int vitri = random.nextInt(arrayImage.size());
            relativeLayout.setBackgroundResource(arrayImage.get(vitri));
        });
        swWifi = findViewById(R.id.swWifi);
        swWifi.setOnCheckedChangeListener((compoundButton, b) -> {
            if(b) {
                Toast.makeText(ImageViewActivity.this, "Switch ON", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(ImageViewActivity.this, "Switch Off", Toast.LENGTH_SHORT).show();
            }
        });
        android = findViewById(R.id.android);
        ios = findViewById(R.id.ios);
        php = findViewById(R.id.php);
        BtnCheckbox = findViewById(R.id.btnCheckbox);
        BtnCheckbox.setOnClickListener(view -> {
            String str = "You checked: \n";
            if(android.isChecked()){
                str += android.getText() + "\n";
            }
            if(ios.isChecked()){
                str += ios.getText() + "\n";
            }
            if(php.isChecked()){
                str += php.getText();
            }
            Toast.makeText(ImageViewActivity.this, str, Toast.LENGTH_SHORT).show();
        });
        android.setOnCheckedChangeListener((compoundButton, b) -> {
            if(b) {
                Toast.makeText(ImageViewActivity.this, "Checked On", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(ImageViewActivity.this, "Checked Off", Toast.LENGTH_SHORT).show();
            }
        });
        checkTime = findViewById(R.id.rgCheckTime);
        checkTime.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId){
                case R.id.sang:
                    Toast.makeText(ImageViewActivity.this, "Ban chon Sang", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.trua:
                    Toast.makeText(ImageViewActivity.this, "Ban chon trua", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.chieu:
                    Toast.makeText(ImageViewActivity.this, "Ban chon chieu", Toast.LENGTH_SHORT).show();
                    break;
            }
        });

        btnChectime = findViewById(R.id.btnCheckTime);
        rbSang = findViewById(R.id.sang);
        rbTrua = findViewById(R.id.trua);
        rbChieu = findViewById(R.id.chieu);
        btnChectime.setOnClickListener(v -> {
            if(rbSang.isChecked()){
                Toast.makeText(ImageViewActivity.this,rbSang.getText(), Toast.LENGTH_SHORT).show();
            }
            if(rbTrua.isChecked()){
                Toast.makeText(ImageViewActivity.this, rbTrua.getText(), Toast.LENGTH_SHORT).show();
            }
            if(rbChieu.isChecked()) {
                Toast.makeText(ImageViewActivity.this, rbChieu.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
