package example.lab3;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class ElectronicDevice extends Item {
    public ElectronicDevice(String name) {
        super(name);
    }
}