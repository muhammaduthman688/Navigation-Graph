package com.example.navgraphpractice;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navgraphpractice.databinding.FragmentFragABinding;
import com.example.navgraphpractice.databinding.FragmentFragBBinding;
import com.example.navgraphpractice.databinding.FragmentTransactionBinding;

public class Frag_B extends Fragment {

    FragmentFragBBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFragBBinding.inflate(getLayoutInflater(), container, false);

        binding.btnNextb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_frag_B_to_frag_C);
            }
        });

        return binding.getRoot();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Clean up the ViewBinding
        binding = null;
    }
}