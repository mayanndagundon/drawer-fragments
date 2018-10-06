package com.fragments.drawer.dagundon.drawer_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TextfieldDemoFragment extends Fragment {

    public TextfieldDemoFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private ActionMode supportActionBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView();

        getSupportActionBar().setTitle("Text Field Demo");
    }

    public ActionMode getSupportActionBar() {
        return supportActionBar;
    }

    public void setContentView() {
    }
}
}
