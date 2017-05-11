package com.example.wuziqi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private WuziqiPanal wuziqiPanal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wuziqiPanal = (WuziqiPanal)findViewById(R.id.id_wuziqi);
        ImageButton button1=(ImageButton)findViewById(R.id.btn_zailai);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wuziqiPanal.start();
            }
        });
        ImageButton button2=(ImageButton)findViewById(R.id.btn_heqi);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"和棋",Toast.LENGTH_LONG).show();
                wuziqiPanal.stop();
            }
        });
    }
}
