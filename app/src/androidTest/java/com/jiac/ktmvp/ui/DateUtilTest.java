package com.jiac.ktmvp.ui;

import android.util.Log;

import org.junit.Test;

/**
 * 类       名:
 * 说       明:
 * 修 改 记 录:
 * 版 权 所 有:   Copyright © 2017
 * 公       司:   深圳市深电能售电有限公司
 * version   0.1
 * date   2018/9/13 17:46
 * author   caojiaxu
 */
public class DateUtilTest {
    @Test
    public void getCurrentTime() throws Exception {
        String currentTime = DateUtil.getCurrentTime(DateUtil.YMDHMS_STYLE);
        Log.d("date","currentTime========"+currentTime);
    }

}