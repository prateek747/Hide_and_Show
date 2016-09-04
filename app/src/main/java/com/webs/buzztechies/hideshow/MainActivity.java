package com.webs.buzztechies.hideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        imageview = (ImageView)findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imageview.getVisibility() == View.INVISIBLE)
                {
                    imageview.setVisibility(View.VISIBLE);
                    button.setText("HIDE");
                }
                else if (imageview.getVisibility() == View.VISIBLE)
                {
                    imageview.setVisibility(View.INVISIBLE);
                    button.setText("SHOW");
                }
            }
        });
    }
}
