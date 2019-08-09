package com.example.acer.bundle1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    EditText edtNama, edtAlamat, edtNoHp, edtPekerjaan, edtLamaKerja, edtAsalSekolah, edtKompetensi;
    Button btnInput;
    String namanya, alamatnya, nohpnya, pekerjaannya, lamakerjanya, asalsekolahnya, kompetensinya;
    Pegawai pegawainya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama=(EditText)findViewById(R.id.edt_nama);
        edtAlamat=(EditText)findViewById(R.id.edt_alamat);
        edtNoHp=(EditText)findViewById(R.id.edt_noHp);
        edtPekerjaan=(EditText)findViewById(R.id.edt_pekerjaan);
        edtLamaKerja=(EditText)findViewById(R.id.edt_LamaKerja);
        edtAsalSekolah=(EditText)findViewById(R.id.edt_AsalSekolah);
        edtKompetensi=(EditText)findViewById(R.id.edt_kompetensi);


        btnInput=(Button)findViewById(R.id.btn_input);
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                namanya=edtNama.getText().toString();
                alamatnya=edtAlamat.getText().toString();
                nohpnya=edtNoHp.getText().toString();
                pekerjaannya=edtPekerjaan.getText().toString();
                lamakerjanya=edtLamaKerja.getText().toString();
                asalsekolahnya=edtAsalSekolah.getText().toString();
                kompetensinya=edtKompetensi.getText().toString();
                pegawainya=new Pegawai(namanya,alamatnya,nohpnya,pekerjaannya,lamakerjanya,asalsekolahnya,kompetensinya);
                Intent kirim=new Intent(MainActivity.this,DetailActivity.class);
                kirim.putExtra("xxx",(Serializable) pegawainya);
                startActivity(kirim);
            }
        });

    }
}
