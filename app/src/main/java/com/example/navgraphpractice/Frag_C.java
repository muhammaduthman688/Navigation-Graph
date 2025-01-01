package com.example.navgraphpractice;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navgraphpractice.databinding.FragmentFragBBinding;
import com.example.navgraphpractice.databinding.FragmentFragCBinding;
import com.example.navgraphpractice.databinding.FragmentTransactionBinding;

public class Frag_C extends Fragment {

    FragmentFragCBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFragCBinding.inflate(getLayoutInflater(), container, false);

        return binding.getRoot();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Clean up the ViewBinding
        binding = null;
    }
}