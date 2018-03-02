package com.example.steven.comcoronetcrownethical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MasterDistributor_Create extends AppCompatActivity {

    Spinner spKota;
    Button btnKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_distributor_create);

        spKota = (Spinner) findViewById(R.id.spKota);
//        spKota.setOnItemClickListener((AdapterView.OnItemClickListener) new CustomOnItemSelectedListener());

        Button btnKirim = (Button)findViewById(R.id.btnKirim);
        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                Toast.makeText(getApplicationContext(),"Berhasil di Simpan",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}