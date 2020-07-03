package com.mapscloud.mojisdkdemo.bean;

import java.util.List;

/**
 * @author TomCan
 * @description:
 * @date :2020/7/3 13:54
 */
public class MojiWeatherBean {


    /**
     * code : 0
     * data : {"city":{"cityId":284609,"counname":"中国","ianatimezone":"Asia/Shanghai","name":"东城区","pname":"北京市","secondaryname":"北京市","timezone":"8"},"condition":{"condition":"阴","conditionId":"13","humidity":"65","icon":"2","pressure":"1004","realFeel":"25","sunRise":"2020-07-03 04:51:00","sunSet":"2020-07-03 19:47:00","temp":"25","tips":"今天有雨，略微偏热，注意衣物变化。","updatetime":"2020-07-03 13:45:08","uvi":"3","vis":"4841","windDegrees":"135","windDir":"东南风","windLevel":"2","windSpeed":"3.0"},"forecast":[{"conditionDay":"雷阵雨","conditionIdDay":"4","conditionIdNight":"8","conditionNight":"中雨","humidity":"56","moonphase":"WaxingGibbous","moonrise":"2020-07-02 16:51:00","moonset":"2020-07-02 02:10:00","pop":"60","predictDate":"2020-07-02","qpf":"4.3","sunrise":"2020-07-02 04:50:00","sunset":"2020-07-02 19:47:00","tempDay":"27","tempNight":"21","updatetime":"2020-07-02 23:07:00","uvi":"6","windDegreesDay":"90","windDegreesNight":"45","windDirDay":"东风","windDirNight":"东北风","windLevelDay":"1","windLevelNight":"2","windSpeedDay":"0.9","windSpeedNight":"2.4"},{"conditionDay":"小雨","conditionIdDay":"7","conditionIdNight":"31","conditionNight":"多云","humidity":"76","moonphase":"WaxingGibbous","moonrise":"2020-07-03 18:01:00","moonset":"2020-07-03 02:50:00","pop":"60","predictDate":"2020-07-03","qpf":"8.2","sunrise":"2020-07-03 04:51:00","sunset":"2020-07-03 19:47:00","tempDay":"26","tempNight":"20","updatetime":"2020-07-03 13:08:00","uvi":"3","windDegreesDay":"45","windDegreesNight":"135","windDirDay":"东北风","windDirNight":"东南风","windLevelDay":"2","windLevelNight":"2","windSpeedDay":"2.4","windSpeedNight":"2.4"},{"conditionDay":"多云","conditionIdDay":"1","conditionIdNight":"4","conditionNight":"雷阵雨","humidity":"67","moonphase":"WaxingGibbous","moonrise":"2020-07-04 19:07:00","moonset":"2020-07-04 03:37:00","pop":"60","predictDate":"2020-07-04","qpf":"1.7","sunrise":"2020-07-04 04:51:00","sunset":"2020-07-04 19:46:00","tempDay":"28","tempNight":"21","updatetime":"2020-07-03 13:08:00","uvi":"7","windDegreesDay":"225","windDegreesNight":"225","windDirDay":"西南风","windDirNight":"西南风","windLevelDay":"2","windLevelNight":"2","windSpeedDay":"2.4","windSpeedNight":"2.4"},{"conditionDay":"雷阵雨","conditionIdDay":"4","conditionIdNight":"2","conditionNight":"阴","humidity":"66","moonphase":"Full","moonrise":"2020-07-05 20:06:00","moonset":"2020-07-05 04:30:00","pop":"60","predictDate":"2020-07-05","qpf":"3.9","sunrise":"2020-07-05 04:52:00","sunset":"2020-07-05 19:46:00","tempDay":"29","tempNight":"21","updatetime":"2020-07-03 13:08:00","uvi":"7","windDegreesDay":"180","windDegreesNight":"180","windDirDay":"南风","windDirNight":"南风","windLevelDay":"1","windLevelNight":"2","windSpeedDay":"0.9","windSpeedNight":"2.4"},{"conditionDay":"多云","conditionIdDay":"1","conditionIdNight":"31","conditionNight":"多云","humidity":"67","moonphase":"WaningGibbous","moonrise":"2020-07-06 20:55:00","moonset":"2020-07-06 05:30:00","pop":"20","predictDate":"2020-07-06","qpf":"0.0","sunrise":"2020-07-06 04:53:00","sunset":"2020-07-06 19:46:00","tempDay":"31","tempNight":"23","updatetime":"2020-07-03 13:08:00","uvi":"11","windDegreesDay":"225","windDegreesNight":"90","windDirDay":"西南风","windDirNight":"东风","windLevelDay":"2","windLevelNight":"2","windSpeedDay":"2.4","windSpeedNight":"2.4"},{"conditionDay":"雷阵雨","conditionIdDay":"4","conditionIdNight":"4","conditionNight":"雷阵雨","humidity":"63","moonphase":"WaningGibbous","moonrise":"2020-07-07 21:37:00","moonset":"2020-07-07 06:33:00","pop":"20","predictDate":"2020-07-07","qpf":"1.0","sunrise":"2020-07-07 04:53:00","sunset":"2020-07-07 19:46:00","tempDay":"32","tempNight":"23","updatetime":"2020-07-03 13:08:00","uvi":"11","windDegreesDay":"90","windDegreesNight":"45","windDirDay":"东风","windDirNight":"东北风","windLevelDay":"1","windLevelNight":"2","windSpeedDay":"0.9","windSpeedNight":"2.4"},{"conditionDay":"多云","conditionIdDay":"1","conditionIdNight":"31","conditionNight":"多云","humidity":"60","moonphase":"WaningGibbous","moonrise":"2020-07-08 22:12:00","moonset":"2020-07-08 07:37:00","pop":"60","predictDate":"2020-07-08","qpf":"3.1","sunrise":"2020-07-08 04:54:00","sunset":"2020-07-08 19:45:00","tempDay":"31","tempNight":"23","updatetime":"2020-07-03 13:08:00","uvi":"11","windDegreesDay":"45","windDegreesNight":"45","windDirDay":"东北风","windDirNight":"东北风","windLevelDay":"2","windLevelNight":"2","windSpeedDay":"2.4","windSpeedNight":"2.4"}],"hourly":[{"condition":"阵雨","conditionId":"86","date":"2020-07-03","hour":"13","humidity":"65","iconDay":"3","iconNight":"33","pop":"90","pressure":"1004","qpf":"0.7","realFeel":"25","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"3","windDegrees":"135","windDir":"ESE","windSpeed":"3","windlevel":"2"},{"condition":"雨","conditionId":"78","date":"2020-07-03","hour":"14","humidity":"77","iconDay":"8","iconNight":"8","pop":"90","pressure":"1003","qpf":"0.4","realFeel":"24","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"3","windDegrees":"0","windDir":"N","windSpeed":"4","windlevel":"1"},{"condition":"雨","conditionId":"78","date":"2020-07-03","hour":"15","humidity":"74","iconDay":"8","iconNight":"8","pop":"90","pressure":"1003","qpf":"0.4","realFeel":"25","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"3","windDegrees":"45","windDir":"NNE","windSpeed":"3","windlevel":"1"},{"condition":"雨","conditionId":"78","date":"2020-07-03","hour":"16","humidity":"70","iconDay":"8","iconNight":"8","pop":"90","pressure":"1003","qpf":"0.2","realFeel":"25","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"2","windDegrees":"45","windDir":"NNE","windSpeed":"3","windlevel":"1"},{"condition":"雨","conditionId":"78","date":"2020-07-03","hour":"17","humidity":"67","iconDay":"8","iconNight":"8","pop":"90","pressure":"1002","qpf":"0.4","realFeel":"25","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"NE","windSpeed":"2","windlevel":"1"},{"condition":"雨","conditionId":"78","date":"2020-07-03","hour":"18","humidity":"69","iconDay":"8","iconNight":"8","pop":"90","pressure":"1002","qpf":"0.5","realFeel":"26","snow":"0","temp":"26","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"NE","windSpeed":"3","windlevel":"1"},{"condition":"雨","conditionId":"78","date":"2020-07-03","hour":"19","humidity":"72","iconDay":"8","iconNight":"8","pop":"90","pressure":"1003","qpf":"0.3","realFeel":"25","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"3","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-03","hour":"20","humidity":"75","iconDay":"0","iconNight":"30","pop":"10","pressure":"1003","qpf":"0.0","realFeel":"24","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"3","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-03","hour":"21","humidity":"77","iconDay":"0","iconNight":"30","pop":"10","pressure":"1003","qpf":"0.0","realFeel":"24","snow":"0","temp":"23","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"3","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-03","hour":"22","humidity":"79","iconDay":"0","iconNight":"30","pop":"10","pressure":"1003","qpf":"0.0","realFeel":"24","snow":"0","temp":"23","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"3","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-03","hour":"23","humidity":"81","iconDay":"0","iconNight":"30","pop":"10","pressure":"1003","qpf":"0.0","realFeel":"24","snow":"0","temp":"23","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"3","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-04","hour":"0","humidity":"82","iconDay":"0","iconNight":"30","pop":"10","pressure":"1003","qpf":"0.0","realFeel":"24","snow":"0","temp":"24","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"1","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-04","hour":"1","humidity":"82","iconDay":"0","iconNight":"30","pop":"10","pressure":"1003","qpf":"0.0","realFeel":"23","snow":"0","temp":"23","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"90","windDir":"E","windSpeed":"1","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-04","hour":"2","humidity":"83","iconDay":"0","iconNight":"30","pop":"10","pressure":"1002","qpf":"0.0","realFeel":"23","snow":"0","temp":"23","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"135","windDir":"SE","windSpeed":"1","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-04","hour":"3","humidity":"84","iconDay":"0","iconNight":"30","pop":"10","pressure":"1002","qpf":"0.0","realFeel":"22","snow":"0","temp":"22","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"135","windDir":"ESE","windSpeed":"1","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-04","hour":"4","humidity":"85","iconDay":"0","iconNight":"30","pop":"10","pressure":"1002","qpf":"0.0","realFeel":"22","snow":"0","temp":"22","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"90","windDir":"E","windSpeed":"1","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-04","hour":"5","humidity":"86","iconDay":"0","iconNight":"30","pop":"10","pressure":"1002","qpf":"0.0","realFeel":"22","snow":"0","temp":"22","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"2","windlevel":"1"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"6","humidity":"82","iconDay":"2","iconNight":"2","pop":"40","pressure":"1002","qpf":"0.0","realFeel":"23","snow":"0","temp":"23","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"2","windlevel":"1"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"7","humidity":"79","iconDay":"2","iconNight":"2","pop":"40","pressure":"1001","qpf":"0.0","realFeel":"23","snow":"0","temp":"23","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"2","windlevel":"1"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"8","humidity":"74","iconDay":"2","iconNight":"2","pop":"40","pressure":"1001","qpf":"0.0","realFeel":"25","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"3","windDegrees":"45","windDir":"ENE","windSpeed":"1","windlevel":"1"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"9","humidity":"68","iconDay":"2","iconNight":"2","pop":"40","pressure":"1001","qpf":"0.0","realFeel":"26","snow":"0","temp":"26","updatetime":"2020-07-03 13:41:50","uvi":"4","windDegrees":"180","windDir":"S","windSpeed":"1","windlevel":"1"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"10","humidity":"62","iconDay":"2","iconNight":"2","pop":"40","pressure":"1000","qpf":"0.0","realFeel":"26","snow":"0","temp":"27","updatetime":"2020-07-03 13:41:50","uvi":"6","windDegrees":"225","windDir":"SSW","windSpeed":"4","windlevel":"1"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"11","humidity":"57","iconDay":"2","iconNight":"2","pop":"40","pressure":"1000","qpf":"0.0","realFeel":"26","snow":"0","temp":"28","updatetime":"2020-07-03 13:41:50","uvi":"7","windDegrees":"225","windDir":"SSW","windSpeed":"8","windlevel":"2"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"12","humidity":"55","iconDay":"2","iconNight":"2","pop":"40","pressure":"999","qpf":"0.0","realFeel":"28","snow":"0","temp":"29","updatetime":"2020-07-03 13:41:50","uvi":"7","windDegrees":"225","windDir":"SSW","windSpeed":"10","windlevel":"2"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"13","humidity":"53","iconDay":"2","iconNight":"2","pop":"40","pressure":"998","qpf":"0.0","realFeel":"29","snow":"0","temp":"30","updatetime":"2020-07-03 13:41:50","uvi":"7","windDegrees":"225","windDir":"SSW","windSpeed":"12","windlevel":"3"}],"sfc":{"banner":"21公里外正在下雨呢","nearRain":60702163,"notice":"距您西北方向21公里正在下小雨呢","percent":[{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0}],"rainLastTime":0,"sfCondition":202,"timestamp":1593755382000}}
     * msg : success
     * rc : {"c":0,"p":"success"}
     */

