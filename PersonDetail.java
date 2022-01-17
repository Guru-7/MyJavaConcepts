package com.bytraining;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class PersonDetail {

	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList();
		int i = 0;
		while (i == 0) {

			Person person = new Person();

			String firstName = JOptionPane.showInputDialog("Enter your First Name ");
			String lastName = JOptionPane.showInputDialog("Enter your Last Name ");
			String phoneNo = JOptionPane.showInputDialog("Enter your Phone Number ");
			String Address = JOptionPane.showInputDialog("Enter your Address ");

			person.setFirstName(firstName);
			person.setLastName(lastName);
			person.setPhoneNo(phoneNo);
			person.setAddress(Address);

			list.add(person);

			i = JOptionPane.showConfirmDialog(null, "Are you Want to Add other person", "Confirmation", 2);

		}

		Collections.sort(list, (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));

		for (int j = 0; j < list.size(); j++) {
			System.out.print("First name : " + list.get(j).getFirstName() + "\tLast Name : " + list.get(j).getLastName()
					+ "\t PhoneNo : " + list.get(j).getPhoneNo() + "\t Address : " + list.get(j).getAddress());
			list.equals(j);

			System.out.print("\n------------------------ \n ");
		}
	}
}