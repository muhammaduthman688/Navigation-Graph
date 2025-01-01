package com.example.navgraphpractice.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navgraphpractice.R;
import com.example.navgraphpractice.databinding.FragmentChooseRecipientBinding;
import com.example.navgraphpractice.databinding.FragmentViewbalanceBinding;

public class FragmentBalance extends Fragment {
    FragmentViewbalanceBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentViewbalanceBinding.inflate(getLayoutInflater(), container, false);
binding.btnNext.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Navigation.findNavController(v).navigate(R.id.action_viewbalanceFragment_to_frag_A);
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