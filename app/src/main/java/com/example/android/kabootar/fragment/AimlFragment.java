package com.example.android.kabootar.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.android.kabootar.R;
import com.example.android.kabootar.SpecialRequestPage;


public class AimlFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_aiml, container, false);

        Button button = (Button) view.findViewById(R.id.name_0);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpecialRequestPage.email= "zingadeprathamesh12@gmail.com";
                Intent intent = new Intent(getActivity(),SpecialRequestPage.class);
                startActivity(intent);
            }
        });
        Button button1 = (Button) view.findViewById(R.id.name_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpecialRequestPage.email= "zingadeprathamesh12@gmail.com";
                Intent intent = new Intent(getActivity(),SpecialRequestPage.class);
                startActivity(intent);
            }
        });
        Button button2 = (Button) view.findViewById(R.id.name_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpecialRequestPage.email= "zingadeprathamesh12@gmail.com";
                Intent intent = new Intent(getActivity(),SpecialRequestPage.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button) view.findViewById(R.id.name_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpecialRequestPage.email= "zingadeprathamesh12@gmail.com";
                Intent intent = new Intent(getActivity(),SpecialRequestPage.class);
                startActivity(intent);
            }
        });
        Button button4 = (Button) view.findViewById(R.id.name_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpecialRequestPage.email= "zingadeprathamesh12@gmail.com";
                Intent intent = new Intent(getActivity(),SpecialRequestPage.class);
                startActivity(intent);
            }
        });
        Button button5 = (Button) view.findViewById(R.id.name_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpecialRequestPage.email= "zingadeprathamesh12@gmail.com";
                Intent intent = new Intent(getActivity(),SpecialRequestPage.class);
                startActivity(intent);
            }
        });
        Button button6 = (Button) view.findViewById(R.id.name_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpecialRequestPage.email= "bhagyalaxmi.v@sigce.edu.in";
                Intent intent = new Intent(getActivity(),SpecialRequestPage.class);
                startActivity(intent);
            }
        });



        return view;
    }


}