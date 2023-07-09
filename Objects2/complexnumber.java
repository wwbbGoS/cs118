import java.util.*;

public class ComplexNumber {
    private double realNum;
    private double imaginaryNum;

    public ComplexNumber(){
        this.realNum = 0;
        this.imaginaryNum = 0;
    }

    public ComplexNumber(double realNum, double imaginaryNum) {
        this.realNum = realNum;
        this.imaginaryNum = imaginaryNum;
    }

    public double getReal() {
        return realNum;
    }

    public double getImaginary() {
        return imaginaryNum;
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        double newReal = c1.getReal() + c2.getReal();
        double newImaginary = c1.getImaginary() + c2.getImaginary();
        return new ComplexNumber(newReal, newImaginary);
    }

    public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2) {
        double newReal = c1.getReal() - c2.getReal();
        double newImaginary = c1.getImaginary() - c2.getImaginary();
        return new ComplexNumber(newReal, newImaginary);
    }

    public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {
        double newReal = (c1.getReal() * c2.getReal()) - (c1.getImaginary() * c2.getImaginary());
        double newImaginary = (c1.getImaginary() * c2.getReal()) + (c1.getReal() * c2.getImaginary());
        return new ComplexNumber(newReal, newImaginary);
    }

    public static ComplexNumber divide(ComplexNumber c1, ComplexNumber c2) {
        double divisor = ((c2.getReal() * c2.getReal()) + (c2.getImaginary() * c2.getImaginary()));

        double newReal = (c1.getReal() * c2.getReal()) + (c1.getImaginary() * c2.getImaginary());
        newReal = newReal / divisor;

        double newImaginary = (c1.getImaginary() * c2.getReal()) - (c1.getReal() * c2.getImaginary());
        newImaginary = newImaginary / divisor;

        return new ComplexNumber(newReal, newImaginary);
           
    }

    public String toString() {
        return (this.realNum + "+" + this.imaginaryNum + "i");
    }

    public double getAbsoluteValue(){
        return Math.sqrt((this.realNum * this.realNum) + (this.imaginaryNum * this.imaginaryNum));
    }
}