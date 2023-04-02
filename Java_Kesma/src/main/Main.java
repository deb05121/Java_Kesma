package main;

import java.sql.SQLException;
import java.util.ArrayList;

import db.Database;
import model.Address;
import model.Availabilities;
import model.User;

public class Main {

	public static void main(String[] args) throws SQLException {
		ArrayList<User> userList = new ArrayList<>();
		ArrayList<Address> addressList = new ArrayList<>();
		ArrayList<Availabilities> availabilitiesList = new ArrayList<>();
		Database db = new Database();
		userList = db.users();
		
		addressList = db.addresses();
		
		availabilitiesList = db.availabilities();
	
		
		for (User user : userList) {
			System.out.println(user.getName() + ": ");
			
			for (Address address : addressList) {
				if(user.getId() == address.getUserId()) {
					
					System.out.println(address.getAddress() + "; ");
				}
				for (Availabilities availabilities : availabilitiesList) {
					
					if((address.getId() == availabilities.getAddressId()) && (user.getId() == address.getUserId())) {
						
						System.out.println("Mobil: " + " " + availabilities.getMobil() + ", " + " " + "Email: " + availabilities.getEmail() + ", " + " " + "Phone: " + availabilities.getPhone());
					}
				}
			}
			System.out.println();
		}
			
		
		db.closedb();
		
		
	}

}
