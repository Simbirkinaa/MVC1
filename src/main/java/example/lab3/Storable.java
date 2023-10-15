package example.lab3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public interface Storable {
    ProceedingJoinPoint sendToWarehouse(Warehouse warehouse);
}