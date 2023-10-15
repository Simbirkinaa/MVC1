package example.lab3;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class Clothing extends Item {
    public Clothing(String name) {
        super(name);
    }
}