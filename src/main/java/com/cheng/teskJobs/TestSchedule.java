package com.cheng.teskJobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class TestSchedule {
    Logger logger = LoggerFactory.getLogger(TestSchedule.class);

    @Scheduled(fixedDelay = 1000)  //定时任务1
    public void printXXXXXXX(){
        try{
            Thread.sleep(5000);  //睡眠5秒
            logger.info(Thread.currentThread().getName() + "--------------" + "定时任务1"); //打印当前线程名字
        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }

    @Scheduled(fixedDelay = 1000)  //定时任务2
    public void printYYYYYYY(){
        try{
            Thread.sleep(1000);
            logger.info(Thread.currentThread().getName() + "--------------" + "定时任务2"); //打印当前线程名字

        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }

    @Scheduled(cron = "0/1 * * * * ?")  //定时任务2
    public void printZZZZZZZ(){
        try{
            Thread.sleep(1000);
            logger.info(Thread.currentThread().getName() + "--------------" + "定时任务3"); //打印当前线程名字

        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }

    @Scheduled(cron = "0/1 * * * * ?")  //定时任务2
    public void printAAAAAAAA(){
        try{
//            Thread.sleep(1000);
            logger.info(Thread.currentThread().getName() + "--------------" + "定时任务4"); //打印当前线程名字
            Thread.sleep(5000);

        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }

    @Scheduled(cron = "0/1 * * * * ?")  //定时任务2
    public void printAAAAAAA5(){
        try{
//            Thread.sleep(1000);
            logger.info(Thread.currentThread().getName() + "--------------" + "定时任务5"); //打印当前线程名字
            Thread.sleep(5000);

        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }


    @Scheduled(cron = "0/1 * * * * ?")  //定时任务2
    public void printAAAAAAA6(){
        try{
//            Thread.sleep(1000);
            logger.info(Thread.currentThread().getName() + "--------------" + "定时任务6"); //打印当前线程名字
            Thread.sleep(5000);

        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }


    @Scheduled(cron = "0/1 * * * * ?")  //定时任务2
    public void printAAAAAAA7(){
        try{
//            Thread.sleep(1000);
            logger.info(Thread.currentThread().getName() + "--------------" + "定时任务7"); //打印当前线程名字
            Thread.sleep(5000);

        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }



    @Scheduled(cron = "0/1 * * * * ?")  //定时任务2
    public void printAAAAAAA8(){
        try{
//            Thread.sleep(1000);
            logger.info(Thread.currentThread().getName() + "--------------" + "定时任务8"); //打印当前线程名字
            Thread.sleep(5000);

        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }



    @Scheduled(cron = "0/1 * * * * ?")  //定时任务2
    public void printAAAAAAA9(){
        try{
//            Thread.sleep(1000);
            logger.info(Thread.currentThread().getName() + "--------------" + "定时任务9"); //打印当前线程名字
            Thread.sleep(5000);

        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }



    @Scheduled(cron = "0/1 * * * * ?")  //定时任务2
    public void printAAAAAAA10(){
        try{
            Thread.sleep(5000);
            logger.info(Thread.currentThread().getName() + "--------------" + "定时任务10"); //打印当前线程名字

        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }




    @Scheduled(cron = "0/1 * * * * ?")  //定时任务2
    public void printAAAAAAA11(){
        try{
            Thread.sleep(5000);

            logger.info(Thread.currentThread().getName() + "--------------" + "定时任务11"); //打印当前线程名字

        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }

}
