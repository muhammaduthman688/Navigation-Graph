package com.example.navgraphpractice;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navgraphpractice.databinding.FragmentFragABinding;
import com.example.navgraphpractice.databinding.FragmentTransactionBinding;
import com.example.navgraphpractice.databinding.FragmentViewbalanceBinding;

public class Frag_A extends Fragment {

    FragmentFragABinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFragABinding.inflate(getLayoutInflater(), container, false);

        binding.btnNexta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_frag_A_to_frag_B);
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