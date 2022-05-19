package com.example.healthbuddy.dashboard.doctor.navigation.appointment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.healthbuddy.databinding.SenderChatMessagesBinding;

public class ChatFragment extends Fragment {


    SenderChatMessagesBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = SenderChatMessagesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }


}