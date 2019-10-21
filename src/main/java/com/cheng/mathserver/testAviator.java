package com.cheng.mathserver;

import com.cheng.mathserver.bean.Point_getName;
import com.googlecode.aviator.AviatorEvaluator;

public class testAviator {

    public static void main(String[] args)  {
        System.out.println("start");

//        String sRule = "(Val(dsadas)+123)>124 && (1/1)==1 ";//ture
//        String sRule = "0+ 0*1 > 1.5";//ture
        String sRule = "Val(dsdas)";//ture
        AviatorEvaluator.addFunction(new Point_getName());//添加组件
        String result = String.valueOf(AviatorEvaluator.execute(sRule));
        System.out.println("result : " + result);

        /**
         *
         */
//        String Avi = Aviators("");
//        System.out.println("result ：：：：：：： " + Avi);

    }

    private static String Aviators(String gongshi) {
        AviatorEvaluator.addFunction(new Point_getName());//添加组件
        String value = String.valueOf(AviatorEvaluator.execute(gongshi));
        return value;
    }


}
