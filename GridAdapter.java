package com.example.shank.alumini;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;








public class GridAdapter extends BaseAdapter {
    private Context mContext;

    public GridAdapter(Context c){
        mContext=c;
    }

@Override

    public int getCount() {

        return lettersIcon.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public GridAdapter() {
        super();
    }

    @Override
    public boolean hasStableIds() {
        return super.hasStableIds();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
ImageView imageView;

        if(convertView==null){
            imageView=new ImageView((mContext));
            imageView.setLayoutParams(new GridView.LayoutParams(85,85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        }else {
            imageView = (ImageView) convertView;

        }


        imageView.setImageResource(lettersIcon[position]);
        return imageView;

    }


    private Integer[] lettersIcon={R.drawable.eee,R.drawable.it42,R.drawable.mech42,R.drawable.ece42,R.drawable.chem,R.drawable.civil
    };
}