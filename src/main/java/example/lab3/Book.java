package example.lab3;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Book extends Item {
    public Book(String name) {
        super(name);
    }
    public void getBook(){
        System.out.println("Книга взята");
    }
}