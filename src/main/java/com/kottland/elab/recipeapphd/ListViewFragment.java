package com.kottland.elab.recipeapphd;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListViewFragment extends Fragment {


    public ListViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_list_view, container, false);

        View view = inflater.inflate(R.layout.fragment_list_view, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listViewfg);
        listView.setAdapter(new ListViewAdapter(getActivity()));

        /**
         * On Click event for Single Gridview Item
         * */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                Intent intentf = new Intent(getActivity(), GridDetailActivity.class);
                intentf.putExtra("id", position);
                startActivity(intentf);
                // Sending image id to FullScreenActivity
                //  Intent i = new Intent(getApplicationContext(), FullScreenActivity.class);
                //  passing array index
                // i.putExtra("id", position);
                //   startActivity(i);
            }
        });

        return view;
    }

}
