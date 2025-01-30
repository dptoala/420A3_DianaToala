package com.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        System.out.println("1. Easy: IWeightable Interface for Airplane Weight");
         // Create IWeightable objects
        IWeightable cargo = new Cargo(850.0);
        IWeightable person = new Person(87.0);
        IWeightable luggage = new Luggage(23.0);

        // Create an Airplane
        Airplane airplane = new Airplane();

        // Add the IWeightable objects to the airplane
        airplane.addWeightable(cargo);
        airplane.addWeightable(person);
        airplane.addWeightable(luggage);

        // Display the total weight of the airplane
        airplane.displayTotalWeight(); // This should output the total weight of all objects

        System.out.println("\n");
        System.out.println("2. (BONUS) Moderate: Comparable for Sorting Books");
        // Create a list of books
        List<Book> books = new ArrayList<>();

        // Add some books to the list
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("Moby Dick 2", "Herman Melville", 1851));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813));
        books.add(new Book("Moby Dick", "Herman Melville", 1851));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));

        // Print the original list of books
        System.out.println("Original list of books:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Sort the books by title (alphabetical order)
        Collections.sort(books);

        // Print the sorted list of books
        System.out.println("\nSorted list of books:");
        for (Book book : books) {
            System.out.println(book);
        }


        System.out.println("\n");
        System.out.println("3. Intermediate: IShootable Polymorphism");
         //Create IShootable objects
        IShootable player = new Player(250);
        IShootable wall = new Wall(50);
        IShootable trap = new Trap();

        Bullet bullet = new Bullet();
        bullet.shoot(player, 20);
        bullet.shoot(wall, 35);
        bullet.shoot(trap, 15);

        System.out.println("\n");
        System.out.println("4. Hard: Payable Interface for Payroll System");
        // Create some Employee and Freelancer objects
        Employee employee1 = new Employee(8500.00);
        Employee employee2 = new Employee(6850.00);

        Freelancer freelancer1 = new Freelancer(40, 25.00);
        Freelancer freelancer2 = new Freelancer(35, 30.00);

        // Create a PayrollSystem object
        PayrollSystem payrollSystem = new PayrollSystem();

        // Add employees and freelancers to the payroll system
        payrollSystem.addPayable(employee1);
        payrollSystem.addPayable(employee2);
        payrollSystem.addPayable(freelancer1);
        payrollSystem.addPayable(freelancer2);

        // Display the total payroll
        payrollSystem.displayTotalPayroll();

    }// end void main
}
