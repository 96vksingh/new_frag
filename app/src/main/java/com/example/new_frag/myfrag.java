package com.example.new_frag;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class myfrag extends Fragment{


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

                }
            });
        }
        else if(MainActivity.imgnum==2){


            i.setImageResource(R.drawable.download);
            i.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i.setVisibility(View.INVISIBLE);

                }
            });



        }
        else if(MainActivity.imgnum==3){


            i.setImageResource(R.drawable.download11);
            i.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i.setVisibility(View.INVISIBLE);

                }
            });

        }
        else if(MainActivity.imgnum==4){

            i.setImageResource(R.drawable.download22);
            i.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i.setVisibility(View.INVISIBLE);

                }
            });


        }
        super.onViewCreated(view, savedInstanceState);
    }
}
