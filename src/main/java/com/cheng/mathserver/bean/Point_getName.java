package com.cheng.mathserver.bean;

import com.cheng.model.Point_values;
import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.type.AviatorDouble;
import com.googlecode.aviator.runtime.type.AviatorJavaType;
import com.googlecode.aviator.runtime.type.AviatorObject;
import io.ebean.Ebean;

import java.util.List;
import java.util.Map;

public class Point_getName extends AbstractFunction {


    @Override
    public AviatorObject call(Map<String,Object> env, AviatorObject b) {
        String point_nname = ((AviatorJavaType) b).getName();//获取到数据点名称
//        Point_values p = Ebean.getDefaultServer().find(Point_values.class).where().eq("point_name",point_nname).findOne();
        Point_values p = Ebean.find(Point_values.class).where().eq("point_name",point_nname).findOne();
        Double values = Double.valueOf(p.value_s);//通过数据点名称查询获取到数据点数值
        return AviatorDouble.valueOf(values);
    }

    @Override
    public String getName() {
        return "Val";
    }
}
