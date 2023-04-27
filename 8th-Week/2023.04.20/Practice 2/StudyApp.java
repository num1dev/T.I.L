package exam2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudyApp {
    public static void main(String[] args) {
        // 스프링 설정 파일을 이용하여 IoC 컨테이너 생성
        ApplicationContext factory
                = new ClassPathXmlApplicationContext("bean1.xml");

        // st1, st2, st3 빈 객체를 가져옴
        Student st1 = (Student) factory.getBean("st1");
        Student st2 = (Student) factory.getBean("st2");
        Student st3 = (Student) factory.getBean("st3");

        // 메시지 출력
        System.out.println(st1.getName() + "는 " + st1.getMyHomework().getHomeworkName() + "를 학습합니다.");
        System.out.println(st2.getName() + "는 " + st2.getMyHomework().getHomeworkName() + "를 학습합니다.");
        System.out.println(st3.getName() + "는 " + st3.getMyHomework().getHomeworkName() + "를 학습합니다.");

        // IoC 컨테이너 종료
        ((ClassPathXmlApplicationContext)factory).close();
    }
}
