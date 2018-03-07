package com.kottland.elab.recipeapphd;

/**
 * Created by KottLand Lab on 8/27/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KottLand Lab on 6/17/2017.
 */

public class ListViewAdapter extends BaseAdapter {

    private final List<ListViewAdapter.Item> mItems = new ArrayList<ListViewAdapter.Item>();
    private final LayoutInflater mInflater;








    public ListViewAdapter(Context context){
        mInflater = LayoutInflater.from(context);


        mItems.add(new ListViewAdapter.Item("Cinnamon_rolls", R.drawable.recipe ) );  mItems.add(new ListViewAdapter.Item("Banana_bread", R.drawable.health_food ) );
        mItems.add(new ListViewAdapter.Item("Cupcakes", R.drawable.healthy_food2 ) );  mItems.add(new ListViewAdapter.Item("German_pancakes", R.drawable.recipe ) );
        mItems.add(new ListViewAdapter.Item("French_toast", R.drawable.recipe ) );  mItems.add(new ListViewAdapter.Item("Blintzes", R.drawable.health_food ) );
        mItems.add(new ListViewAdapter.Item("Biscuits", R.drawable.healthy_food2 ) );  mItems.add(new ListViewAdapter.Item("Biscuits", R.drawable.recipe ) );



        mItems.add(new Item("Cinnamon_rolls", R.drawable.recipe ) );  mItems.add(new Item("Banana_bread", R.drawable.health_food ) );
        mItems.add(new Item("Cupcakes", R.drawable.healthy_food2 ) );  mItems.add(new Item("German_pancakes", R.drawable.recipe ) );
        mItems.add(new Item("French_toast", R.drawable.recipe ) );  mItems.add(new Item("Blintzes", R.drawable.health_food ) );
        mItems.add(new Item("Biscuits", R.drawable.healthy_food2 ) );  mItems.add(new Item("Biscuits", R.drawable.recipe ) );





    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public ListViewAdapter.Item getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return mItems.get(i).drawableId;
    }



    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;
        ImageView picture;
        TextView name;
        if (v==null){

            v= mInflater.inflate(R.layout.list_itemz, viewGroup, false);
            v.setTag(R.id.picture_list, v.findViewById(R.id.picture_list));
            v.setTag(R.id.text_list,v.findViewById(R.id.text_list));
        }

        picture = (ImageView)v.getTag(R.id.picture_list);
        name = (TextView)v.getTag(R.id.text_list);
        ListViewAdapter.Item item = getItem(i);
        picture.setImageResource(item.drawableId);
        name.setText(item.name);
        return v;

    }

    private static class Item {
        public final String name;
        public final  int  drawableId;
        Item(String name, int drawableId){
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}

