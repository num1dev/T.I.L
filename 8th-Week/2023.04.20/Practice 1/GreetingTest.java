package exam1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;

 
public class GreetingTest {
    public static void main(String[] args) {
             ApplicationContext factory
                = new ClassPathXmlApplicationContext("exam1.xml");
            LocalDateTime now = (LocalDateTime)factory.getBean("DateTime");
            int hour = now.getHour();
            if (6 <= hour && hour < 12) {
                Greeting bean1 =(Greeting)factory.getBean("Greeting1");
                bean1.greet();
            } else if (12 <= hour && hour < 17) {
                Greeting bean2 =(Greeting)factory.getBean("Greeting2");
                bean2.greet();
            } else if (17 <= hour && hour < 22) {
                Greeting bean3 =(Greeting)factory.getBean("Greeting3");
                bean3.greet();
            } else {
                Greeting bean4 =(Greeting)factory.getBean("Greeting4");
                bean4.greet();
            }
        }
    } 
 
