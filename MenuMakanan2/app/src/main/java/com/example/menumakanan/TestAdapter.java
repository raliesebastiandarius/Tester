package com.example.menumakanan;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TestAdapter extends BaseAdapter {
    private Activity act;
    private List<Menu> list;
    private ImageButton btnDelete;
    private Context context;

    public TestAdapter(Activity act) {
        this.act = act;
        this.list = new ArrayList<Menu>();
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int i) {
        return this.list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, final View view, ViewGroup viewGroup) {
        View itemView = this.act.getLayoutInflater().inflate(R.layout.item_list, null);
        TextView tvNama = itemView.findViewById(R.id.list_string);
        ImageButton btnDelete = itemView.findViewById(R.id.btn_delete);
        btnDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                remove(i);
            }
        });
        Menu makanan = this.list.get(i);
        String nama = makanan.getNama();
        String tes = makanan.getDeskripsi();
        tvNama.setText(nama);
        return itemView;
    }

    public void addLine(String nama, String deskripsi, String tag, String bahan, String langkah, String tersedia) {
        Menu menu = new Menu(nama, deskripsi, tag, bahan, langkah, tersedia);
        this.list.add(menu);
        this.notifyDataSetChanged();
    }

    public void remove(int position) {
        list.remove(position);
        notifyDataSetChanged();
    }

    }