    private int      code;
    private DataBean data;
    private String   msg;
    private RcBean   rc;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public RcBean getRc() {
        return rc;
    }

    public void setRc(RcBean rc) {
        this.rc = rc;
    }

    public static class DataBean {
        /**
         * city : {"cityId":284609,"counname":"中国","ianatimezone":"Asia/Shanghai","name":"东城区","pname":"北京市","secondaryname":"北京市","timezone":"8"}
         * condition : {"condition":"阴","conditionId":"13","humidity":"65","icon":"2","pressure":"1004","realFeel":"25","sunRise":"2020-07-03 04:51:00","sunSet":"2020-07-03 19:47:00","temp":"25","tips":"今天有雨，略微偏热，注意衣物变化。","updatetime":"2020-07-03 13:45:08","uvi":"3","vis":"4841","windDegrees":"135","windDir":"东南风","windLevel":"2","windSpeed":"3.0"}
         * forecast : [{"conditionDay":"雷阵雨","conditionIdDay":"4","conditionIdNight":"8","conditionNight":"中雨","humidity":"56","moonphase":"WaxingGibbous","moonrise":"2020-07-02 16:51:00","moonset":"2020-07-02 02:10:00","pop":"60","predictDate":"2020-07-02","qpf":"4.3","sunrise":"2020-07-02 04:50:00","sunset":"2020-07-02 19:47:00","tempDay":"27","tempNight":"21","updatetime":"2020-07-02 23:07:00","uvi":"6","windDegreesDay":"90","windDegreesNight":"45","windDirDay":"东风","windDirNight":"东北风","windLevelDay":"1","windLevelNight":"2","windSpeedDay":"0.9","windSpeedNight":"2.4"},{"conditionDay":"小雨","conditionIdDay":"7","conditionIdNight":"31","conditionNight":"多云","humidity":"76","moonphase":"WaxingGibbous","moonrise":"2020-07-03 18:01:00","moonset":"2020-07-03 02:50:00","pop":"60","predictDate":"2020-07-03","qpf":"8.2","sunrise":"2020-07-03 04:51:00","sunset":"2020-07-03 19:47:00","tempDay":"26","tempNight":"20","updatetime":"2020-07-03 13:08:00","uvi":"3","windDegreesDay":"45","windDegreesNight":"135","windDirDay":"东北风","windDirNight":"东南风","windLevelDay":"2","windLevelNight":"2","windSpeedDay":"2.4","windSpeedNight":"2.4"},{"conditionDay":"多云","conditionIdDay":"1","conditionIdNight":"4","conditionNight":"雷阵雨","humidity":"67","moonphase":"WaxingGibbous","moonrise":"2020-07-04 19:07:00","moonset":"2020-07-04 03:37:00","pop":"60","predictDate":"2020-07-04","qpf":"1.7","sunrise":"2020-07-04 04:51:00","sunset":"2020-07-04 19:46:00","tempDay":"28","tempNight":"21","updatetime":"2020-07-03 13:08:00","uvi":"7","windDegreesDay":"225","windDegreesNight":"225","windDirDay":"西南风","windDirNight":"西南风","windLevelDay":"2","windLevelNight":"2","windSpeedDay":"2.4","windSpeedNight":"2.4"},{"conditionDay":"雷阵雨","conditionIdDay":"4","conditionIdNight":"2","conditionNight":"阴","humidity":"66","moonphase":"Full","moonrise":"2020-07-05 20:06:00","moonset":"2020-07-05 04:30:00","pop":"60","predictDate":"2020-07-05","qpf":"3.9","sunrise":"2020-07-05 04:52:00","sunset":"2020-07-05 19:46:00","tempDay":"29","tempNight":"21","updatetime":"2020-07-03 13:08:00","uvi":"7","windDegreesDay":"180","windDegreesNight":"180","windDirDay":"南风","windDirNight":"南风","windLevelDay":"1","windLevelNight":"2","windSpeedDay":"0.9","windSpeedNight":"2.4"},{"conditionDay":"多云","conditionIdDay":"1","conditionIdNight":"31","conditionNight":"多云","humidity":"67","moonphase":"WaningGibbous","moonrise":"2020-07-06 20:55:00","moonset":"2020-07-06 05:30:00","pop":"20","predictDate":"2020-07-06","qpf":"0.0","sunrise":"2020-07-06 04:53:00","sunset":"2020-07-06 19:46:00","tempDay":"31","tempNight":"23","updatetime":"2020-07-03 13:08:00","uvi":"11","windDegreesDay":"225","windDegreesNight":"90","windDirDay":"西南风","windDirNight":"东风","windLevelDay":"2","windLevelNight":"2","windSpeedDay":"2.4","windSpeedNight":"2.4"},{"conditionDay":"雷阵雨","conditionIdDay":"4","conditionIdNight":"4","conditionNight":"雷阵雨","humidity":"63","moonphase":"WaningGibbous","moonrise":"2020-07-07 21:37:00","moonset":"2020-07-07 06:33:00","pop":"20","predictDate":"2020-07-07","qpf":"1.0","sunrise":"2020-07-07 04:53:00","sunset":"2020-07-07 19:46:00","tempDay":"32","tempNight":"23","updatetime":"2020-07-03 13:08:00","uvi":"11","windDegreesDay":"90","windDegreesNight":"45","windDirDay":"东风","windDirNight":"东北风","windLevelDay":"1","windLevelNight":"2","windSpeedDay":"0.9","windSpeedNight":"2.4"},{"conditionDay":"多云","conditionIdDay":"1","conditionIdNight":"31","conditionNight":"多云","humidity":"60","moonphase":"WaningGibbous","moonrise":"2020-07-08 22:12:00","moonset":"2020-07-08 07:37:00","pop":"60","predictDate":"2020-07-08","qpf":"3.1","sunrise":"2020-07-08 04:54:00","sunset":"2020-07-08 19:45:00","tempDay":"31","tempNight":"23","updatetime":"2020-07-03 13:08:00","uvi":"11","windDegreesDay":"45","windDegreesNight":"45","windDirDay":"东北风","windDirNight":"东北风","windLevelDay":"2","windLevelNight":"2","windSpeedDay":"2.4","windSpeedNight":"2.4"}]
         * hourly : [{"condition":"阵雨","conditionId":"86","date":"2020-07-03","hour":"13","humidity":"65","iconDay":"3","iconNight":"33","pop":"90","pressure":"1004","qpf":"0.7","realFeel":"25","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"3","windDegrees":"135","windDir":"ESE","windSpeed":"3","windlevel":"2"},{"condition":"雨","conditionId":"78","date":"2020-07-03","hour":"14","humidity":"77","iconDay":"8","iconNight":"8","pop":"90","pressure":"1003","qpf":"0.4","realFeel":"24","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"3","windDegrees":"0","windDir":"N","windSpeed":"4","windlevel":"1"},{"condition":"雨","conditionId":"78","date":"2020-07-03","hour":"15","humidity":"74","iconDay":"8","iconNight":"8","pop":"90","pressure":"1003","qpf":"0.4","realFeel":"25","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"3","windDegrees":"45","windDir":"NNE","windSpeed":"3","windlevel":"1"},{"condition":"雨","conditionId":"78","date":"2020-07-03","hour":"16","humidity":"70","iconDay":"8","iconNight":"8","pop":"90","pressure":"1003","qpf":"0.2","realFeel":"25","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"2","windDegrees":"45","windDir":"NNE","windSpeed":"3","windlevel":"1"},{"condition":"雨","conditionId":"78","date":"2020-07-03","hour":"17","humidity":"67","iconDay":"8","iconNight":"8","pop":"90","pressure":"1002","qpf":"0.4","realFeel":"25","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"NE","windSpeed":"2","windlevel":"1"},{"condition":"雨","conditionId":"78","date":"2020-07-03","hour":"18","humidity":"69","iconDay":"8","iconNight":"8","pop":"90","pressure":"1002","qpf":"0.5","realFeel":"26","snow":"0","temp":"26","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"NE","windSpeed":"3","windlevel":"1"},{"condition":"雨","conditionId":"78","date":"2020-07-03","hour":"19","humidity":"72","iconDay":"8","iconNight":"8","pop":"90","pressure":"1003","qpf":"0.3","realFeel":"25","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"3","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-03","hour":"20","humidity":"75","iconDay":"0","iconNight":"30","pop":"10","pressure":"1003","qpf":"0.0","realFeel":"24","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"3","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-03","hour":"21","humidity":"77","iconDay":"0","iconNight":"30","pop":"10","pressure":"1003","qpf":"0.0","realFeel":"24","snow":"0","temp":"23","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"3","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-03","hour":"22","humidity":"79","iconDay":"0","iconNight":"30","pop":"10","pressure":"1003","qpf":"0.0","realFeel":"24","snow":"0","temp":"23","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"3","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-03","hour":"23","humidity":"81","iconDay":"0","iconNight":"30","pop":"10","pressure":"1003","qpf":"0.0","realFeel":"24","snow":"0","temp":"23","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"3","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-04","hour":"0","humidity":"82","iconDay":"0","iconNight":"30","pop":"10","pressure":"1003","qpf":"0.0","realFeel":"24","snow":"0","temp":"24","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"1","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-04","hour":"1","humidity":"82","iconDay":"0","iconNight":"30","pop":"10","pressure":"1003","qpf":"0.0","realFeel":"23","snow":"0","temp":"23","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"90","windDir":"E","windSpeed":"1","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-04","hour":"2","humidity":"83","iconDay":"0","iconNight":"30","pop":"10","pressure":"1002","qpf":"0.0","realFeel":"23","snow":"0","temp":"23","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"135","windDir":"SE","windSpeed":"1","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-04","hour":"3","humidity":"84","iconDay":"0","iconNight":"30","pop":"10","pressure":"1002","qpf":"0.0","realFeel":"22","snow":"0","temp":"22","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"135","windDir":"ESE","windSpeed":"1","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-04","hour":"4","humidity":"85","iconDay":"0","iconNight":"30","pop":"10","pressure":"1002","qpf":"0.0","realFeel":"22","snow":"0","temp":"22","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"90","windDir":"E","windSpeed":"1","windlevel":"1"},{"condition":"晴","conditionId":"1","date":"2020-07-04","hour":"5","humidity":"86","iconDay":"0","iconNight":"30","pop":"10","pressure":"1002","qpf":"0.0","realFeel":"22","snow":"0","temp":"22","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"2","windlevel":"1"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"6","humidity":"82","iconDay":"2","iconNight":"2","pop":"40","pressure":"1002","qpf":"0.0","realFeel":"23","snow":"0","temp":"23","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"2","windlevel":"1"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"7","humidity":"79","iconDay":"2","iconNight":"2","pop":"40","pressure":"1001","qpf":"0.0","realFeel":"23","snow":"0","temp":"23","updatetime":"2020-07-03 13:41:50","uvi":"1","windDegrees":"45","windDir":"ENE","windSpeed":"2","windlevel":"1"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"8","humidity":"74","iconDay":"2","iconNight":"2","pop":"40","pressure":"1001","qpf":"0.0","realFeel":"25","snow":"0","temp":"25","updatetime":"2020-07-03 13:41:50","uvi":"3","windDegrees":"45","windDir":"ENE","windSpeed":"1","windlevel":"1"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"9","humidity":"68","iconDay":"2","iconNight":"2","pop":"40","pressure":"1001","qpf":"0.0","realFeel":"26","snow":"0","temp":"26","updatetime":"2020-07-03 13:41:50","uvi":"4","windDegrees":"180","windDir":"S","windSpeed":"1","windlevel":"1"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"10","humidity":"62","iconDay":"2","iconNight":"2","pop":"40","pressure":"1000","qpf":"0.0","realFeel":"26","snow":"0","temp":"27","updatetime":"2020-07-03 13:41:50","uvi":"6","windDegrees":"225","windDir":"SSW","windSpeed":"4","windlevel":"1"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"11","humidity":"57","iconDay":"2","iconNight":"2","pop":"40","pressure":"1000","qpf":"0.0","realFeel":"26","snow":"0","temp":"28","updatetime":"2020-07-03 13:41:50","uvi":"7","windDegrees":"225","windDir":"SSW","windSpeed":"8","windlevel":"2"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"12","humidity":"55","iconDay":"2","iconNight":"2","pop":"40","pressure":"999","qpf":"0.0","realFeel":"28","snow":"0","temp":"29","updatetime":"2020-07-03 13:41:50","uvi":"7","windDegrees":"225","windDir":"SSW","windSpeed":"10","windlevel":"2"},{"condition":"阴","conditionId":"13","date":"2020-07-04","hour":"13","humidity":"53","iconDay":"2","iconNight":"2","pop":"40","pressure":"998","qpf":"0.0","realFeel":"29","snow":"0","temp":"30","updatetime":"2020-07-03 13:41:50","uvi":"7","windDegrees":"225","windDir":"SSW","windSpeed":"12","windlevel":"3"}]
         * sfc : {"banner":"21公里外正在下雨呢","nearRain":60702163,"notice":"距您西北方向21公里正在下小雨呢","percent":[{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0}],"rainLastTime":0,"sfCondition":202,"timestamp":1593755382000}
         */

