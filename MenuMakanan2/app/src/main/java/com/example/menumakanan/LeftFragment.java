package com.example.menumakanan;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class LeftFragment extends Fragment implements View.OnClickListener {

    protected TextView home,page2,exit,menu,setting;
    protected FragmentListener listener;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_left, container, false);
        this.home=view.findViewById(R.id.home);
        this.page2=view.findViewById(R.id.page2);
        this.exit=view.findViewById(R.id.exit);
        this.menu=view.findViewById(R.id.menu);
        this.setting=view.findViewById(R.id.setting);

        this.home.setOnClickListener(this);
        this.page2.setOnClickListener(this);
        this.exit.setOnClickListener(this);
        this.menu.setOnClickListener(this);
        this.setting.setOnClickListener(this);
        return view;
    }



    @Override
    public void onClick(View view) {
        if(view.getId()==home.getId()){
            this.listener.changePage(1,"");
        }else if(view.getId()==page2.getId()){
            this.listener.changePage(3,"");
        }else if(view.getId()==exit.getId()){
            this.listener.changePage(4,"");
        }else if(view.getId()==menu.getId()){
            this.listener.changePage(5,"");
        }else if(view.getId()==setting.getId()) {
            this.listener.changePage(6, "");
        }
    }

    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof FragmentListener){
            this.listener= (FragmentListener) context;
        }
    }
}
