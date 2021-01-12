package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Deskripsi extends AppCompatActivity {
    private List<Menu> list;
    private Menu menu;
    private TestAdapter ta;

    public Deskripsi() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_deskripsi);

        this.menu = (Menu) getIntent().getSerializableExtra("Menu");
        TextView tvNama = this.findViewById(R.id.nama_menu);
        TextView tvDeskripsi = this.findViewById(R.id.deskripsi_menu);
        TextView tvTag = this.findViewById(R.id.tag_menu);
        TextView tvBahan = this.findViewById(R.id.bahan_menu);
        TextView tvLangkah = this.findViewById(R.id.langkah_menu);
        TextView tvTersedia = this.findViewById(R.id.tersedia_menu);
        String nama = menu.getNama();
        String deskripsi = menu.getDeskripsi();
        String tag = menu.getTag();
        String bahan = menu.getBahan();
        String langkah = menu.getLangkah();
        String tersedia = menu.getTersedia();
        tvNama.setText(nama);
        tvDeskripsi.setText(deskripsi);
        tvTag.setText(tag);
        tvBahan.setText(bahan);
        tvLangkah.setText(langkah);
        tvTersedia.setText(tersedia);




    }

}
