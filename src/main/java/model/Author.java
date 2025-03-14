package model;

public class Author {
	private int id;
	private String firstName;
	private String lastName;
	
	public Author(int id, String ime, String prezime) {
		super();
		this.id = id;
		this.firstName = ime;
		this.lastName = prezime;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
