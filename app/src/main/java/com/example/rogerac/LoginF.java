package com.example.rogerac;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class LoginF extends Fragment {
    Button bt;
    private EditText E1,E2;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)

    {
        View view=inflater.inflate(R.layout.login,container,false);

        E1 = (EditText) view.findViewById(R.id.editTextTextPersonName);
        E2 = (EditText) view.findViewById(R.id.editTextTextPersonName3);

        bt=view.findViewById(R.id.button_login);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(E1.getText().toString().equals("Jiro") && E2.getText().toString().equals("15847205"))
                ((Navegation) getActivity()).navegateTo(new MenuF(),false);

                validateEmailAddress(E2);
            }
        });
        return view;
    }

    private  boolean validateEmailAddress(EditText email){
        String emailInput = E2.getText().toString();
        if(E1.getText().toString().equals("Jiro") && E2.getText().toString().equals("15847205")){
            Toast.makeText(getActivity(), "Usuario Correcto", Toast.LENGTH_SHORT).show();
            return  true;
        }else{
            Toast.makeText(getActivity(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
            return  false;
        }
    }

}