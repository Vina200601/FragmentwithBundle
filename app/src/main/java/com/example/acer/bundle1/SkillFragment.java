package com.example.acer.bundle1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SkillFragment extends Fragment {

    private Bundle bundle;
    private Pegawai pegawai3;
    private TextView txtNama3,txtAsalSekolah, txtKompetensi;

    public SkillFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle=getArguments();
        pegawai3=(Pegawai)bundle.getSerializable("bungkus3");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view3=inflater.inflate(R.layout.fragment_skill, container, false);
       txtNama3=(TextView)view3.findViewById(R.id.txt_nama3);
       txtAsalSekolah=(TextView)view3.findViewById(R.id.txt_asalsekolah);
       txtKompetensi=(TextView)view3.findViewById(R.id.txt_kompetensi);
       return view3;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama3.setText(pegawai3.getNamanya());
        txtAsalSekolah.setText(pegawai3.getAsalsekolah());
        txtKompetensi.setText((pegawai3.getKompetensi()));
    }
}
