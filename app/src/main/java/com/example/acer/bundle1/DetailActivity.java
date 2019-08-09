package com.example.acer.bundle1;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    TabFragmentAdapter TabFragmentAdapter;
    Pegawai pegawai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tabLayout=(TabLayout)findViewById(R.id.tab_layout);
        viewPager=(ViewPager)findViewById(R.id.view_pager);
        Intent kirim=getIntent();
        pegawai=(Pegawai)getIntent().getSerializableExtra("xxx");
        TabFragmentAdapter=new TabFragmentAdapter(getSupportFragmentManager(),pegawai);
        viewPager.setAdapter(TabFragmentAdapter);
        tabLayout.setTabTextColors(getResources().getColor(R.color.color1),getResources().getColor(R.color.color2));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);
    }
}
