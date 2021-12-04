package com.example.rogerac;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class introActivity extends Fragment {
    Button bt;
    @Override
    public View onCreateView(
            @   NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)

    {
        View view=inflater.inflate(R.layout.activity_intro,container,false);
        bt=view.findViewById(R.id.button_into);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ((Navegation) getActivity()).navegateTo(new LoginF(),false);
            }
        });


        return view;
    }

}