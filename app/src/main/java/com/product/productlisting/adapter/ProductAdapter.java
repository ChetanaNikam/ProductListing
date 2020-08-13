package com.product.productlisting.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.product.productlisting.R;
import com.product.productlisting.models.ShopList;
import com.product.productlisting.interfaces.OnClickItem;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<ShopList> mResponse;
    private OnClickItem onClickLayout;

    public ProductAdapter(Context mContext, ArrayList<ShopList> mResponse, OnClickItem onClick) {
        this.mContext = mContext;
        this.mResponse = mResponse;
        this.onClickLayout=onClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_product_list,parent,false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.mtv_expectedTime.setText(mResponse.get(position).getExpected_delivery_time());
        holder.mtv_rating.setText(mResponse.get(position).getRating());
        holder.mtv_price.setText(mResponse.get(position).getPrice());
        holder.mtv_productspec.setText(mResponse.get(position).getProduct_special());
        holder.mtv_product_name.setText(mResponse.get(position).getProduct_name());
        holder.mtv_productstatus.setText(mResponse.get(position).getProduct_status());
        holder.mimg_product.setImageResource(mResponse.get(position).getProduct_image());



       holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickLayout.OnSingleItemClick(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mResponse.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mtv_expectedTime,mtv_price;
        private TextView mtv_rating,mtv_product_name,mtv_productstatus,mtv_productspec;
        private ImageView mimg_product;
        private LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mtv_expectedTime=itemView.findViewById(R.id.tv_expectedTime);
            mtv_rating=itemView.findViewById(R.id.tv_rating);
            mtv_product_name=itemView.findViewById(R.id.tv_productname);
            mtv_productstatus=itemView.findViewById(R.id.tv_product_tatus);
            mtv_productspec=itemView.findViewById(R.id.tv_product_spec);
            mimg_product=itemView.findViewById(R.id.img_product);
            mtv_price=itemView.findViewById(R.id.tv_price);
            linearLayout=itemView.findViewById(R.id.ll_productlist);
        }
    }
}
