package com.example.navgraphpractice.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.navgraphpractice.R;
import com.example.navgraphpractice.databinding.FragmentChooseRecipientBinding;
import com.example.navgraphpractice.databinding.FragmentMainFragmentBinding;


public class FragmentReceiptSelection extends Fragment {

    FragmentChooseRecipientBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentChooseRecipientBinding.inflate(getLayoutInflater(), container, false);
        binding.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = binding.editText.getText().toString();
                if (!inputText.isEmpty()) {
                    NavDirections directions = FragmentReceiptSelectionDirections
                            .actionChooseRecipientFragmentToSpecifyAccountFragment(inputText);
                    Navigation.findNavController(v).navigate(directions);
                } else {
                    // Handle the case where the input string is empty
                    Toast.makeText(getActivity(), "Enter Recipient", Toast.LENGTH_SHORT).show();
                }
            }
        });

//        binding.next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                NavDirections directions = FragmentReceiptSelectionDirections.
//                        actionChooseRecipientFragmentToSpecifyAccountFragment(binding.editText.getText().toString());
//                Navigation.findNavController(v).navigate(directions);
//            }
//        });
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