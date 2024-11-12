package com.example.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button like;
    private Button unlike;
    private Button save;
    private TextView liki;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        like = findViewById(R.id.like);
        unlike = findViewById(R.id.unlike);
        save = findViewById(R.id.save);
        liki = findViewById(R.id.liki);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num++;
                updatel();
            }
        });

        unlike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num == 0){
                    updatel();
                } else {
                    num--;
                    updatel();
                }
            }
        });


    }
    private void updatel(){
        liki.setText(num + " polubień");
    }

}