package com.pressure.blood.blood_pressure;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Fragment22 extends Fragment {
    ImageView imageView1;

    public Fragment22() {

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment22, container, false);

        imageView1=view.findViewById(R.id.food1);


        return view;
    }    }




