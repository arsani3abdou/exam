package fhtw.at.exam.service;

import fhtw.at.exam.dto.Measurements;
import org.springframework.stereotype.Service;

@Service
public class ConverterService {
    Measurements measurements = new Measurements();

    public void takeInInch(double input){
        measurements.setCalculatedNumberM(input);
    }

    public void takeInYard(double input){
        measurements.setCalculatedNumberCm(input);
    }

    public double getNumber(){
        return measurements.getNumber();
    }
}
