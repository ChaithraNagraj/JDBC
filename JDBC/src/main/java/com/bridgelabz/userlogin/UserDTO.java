package com.bridgelabz.userlogin;
/******************************
 * 
 * @author chaithra B N
 *@version 1.0
 *@since 15/04/2020
 *Purpose:Data Model For Register or Login process of user this class will work as intermediate between Application and Database
 *		   it will Store User data temporary based and store data object into database.it's also called as DTO(Data Transfer Object)
 *		   this layer should contain a simple class called Data Transfer Object(DTO) this object is just a simple mapping to the table, 
 *		   every column in the table would be a member variable in the class.main aim is to order this layer to create, modify, delete 
 *		   or search for an entity Using simple java objects rather than dealing with SQL statements and other database related commands.
 *         We want to map this table to our java code, we can do so by creating a simple class(bean) that contains the same fields.
 * 
 *
 */
public class UserDTO {
private String fName;
private String lName;
private String uName;
private String gender;
private String password;
private String address;
private String city;
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getuName() {
	return uName;
}
public void setuName(String uName) {
	this.uName = uName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
private String state;
private int pincode;
private long contact;
/** To get contact of user from object
 * */
}
