package exam3;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;


public class GreetingTest {
    public static void main(String[] args) {
             ApplicationContext factory
                = new ClassPathXmlApplicationContext("exam3.xml");
            LocalDateTime now = (LocalDateTime)factory.getBean("DateTime");
            int hour = now.getHour();
            Greeting bean;
            if (6 <= hour && hour < 12) {
                bean =(Greeting)factory.getBean("Greeting1");
            } else if (12 <= hour && hour < 17) {
                bean =(Greeting)factory.getBean("Greeting2");
            } else if (17 <= hour && hour < 22) {
                bean =(Greeting)factory.getBean("Greeting3");
            } else {
                bean =(Greeting)factory.getBean("Greeting4");
            }
                bean.greet();
             ((ClassPathXmlApplicationContext)factory).close();
        }
    }
