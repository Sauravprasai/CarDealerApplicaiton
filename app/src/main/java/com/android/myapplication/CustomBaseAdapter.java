package com.android.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {
    Context context;
    String listCar[];
    int listImages[];
    String listDesp[];
    int listPrice[];
    int listStatus[];
    LayoutInflater inflater;


    public CustomBaseAdapter(Context ctx,String[] carList, int[] carImages, String[] carDescription, int[] carPrice,int[] carStatus){
        this.context =ctx;
        this.listCar = carList;
        this.listImages = carImages;
        this.listDesp = carDescription;
        this.listPrice = carPrice;
        this.listStatus = carStatus;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listCar.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView titleView = (TextView) convertView.findViewById(R.id.text_view_title);
        ImageView carImage = (ImageView)  convertView.findViewById(R.id.image_view_icon);
        TextView descView = (TextView) convertView.findViewById(R.id.text_view_short_description);
        TextView priceView =(TextView) convertView.findViewById(R.id.text_view_price);
        TextView statusView = (TextView) convertView.findViewById(R.id.text_view_status_value);

        titleView.setText(listCar[position]);
        carImage.setImageResource(listImages[position]);
        descView.setText(listDesp[position]);
        priceView.setText(String.valueOf(listPrice[position]));

        if (listStatus[position] == 1) {
            statusView.setText("Sold");
        } else {
            statusView.setText("Unsold");
        }

        return convertView;
    }
}