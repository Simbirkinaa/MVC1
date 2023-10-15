//Этот код представляет собой контроллер Spring Boot,
// который обрабатывает HTTP GET запросы на различные маршруты и возвращает текстовые ответы
package org.example.springApplication.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String SayHello(String name) {
        if (name != null) {
            return "Hello " + name + "!";
        } else {
            return "Hello world!";
        }
    }

    @GetMapping("/about")
    public String about() {
        return "about us";
    }

    @GetMapping("/options")
    public String options(String param) {
        if (param != null) {
            return "not an option";
        } else {
            return "options";
        }
    }
}
