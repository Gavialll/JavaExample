package ДинамічнаПараметриМетода;

import ВнутрішніКласи.Car;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        printUserInfo("firstName", "lastName");
    }

    public static void printUserInfo(String ... info){
        for(String point : info) {
            System.out.println(point);
        }
    }
}
