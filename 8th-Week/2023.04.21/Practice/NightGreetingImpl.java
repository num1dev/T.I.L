package exam3;

import org.springframework.stereotype.Component;

@Component("Greeting4")
public class NightGreetingImpl implements Greeting {
    @Override
    public void greet() {
        System.out.println("안녕히 주무세요.");
    }
} 
