package com.example.new_frag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView i1,i2,i3,i4;
    static int imgnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1=findViewById(R.id.imageView2);
        i2=findViewById(R.id.imageView3);
        i3=findViewById(R.id.imageView4);
        i4=findViewById(R.id.imageView5);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fl=getSupportFragmentManager().beginTransaction();

                fl.replace(R.id.fragment,new myfrag1());
                fl.commit();
                imgnum=1;
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fl=getSupportFragmentManager().beginTransaction();

                fl.replace(R.id.fragment,new myfrag1());
                fl.commit();
                imgnum=2;
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fl=getSupportFragmentManager().beginTransaction();

                fl.replace(R.id.fragment,new myfrag1());
                fl.commit();
                imgnum=3;
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fl=getSupportFragmentManager().beginTransaction();

                fl.replace(R.id.fragment,new myfrag1());
                fl.commit();
                imgnum=4;
            }
        });
    }
}
