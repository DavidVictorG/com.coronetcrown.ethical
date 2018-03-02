package com.example.steven.comcoronetcrownethical;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.iHome) {
            Toast.makeText(getApplicationContext(),"Home",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.iMaster) {
            Toast.makeText(getApplicationContext(),"Berikut Data Master",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.iTransaksi) {
            Toast.makeText(getApplicationContext(),"Berikut Data Transaksi",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.iDana) {
            Toast.makeText(getApplicationContext(),"Berikut Data Dana",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.iLaporan) {
            Toast.makeText(getApplicationContext(),"Berikut Data Laporan",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.iAdmin) {
            Toast.makeText(getApplicationContext(),"Berikut Data Admin",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.iKuesioner) {
            Toast.makeText(getApplicationContext(),"Berikut Data Kuesioner",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.iChangePass) {
            Toast.makeText(getApplicationContext(),"Berikut Data Change Password",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.iAbout) {
            Toast.makeText(getApplicationContext(),"Program ini dibuat oleh PT. Coronet Crown",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.iHelp) {
            Toast.makeText(getApplicationContext(),"Silahkan Hubungi Pusat",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.iLogOut) {
            Toast.makeText(getApplicationContext(),"Berhasil Log Out",Toast.LENGTH_SHORT).show();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}