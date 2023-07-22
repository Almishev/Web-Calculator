package com.spring.calculator.controller;

import com.spring.calculator.model.Digit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdditionController {

    @GetMapping("/")
    public String home(){

        return "home";
    }

    @GetMapping("/sum")
    public String viewForm(Model model){

        model.addAttribute("Addition",new Digit());
        return "add";
    }

    @PostMapping("/addition")
    public String add(@ModelAttribute Digit addition, BindingResult result, Model model){
        model.addAttribute("addition",addition);
        return "calculate-sum";
    }

    @GetMapping("/minus")
    public String viewMinusForm(Model model){

        model.addAttribute("Addition",new Digit());
        return "minus";
    }

    @PostMapping("/minus")
    public String minus(@ModelAttribute Digit minus, BindingResult result, Model model){
        model.addAttribute("minus",minus);
        return "calculate-minus";
    }

    @GetMapping("/multiplication")
    public String viewMultiplicationForm(Model model){

        model.addAttribute("Addition",new Digit());
        return "multiplication";
    }

    @PostMapping("/multiplication")
    public String multiplication(@ModelAttribute Digit multiplication, BindingResult result, Model model){
        model.addAttribute("multiplication",multiplication);
        return "calculate-multiplication";
    }


    @GetMapping("/divide")
    public String viewDivideForm(Model model){

        model.addAttribute("Addition",new Digit());
        return "divide";
    }

    @PostMapping("/divide")
    public String divide(@ModelAttribute Digit divide, BindingResult result, Model model){
        if (result.hasErrors()){
            return "error-zero";
        }
        model.addAttribute("divide",divide);
        return "calculate-divide";
    }
}
