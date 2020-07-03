package com.mapscloud.mojisdkdemo.net;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.ConnectionPool;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @author TomCan
 * @description:
 * @date :2020/7/3 13:40
 */
public class NetWorkMate<T> {
    public static final String BSSEURL  = "http://coapi.moji.com";
    public static final String TOKEN    = "7729c7ba4f83ab419ff292fcbebb3629";
    public static final String KEY      = "a35f210716d30fcdb283af1f9192eb73";
    public static final String PASSWORD = "17ea4d7328cefbb04b6a2f127997ef2c";

    private NetWorkMate() {
    }

    private static final NetWorkMate netWorkMate = new NetWorkMate();

    public static NetWorkMate getInstance() {
        return netWorkMate;
    }


    /**
     * OkHttpClient 请求客户端
     */
    private static final OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(2, TimeUnit.SECONDS)
            .readTimeout(1000, TimeUnit.SECONDS)
            .writeTimeout(1000, TimeUnit.SECONDS)
            .connectionPool(new ConnectionPool(10000, 10000, TimeUnit.SECONDS))
            .retryOnConnectionFailure(true)
            .addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request request = chain.request().newBuilder()
                            .addHeader("Accept", "application/json")
                            .build();
                    return chain.proceed(request);
                }
            }).build();


    /**
     * 构建 Retrofit
     *
     * @param url
     * @return
     */
    private Retrofit builderRetrofit(String url) {
        return new Retrofit.Builder()
                .baseUrl(url)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }


    /**
     * 创建Service
     *
     * @param baseUrl
     * @return
     */
    public NetWorkService createRetrofitService(String baseUrl) {
        return builderRetrofit(baseUrl).create(NetWorkService.class);
    }


    /**
     * 网络请求
     *
     * @param observable
     * @param callback
     */
    public void requestNetWork(Observable<T> observable, Observer<T> callback) {
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(callback);
    }

}
