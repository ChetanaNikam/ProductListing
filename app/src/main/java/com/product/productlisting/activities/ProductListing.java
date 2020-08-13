package com.product.productlisting.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.product.productlisting.interfaces.OnClickItem;
import com.product.productlisting.adapter.ProductAdapter;
import com.product.productlisting.R;
import com.product.productlisting.models.ShopList;

import java.util.ArrayList;

public class ProductListing extends AppCompatActivity {
    private RecyclerView mRv_Product;
    private Context mContext;
    private ArrayList<ShopList> shopLists=getProducts();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productlisting);
        mContext=this;
        initView();
        setProducts();
    }

    private void setProducts() {
        ProductAdapter productAdapter=new ProductAdapter(mContext, shopLists, new OnClickItem() {
            @Override
            public void OnSingleItemClick(int position) {
                Intent intent=new Intent(ProductListing.this,ProductDetails.class);
                intent.putExtra("productListing",shopLists.get(position));
                startActivity(intent);
            }
        });
        mRv_Product.setAdapter(productAdapter);
    }

    private void initView() {
        mRv_Product=findViewById(R.id.rv_products);
        mRv_Product.setLayoutManager(new LinearLayoutManager(this));
    }

    private ArrayList<ShopList> getProducts() {
        ArrayList<ShopList> shopLists= new ArrayList<>();
        shopLists.add(new ShopList("0","Samsung Galaxy ","Samsung Galaxy M31 (Space Black, 8GB RAM, 128GB Storage)","Available","Rating : 4.5","Within 2 days","₹ 19,499.00",R.drawable.mobile2));
        shopLists.add(new ShopList("1","Redmi 8A Dual","Redmi 8A Dual (Sea Blue, 2GB RAM, 32GB Storage) – Dual Cameras & 5,000 mAH Battery","Available","Rating : 4.0","Within 5 days","₹ 25,499.00",R.drawable.mobile1));
        shopLists.add(new ShopList("2","Samsung Galaxy M21","Samsung Galaxy M21 (Midnight Blue, 4GB RAM, 64GB Storage)","Out of Stock","Rating : 5.0","Within 2 days","₹ 30,499.00",R.drawable.mobile2));
        shopLists.add(new ShopList("3","Apple iPhone ","Apple iPhone 7 (32GB) - Black","Available","Rating : 3.5","Within 4 days","₹ 17,499.00",R.drawable.mobile1));
        shopLists.add(new ShopList("4","OnePlus 8 ","OnePlus 8 (Glacial Green 6GB RAM+128GB Storage)","Out of Stock","Rating : 2.5","Within 6 days","₹ 9,499.00",R.drawable.mobile));
        shopLists.add(new ShopList("5","Mi 10  ","Mi 10 (Twilight Grey, 8GB RAM, 128GB Storage) - 108MP Quad Camera, SD 865 Processor, 5G Ready","Available","Rating : 4.5","Within 6 days","₹ 10,499.00",R.drawable.mobile1));
        shopLists.add(new ShopList("6","Samsung Galaxy ","Samsung Galaxy M31 (Space Black, 8GB RAM, 128GB Storage)","Out of Stock","Rating : 5.0","Within 7 days","₹ 30,499.00",R.drawable.mobile2));
        shopLists.add(new ShopList("7","Redmi 8A Dual","Redmi 8A Dual (Sea Blue, 2GB RAM, 32GB Storage) – Dual Cameras & 5,000 mAH Battery","Available","Rating : 3.0","Within 8 days","₹ 22,400.00",R.drawable.mobile));
        shopLists.add(new ShopList("8","Mi 16 ","Mi 10 (Twilight Grey, 8GB RAM, 128GB Storage) - 108MP Quad Camera, SD 865 Processor, 5G Ready","Available","Rating : 2.0","Within 9 days","₹ 30,499.00",R.drawable.mobile1));
        shopLists.add(new ShopList("9","Samsung Galaxy 20 ","Samsung Galaxy M31 (Space Black, 8GB RAM, 128GB Storage)","Out of Stock","Rating : 2.5","Within 4 days","₹ 26,499.00",R.drawable.mobile2));
        return shopLists;

    }
}