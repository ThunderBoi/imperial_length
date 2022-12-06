package at.fhtw.imperial_length.controller;


import at.fhtw.imperial_length.service.ImperialLengthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialLengthController {

    private final ImperialLengthService service;

    public ImperialLengthController(ImperialLengthService service) {
        this.service = service;
    }

    @GetMapping("/calculate/centimeter/{inch}")
    String calculateInchToCent(@PathVariable double inch){
        return service.calculateInch(inch);
    }

    @GetMapping("/calculate/meter/{yard}")
    String calculateYardToMeter(@PathVariable double yards){
        return service.calculateInch(yards);
    }

}
