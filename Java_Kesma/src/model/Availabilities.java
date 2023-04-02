package model;

public class Availabilities {
	
	private int id;
	private int addressId;
	private int mobil;
	private String email;
	private int phone;
	
	public Availabilities(int id, int addressId, int mobil, String email, int phone) {
		super();
		this.id = id;
		this.addressId = addressId;
		this.mobil = mobil;
		this.email = email;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getMobil() {
		return mobil;
	}
	public void setMobil(int mobil) {
		this.mobil = mobil;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Availabilities [id=" + id + ", addressId=" + addressId + ", mobil=" + mobil + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
	
	
}
