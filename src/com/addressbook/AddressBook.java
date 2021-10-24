package com.addressbook;

import java.util.*;

/*
 * @Welcome -This code takes input from console as name, address, phone number, email and prints address book.
 * also includes feature of adding multiple address books.
 * @author  -deepak
 * @version -1.0
 * @since   -2021-10-19
 */

class AddressBook {
    public static Scanner sc = new Scanner(System.in);
    private static Method method = new Method();
    public static HashMap<String, ArrayList> bookMap = new HashMap<String, ArrayList>();
    private String addressBookName;
    public static ArrayList<PersonDetails> book = new ArrayList<>();

    //main method
    public static void main(String[] args) {
        AddressBook AddressBook = new AddressBook();
        boolean flag = true;
        while (flag) {
            System.out.println("Enter your choice");
            System.out.println("Select an option\n" + "1] Add New Address Book\n"
                    + "2] Find Duplicate Entry in Address Book\n" + "3]Search Record from a city\n"
                    + "4]Search Record from a State\n" + "5]Exit\n" + "Enter your Choice\n");
            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("Enter the Name of Address Book: ");
                    String addressBookName = sc.next();
                    if (bookMap.containsKey(addressBookName)) {
                        System.out.println("The Address book Already Exists");
                        break;
                    } else {
                        AddressBook.addAddressBook(addressBookName);
                        break;
                    }
                }
                case 2:
                    for (HashMap.Entry<String, ArrayList> entry : bookMap.entrySet()) {
                        ArrayList value = entry.getValue();
                        System.out.println("Address Book Name: " + entry.getKey());
                        //value.checkDuplicate();
                    }
                case 3:
                    System.out.println("Enter Name of City: ");
                    String CityName = sc.next();
                    AddressBook.searchPersonByCity(CityName);
                    break;

                case 4: {
                    System.out.println("Enter Name of State: ");
                    String StateName = sc.next();
                    AddressBook.searchPersonByState(StateName);
                    break;
                }

                case 5:
                    flag = false;
                    break;
            }
        }
    }

    //Add new AddressBook
    public void addAddressBook(String bookName) {

        boolean flag = true;

        while (flag) {
            System.out.println( "1] Add Record\n" + "2] Display\n"
                    + "3] Edit Record\n" + "4] Delete Record\n" + "5] Exit\n" + "Enter your Choice\n");
            int option = sc.nextInt();

            switch (option) {
                case 1:

                    System.out.println("enter no of Records to be added");
                    int noOfRecords = sc.nextInt();
                    for (int i = 0; i < noOfRecords; i++) {
                        method.addRecord();
                    }
                    bookMap.put(addressBookName, book);
                    System.out.println("Address Book Added Successfully");
                    break;

                case 2:
                    System.out.println("Enter the Person First name to Display ");
                    String Name = sc.next();

                    boolean list = method.Display(Name);
                    if (list) {
                        System.out.println("Displayed the Record");
                    } else {
                        System.out.println(" Cannot be Displayed");
                    }

                    break;

                case 3:
                    System.out.println("Enter the Person First name to edit details: ");
                    String personName = sc.next();

                    boolean listEdited = method.editRecord(personName);
                    if (listEdited) {
                        System.out.println("List Edited Successfully");
                    } else {
                        System.out.println("List Cannot be Edited");
                    }

                    break;
                case 4:
                    System.out.println("Enter the Record to be deleted:");
                    String firstName = sc.next();
                    boolean listDeleted = method.deleteRecord(firstName);
                    if (listDeleted) {
                        System.out.println("Deleted Record from the List");
                    } else {
                        System.out.println("List Cannot be Deleted");
                    }
                    break;
                case 5:
                    flag = false;
                    break;

            }

        }

    }

    private void searchPersonByState(String stateName) {
        for (HashMap.Entry<String, ArrayList> entry : bookMap.entrySet()) {
            ArrayList value = entry.getValue();
            System.out.println("The Address Book: " + entry.getKey());
            //value.getPersonNameByState(stateName);
        }
    }

    private void searchPersonByCity(String cityName) {
        for (HashMap.Entry<String, ArrayList> entry : bookMap.entrySet()) {
            ArrayList value = entry.getValue();
            System.out.println("The Address Book: " + entry.getKey());
            //value.getPersonNameByCity(cityName);
        }
    }
}