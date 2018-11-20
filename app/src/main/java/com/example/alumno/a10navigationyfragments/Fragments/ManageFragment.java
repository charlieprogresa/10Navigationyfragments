package com.example.alumno.a10navigationyfragments.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alumno.a10navigationyfragments.MainActivity;
import com.example.alumno.a10navigationyfragments.R;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class ManageFragment extends Fragment {

    private TextView textViewManage;
    private Button buttonManage;
    private ImageView imageViewManage;
    private Context context;

    public ManageFragment() {
        // Required empty public constructor
        context = getActivity();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_manage, container, false);
        //  TODO CODIGO NECESARIO PARA QUE EL FRAME FUNCIONE
        textViewManage = rootView.findViewById(R.id.lblManage);
        buttonManage = rootView.findViewById(R.id.buttonManage);
        imageViewManage = rootView.findViewById(R.id.ivImagen);

        buttonManage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(container.getContext(), "Estoy en manage.", Toast.LENGTH_SHORT).show();
                Toast.makeText(context, "Esto es un mensage", Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }

}

