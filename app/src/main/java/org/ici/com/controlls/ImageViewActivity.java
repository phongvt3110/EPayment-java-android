package org.ici.com.controlls;

import androidx.appcompat.app.AppCompatActivity;
import org.ici.com.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ImageViewActivity extends AppCompatActivity {
    ImageView imageView;
    RelativeLayout relativeLayout;
    Button changeBackground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.penguin);
        changeBackground = (Button) findViewById(R.id.btnChangeBackground);
        changeBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout = (RelativeLayout)findViewById(R.id.imageViewScreen);
                relativeLayout.setBackgroundResource(R.drawable.images1);
            }
        });
    }
}
