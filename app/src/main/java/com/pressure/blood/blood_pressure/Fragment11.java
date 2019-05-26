package com.pressure.blood.blood_pressure;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Fragment11 extends Fragment {

ImageView imageView;
    public Fragment11() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment11, container, false);

        imageView=view.findViewById(R.id.food);


return view;
    }

}
