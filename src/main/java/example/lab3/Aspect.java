package example.lab3;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;


@Component
public class Aspect {
    public void beforeAdvice() {
        System.out.println("Выполнение Before Advice");
    }

    public void afterReturningAdvice(Object result) {
        System.out.println("Выполнение After Returning Advice. Результат: " + result);
    }

    public void afterThrowingAdvice(Exception exception) {
        System.out.println("Выполнение After Throwing Advice. Исключение: " + exception.getMessage());
    }

    public void afterFinallyAdvice() {
        System.out.println("Выполнение After Finally Advice");
    }

    public void aroundAdvice(ProceedingJoinPoint joinPoint) {
        System.out.println("Выполнение Around Advice до метода");

        try {
            joinPoint.proceed(); // Вызов основной логики метода
            System.out.println("Выполнение Around Advice после метода");
        } catch (Throwable throwable) {
            System.out.println("Выполнение Around Advice при возникновении ошибки: " + throwable.getMessage());
        }
    }
    public void aroundAdviceWithoutParameters() {
        System.out.println("Выполнение Around Advice без параметров");
    }
}