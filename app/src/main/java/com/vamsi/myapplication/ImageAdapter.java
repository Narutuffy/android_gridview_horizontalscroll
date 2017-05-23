package com.vamsi.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


import static com.vamsi.myapplication.Data.imageArray;

/**
 * Created by Vamsi Rao on 5/22/2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context context;

    public ImageAdapter(Context c) {
    context=c;
    }

    @Override
    public int getCount() {
        return imageArray.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ImageView imageView;
        if(convertView==null){
            imageView=new ImageView(context);
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
             }
             else{
            imageView=(ImageView)convertView;
        }
        imageView.setImageResource(imageArray.get(position));
        return imageView;
    }



}
