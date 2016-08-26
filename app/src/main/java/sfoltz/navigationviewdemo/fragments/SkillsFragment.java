package sfoltz.navigationviewdemo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sfoltz.navigationviewdemo.R;

/**
 * Created by scottfoltz on 8/26/16.
 */
public class SkillsFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_skills,container,false);
        return v;
    }
}
