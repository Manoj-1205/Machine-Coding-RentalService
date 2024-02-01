package com.machinecoding.carrentalsystem.Exceptions;

public class CarAlreadyBookedException extends RuntimeException{
    public CarAlreadyBookedException(String message){
        super(message);
    }
}
