package com.example.menumakanan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment implements View.OnClickListener {
    protected EditText input;
    protected FragmentListener listener;
    protected TextView tvTitle;
    protected ListView listMenu;
    protected TestAdapter adapter;
    protected MainActivity activity;
    protected Button addButton;
    protected AddFragment addFragment;
    protected ImageButton btnDelete;

    public SecondFragment(MainActivity activity, TestAdapter adapter) {
        this.activity = activity;
        this.adapter = adapter;
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        this.listMenu = view.findViewById(R.id.menu_makanan);
        this.addButton = view.findViewById(R.id.add_button);
        this.btnDelete = view.findViewById(R.id.btn_delete);

        this.addButton.setOnClickListener(this);
        this.listMenu.setAdapter(this.adapter);
        this.adapter.addLine("nasi rebus", "rebus", "goreng", "nasi dan minyak", "goreng", "unpar");
        this.adapter.addLine("nasi bakar", "digorqweeng", "gorenqweg", "naasdsi dan minyak", "goreng", "unpar");
        this.adapter.addLine("nasi panggang", "diqweqgoreng", "goreqweng", "nasi dan minyak", "goreng", "unpar");
        this.adapter.addLine(" goreng", "digoreng", "goreng", "nasi dan minyak", "goreng", "unpar");
        listMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("error", "tes");
                Menu menu = (Menu) adapter.getItem(i);
                Intent intent = new Intent(view.getContext(), Deskripsi.class);
                intent.putExtra("Menu", menu);
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == addButton.getId()) {
            this.activity.changePage(7, "");
        }

        //
//    public static SecondFragment newInstance(){
//        SecondFragment fragment = new SecondFragment();
//        return fragment;
//    }

    }
}
