package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){

        if(findContact(contact.getName()) >= 0){
            return false;
        }

        myContacts.add(contact);
        System.out.println("Contact successfully added");
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){

        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;

    }

    public boolean removeContact(Contact contact){

        if(findContact(contact) >= 0){
            this.myContacts.remove(contact);
            System.out.println("Contact Removed");
            return true;
        }

        System.out.println("Contact not found.");
        return false;

    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for(int i = 0; i < myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){

        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);

        }

        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i = 0; i < this.myContacts.size(); i++){
            System.out.println(((i + 1) + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber()));
        }
        System.out.println("You have " + (myContacts.size()) + " contacts.");

    }

    /**
     *
     * Contact List:
     * 1. Bob -> 31415926
     * 2. Alice -> 16180339
     * 3. Tom -> 11235813
     * 4. Jane -> 23571113
     */
}
