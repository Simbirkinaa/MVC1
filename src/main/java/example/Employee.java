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
public class Employee {

    @Value("${employee.name}")
    private String name;

    @Value("${employee.age}")
    private int age;

    @Autowired
    private Car car;

    @Autowired
    private Pet pet;
    public Employee() {
        System.out.println("Employee constructor called.");
    }

    public Employee(String s, String s2, Pet pet, Car car) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    // Этот метод возвращает строку, содержащую информацию о сотруднике
    public String getEmployeeInfo() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", pet=" + pet +
                '}';
    }
    @PostConstruct
    public void init() {
        System.out.println("Employee initialized.");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Employee destroyed.");
    }
}
