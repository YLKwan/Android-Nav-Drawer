package com.example.navdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentOne extends Fragment {

    public static FragmentOne newInstance(){
        return new FragmentOne();
    }

    public FragmentOne() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ((ActionBarActivity)getActivity()).getSupportActionBar().setTitle("Fragment1");
        return inflater.inflate(R.layout.fragment_fragment_one, container, false);
    }


}
