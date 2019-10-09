package org.ici.com.controlls;

import androidx.appcompat.app.AppCompatActivity;
import org.ici.com.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.penguin);
        changeBackground = (Button) findViewById(R.id.btnChangeBackground);
        relativeLayout = (RelativeLayout)findViewById(R.id.imageViewScreen);
        changeBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout.setBackgroundResource(R.drawable.images1);
            }
        });
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        arrayImage = new ArrayList<>();
        arrayImage.add(R.drawable.images);
        arrayImage.add(R.drawable.images1);
        arrayImage.add(R.drawable.image3);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int vitri = random.nextInt(arrayImage.size());
                relativeLayout.setBackgroundResource(arrayImage.get(vitri));
            }
        });
        swWifi = findViewById(R.id.swWifi);
        swWifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(ImageViewActivity.this, "Switch ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ImageViewActivity.this, "Switch Off", Toast.LENGTH_SHORT).show();
                }
            }
        });
        android = findViewById(R.id.android);
        ios = findViewById(R.id.ios);
        php = findViewById(R.id.php);
        BtnCheckbox = findViewById(R.id.btnCheckbox);
        BtnCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
            }
        });
        android.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(ImageViewActivity.this, "Checked On", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ImageViewActivity.this, "Checked Off", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
