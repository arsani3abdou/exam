package fhtw.at.exam.dto;

public class Measurements {
    private double number;

    public double getNumber() {
        return number;
    }

    public void setCalculatedNumberM(double number){
        this.number = number * 2.54;
    }

    public void setCalculatedNumberCm(double number){
        this.number = number / 1.094;
    }

}
