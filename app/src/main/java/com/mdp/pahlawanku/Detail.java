package com.mdp.pahlawanku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {
    private ImageView ivFoto;
    private TextView tvNama, tvTtg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivFoto = findViewById(R.id.iv_foto);
        tvNama = findViewById(R.id.tv_nama);
        tvTtg = findViewById(R.id.tv_ttg);

        Intent intent = getIntent();
        String nama = intent.getStringExtra("varNama");
        String tentang = intent.getStringExtra("varTtg");
        String Foto = intent.getStringExtra("varFoto");

        setTitle(nama);
        tvNama.setText(nama);
        tvTtg.setText(tentang);
        Glide.with(this)
                .load(Foto).into(ivFoto);



    }
}