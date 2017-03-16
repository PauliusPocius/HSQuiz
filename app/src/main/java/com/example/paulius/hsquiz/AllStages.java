package com.example.paulius.hsquiz;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class AllStages extends AppCompatActivity {

    RankLibrary rankLibrary = new RankLibrary();
    DatabaseHelper MYdb;
    private Intent basicsactivity;
    private Intent naxramasactivity;
    private ImageButton basics;
    private ImageButton naxramas;

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.allstages);

        MYdb= new DatabaseHelper(this);
        ImageView basicsphoto = (ImageView)findViewById(R.id.imageView3);
        ImageView naxramasphoto = (ImageView)findViewById(R.id.imageView4);
        ImageView gvgphoto = (ImageView)findViewById(R.id.imageView5);

        basicsactivity = new Intent(this, BasicsActivity.class);
        naxramasactivity = new Intent(this, NaxramasActivity.class);

        final Cursor res = MYdb.Select();
        res.moveToFirst();
        basicsphoto.setImageResource(rankLibrary.GetPhoto(Integer.parseInt(res.getString(0))));

        Cursor res1 = MYdb.naxramas();
        res1.moveToFirst();
        naxramasphoto.setImageResource(rankLibrary.GetPhoto(Integer.parseInt(res1.getString(0))));

        Cursor res2 = MYdb.gvg();
        res2.moveToFirst();
        gvgphoto.setImageResource(rankLibrary.GetPhoto(Integer.parseInt(res2.getString(0))));


        basics = (ImageButton)findViewById(R.id.basics);
        basics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(basicsactivity);
                finish();
            }
        });

        naxramas = (ImageButton)findViewById(R.id.naxramas);

        naxramas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(res.getString(0))<5) {
                    startActivity(naxramasactivity);
                }else {
                    Toast.makeText(getApplicationContext(),"Required 5 rank in basics",Toast.LENGTH_SHORT).show();
                }
            }
        });}


}
