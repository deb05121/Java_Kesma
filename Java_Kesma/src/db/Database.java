package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

import model.Address;
import model.Availabilities;
import model.User;

public class Database {
	
	private final String DB_URL = "jdbc:mysql://localhost:3306/userdb";
	private final String DB_USER = "root";
	private final String DB_PWD = "root";
	private Connection conn;
	
	public Database() throws SQLException {
		conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
		
	}
	
	public ArrayList<User> users() throws SQLException {
		ArrayList<User> userList = new ArrayList<>();
		
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM userdb.users");
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			
			User u = new User(id, name);
			userList.add(u);
		}
		
		return userList;
	}
	
	public ArrayList<Address> addresses() throws SQLException {
		ArrayList<Address> addressList = new ArrayList<>();
		
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM userdb.addresses");
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			int id = rs.getInt("id");
			int userid = rs.getInt("userid");
			String address = rs.getString("address");
			
			Address addr = new Address(id, userid, address);
			addressList.add(addr);
		}
		
		return addressList;
	}
	
	public ArrayList<Availabilities> availabilities() throws SQLException {
		ArrayList<Availabilities> availabilitiesList = new ArrayList<>();
		
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM userdb.availabilities");
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			int id = rs.getInt("id");
			int addressid = rs.getInt("addressid");
			int mobil = rs.getInt("mobil");
			String email = rs.getString("email");
			int phone = rs.getInt("phone");
			
			Availabilities av = new Availabilities(id, addressid, mobil, email, phone);
			availabilitiesList.add(av);
		}
		
		
		return availabilitiesList;
	}
	
	public void closedb() throws SQLException {
		conn.close();
	}


	
	
}
