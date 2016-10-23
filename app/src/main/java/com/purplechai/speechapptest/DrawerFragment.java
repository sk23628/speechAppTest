package com.purplechai.speechapptest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Nikhil on 10/23/2016.
 */

public class DrawerFragment extends Fragment {

TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.drawer_layout,container,false);
    }

    @Override
    public void onStart() {
        textView=(TextView) getView().findViewById(R.id.bTranslateToGerman);
        //getActivity().finish();
        super.onStart();
    }

    void test(){

    }
}
