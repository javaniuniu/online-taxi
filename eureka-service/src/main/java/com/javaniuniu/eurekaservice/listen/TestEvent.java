package com.javaniuniu.eurekaservice.listen;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @auther: javaniuniu
 * @date: 2020/9/12 12:22 PM
 */
@Component
public class TestEvent {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event){
        // 发邮件，发短信
        System.out.println("下线"+event.getServerId());
    }

    public static void main(String[] args) {
        Timer time = new Timer();
        TimerTask t = new TimerTask() {
            @Override
            public void run() {

            }
        };
        new Timer().schedule(t,1);
    }

}
