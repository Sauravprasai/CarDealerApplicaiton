package com.android.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AddProduct extends AppCompatActivity {

    // Declare your UI components
    private ImageView mImageViewProduct;
    private EditText mEditTextName;
    private EditText mEditTextDescription;
    private EditText mEditTextPrice;
    private Button mButtonSelectImage;
    private Button mButtonAddProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        // Initialize your UI components
        mImageViewProduct = findViewById(R.id.image_view_product);
        mEditTextName = findViewById(R.id.edit_text_name);
        mEditTextDescription = findViewById(R.id.edit_text_description);
        mEditTextPrice = findViewById(R.id.edit_text_price);
        mButtonSelectImage = findViewById(R.id.button_select_image);
        mButtonAddProduct = findViewById(R.id.button_add_product);

        // Set onClickListener for your buttons
        mButtonSelectImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mButtonAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
