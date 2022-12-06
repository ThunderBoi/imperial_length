package at.fhtw.imperial_length.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialLengthController {


    @GetMapping("/calculate/centimeter/{inch}")
    String calculateInchToCent(@PathVariable double inch){
        return String.valueOf(inch*2.54);
    }




}
