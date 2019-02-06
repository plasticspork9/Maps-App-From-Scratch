package org.pursuit.mapsappfromscratch.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.mapsappfromscratch.R;
import org.pursuit.mapsappfromscratch.model.Museum;
import org.pursuit.mapsappfromscratch.model.MuseumResponse;
import org.pursuit.mapsappfromscratch.network.ApiUtil;
import org.pursuit.mapsappfromscratch.network.MuseumService;
import org.pursuit.mapsappfromscratch.network.RetrofitSingleton;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class BlankFragment extends Fragment {
    private  View rootView;
    MuseumService museumService;

    public BlankFragment() {

    }

    public static BlankFragment getInstance() {
        return new BlankFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_blank, container, false);
        museumService = ApiUtil.getApiService();
        museumService.getMuseumsList().enqueue(new Callback<MuseumResponse>() {
            @Override
            public void onResponse(Call<MuseumResponse> call, Response<MuseumResponse> response) {
                List<Museum> museums = response.body().getMuseums();

                Log.d("SAMER", String.valueOf(museums.size()));
            }

            @Override
            public void onFailure(Call<MuseumResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });
        return rootView;
    }

}
