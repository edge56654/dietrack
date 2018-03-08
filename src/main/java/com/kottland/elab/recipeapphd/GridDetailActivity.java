package com.kottland.elab.recipeapphd;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class GridDetailActivity extends AppCompatActivity {

    int position;
    private ImageView imageView;
    private TextView textView;
    private TextView dtextView;
    private TextView titletextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_detail);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Dietrack", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        // Set tile for the ViewPager
        setTitle(" Grid Details Activity ");

        // get intent data
        Intent i = getIntent();
        position = i.getExtras().getInt("id");

        MyGridAdapter gridAdapter = new MyGridAdapter(this);
        // List<MyGridAdapter.Item> mItems = new ArrayList<MyGridAdapter.Item>();

        List<ImageView> mItems = new ArrayList<ImageView>();

        // Retrieve all the images
        for (int position = 0; position < gridAdapter.getCount(); position++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(gridAdapter.mThumbIds[position]);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);




            mItems.add(imageView);
        }


        imageView = (ImageView)findViewById(R.id.image_grddetails);
        imageView.setImageResource(gridAdapter.mThumbIds[position]);

        textView = (TextView)findViewById(R.id.description_TextView);
        textView.setText(gridAdapter.mDescriptionTXT[position]);

        dtextView = (TextView)findViewById(R.id.details_text);
        dtextView.setText(gridAdapter.Ingredients[position]);

        titletextView = (TextView)findViewById(R.id.restitle);
        titletextView.setText(gridAdapter.mRecipeTitle[position]);


    }
}
