package com.pressure.blood.blood_pressure;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Fragment2 extends Fragment {



    public Fragment2() {
    }


    ImageView imageView5,imageView6,imageView7,imageView8;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment2, container, false);


        imageView5=view.findViewById(R.id.imageView1);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Page55.class);
                startActivity(intent);             }
        });


        imageView6=view.findViewById(R.id.imageView2);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Page66.class);
                startActivity(intent);             }
        });

        imageView7=view.findViewById(R.id.imageView3);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Page7.class);
                startActivity(intent);                  }
        });

        imageView8=view.findViewById(R.id.imageView4);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Page8.class);
                startActivity(intent);                   }
        });

        return  view;
    }


}