package com.smartdatasolutions.test;

public class Member {

	private String	id;
	private String	address;
	private String	city;
	private String	firstName;
	private String	lastName;
	private String	state;
	private String	zip;
	
//	
//
//	public Member(String id, String address, String city, String firstName, String lastName, String state, String zip) {
//		super();
//		this.id = id;
//		this.address = address;
//		this.city = city;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.state = state;
//		this.zip = zip;
//	}

	public void setId( String id ) {
		this.id = id;
	}

	public String getId( ) {
		return id;
	}

	public String getAddress( ) {
		return address;
	}

	public String getCity( ) {
		return city;
	}

	public String getFirstName( ) {
		return firstName;
	}

	public String getLastName( ) {
		return lastName;
	}

	public String getState( ) {
		return state;
	}

	public String getZip( ) {
		return zip;
	}

	public void setAddress( String address ) {
		this.address = address;
	}

	public void setCity( String city ) {
		this.city = city;
	}

	public void setFirstName( String firstName ) {
		this.firstName = firstName;
	}

	public void setLastName( String lastName ) {
		this.lastName = lastName;
	}

	public void setState( String state ) {
		this.state = state;
	}

	public void setZip( String zip ) {
		this.zip = zip;
	}

	public String toCSVString() {
	    return "Member [id=" + id + ", address=" + address + ", city=" + city + ", firstName=" + firstName 
	        + ", lastName=" + lastName + ", state=" + state + ", zip=" + zip;
	}


	@Override
    public String toString( ) {
        return "Member [id=" + id + ", address=" + address + ", city=" + city + ", firstName=" + firstName 
        + ", lastName=" + lastName + ", state=" + state + ", zip=" + zip + "]";
    }

}
