package com.company;

import task3.*; //importing the class that is located in other package(second), it lets us work with this class


public class Main {

    public static void main(String[] args) {
	Car c = new Car(2);
	c.start();
	c.stop();

	c.start();
	c.stop();

	Feline ff = new Feline();
	Canine cc = new Canine();
	ff.roam();
	cc.roam();
    }
}
