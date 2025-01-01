package com.example.navgraphpractice.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navgraphpractice.R;
import com.example.navgraphpractice.databinding.FragmentChooseRecipientBinding;
import com.example.navgraphpractice.databinding.FragmentConfirmationBinding;
import com.example.navgraphpractice.databinding.FragmentTransactionBinding;


public class FragmentTransaction extends Fragment {
    FragmentTransactionBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTransactionBinding.inflate(getLayoutInflater(), container, false);

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Clean up the ViewBinding
        binding = null;
    }
}