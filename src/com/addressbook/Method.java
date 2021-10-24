package com.addressbook;

import java.util.*;
import java.util.stream.Collectors;


public class Method {
    public static Scanner sc = new Scanner(System.in);
    
    //creating book(list) for storing records(person Objects)
    public ArrayList<PersonDetails> book = new ArrayList<>();
    
    
    // Add Record Details to the addressBook.
    public void addRecord(){
        System.out.println("Enter the record details:");
        System.out.println("Enter First Name");
        String firstName = sc.next();
        System.out.println("Enter last Name");
        String lastName = sc.next();
        System.out.println("Enter Address ");
        String address = sc.next();
        System.out.println("Enter City ");
        String city = sc.next();
        System.out.println("Enter State ");
        String state = sc.next();
        System.out.println("Enter  Email ");
        String email = sc.next();
        System.out.println("Enter phone Number");
        String phoneNumber = sc.next();
        System.out.println("Enter Zip code");
        String zip = sc.next();

        PersonDetails record = new PersonDetails(firstName, lastName, address, city, state, email, phoneNumber, zip);
        book.add(record);
        System.out.println(book);

    }
    // Edit c Detail By Firstname
    public boolean editRecord(String Name)
    {
        int flag = 0;
        for(PersonDetails record: book)
        {
            if(record.getFirstName().equals(Name))
            {

                System.out.println("Select an option to edit\n"
                        +"1] First Name\n"
                        +"2] Last Name\n"
                        +"3] Address\n"
                        +"4] City\n"
                        +"5] State\n"
                        +"6] Email"
                        +"7] phone Number\n"
                        +"8] ZIP code\n");

                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                    {
                        System.out.println("Enter First Name: ");
                        String firstName = sc.next();
                        record.setFirstName(firstName);
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Enter last name: ");
                        String lastName = sc.next();
                        record.setLastName(lastName);
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Enter Address: ");
                        String address = sc.next();
                        record.setAddress(address);
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Enter City: ");
                        String city = sc.next();
                        record.setCity(city);
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Enter State: ");
                        String state =sc.next();
                        record.setState(state);
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Enter Email: ");
                        String email = sc.next();
                        record.setZip(email);
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Enter Phone Number:");
                        String phoneNumber = sc.next();
                        record.setPhoneNumber(phoneNumber);
                        break;
                    }
                    case 8:
                    {
                        System.out.println("Enter Zip Code: ");
                        String zip = sc.next();
                        record.setZip(zip);
                        break;
                    }

                }

                flag = 1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }
    //	Display c Details
    public boolean Display(String Name)
    {
        int flag = 0;
        for(PersonDetails record: book)
        {
            if(record.getFirstName().equals(Name))
            {
                System.out.println(record);
                flag = 1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }
    // Delete record Details
    public boolean deleteRecord(String name) {
        int flag = 0;
        for(PersonDetails record: book)
        {
            if(record.getFirstName().equals(name))
            {
                book.remove(record);
                flag = 1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }

}
