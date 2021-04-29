package com.example.phamngocnhuy_18055121;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BurgerAdapter extends RecyclerView.Adapter<BurgerAdapter.BookViewHolder>{
    private ArrayList<Burger> mBurgerList;
    private LayoutInflater mInflater;
    private Context context;
    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.burger_item,parent,false);
        BookViewHolder bvh= new BookViewHolder(v);
        return bvh;
    }

    public BurgerAdapter(ArrayList<Burger> mBurgerList, Context context) {
        mInflater=LayoutInflater.from(context);
        this.mBurgerList = mBurgerList;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Burger b= mBurgerList.get(position);
        holder.imgTim.setImageResource(b.getImgTim());
        holder.imgHinh.setImageResource(b.getImgHinh());
        holder.tvName.setText(b.getName());
        holder.tvPrice.setText("$"+b.getPrice());
        holder.tvRate.setText(b.getRate()+"");

    }

    @Override
    public int getItemCount() {
        return mBurgerList.size();
    }

    public void filterListH(ArrayList<Burger> filterList){
        mBurgerList=filterList;
        notifyDataSetChanged();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView tvName;
        public TextView tvPrice;
        public TextView tvRate;
        public ImageView imgHinh;
        public ImageView imgTim;
        BurgerAdapter burgerAdapter;
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tvName);
            tvPrice=itemView.findViewById(R.id.tvPrice);
            tvRate=itemView.findViewById(R.id.tvRate);
            imgHinh=itemView.findViewById(R.id.imgHinh);
            imgTim=itemView.findViewById(R.id.imgTim);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            int mPostition=getLayoutPosition();
            Burger b=mBurgerList.get(mPostition);
            Intent i= new Intent(context,Screen2.class);
            i.putExtra("imgHinh",b.getImgHinh());
            i.putExtra("imgTim",b.getImgTim());
            i.putExtra("name",b.getName());
            i.putExtra("price",b.getPrice());
            i.putExtra("rate",b.getRate());

            context.startActivity(i);

        }
    }
}
