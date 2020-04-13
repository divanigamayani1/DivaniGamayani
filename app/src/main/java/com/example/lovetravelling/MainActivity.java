package com.example.lovetravelling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //variabel
    private ArrayList <String> mNames = new ArrayList<>();
    private ArrayList <String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmap: preparing bitmaps.");

        mImageUrls.add("https://cdn2.tstatic.net/kaltim/foto/bank/images2/instagram-kvntli-pantai-pandawa-di-bali.jpg");
        mNames.add("Pantai Pandawa");

        mImageUrls.add("https://cdn.water-sport-bali.com/wp-content/uploads/2014/04/Gili-Trawangan.jpg");
        mNames.add("Gili Terawangan");

        mImageUrls.add("https://www.sunshineseeker.com/wp-content/uploads/2016/06/Tegalalang-Rice-Terrace-Ubud.jpg");
        mNames.add("Terrace Ubud Bali");

        mImageUrls.add("https://www.balisafarimarinepark.com/wp-content/uploads/2017/11/17015830_10154515632888931_1877145227028070565_o.jpg");
        mNames.add("Bali Taman Safari");

        mImageUrls.add("https://www.balibirdpark.com/slide/04.jpg");
        mNames.add("Bali Bird Park");
        initRecyclerView();
    }
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
