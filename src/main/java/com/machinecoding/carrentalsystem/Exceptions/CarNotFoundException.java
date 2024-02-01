package com.machinecoding.carrentalsystem.Exceptions;

public class CarNotFoundException extends RuntimeException{
    public CarNotFoundException(String message){
        super(message);
    }
}
