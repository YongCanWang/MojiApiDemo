package com.mapscloud.mojisdkdemo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mapscloud.mojisdkdemo.bean.MojiWeatherBean;
import com.mapscloud.mojisdkdemo.net.NetWorkMate;
import com.mapscloud.mojisdkdemo.net.NetWorkService;
import com.mapscloud.mojisdkdemo.utils.Utils;

import androidx.appcompat.app.AppCompatActivity;
import rx.Observable;
import rx.Observer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String   TAG = "MainActivity";
    private              TextView tv_weather_content;
    private double lat = 39.91488908;
    private double lon = 116.40387397;
    private static String key = NetWorkMate.KEY;
    private static long date = System.currentTimeMillis();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_miji_weather = findViewById(R.id.bt_miji_weather);
        bt_miji_weather.setOnClickListener(this);
        tv_weather_content = findViewById(R.id.tv_weather_content);
        String keystr = NetWorkMate.PASSWORD + date + lat + lon;
        key = Utils.getMD5(keystr);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_miji_weather:
                NetWorkService retrofitService = NetWorkMate.getInstance().createRetrofitService(NetWorkMate.BSSEURL);
                final Observable<MojiWeatherBean> mojiWeather =
                        retrofitService.getMojiWeather(
                                date,
                                NetWorkMate.TOKEN,
                                key,
                                lat,
                                lon);

                NetWorkMate.getInstance().requestNetWork(mojiWeather, new Observer() {
                    @Override
                    public void onCompleted() { }

                    @Override
                    public void onError(Throwable e) {
                        tv_weather_content.setText(e.toString());
                        Log.e(TAG, "请求错误:" + e.toString());
                    }

                    @Override
                    public void onNext(Object o) {
                        MojiWeatherBean mojiWeatherBean = (MojiWeatherBean) o;
                        tv_weather_content.setText(mojiWeatherBean.toString());
                    }
                });
                break;
        }

    }

}
