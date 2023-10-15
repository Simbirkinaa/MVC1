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
public class Car {
    public Car() {
    }
    @Value("${car.brand}")
    private String brand;

    public Car(String s, String s2) {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
    @PostConstruct
    public void init() {
        System.out.println("Car initialized.");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Car destroyed.");
    }
}
