package com.cheng.mathserver;

import com.cheng.mathserver.bean.Point_getName;
import com.googlecode.aviator.AviatorEvaluator;

public class AviatorServer  {

    public String Aviators(String gongshi){
        AviatorEvaluator.addFunction(new Point_getName());//添加组件
        String value = String.valueOf(AviatorEvaluator.execute(gongshi));
        return value;
    }
}
