package com.singleton;

import com.singleton.service.SingletonService;

public class Main {
    public static void main(String[] args) {
        SingletonService instanceOne = SingletonService.getInstance();
        SingletonService instanceTwo = SingletonService.getInstance();

        System.out.println("Instance one " + instanceOne.hashCode());
        System.out.println("Instance two " + instanceTwo.hashCode());
    }
}