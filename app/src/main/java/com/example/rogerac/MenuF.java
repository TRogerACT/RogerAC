package com.example.rogerac;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class MenuF extends Fragment {

    ImageButton bt;
    ImageButton bt2;
    ImageButton bt3;
    ImageButton bt4;
    ImageButton bt5;
    ImageButton bt6;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflanter, ViewGroup container, Bundle savedInstanceState

            ) {
        View view = inflanter.inflate(R.layout.activity_menu, container, false);
        bt=view.findViewById(R.id.hbo1);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), hbo.class);
                startActivity(intent);
            }
        });
        bt2=view.findViewById(R.id.star1);
        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Star.class);
                startActivity(intent);
            }
        });
        bt3=view.findViewById(R.id.disney1);
        bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), disney.class);
                startActivity(intent);
            }
        });
        bt4=view.findViewById(R.id.spotify1);
        bt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), spotify.class);
                startActivity(intent);
            }
        });
        bt5=view.findViewById(R.id.paramount1);
        bt5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Paramount.class);
                startActivity(intent);
            }
        });
        bt6=view.findViewById(R.id.bins1);
        bt6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Bins.class);
                startActivity(intent);
            }
        });

        return view;
    }


}
