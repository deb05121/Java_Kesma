package model;

public class Address {
	
	private int id;
	private int userId;
	private String address;
	
	public Address(int id, int userId, String address) {
		super();
		this.id = id;
		this.userId = userId;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", userId=" + userId + ", address=" + address + "]";
	}
	
	
	
}
