package example.lab3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class Item implements Storable {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public ProceedingJoinPoint sendToWarehouse(Warehouse warehouse) {
        warehouse.putOnWarehouse(this);
        return null;
    }

    public String getName() {
        return name;
    }
}