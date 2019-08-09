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
public class PersonalFragment extends Fragment {
    private Bundle bundle;
    private Pegawai pegawainya;
    private TextView txtNama, txtAlamat, txtNohp;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle=getArguments();
        pegawainya=(Pegawai)bundle.getSerializable("bungkus1");
    }

    public PersonalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_personal,container,false);
        txtNama=(TextView)view.findViewById(R.id.txt_nama1);
        txtAlamat=(TextView)view.findViewById(R.id.txt_alamat);
        txtNohp=(TextView)view.findViewById(R.id.txt_nohp);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama.setText(pegawainya.getNamanya());
        txtAlamat.setText(pegawainya.getAlamatnya());
        txtNohp.setText(pegawainya.getNohpnya());
    }
}
