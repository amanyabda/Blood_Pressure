package com.pressure.blood.blood_pressure;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Fragment1 extends Fragment {

    public Fragment1() {

    }

    ImageView imageView1,imageView2,imageView3,imageView4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment1, container, false);

        imageView1=view.findViewById(R.id.imageView6);
        imageView1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IntrodactionPage1.class);
                startActivity(intent);

            }
        });




        imageView2=view.findViewById(R.id.imageView5);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Page22.class);
                startActivity(intent);
            }
        });

        imageView3=view.findViewById(R.id.imageView7);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Page33.class);
                startActivity(intent);
            }
        });


        imageView4=view.findViewById(R.id.imageView8);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Page44.class);
                startActivity(intent);
            }
        });
        return  view;

    }}
