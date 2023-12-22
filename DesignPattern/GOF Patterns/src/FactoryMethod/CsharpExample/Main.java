/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod.CsharpExample;

/**
 *
 * @author fa20-bse-044
 */
public class Main {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();

        // Create a rural person (Villager)
        IPerson ruralPerson = personFactory.getPerson(PersonType.Rural);
        System.out.println("Rural Person: " + ruralPerson.getName());

        // Create an urban person (CityPerson)
        IPerson urbanPerson = personFactory.getPerson(PersonType.Urban);
        System.out.println("Urban Person: " + urbanPerson.getName());
    }
}