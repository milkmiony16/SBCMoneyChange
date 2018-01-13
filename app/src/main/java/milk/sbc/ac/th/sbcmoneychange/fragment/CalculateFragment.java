package milk.sbc.ac.th.sbcmoneychange.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import milk.sbc.ac.th.sbcmoneychange.MainActivity;
import milk.sbc.ac.th.sbcmoneychange.R;

/**
 * Created by LAB3201_00 on 13/1/2561.
 */

public class CalculateFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        Toolbar Controller
        Toolbar toolbar = getView().findViewById(R.id.toobarCalculate);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

        ((MainActivity) getActivity()).getSupportActionBar()
                .setTitle(getString(R.string.th_exchange));

        ((MainActivity) getActivity()).getSupportActionBar()
                .setSubtitle(getString(R.string.th_sub_exchange));
        ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
            ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);










    } //Main Method

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_calculate,container,false);
        return view;
    }
}   //Main Class
