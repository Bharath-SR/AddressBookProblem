/**
 * 
 */
package com.bridgeLabz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class AddressBook {

	/**
	 *Address Book ability to create Contacts
	 */
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

//	class Operations{
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
			
			case 2:
				System.out.println("*************************************");
				Iterator<AddressBook> i = col.iterator();
				while(i.hasNext()) {
					AddressBook ab=i.next();
					System.out.println(ab);
					System.out.println("*************************************");
				}
			break;
			
			case 3:
				boolean available = false;
				System.out.println("Enter Serial Number to Delete ");
				sNo=inputInt.nextInt();
				System.out.println("*************************************");
			    i = col.iterator();
			    while(i.hasNext()) {
			    	AddressBook ab =i.next();
			    	if(ab.getsNumber() == sNo) {
			    		i.remove();
			    		available=true;
			    	}
			    }
			    
			    if(!available) {
			    	System.out.println("Record Not Found");
			    }else {
			    	System.out.println("Record is Deleted");
			    }
			    System.out.println("*************************************");
			break;
			
			case 4:
			    available = false;
				System.out.println("Enter Serial Number to Edit ");
				sNo=inputInt.nextInt();
				System.out.println("*************************************");
			    ListIterator<AddressBook> li = col.listIterator();
			    while(li.hasNext()) {
			    	AddressBook ab =li.next();
			    	if(ab.getsNumber() == sNo) {
			    		System.out.println("Enter Serial Number");
			    		sNo=inputInt.nextInt();
			    		System.out.println("Enter First Name");
			    		firstName=inputString.nextLine();
			    		System.out.println("Enter Your New last name");
			    		lastName=inputString.nextLine();
			            System.out.println("Enter New address :  ");
					   address =inputString.nextLine();
						System.out.println("Enter New State :  ");
						 state =inputString.nextLine();
						System.out.println("Enter New City :  ");
						 city =inputString.nextLine();
						System.out.println("Enter New ZipCode :  ");
						 zipcode =inputInt.nextInt();
						System.out.println("Enter New Phone Number :  ");
						 phone_number =inputInt.nextInt();
						System.out.println("Enter New Email :  ");
						 e_mail =inputString.nextLine();
						li.set(new AddressBook(firstName,lastName,address,state,city,zipcode,e_mail,phone_number, sNo));
						available = true;
			    	}
			    }
			    
			    if(!available) {
			    	System.out.println("Record Not Found");
			    }else {
			    	System.out.println("Record is Edited Successfully");
			    }
			    System.out.println("*************************************");
			break;
		}
		}while(ch!=0);
		
	}
	}
	



