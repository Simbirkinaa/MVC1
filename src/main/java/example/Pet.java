package example;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class Pet {
    public Pet() {
        // конструктор без параметров
    }
    @Value("${pet.name}")
    private String name;

    public Pet(String s, String s2) {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
    @PostConstruct
    public void init() {
        System.out.println("Pet initialized.");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Pet destroyed.");
    }
}
