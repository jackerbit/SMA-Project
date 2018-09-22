package sms.function;

import java.io.Serializable;

public class SchoolDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name, year, address, email, phone, yearOpened;;
	private int quantity; 
	
	public SchoolDTO() {
		name = year = address = email = phone = yearOpened = "";
		quantity = 0;
	}
	public SchoolDTO(String name, int quantity, String year, String address, String yearOpened, String email, String phone) {
		this.name = name;
		this.year = year;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.quantity = quantity;
		this.yearOpened = yearOpened;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getYearOpens() {
		return yearOpened;
	}
	public void setYearOpens(String yearOpens) {
		this.yearOpened = yearOpens;
	}
	@Override
	public String toString() {
		return "============ "+name.toUpperCase()+" ============\n"
				+ "Name: "+name+"\n"
				+ "The number of student: " +quantity+"\n" 
				+ "Year: "+year+"\n"
				+ "Address: "+address+"\n"
				+ "Year Opened: "+yearOpened+"\n"
				+ "Email: "+email+"\n"
				+ "Phone: "+phone+"\n";
	}
	
	
}
