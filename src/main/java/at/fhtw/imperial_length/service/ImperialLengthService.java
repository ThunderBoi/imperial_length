package at.fhtw.imperial_length.service;

import org.springframework.stereotype.Service;

@Service
public class ImperialLengthService {

    public String calculateInch(double inch){
        return String.valueOf(inch*2.54);
    }

    public String calculateyards(double yards){
        return String.valueOf(yards/1.094);
    }
}
