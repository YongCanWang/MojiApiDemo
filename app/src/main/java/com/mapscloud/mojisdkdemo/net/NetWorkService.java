package com.mapscloud.mojisdkdemo.net;

import com.mapscloud.mojisdkdemo.bean.MojiWeatherBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author TomCan
 * @description:
 * @date :2020/7/3 13:47
 */
public interface NetWorkService {

    // http://coapi.moji.com/whapi/json/lbsweather?
    // timestamp=0
    // &token=7729c7ba4f83ab419ff292fcbebb3629
    // &key=a35f210716d30fcdb283af1f9192eb73
    // &lat=39.91488908
    // &lon=116.40387397


    @GET("whapi/json/lbsweather?")
    Observable<MojiWeatherBean> getMojiWeather(@Query("timestamp") Long timestamp,
                                               @Query("token") String token,
                                               @Query("key") String key,
                                               @Query("lat") double lat,
                                               @Query("lon") double lon);

}
