package com.example.menumakanan;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentListener {

    protected MainFragment fragment1;
    protected FragmentManager fragmentManager;
    protected SecondFragment fragment2;
    protected ThirdFragment fragment3;
    protected FourthFragment fragment4;
    protected DeskripsiFragment fragmentDeskripsi;
    protected AddFragment fragmentAdd;
    protected ResultDialogFragment resultDialogFragment;
    protected TestAdapter adapter;
    Toolbar toolbar;
    protected DrawerLayout drawer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.adapter = new TestAdapter(this);
        this.fragment1 = new MainFragment();
        this.fragment2 = new SecondFragment(this,adapter);
        this.fragment3 = new ThirdFragment();
        this.fragment4 = new FourthFragment();
        this.fragmentDeskripsi = new DeskripsiFragment();
        this.fragmentAdd = new AddFragment(this);
        this.fragmentManager = this.getSupportFragmentManager();
        this.resultDialogFragment = new ResultDialogFragment();
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        ft.add(R.id.fragment_container, this.fragment1).addToBackStack(null).commit();
        this.toolbar = this.findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);
        this.drawer = this.findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle abdt = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.openDrawer, R.string.closeDrawer);
        drawer.addDrawerListener(abdt);
        abdt.syncState();
    }

    public void setSupportActionBar(Toolbar toolbar) {
        this.toolbar = toolbar;
    }

    @Override
    public void changePage(int page, String input) {
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        if (page == 1) {
            if (this.fragment1.isAdded()) {
                ft.show(this.fragment1);
            } else {
                ft.add(R.id.fragment_container, this.fragment1);
            }
            ft.hide(this.fragment4);
            ft.hide(this.fragment2);
            ft.hide(this.fragment3);
            ft.hide(this.resultDialogFragment);
        } else if (page == 2) {
            this.resultDialogFragment = ResultDialogFragment.newInstance(input);
            this.resultDialogFragment.show(this.getSupportFragmentManager(), "dialog");
        } else if (page == 3) {
            if (this.fragment2.isAdded()) {
                ft.show(this.fragment2);
            } else {
                ft.add(R.id.fragment_container, this.fragment2);
            }
            ft.hide(this.fragment4);
            ft.hide(this.fragment3);
            ft.hide(this.fragment1);
        } else if (page == 4) {
            this.closeApplication();
        } else if (page == 5) {
            if (this.fragment3.isAdded()) {
                ft.show(this.fragment3);
            } else {
                ft.add(R.id.fragment_container, this.fragment3);
            }
            ft.hide(this.fragment4);
            ft.hide(this.fragment2);
            ft.hide(this.fragment1);
        } else if (page == 6) {
            if (this.fragment4.isAdded()) {
                ft.show(this.fragment4);
            } else {
                ft.add(R.id.fragment_container, this.fragment4);
            }
            ft.hide(this.fragment3);
            ft.hide(this.fragment2);
            ft.hide(this.fragment1);
        } else if (page == 7) {
            if (this.fragmentAdd.isAdded()) {
                ft.show(this.fragmentAdd);
            } else {
                ft.add(R.id.fragment_container, this.fragmentAdd);
            }
            ft.hide(this.fragment3);
            ft.hide(this.fragment2);
            ft.hide(this.fragment1);
        }
        ft.commit();
        this.drawer.closeDrawers();
    }

    @Override
    public void closeApplication() {
        this.moveTaskToBack(true);
        this.finish();
    }

    public void addLine (String nama, String deskripsi, String tag, String bahan, String langkah, String tersedia) {
        adapter.addLine(nama, deskripsi, tag, bahan, langkah, tersedia);
    }
}