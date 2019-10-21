package com.cheng.teskJobs.ceshi;

import com.cheng.model.Point;
import io.ebean.Ebean;
import org.apache.jasper.compiler.SmapStratum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.List;

@Component
public class install_points {
    Logger logger = LoggerFactory.getLogger(install_points.class);

    final String url = "jdbc:mysql://localhost:3306/boot_backend?serverTimezone=UTC&useSSL=false";

    @Scheduled(cron = "0/10 * * * * ?")
    public void s(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/boot_backend" +
                    "?useUnicode=true&characterEncoding=UTF-8&useServerPrepStmts=false&rewriteBatchedStatements=true","root","root");
            connection.setAutoCommit(false); //设置手动提交
            //预编译sql对象,只编译一回
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO a_point_values (point_id,point_name,value_s,colour_s) VALUES(?,?,?,?)");
            List<Point> points = Ebean.find(Point.class).findList();
            for (Point p : points){
                ps.setString(0, String.valueOf(p.id));
                ps.setString(1, String.valueOf(p.point_name));
                ps.setString(2, String.valueOf((int) (Math.random()*(1000-100)+100.02)));
                ps.setString(3, "");
                ps.addBatch();
            }
            ps.executeBatch();//提交批处理
            connection.commit();//执行
            connection.close();
        } catch (ClassNotFoundException e) {
            logger.info("驱动错误");
            e.printStackTrace();
        } catch (SQLException e) {
            logger.info("连接数据库失败");
            e.printStackTrace();
        }
    }



}
