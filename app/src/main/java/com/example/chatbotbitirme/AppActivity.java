package com.example.chatbotbitirme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.chatbotbitirme.Adapters.TabLayoutAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class AppActivity extends AppCompatActivity {

    private Toolbar actionBar;
    TabLayout tabLayout;
    ViewPager2 viewPager;
    TabLayoutAdapter tabLayoutAdapter;



    private void init(){
        actionBar = findViewById(R.id.actionBarApp);
        setSupportActionBar(actionBar);
        getSupportActionBar().setTitle(R.string.app_name);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        init();

        tabLayout = findViewById(R.id.tabLayoutApp);
        viewPager = findViewById(R.id.viewPagerApp);
        tabLayoutAdapter = new TabLayoutAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager.setAdapter(tabLayoutAdapter);

        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                tab.setText(tabLayoutAdapter.pages.get(position));

            }
        }).attach();

    }
}