package com.si5b.utsramadhanpratama;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText etNama;
    EditText etNomor;
    TextView tvInformasi;
    CheckBox cbFacebook;
    CheckBox cbInstagram;
    CheckBox cbWebsite;
    Button btnDaftar;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnDaftar = findViewById(R.id.btn_daftar_formulir);
        etNama = findViewById(R.id.et_nama_lengkap);
        etNomor = findViewById(R.id.et_nomor_pendaftaran);
        tvInformasi = findViewById(R.id.tv_informasi);
        cbFacebook = findViewById(R.id.cb_fb);
        cbInstagram = findViewById(R.id.cb_ig);
        cbWebsite = findViewById(R.id.cb_website);

        btnDaftar = findViewById(R.id.btn_daftar_formulir);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.cb_fb:
                        if (cbFacebook.isChecked())
                            Toast.makeText(getApplicationContext(), "Facebook", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.cb_ig:
                        if(cbInstagram.isChecked())
                            Toast.makeText(getApplicationContext(), "Instagram", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.cb_website:
                        if (cbWebsite.isChecked())
                            Toast.makeText(getApplicationContext(), "Website", Toast.LENGTH_SHORT).show();
                }


                String namaLengkap = etNama.getText().toString();
                String nomorPendaftaran = etNomor.getText().toString();
                String informasiPendaftaran = tvInformasi.getText().toString();

                if (namaLengkap.trim().equals("")){
                    etNama.setError("Nama Di isi Terlebih Dahulu !");
                }

                else if (nomorPendaftaran.trim().equals("")){
                    etNomor.setError("Nomor Di isi Terlebih Dahulu !");
                }

                else if (informasiPendaftaran.trim().equals("Informasi Pendaftaran Dari :")) {
                    tvInformasi.getText().toString();
                }

                else {
                    Intent pindah = new Intent(MainActivity.this, MainActivity2.class);
                    pindah.putExtra("NamaLengkap",namaLengkap);
                    pindah.putExtra("NomorPendaftaran",nomorPendaftaran);
                    startActivity(pindah);
                }
            }
        });
    }

}