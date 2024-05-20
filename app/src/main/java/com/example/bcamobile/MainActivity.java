package com.example.bcamobile;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mengambil referensi dari ImageView
        ImageView group9ImageView = findViewById(R.id.group9);
        ImageView group10ImageView = findViewById(R.id.group10);

        // Menambahkan listener untuk menangani klik pada bcaMobileImageView
        group9ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat intent untuk membuka URL KlikBCA
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.klikbca.com"));
                // Memeriksa apakah ada aplikasi yang dapat menangani intent ini
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        group10ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat intent untuk membuka URL KlikBCA
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bca.co.id/id/Individu/layanan/e-banking/BCA-Mobile"));
                // Memeriksa apakah ada aplikasi yang dapat menangani intent ini
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
    public void showbcaPopup(View view) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.klikmbca);

        ImageView group12 = dialog.findViewById(R.id.group12);
        group12.setImageResource(R.drawable.group_12);

        dialog.show();
    }

    public void showaboutPopup(View view) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.klikabout);

        ImageView about = dialog.findViewById(R.id.about);
        about.setImageResource(R.drawable.about);

        dialog.show();
    }

    public void showrekeningPopup(View view) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.klikrekeningbaru);

        ImageView about = dialog.findViewById(R.id.group13);
        about.setImageResource(R.drawable.group_13);

        dialog.show();
    }

    public void showgantikodePopup(View view) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.klikgantikode);

        ImageView about = dialog.findViewById(R.id.gantikodeakses);
        about.setImageResource(R.drawable.ganti_kode_akses);

        dialog.show();
    }

    public void showflazzPopup(View view) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.klikflazz);

        ImageView about = dialog.findViewById(R.id.flazz);
        about.setImageResource(R.drawable.flazz);

        dialog.show();
    }
}
