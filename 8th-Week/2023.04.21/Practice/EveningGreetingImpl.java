package exam3;

import org.springframework.stereotype.Component;

@Component("Greeting3")
public class EveningGreetingImpl implements Greeting {
    @Override
    public void greet() {
        System.out.println("편안한 저녁되세요.");
    }
}
 
