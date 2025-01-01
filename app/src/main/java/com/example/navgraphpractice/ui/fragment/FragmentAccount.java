package com.example.navgraphpractice.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.example.navgraphpractice.databinding.FragmentSpecifyAccountBinding;

public class FragmentAccount extends Fragment {
    FragmentSpecifyAccountBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSpecifyAccountBinding.inflate(getLayoutInflater(), container, false);
        binding.send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assert getArguments() != null;

                String inputText = binding.editText.getText().toString();
                try {
                    int intValue = Integer.parseInt(inputText);

                    NavDirections directions = FragmentAccountDirections.actionSpecifyAccountFragmentToConfirmationFragment(
                            FragmentAccountArgs.fromBundle(getArguments()).getName(),
                            intValue);
                    Navigation.findNavController(v).navigate(directions);
                } catch (NumberFormatException e) {
                    // Handle the case where the input string is not a valid integer
                    // For example, display an error message to the user
                    Toast.makeText(getActivity(), "Input Amount", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigateUp();
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