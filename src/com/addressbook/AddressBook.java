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
    static Scanner sc = new Scanner(System.in);

    static Method method = new Method();

    //main method
    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
            System.out.println("Select an option\n"
                    + "1] Add New Address Book\n"
                    + "2] Add entry\n"
                    + "3] Edit entry\n"
                    + "4] Delete Entry\n"
                    + "5] Search Record from a city\n"
                    + "6] Search Record from a State\n"
                    + "7] Display all addressBooks with details\n"
                    + "8] Display single addressBook details\n"
                    + "9] Exit\n");

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    method.addAddressBook();
                    break;
                case 2:
                    method.addRecord();
                    break;

                case 3:
                    method.editRecord();
                    break;

                case 4:
                    method.deleteRecord();
                    break;

                case 5: {
                    method.searchPersonByState();
                    break;
                }

                case 6:
                    method.searchPersonByCity();
                    break;

                case 7:
                    method.displayAll();
                    break;

                case 8:
                    method.displayBook();
                    break;

                case 9:
                    flag = false;
                    break;


            }
        }
    }
}




