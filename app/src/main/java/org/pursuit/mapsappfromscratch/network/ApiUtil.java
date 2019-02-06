package org.pursuit.mapsappfromscratch.network;

public class ApiUtil {
    public static final String BASE_URL = "https://raw.githubusercontent.com/";

    public static MuseumService getApiService(){

        return RetrofitSingleton.getRetrofit(BASE_URL).create(MuseumService.class);

    }
}
