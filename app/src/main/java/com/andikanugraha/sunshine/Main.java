package com.andikanugraha.sunshine;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Main extends Fragment {



    ArrayAdapter<String> mForecastAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        String[] forecastArray = {
                "Hari ini - Mendung - 88/63",
                "Besok - Cerah - 88/63",
                "Kamis - Mendung - 88/63",
                "Jumat - Mendung - 88/63",
                "Sabtu - Mendung - 88/63",
                "Minggu - Mendung - 88/63",
                "Jumat - Mendung - 88/63",
                "Sabtu - Mendung - 88/63",
                "Minggu - Mendung - 88/63",
                "Senin - Mendung - 88/63"
        };

        String[] dummies = {
                "andika",
                "andika",
                "andika",
                "andika",
                "andika",
                "andika",
                "andika",
                "andika",
                "andika"
        };

        List<String> mingguan = new ArrayList<String>(Arrays.asList(dummies));
        // Inflate the layout for this fragment
        mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),R.layout.list_item_forecast, R.id.list_item_forecase_textview, mingguan
        );

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);
        return rootView;
    }

}