        private CityBean           city;
        private ConditionBean      condition;
        private SfcBean            sfc;
        private List<ForecastBean> forecast;
        private List<HourlyBean>   hourly;

        public CityBean getCity() {
            return city;
        }

        public void setCity(CityBean city) {
            this.city = city;
        }

        public ConditionBean getCondition() {
            return condition;
        }

        public void setCondition(ConditionBean condition) {
            this.condition = condition;
        }

        public SfcBean getSfc() {
            return sfc;
        }

        public void setSfc(SfcBean sfc) {
            this.sfc = sfc;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public List<HourlyBean> getHourly() {
            return hourly;
        }

        public void setHourly(List<HourlyBean> hourly) {
            this.hourly = hourly;
        }

        public static class CityBean {
            /**
             * cityId : 284609
             * counname : 中国
             * ianatimezone : Asia/Shanghai
             * name : 东城区
             * pname : 北京市
             * secondaryname : 北京市
             * timezone : 8
             */

            private int    cityId;
            private String counname;
            private String ianatimezone;
            private String name;
            private String pname;
            private String secondaryname;
            private String timezone;

            public int getCityId() {
                return cityId;
            }

            public void setCityId(int cityId) {
                this.cityId = cityId;
            }

            public String getCounname() {
                return counname;
            }

            public void setCounname(String counname) {
                this.counname = counname;
            }

            public String getIanatimezone() {
                return ianatimezone;
            }

            public void setIanatimezone(String ianatimezone) {
                this.ianatimezone = ianatimezone;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPname() {
                return pname;
            }

            public void setPname(String pname) {
                this.pname = pname;
            }

            public String getSecondaryname() {
                return secondaryname;
            }

            public void setSecondaryname(String secondaryname) {
                this.secondaryname = secondaryname;
            }

            public String getTimezone() {
                return timezone;
            }

            public void setTimezone(String timezone) {
                this.timezone = timezone;
            }

            @Override
            public String toString() {
                return "CityBean{" +
                        "cityId=" + cityId +
                        ", counname='" + counname + '\'' +
                        ", ianatimezone='" + ianatimezone + '\'' +
                        ", name='" + name + '\'' +
                        ", pname='" + pname + '\'' +
                        ", secondaryname='" + secondaryname + '\'' +
                        ", timezone='" + timezone + '\'' +
                        '}';
            }
        }

        public static class ConditionBean {
            /**
             * condition : 阴
             * conditionId : 13
             * humidity : 65
             * icon : 2
             * pressure : 1004
             * realFeel : 25
             * sunRise : 2020-07-03 04:51:00
             * sunSet : 2020-07-03 19:47:00
             * temp : 25
             * tips : 今天有雨，略微偏热，注意衣物变化。
             * updatetime : 2020-07-03 13:45:08
             * uvi : 3
             * vis : 4841
             * windDegrees : 135
             * windDir : 东南风
             * windLevel : 2
             * windSpeed : 3.0
             */

            private String condition;
            private String conditionId;
            private String humidity;
            private String icon;
            private String pressure;
            private String realFeel;
            private String sunRise;
            private String sunSet;
            private String temp;
            private String tips;
            private String updatetime;
            private String uvi;
            private String vis;
            private String windDegrees;
            private String windDir;
            private String windLevel;
            private String windSpeed;

            public String getCondition() {
                return condition;
            }

            public void setCondition(String condition) {
                this.condition = condition;
            }

            public String getConditionId() {
                return conditionId;
            }

            public void setConditionId(String conditionId) {
                this.conditionId = conditionId;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getPressure() {
                return pressure;
            }

            public void setPressure(String pressure) {
                this.pressure = pressure;
            }

            public String getRealFeel() {
                return realFeel;
            }

            public void setRealFeel(String realFeel) {
                this.realFeel = realFeel;
            }

            public String getSunRise() {
                return sunRise;
            }

            public void setSunRise(String sunRise) {
                this.sunRise = sunRise;
            }

            public String getSunSet() {
                return sunSet;
            }

            public void setSunSet(String sunSet) {
                this.sunSet = sunSet;
            }

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            public String getUvi() {
                return uvi;
            }

            public void setUvi(String uvi) {
                this.uvi = uvi;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public String getWindDegrees() {
                return windDegrees;
            }

            public void setWindDegrees(String windDegrees) {
                this.windDegrees = windDegrees;
            }

            public String getWindDir() {
                return windDir;
            }

            public void setWindDir(String windDir) {
                this.windDir = windDir;
            }

            public String getWindLevel() {
                return windLevel;
            }

            public void setWindLevel(String windLevel) {
                this.windLevel = windLevel;
            }

            public String getWindSpeed() {
                return windSpeed;
            }

            public void setWindSpeed(String windSpeed) {
                this.windSpeed = windSpeed;
            }

            @Override
            public String toString() {
                return "ConditionBean{" +
                        "condition='" + condition + '\'' +
                        ", conditionId='" + conditionId + '\'' +
                        ", humidity='" + humidity + '\'' +
                        ", icon='" + icon + '\'' +
                        ", pressure='" + pressure + '\'' +
                        ", realFeel='" + realFeel + '\'' +
                        ", sunRise='" + sunRise + '\'' +
                        ", sunSet='" + sunSet + '\'' +
                        ", temp='" + temp + '\'' +
                        ", tips='" + tips + '\'' +
                        ", updatetime='" + updatetime + '\'' +
                        ", uvi='" + uvi + '\'' +
                        ", vis='" + vis + '\'' +
                        ", windDegrees='" + windDegrees + '\'' +
                        ", windDir='" + windDir + '\'' +
                        ", windLevel='" + windLevel + '\'' +
                        ", windSpeed='" + windSpeed + '\'' +
                        '}';
            }
        }

        public static class SfcBean {
            /**
             * banner : 21公里外正在下雨呢
             * nearRain : 60702163
             * notice : 距您西北方向21公里正在下小雨呢
             * percent : [{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0},{"dbz":0,"desc":"无雨","icon":-1,"percent":0}]
             * rainLastTime : 0
             * sfCondition : 202
             * timestamp : 1593755382000
             */

            private String            banner;
            private int               nearRain;
            private String            notice;
            private int               rainLastTime;
            private int               sfCondition;
            private long              timestamp;
            private List<PercentBean> percent;

            public String getBanner() {
                return banner;
            }

            public void setBanner(String banner) {
                this.banner = banner;
            }

            public int getNearRain() {
                return nearRain;
            }

            public void setNearRain(int nearRain) {
                this.nearRain = nearRain;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }

            public int getRainLastTime() {
                return rainLastTime;
            }

            public void setRainLastTime(int rainLastTime) {
                this.rainLastTime = rainLastTime;
            }

            public int getSfCondition() {
                return sfCondition;
            }

            public void setSfCondition(int sfCondition) {
                this.sfCondition = sfCondition;
            }

            public long getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(long timestamp) {
                this.timestamp = timestamp;
            }

            public List<PercentBean> getPercent() {
                return percent;
            }

            public void setPercent(List<PercentBean> percent) {
                this.percent = percent;
            }

            public static class PercentBean {
                /**
                 * dbz : 0
                 * desc : 无雨
                 * icon : -1
                 * percent : 0.0
                 */

                private int    dbz;
                private String desc;
                private int    icon;
                private double percent;

                public int getDbz() {
                    return dbz;
                }

                public void setDbz(int dbz) {
                    this.dbz = dbz;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public int getIcon() {
                    return icon;
                }

                public void setIcon(int icon) {
                    this.icon = icon;
                }

                public double getPercent() {
                    return percent;
                }

                public void setPercent(double percent) {
                    this.percent = percent;
                }

                @Override
                public String toString() {
                    return "PercentBean{" +
                            "dbz=" + dbz +
                            ", desc='" + desc + '\'' +
                            ", icon=" + icon +
                            ", percent=" + percent +
                            '}';
                }
            }


            @Override
            public String toString() {
                return "SfcBean{" +
                        "banner='" + banner + '\'' +
                        ", nearRain=" + nearRain +
                        ", notice='" + notice + '\'' +
                        ", rainLastTime=" + rainLastTime +
                        ", sfCondition=" + sfCondition +
                        ", timestamp=" + timestamp +
                        ", percent=" + percent.toString() +
                        '}';
            }
        }

        public static class ForecastBean {
            /**
             * conditionDay : 雷阵雨
             * conditionIdDay : 4
             * conditionIdNight : 8
             * conditionNight : 中雨
             * humidity : 56
             * moonphase : WaxingGibbous
             * moonrise : 2020-07-02 16:51:00
             * moonset : 2020-07-02 02:10:00
             * pop : 60
             * predictDate : 2020-07-02
             * qpf : 4.3
             * sunrise : 2020-07-02 04:50:00
             * sunset : 2020-07-02 19:47:00
             * tempDay : 27
             * tempNight : 21
             * updatetime : 2020-07-02 23:07:00
             * uvi : 6
             * windDegreesDay : 90
             * windDegreesNight : 45
             * windDirDay : 东风
             * windDirNight : 东北风
             * windLevelDay : 1
             * windLevelNight : 2
             * windSpeedDay : 0.9
             * windSpeedNight : 2.4
             */

            private String conditionDay;
            private String conditionIdDay;
            private String conditionIdNight;
            private String conditionNight;
            private String humidity;
            private String moonphase;
            private String moonrise;
            private String moonset;
            private String pop;
            private String predictDate;
            private String qpf;
            private String sunrise;
            private String sunset;
            private String tempDay;
            private String tempNight;
            private String updatetime;
            private String uvi;
            private String windDegreesDay;
            private String windDegreesNight;
            private String windDirDay;
            private String windDirNight;
            private String windLevelDay;
            private String windLevelNight;
            private String windSpeedDay;
            private String windSpeedNight;

            public String getConditionDay() {
                return conditionDay;
            }

            public void setConditionDay(String conditionDay) {
                this.conditionDay = conditionDay;
            }

            public String getConditionIdDay() {
                return conditionIdDay;
            }

            public void setConditionIdDay(String conditionIdDay) {
                this.conditionIdDay = conditionIdDay;
            }

            public String getConditionIdNight() {
                return conditionIdNight;
            }

            public void setConditionIdNight(String conditionIdNight) {
                this.conditionIdNight = conditionIdNight;
            }

            public String getConditionNight() {
                return conditionNight;
            }

            public void setConditionNight(String conditionNight) {
                this.conditionNight = conditionNight;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getMoonphase() {
                return moonphase;
            }

            public void setMoonphase(String moonphase) {
                this.moonphase = moonphase;
            }

            public String getMoonrise() {
                return moonrise;
            }

            public void setMoonrise(String moonrise) {
                this.moonrise = moonrise;
            }

            public String getMoonset() {
                return moonset;
            }

            public void setMoonset(String moonset) {
                this.moonset = moonset;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPredictDate() {
                return predictDate;
            }

            public void setPredictDate(String predictDate) {
                this.predictDate = predictDate;
            }

            public String getQpf() {
                return qpf;
            }

            public void setQpf(String qpf) {
                this.qpf = qpf;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public String getTempDay() {
                return tempDay;
            }

            public void setTempDay(String tempDay) {
                this.tempDay = tempDay;
            }

            public String getTempNight() {
                return tempNight;
            }

            public void setTempNight(String tempNight) {
                this.tempNight = tempNight;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            public String getUvi() {
                return uvi;
            }

            public void setUvi(String uvi) {
                this.uvi = uvi;
            }

            public String getWindDegreesDay() {
                return windDegreesDay;
            }

            public void setWindDegreesDay(String windDegreesDay) {
                this.windDegreesDay = windDegreesDay;
            }

            public String getWindDegreesNight() {
                return windDegreesNight;
            }

            public void setWindDegreesNight(String windDegreesNight) {
                this.windDegreesNight = windDegreesNight;
            }

            public String getWindDirDay() {
                return windDirDay;
            }

            public void setWindDirDay(String windDirDay) {
                this.windDirDay = windDirDay;
            }

            public String getWindDirNight() {
                return windDirNight;
            }

            public void setWindDirNight(String windDirNight) {
                this.windDirNight = windDirNight;
            }

            public String getWindLevelDay() {
                return windLevelDay;
            }

            public void setWindLevelDay(String windLevelDay) {
                this.windLevelDay = windLevelDay;
            }

            public String getWindLevelNight() {
                return windLevelNight;
            }

            public void setWindLevelNight(String windLevelNight) {
                this.windLevelNight = windLevelNight;
            }

            public String getWindSpeedDay() {
                return windSpeedDay;
            }

            public void setWindSpeedDay(String windSpeedDay) {
                this.windSpeedDay = windSpeedDay;
            }

            public String getWindSpeedNight() {
                return windSpeedNight;
            }

            public void setWindSpeedNight(String windSpeedNight) {
                this.windSpeedNight = windSpeedNight;
            }

            @Override
            public String toString() {
                return "ForecastBean{" +
                        "conditionDay='" + conditionDay + '\'' +
                        ", conditionIdDay='" + conditionIdDay + '\'' +
                        ", conditionIdNight='" + conditionIdNight + '\'' +
                        ", conditionNight='" + conditionNight + '\'' +
                        ", humidity='" + humidity + '\'' +
                        ", moonphase='" + moonphase + '\'' +
                        ", moonrise='" + moonrise + '\'' +
                        ", moonset='" + moonset + '\'' +
                        ", pop='" + pop + '\'' +
                        ", predictDate='" + predictDate + '\'' +
                        ", qpf='" + qpf + '\'' +
                        ", sunrise='" + sunrise + '\'' +
                        ", sunset='" + sunset + '\'' +
                        ", tempDay='" + tempDay + '\'' +
                        ", tempNight='" + tempNight + '\'' +
                        ", updatetime='" + updatetime + '\'' +
                        ", uvi='" + uvi + '\'' +
                        ", windDegreesDay='" + windDegreesDay + '\'' +
                        ", windDegreesNight='" + windDegreesNight + '\'' +
                        ", windDirDay='" + windDirDay + '\'' +
                        ", windDirNight='" + windDirNight + '\'' +
                        ", windLevelDay='" + windLevelDay + '\'' +
                        ", windLevelNight='" + windLevelNight + '\'' +
                        ", windSpeedDay='" + windSpeedDay + '\'' +
                        ", windSpeedNight='" + windSpeedNight + '\'' +
                        '}';
            }

        }

        public static class HourlyBean {
            /**
             * condition : 阵雨
             * conditionId : 86
             * date : 2020-07-03
             * hour : 13
             * humidity : 65
             * iconDay : 3
             * iconNight : 33
             * pop : 90
             * pressure : 1004
             * qpf : 0.7
             * realFeel : 25
             * snow : 0
             * temp : 25
             * updatetime : 2020-07-03 13:41:50
             * uvi : 3
             * windDegrees : 135
             * windDir : ESE
             * windSpeed : 3
             * windlevel : 2
             */

            private String condition;
            private String conditionId;
            private String date;
            private String hour;
            private String humidity;
            private String iconDay;
            private String iconNight;
            private String pop;
            private String pressure;
            private String qpf;
            private String realFeel;
            private String snow;
            private String temp;
            private String updatetime;
            private String uvi;
            private String windDegrees;
            private String windDir;
            private String windSpeed;
            private String windlevel;

            public String getCondition() {
                return condition;
            }

            public void setCondition(String condition) {
                this.condition = condition;
            }

            public String getConditionId() {
                return conditionId;
            }

            public void setConditionId(String conditionId) {
                this.conditionId = conditionId;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHour() {
                return hour;
            }

            public void setHour(String hour) {
                this.hour = hour;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getIconDay() {
                return iconDay;
            }

            public void setIconDay(String iconDay) {
                this.iconDay = iconDay;
            }

            public String getIconNight() {
                return iconNight;
            }

            public void setIconNight(String iconNight) {
                this.iconNight = iconNight;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPressure() {
                return pressure;
            }

            public void setPressure(String pressure) {
                this.pressure = pressure;
            }

            public String getQpf() {
                return qpf;
            }

            public void setQpf(String qpf) {
                this.qpf = qpf;
            }

            public String getRealFeel() {
                return realFeel;
            }

            public void setRealFeel(String realFeel) {
                this.realFeel = realFeel;
            }

            public String getSnow() {
                return snow;
            }

            public void setSnow(String snow) {
                this.snow = snow;
            }

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            public String getUvi() {
                return uvi;
            }

            public void setUvi(String uvi) {
                this.uvi = uvi;
            }

            public String getWindDegrees() {
                return windDegrees;
            }

            public void setWindDegrees(String windDegrees) {
                this.windDegrees = windDegrees;
            }

            public String getWindDir() {
                return windDir;
            }

            public void setWindDir(String windDir) {
                this.windDir = windDir;
            }

            public String getWindSpeed() {
                return windSpeed;
            }

            public void setWindSpeed(String windSpeed) {
                this.windSpeed = windSpeed;
            }

            public String getWindlevel() {
                return windlevel;
            }

            public void setWindlevel(String windlevel) {
                this.windlevel = windlevel;
            }

            @Override
            public String toString() {
                return "HourlyBean{" +
                        "condition='" + condition + '\'' +
                        ", conditionId='" + conditionId + '\'' +
                        ", date='" + date + '\'' +
                        ", hour='" + hour + '\'' +
                        ", humidity='" + humidity + '\'' +
                        ", iconDay='" + iconDay + '\'' +
                        ", iconNight='" + iconNight + '\'' +
                        ", pop='" + pop + '\'' +
                        ", pressure='" + pressure + '\'' +
                        ", qpf='" + qpf + '\'' +
                        ", realFeel='" + realFeel + '\'' +
                        ", snow='" + snow + '\'' +
                        ", temp='" + temp + '\'' +
                        ", updatetime='" + updatetime + '\'' +
                        ", uvi='" + uvi + '\'' +
                        ", windDegrees='" + windDegrees + '\'' +
                        ", windDir='" + windDir + '\'' +
                        ", windSpeed='" + windSpeed + '\'' +
                        ", windlevel='" + windlevel + '\'' +
                        '}';
            }
        }


        @Override
        public String toString() {
            return "DataBean{" +
                    "city=" + city +
                    ", condition=" + condition.toString() +
                    ", sfc=" + sfc +
                    ", forecast=" + forecast.toString() +
                    ", hourly=" + hourly.toString() +
                    '}';
        }
    }

    public static class RcBean {
        /**
         * c : 0
         * p : success
         */

        private int    c;
        private String p;

        public int getC() {
            return c;
        }

        public void setC(int c) {
            this.c = c;
        }

        public String getP() {
            return p;
        }

        public void setP(String p) {
            this.p = p;
        }

        @Override
        public String toString() {
            return "RcBean{" +
                    "c=" + c +
                    ", p='" + p + '\'' +
                    '}';
        }
    }


    @Override
    public String toString() {
        return "MojiWeatherBean{" +
                "code=" + code +
                ", data=" + data.toString() +
                ", msg='" + msg + '\'' +
                ", rc=" + rc.toString() +
                '}';
    }
}
