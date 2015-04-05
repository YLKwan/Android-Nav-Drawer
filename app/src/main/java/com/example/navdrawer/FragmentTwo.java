package com.example.navdrawer;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentTwo extends Fragment {


    public static FragmentTwo newInstance(){
        return new FragmentTwo();
    }

    public FragmentTwo() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ((ActionBarActivity)getActivity()).getSupportActionBar().setTitle("Fragment2");
        return inflater.inflate(R.layout.fragment_fragment_two, container, false);
    }


}
