package com.si5b.utsramadhanpratama;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tvNamaLengkap;
    TextView tvNomorPendaftaran;
    TextView tvInformasiPendaftaran;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNamaLengkap = findViewById(R.id.tv_tampil_nama);
        tvNomorPendaftaran = findViewById(R.id.tv_tampil_pendaftaran);
        tvInformasiPendaftaran = findViewById(R.id.tv_tampil_pendaftaran);

        Intent terima = getIntent();
        String yNamaLengkap = terima.getStringExtra("xNamaLengkap");
        String yNomorPendaftaran = terima.getStringExtra("xNomorPendaftaran");
        String yInformasiPendaftaran = terima.getStringExtra("xInformasiPendaftaran");
        tvNamaLengkap.setText(yNamaLengkap);
        tvNomorPendaftaran.setText(yNomorPendaftaran);
        tvInformasiPendaftaran.setText(yInformasiPendaftaran);
    }
}