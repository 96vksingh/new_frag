package com.example.new_frag;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link myfrag1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link myfrag1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class myfrag1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        return inflater.inflate(R.layout.myfrag_layout,
                container, false);


    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        final ImageView i = view.findViewById(R.id.imageView);
        if(MainActivity.imgnum==1){

            i.setImageResource(R.drawable.random);
            i.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i.setVisibility(View.INVISIBLE);
                    Toast.makeText(getContext(),"here",Toast.LENGTH_SHORT).show();

                }
            });
        }
        else if(MainActivity.imgnum==2){


            i.setImageResource(R.drawable.download);
            i.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i.setVisibility(View.INVISIBLE);
                    Toast.makeText(getContext(),"here",Toast.LENGTH_SHORT).show();
                }
            });



        }
        else if(MainActivity.imgnum==3){


            i.setImageResource(R.drawable.download11);
            i.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i.setVisibility(View.INVISIBLE);
                    Toast.makeText(getContext(),"here",Toast.LENGTH_SHORT).show();
                }
            });

        }
        else if(MainActivity.imgnum==4){

            i.setImageResource(R.drawable.download22);
            i.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i.setVisibility(View.INVISIBLE);
                    Toast.makeText(getContext(),"here",Toast.LENGTH_SHORT).show();
                }
            });


        }
        super.onViewCreated(view, savedInstanceState);
    }
}
