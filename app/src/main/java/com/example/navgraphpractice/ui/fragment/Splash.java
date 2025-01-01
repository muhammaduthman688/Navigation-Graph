package com.example.navgraphpractice.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navgraphpractice.R;
import com.example.navgraphpractice.databinding.FragmentFragABinding;
import com.example.navgraphpractice.databinding.FragmentFragCBinding;
import com.example.navgraphpractice.databinding.FragmentSplashBinding;
import com.example.navgraphpractice.databinding.FragmentTransactionBinding;

import java.util.Objects;

public class Splash extends Fragment {
    FragmentSplashBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Objects.requireNonNull(((AppCompatActivity) requireActivity()).getSupportActionBar()).hide();
        binding = FragmentSplashBinding.inflate(getLayoutInflater(), container, false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.action_splash_to_main_fragment);
            }
        },3000);
        return binding.getRoot();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Clean up the ViewBinding
        binding = null;
    }
}