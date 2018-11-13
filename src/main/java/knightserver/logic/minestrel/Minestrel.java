package knightserver.logic.minestrel;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class Minestrel {
    @Before("execution(* knightserver.logic.knight.Knight.embarkOnQuest(..))")
    public void singBeforeQuest() {
        System.out.println("Fa la la; The knight is so brave!");
    }

    @After("execution(* knightserver.logic.knight.Knight.embarkOnQuest(..))")
    public void singAfterQuest() {
        System.out.println("O-ho-ho");
    }
}
