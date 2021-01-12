package com.example.menumakanan;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment implements View.OnClickListener {
    protected EditText input;
    protected FragmentListener listener;
    protected Button click;
    private View judul;


    public MainFragment() {

    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
//        View view = inflater.inflate(R.layout.fragment_first,container,false);
//        return view;
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceStated) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        this.judul = view.findViewById(R.id.tv_judul);
        this.click = view.findViewById(R.id.btn_cari);
        this.click.setOnClickListener(this);
        return view;
    }
//    public static FirstFragment newInstance(){
//        FirstFragment fragment = new FirstFragment();
//        return fragment;
//    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentListener) {
            this.listener = (FragmentListener) context;
        } else {
            throw new ClassCastException(context.toString()
                    + "must implement FragmentListener");
        }
    }


    @Override
    public void onClick(View view) {

    }



}
