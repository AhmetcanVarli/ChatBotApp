package com.example.chatbotbitirme.Adapters;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.chatbotbitirme.Fragments.ChatFragment;
import com.example.chatbotbitirme.Fragments.FriendsFragment;
import com.example.chatbotbitirme.Fragments.RequestFragment;

import java.util.ArrayList;

import javax.xml.transform.sax.SAXResult;

public class TabLayoutAdapter extends FragmentStateAdapter{

    public ArrayList<String> pages;

    public TabLayoutAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);

        pages = new ArrayList<>();
        pages.add("İstekler");
        pages.add("Mesajlar");
        pages.add("Arkadaşlar");

    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {

        RequestFragment requestFragment = new RequestFragment();
        Bundle bundle = new Bundle();
        bundle.putString("mykey",pages.get(position));
        requestFragment.setArguments(bundle);

        return requestFragment;
    }

    @Override
    public int getItemCount() {
        return pages.size();
    }
}
