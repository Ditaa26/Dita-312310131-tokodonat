package com.example.tokodonat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class purchase extends AppCompatActivity {

    private ImageView tombolKembali, logoImage, donutImageMacha, donutImageStrawberry, homeImage, profileImage;
    private TextView teksPembelian, teksDonatMacha, jumlahHargaBayarMacha, jumlahBeliMacha, teksDonatStrawberry,
            jumlahHargaBayarStrawberry, jumlahBeliStrawberry, teksTotalPesanan, totalPesananSemua,
            teksMetodePembayaran, teksLanjut;
    private LinearLayout layoutBayar, layoutPembayaranMacha, layoutPembayaranStrawberry, layoutTotalPembayaran,
            layoutCOD, navigasiBawah;
    private CheckBox cbCOD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        tombolKembali = findViewById(R.id.back_button4);
        logoImage = findViewById(R.id.logoImage5);
        donutImageMacha = findViewById(R.id.donutImageView6);
        donutImageStrawberry = findViewById(R.id.donutImageViewStrawberry);
        homeImage = findViewById(R.id.home_image_view3);
        profileImage = findViewById(R.id.profile_image_view3);

        layoutBayar = findViewById(R.id.linearBayar);
        teksDonatMacha = findViewById(R.id.jumlahHargaBayarMacha);
        jumlahHargaBayarMacha = findViewById(R.id.jumlahHargaBayarMacha);
        jumlahBeliMacha = findViewById(R.id.jumlahBeliMacha);
        teksDonatStrawberry = findViewById(R.id.jumlahHargaBayarStrawberry);
        jumlahHargaBayarStrawberry = findViewById(R.id.jumlahHargaBayarStrawberry);
        jumlahBeliStrawberry = findViewById(R.id.jumlahBeliStrawberry);
        teksTotalPesanan = findViewById(R.id.totalPesanan);
        totalPesananSemua = findViewById(R.id.totalPesananSemua);
        teksMetodePembayaran = findViewById(R.id.tv_metodePembayaran);
        teksLanjut = findViewById(R.id.nexttextview);

        layoutBayar = findViewById(R.id.linearBayar);
        layoutPembayaranMacha = findViewById(R.id.LinearPembayaran);
        layoutPembayaranStrawberry = findViewById(R.id.LinearPembayaran2);
        layoutTotalPembayaran = findViewById(R.id.totalPembayaran);
        layoutCOD = findViewById(R.id.ll_cashOnDelivery);
        navigasiBawah = findViewById(R.id.bottomNav3);

        tombolKembali.setOnClickListener(view -> {
            Intent intent = new Intent(purchase.this, menu.class);
            startActivity(intent);
        });

        homeImage.setOnClickListener(view -> {
            Intent homeIntent = new Intent(purchase.this, homepage.class);
            startActivity(homeIntent);
        });

        profileImage.setOnClickListener(view -> {
            Intent profileIntent = new Intent(purchase.this, profile.class);
            startActivity(profileIntent);
        });


        cbCOD = findViewById(R.id.cb_cashOnDelivery);

        tombolKembali.setOnClickListener(view -> finish());

        teksLanjut.setOnClickListener(view -> {
        });

        teksLanjut.setOnClickListener(view -> {
            Intent intent = new Intent(purchase.this, closing.class);
            startActivity(intent);
        });

        Intent intent = getIntent();
        int totalJumlah = intent.getIntExtra("totalJumlah", 0);
        int totalHarga = intent.getIntExtra("totalHarga", 0);

        teksTotalPesanan.setText("Total Pesanan: " + totalJumlah + " Item");
        totalPesananSemua.setText("Total: Rp " + totalHarga);

        teksLanjut.setOnClickListener(view -> {
            Intent closingIntent = new Intent(purchase.this, closing.class);
            closingIntent.putExtra("totalJumlah", totalJumlah); // Kirim total jumlah ke halaman closing
            closingIntent.putExtra("totalHarga", totalHarga); // Kirim total harga ke halaman closing
            startActivity(closingIntent);
        });
    }
}
