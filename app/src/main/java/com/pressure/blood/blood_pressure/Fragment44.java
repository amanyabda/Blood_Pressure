package com.pressure.blood.blood_pressure;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Fragment44 extends Fragment {


    public Fragment44() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment44, container, false);

        ImageView imageView1=view.findViewById(R.id.rr);


        return view;}

}
