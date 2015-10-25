package com.example.mitrikyle.jambuds;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class ExperienceListFragment extends ListFragment {


    private static final String TAG =  "ExperienceListFragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setupAdapter();
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }

    private class ExperienceItemAdapter extends ArrayAdapter<String> {
        public ExperienceItemAdapter(List<String> experienceItems){
            super(getActivity(), 0, experienceItems);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            if(convertView == null){
                convertView = getActivity().getLayoutInflater()
                        .inflate(R.layout.list_item_experience, null);
            }

            String item = getItem(position);

            TextView textView = (TextView) convertView.findViewById(R.id.instrumentTextView);
            textView.setText(item);
            CheckBox beginnerCheckBox = (CheckBox)convertView.findViewById(R.id.beginnerCheckBox);
            CheckBox intermediateCheckBox = (CheckBox)convertView.findViewById(R.id.intermediateCheckBox);
            CheckBox advancedCheckBox = (CheckBox)convertView.findViewById(R.id.advancedCheckBox);

            return convertView;
        }
    }

    public void setupAdapter() {
        /*
        int location = getActivity().getIntent().getIntExtra("location", 1); // defaults to best dining hall
        Bundle bundle = getArguments();
        mQuery = bundle.getString("query", null);
        ParseQuery<FoodItem> query = ParseQuery.getQuery(FoodItem.class);
        query.whereEqualTo("location", location);
        if (mQuery!=null) {
            Log.d(TAG, "Query: " + mQuery);
            query.whereStartsWith("title", mQuery);
            // TODO query parse with search
        }
        query.findInBackground(new FindCallback<FoodItem>() {
            @Override
            public void done(List<FoodItem> list, ParseException e) {
                if (e == null) {
                    FoodItemAdapter adapter = new FoodItemAdapter(list);
                    setListAdapter(adapter);
                    Log.d(TAG, "Query is done");
                } else {
                    Log.d("FoodItem", "Error: " + e.getMessage());
                }
            }
        });
    } */
        ArrayList<String> stuff = new ArrayList<String>();
        stuff.add("Test");
        stuff.add("Rekt");
        stuff.add("Piano and Viola");
        setListAdapter(new ExperienceItemAdapter(stuff));
    }


}
