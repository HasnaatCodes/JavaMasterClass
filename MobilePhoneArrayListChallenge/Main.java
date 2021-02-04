package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0161");

    public static void main(String[] args) {

        boolean quit = false;
        printActions();

        while (!quit) {
            System.out.println("Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
            }
        }



    }

    private static void queryContact() {
        System.out.print("Please enter the name of the contact: ");
        String name = scanner.nextLine();

        Contact contact = mobilePhone.queryContact(name);
        if(contact == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + contact.getName() + " phone number is " + contact.getPhoneNumber());
    }

    private static void removeContact() {
        System.out.print("Please enter the name of the contact: ");
        String name = scanner.nextLine();

        Contact contact = mobilePhone.queryContact(name);
        if(contact == null){
            System.out.println("Contact not found");
            return;
        }

        mobilePhone.removeContact(contact);
    }

    private static void updateContact() {
        System.out.print("Please enter the name of the contact: ");
        String oldName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(oldName);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContact, newContact)){
            System.out.println("Successfully updated record");
        }else{
            System.out.println("Error updating contact");
        }

    }

    private static void addNewContact() {

        System.out.print("Please enter the name of the contact: ");
        String name = scanner.nextLine();
        System.out.print("Please enter the number of the contact: ");
        String number = scanner.nextLine();


        Contact newContact = Contact.createContact(name, number);

        if(mobilePhone.addNewContact(newContact)){
            System.out.println("Contact successfully added");
        }else{
            System.out.println("Contact not added, user already on file");
        }
    }

    public static void printActions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To shutdown.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To update a contact in the list.");
        System.out.println("\t 4 - To remove a contact  from the list.");
        System.out.println("\t 5 - To query a contact  in the list.");
        System.out.println("\t 6 - To print choice options.");
        System.out.println("Choose your action: ");
    }


}
