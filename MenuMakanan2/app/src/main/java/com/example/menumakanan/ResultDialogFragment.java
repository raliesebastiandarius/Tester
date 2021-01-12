package com.example.menumakanan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;

public class ResultDialogFragment extends DialogFragment {
    protected TextView tvResult;

    public static ResultDialogFragment newInstance(String s){
        Bundle args = new Bundle();
        ResultDialogFragment fragment = new ResultDialogFragment();
        args.putString("text",s);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ){
        View view = inflater.inflate(R.layout.fragment_dialog,container,false);
        this.tvResult = view.findViewById(R.id.tvResult);
        this.tvResult.setText(this.getArguments().getString("text",""));
        return view;
    }
}
