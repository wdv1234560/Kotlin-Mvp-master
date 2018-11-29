package com.jiac.ktmvp.ui;

import android.annotation.SuppressLint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 类       名:
 * 说       明:
 * 修 改 记 录:
 * 版 权 所 有:   Copyright © 2017
 * 公       司:   深圳市深电能售电有限公司
 * version   0.1
 * date   2018/4/19 11:02
 * author   caojiaxu
 */
public class DateUtil {
    public static final String YMDHMS_STYLE = "yyyy-MM-dd HH:mm:ss";
    public static String getFormatDay(String day, String style) {

        // 定义日期格式
        SimpleDateFormat matter = new SimpleDateFormat(style);
        try {
            Date date = matter.parse(day);
            return matter.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return "--";
        }
    }
    public static String getCurrentTime(String style) {
        // 定义日期格式
        SimpleDateFormat matter = new SimpleDateFormat(style);
        try {
            Date date = new Date();
            return matter.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return "--";
        }
    }

    public static Date getFormatDate(String day, String style) {
        // 定义日期格式
        SimpleDateFormat matter = new SimpleDateFormat(style);
        try {
            Date date = matter.parse(day);
            return date;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String getFormatYMD(String day) {
        try {
            String[] date = day.split(" ");

            return date[0];
        } catch (Exception e) {
            e.printStackTrace();
            return "--";
        }
    }

    /**
     * 与当前时间比较早晚
     *
     * @param time 需要比较的时间
     * @return lastTime比time晚则返回true
     */
    public static boolean compareNowMonth(String time, String lastTime) {
        boolean isDayu = false;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat formatYMD = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = null;
        Date parse1 = null;
        try {
            if (time.length() > 10) {
                parse = format.parse(time);

            } else {
                parse = formatYMD.parse(time);

            }
            if (lastTime.length() > 10) {
                parse1 = format.parse(lastTime);

            } else {
                parse1 = formatYMD.parse(lastTime);

            }
            long diff = parse1.getTime() - parse.getTime();
            if (diff > 0) {
                isDayu = true;
            } else {
                isDayu = false;
            }
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return isDayu;
    }

    public static String getTime(Date date, int type) {//可根据需要自行截取数据显示
        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String time = format.format(date);
        return time;
    }
}
