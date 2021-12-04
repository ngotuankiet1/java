package com.example.java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.java.Object.TruyenTranh;
import com.example.java.adapter.TruyenTranhAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
GridView gdvDSTruyen;
TruyenTranhAdapter adapter;
ArrayList<TruyenTranh> truyenTranhArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        anhXa();
        setUp();
        setClick();
    }
    private void init(){
        truyenTranhArrayList = new ArrayList<>();
        truyenTranhArrayList.add(new TruyenTranh("BỐ TÔI QUÁ MẠNH\n","Chapter 1","http://st.imageinstant.net/data/comics/165/bo-toi-qua-manh.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("TU TIÊN GIẢ ĐẠI CHIẾN SIÊU NĂNG LỰC","Chapter 1","http://st.imageinstant.net/data/comics/212/tu-tien-gia-dai-chien-sieu-nang-luc.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("CHÚA TỂ HỌC ĐƯỜNG","Chapter 507.5","http://st.imageinstant.net/data/comics/94/chua-te-hoc-duong.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("ANH HÙNG ONEPUNCH","Chapter 201: Raw","http://st.imageinstant.net/data/comics/37/anh-hung-onepunch.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("BỐ TÔI QUÁ MẠNH\n","Chapter 1","http://st.imageinstant.net/data/comics/165/bo-toi-qua-manh.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("TU TIÊN GIẢ ĐẠI CHIẾN SIÊU NĂNG LỰC","Chapter 1","http://st.imageinstant.net/data/comics/212/tu-tien-gia-dai-chien-sieu-nang-luc.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("CHÚA TỂ HỌC ĐƯỜNG","Chapter 507.5","http://st.imageinstant.net/data/comics/94/chua-te-hoc-duong.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("ANH HÙNG ONEPUNCH","Chapter 201: Raw","http://st.imageinstant.net/data/comics/37/anh-hung-onepunch.jpg"));

        adapter = new TruyenTranhAdapter(this , 0,truyenTranhArrayList);
    }
    private void anhXa(){
        gdvDSTruyen = findViewById(R.id.gdvDSTruyen);
    }
    private void setUp(){
        gdvDSTruyen.setAdapter(adapter);
    }
    private void setClick(){

    }
}