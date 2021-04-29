package com.example.phamngocnhuy_18055121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {
    private ImageButton btnAdd;
    private ImageButton btnTru;
    public TextView tvNameS2;
    public ImageView imgHinh2;
    int counter=0;
    private TextView kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        int imgHinh= getIntent().getIntExtra("imgHinh",2);

        String nameS2= getIntent().getStringExtra("name");

         tvNameS2=findViewById(R.id.tvNameS2);

        imgHinh2=findViewById(R.id.imgHinhS2);

        tvNameS2.setText(nameS2);
        imgHinh2.setImageResource(imgHinh);

        kq=(TextView) findViewById(R.id.tvCount);
    }
    public void them(View view){
        counter++;
        kq.setText(Integer.toString(counter));
    }
    public void tru(View view){
        if(counter>0){
            counter--;
        }
        else{
            counter=0;
        }
        kq.setText(Integer.toString(counter));
    }
}