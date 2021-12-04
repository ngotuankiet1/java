package com.example.java.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.java.Object.TruyenTranh;
import com.example.java.R;

import java.util.ArrayList;
import java.util.List;
public class TruyenTranhAdapter extends ArrayAdapter<TruyenTranh> {
    private Context ct;
    private ArrayList<TruyenTranh> arr;
    public TruyenTranhAdapter(Context context ,int resource,List<TruyenTranh> objects){
        super(context , resource , objects);
        this.ct = context;
        this.arr = new ArrayList<>(objects);
    }
    @Override
    public View getView(int position , View converView, ViewGroup parent){
        if(converView==null){
            LayoutInflater inflater = (LayoutInflater)ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            converView = inflater.inflate(R.layout.item_truyen , null);

        }
        if(arr.size()>0){
            TruyenTranh truyenTranh = this.arr.get(position);
            TextView tenTentruyen = converView.findViewById(R.id.txtTentruyen);
            TextView tentTenchap = converView.findViewById(R.id.txtTenchap);
            ImageView imgAnhtruyen = converView.findViewById(R.id.imgAnhtruyen);

            tenTentruyen.setText(truyenTranh.getNameComic());
            tentTenchap.setText(truyenTranh.getNumberChapter());
            Glide.with(this.ct).load(truyenTranh.getLinkPicture()).into(imgAnhtruyen);

        }
        return converView;
    }
}
