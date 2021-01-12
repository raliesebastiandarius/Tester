package com.example.menumakanan;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;


    public class DeskripsiFragment extends Fragment {
        protected FragmentListener listener;
        protected TextView tvNama;
        protected TextView tvDeskripsi;
        protected TextView tvTag;
        protected TextView tvBahan;
        protected TextView tvLangkah;
        protected TextView tvTersedia;
        protected Menu menu;

        public DeskripsiFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            View view = inflater.inflate(R.layout.fragment_deskripsi,container,false);
            TextView tvNama = view.findViewById(R.id.nama_menu);
            TextView tvDeskripsi = view.findViewById(R.id.deskripsi_menu);
            TextView tvTag = view.findViewById(R.id.tag_menu);
            TextView tvBahan = view.findViewById(R.id.bahan_menu);
            TextView tvLangkah = view.findViewById(R.id.langkah_menu);
            TextView tvTersedia = view.findViewById(R.id.tersedia_menu);
            return view;
        }

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

    }



