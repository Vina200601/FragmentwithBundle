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
public class JobFragment extends Fragment {

    private Bundle bundle;
    private Pegawai pegawai2;
    private TextView txtnama2, txtpekerjaan, txtlamakerja;

    public JobFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle = getArguments();
        pegawai2 = (Pegawai) bundle.getSerializable("bungkus2");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view2 = inflater.inflate(R.layout.fragment_job, container, false);
        txtnama2 = (TextView) view2.findViewById(R.id.txt_nama2);
        txtpekerjaan = (TextView) view2.findViewById(R.id.txt_pekerjaan);
        txtlamakerja = (TextView) view2.findViewById(R.id.txt_lmkerja);
        return view2;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtnama2.setText(pegawai2.getNamanya());
        txtpekerjaan.setText(pegawai2.getPekerjaan());
        txtlamakerja.setText(pegawai2.getLamakerja());
    }
}
