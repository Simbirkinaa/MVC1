package example;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeIoC {
    public static void main(String[] args) {
        // файл содержит информацию о бинах, которые Spring должен создать и управлять
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = context.getBean("employeeBean", Employee.class);
        System.out.println(employee.getEmployeeInfo());

        Employee employee2 = context.getBean("employeeBean2", Employee.class);
        System.out.println(employee2.getEmployeeInfo());

        context.close();
    }
}
