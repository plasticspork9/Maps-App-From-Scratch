package org.pursuit.mapsappfromscratch;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.pursuit.mapsappfromscratch.fragments.BlankFragment;
import org.pursuit.mapsappfromscratch.model.Museum;
import org.pursuit.mapsappfromscratch.model.MuseumResponse;
import org.pursuit.mapsappfromscratch.network.ApiUtil;
import org.pursuit.mapsappfromscratch.network.MuseumService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlankFragment blankFragment = BlankFragment.getInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_container, blankFragment);
        fragmentTransaction.commit();
    }

}
