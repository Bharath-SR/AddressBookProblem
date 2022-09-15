/**
 * 
 */
package com.bridgeLabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class AddressBook {
	 
	private int sNo;
	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private String city;
	private int zipcode;
	private int phone_number;
	private String e_mail;
	
	AddressBook(String firstName,String lastName,String address,String state,String city,int phone_number,String e_mail,int zipcode,int sNo){
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.state=state;
		this.city=city;
		this.zipcode=zipcode;
		this.phone_number=phone_number;
		this.e_mail=e_mail;
		this.sNo=sNo;
	}
	public int getsNumber() {
		return sNo;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public int getZipCode() {
		return zipcode;
	}
	public int getPhNumber() {
		return phone_number;
	}
	public String Email() {
		return e_mail;
	}
	public String toString() {
		return firstName+" "+lastName+" "+address+" "+state+" "+city+" "+zipcode+" "+phone_number+" "+e_mail;
	}

	public static void main(String[] args) {
		List<AddressBook> col= new ArrayList<AddressBook>();
		Scanner inputInt = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Delete");
			System.out.println("4.Edit");
			System.out.println("5.Search");
			System.out.println("Choose Your Option To Perform Operations:");
			ch=inputInt.nextInt();
			switch(ch) {
			case 1:
				System.out.print("Enter Serial Number :  ");
				int sNo =inputInt.nextInt();
				System.out.print("Enter first name : ");
				String firstName =inputString.nextLine();
				System.out.print("Enter last name :  ");
				String lastName =inputString.nextLine();
				System.out.print("Enter address :  ");
				String address =inputString.nextLine();
				System.out.print("Enter State :  ");
				String state =inputString.nextLine();
				System.out.print("Enter City :  ");
				String city =inputString.nextLine();
				System.out.print("Enter ZipCode :  ");
				int zipcode =inputInt.nextInt();
				System.out.print("Enter Phone Number :  ");
				int phone_number =inputInt.nextInt();
				System.out.print("Enter Email :  ");
				String e_mail =inputString.nextLine();
				col.add(new AddressBook(firstName,lastName,address,state,city,zipcode,e_mail,phone_number,sNo));
			break;
			}
			

}while(ch!=0);
	}}
