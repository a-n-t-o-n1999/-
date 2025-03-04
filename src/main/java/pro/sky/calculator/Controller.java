package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final CalculatorServise calculatorServise;
    public Controller (CalculatorServise calculatorServise){
        this.calculatorServise=calculatorServise;
    }
    @GetMapping
    public String Hello(){
        return "Привет";
    }
    @GetMapping(path = "/calculator")
    public String HelloCalculator(){
        return calculatorServise.HelloCalculator();
    }
    @GetMapping(path = "/calculator/plus")
    public String Sum(@RequestParam("num1") int num1 , @RequestParam("num2")int num2){
        return calculatorServise.Sum(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String subtraction(@RequestParam("num1") int num1 , @RequestParam("num2")int num2){
        return calculatorServise.subtraction(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1 , @RequestParam("num2")int num2){
        return calculatorServise.multiply(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int num1 , @RequestParam("num2")int num2){
        return calculatorServise.divide(num1, num2);
    }
}
