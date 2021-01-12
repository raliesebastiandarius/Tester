package com.example.menumakanan;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class AddFragment extends Fragment implements View.OnClickListener{
    protected FragmentListener listener;
    protected EditText etNama;
    protected EditText etDeskripsi;
    protected EditText etTag;
    protected EditText etBahan;
    protected EditText etLangkah;
    protected EditText etTersedia;
    protected MainActivity activity;
    protected Button submitButton;
    protected TextView berhasil;

    public AddFragment(MainActivity activity) {
        this.activity = activity;
    }

    public EditText getEtNama() {
        return etNama;
    }

    public EditText getEtDeskripsi() {
        return etDeskripsi;
    }

    public EditText getEtTag() {
        return etTag;
    }

    public EditText getEtBahan() {
        return etBahan;
    }

    public EditText getEtLangkah() {
        return etLangkah;
    }

    public EditText getEtTersedia() {
        return etTersedia;
    }

    public String nama() {
        return etNama.getText().toString();

    }

    public String deskripsi() {
        return etDeskripsi.getText().toString();
    }

    public String tag() {
        return etTag.getText().toString();
    }

    public String bahan() {
        return etBahan.getText().toString();
    }

    public String langkah() {
        return etLangkah.getText().toString();
    }

    public String tersedia() {
        return etTersedia.getText().toString();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_add,container,false);
        this.etNama = view.findViewById(R.id.add_nama);
        this.etDeskripsi = view.findViewById(R.id.add_deskripsi);
        this.etTag = view.findViewById(R.id.add_tag);
        this.etBahan = view.findViewById(R.id.add_bahan);
        this.etLangkah = view.findViewById(R.id.add_langkah);
        this.etTersedia = view.findViewById(R.id.add_tersedia);
        this.submitButton = view.findViewById(R.id.submit_button);
        this.berhasil = view.findViewById(R.id.berhasil);
        this.submitButton.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View view) {
        String nama = nama();
        String deskripsi = deskripsi();
        String tag = tag();
        String bahan = bahan();
        String langkah = langkah();
        String tersedia = tersedia();
        if(view.getId()==submitButton.getId()){
            activity.addLine(nama(),deskripsi,tag,bahan,langkah,tersedia);
            berhasil.setText("Berhasil");
        }

    }



}



