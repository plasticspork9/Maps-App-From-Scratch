package org.pursuit.mapsappfromscratch.network;

import org.pursuit.mapsappfromscratch.model.MuseumResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MuseumService {
    @GET("JDVila/storybook/master/museums.json")
    Call<MuseumResponse> getMuseumsList();
}
