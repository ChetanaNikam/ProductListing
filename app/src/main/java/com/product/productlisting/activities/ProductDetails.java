package com.product.productlisting.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.product.productlisting.R;
import com.product.productlisting.models.ShopList;

public class ProductDetails extends AppCompatActivity {
    private ShopList Response;
    private TextView mtv_expectedTime,mtv_price;
    private TextView mtv_rating,mtv_product_name,mtv_productstatus,mtv_productspec;
    private ImageView mimg_product;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        getIntentData();
        initView();
        setData();
    }

    private void initView() {
        mtv_expectedTime=findViewById(R.id.tv_expectedTime_details);
        mtv_rating=findViewById(R.id.tv_rating_details);
        mtv_product_name=findViewById(R.id.tv_productname_details);
        mtv_productstatus=findViewById(R.id.tv_product_tatus_details);
        mtv_productspec=findViewById(R.id.tv_product_spec_details);
        mimg_product=findViewById(R.id.img_product_details);
        mtv_price=findViewById(R.id.tv_price_details);
    }

    private void setData() {
        mtv_expectedTime.setText(Response.getExpected_delivery_time());
        mtv_rating.setText(Response.getRating());
        mtv_price.setText(Response.getPrice());
        mtv_productspec.setText(Response.getProduct_special());
        mtv_product_name.setText(Response.getProduct_name());
        mtv_productstatus.setText(Response.getProduct_status());
        mimg_product.setImageResource(Response.getProduct_image());
    }

    private void getIntentData() {
        Intent intent=getIntent();
        Response=(ShopList) intent.getSerializableExtra("productListing");
    }
}