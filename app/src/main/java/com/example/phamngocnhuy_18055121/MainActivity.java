package com.example.phamngocnhuy_18055121;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private BurgerAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Burger> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList= new ArrayList<>();
        EditText editText=findViewById(R.id.editTextS1);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });


        for (int i=0;i<7;i++){
            arrayList.add(new Burger("Peter Luger",4.2,44.00,R.drawable.spc,R.drawable.vh));
            arrayList.add(new Burger("Angus bugger",3.2,24.00,R.drawable.a,R.drawable.va));
        }

        mRecyclerView=findViewById(R.id.recycleView);
        mAdapter=new BurgerAdapter(arrayList,this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        GridLayoutManager layoutManager= new GridLayoutManager(MainActivity.this,2,GridLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(layoutManager);
    }

    private void filter(String tx) {
        ArrayList<Burger> filterList= new ArrayList<>();
        for(Burger b:arrayList){
            if(b.getName().toLowerCase().contains(tx.toLowerCase())){
                filterList.add(b);
            }
        }
        mAdapter.filterListH(filterList);
    }
}