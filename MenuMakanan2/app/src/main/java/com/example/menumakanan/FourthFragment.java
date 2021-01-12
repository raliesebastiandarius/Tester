package com.example.menumakanan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FourthFragment extends Fragment {
    protected EditText input;
    protected Button submit;
    protected FragmentListener listener;
    protected TextView tvTitle;

    public FourthFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_fourth,container,false);



        return view;
    }
    //
//    public static SecondFragment newInstance(){
//        SecondFragment fragment = new SecondFragment();
//        return fragment;
//    }

}
