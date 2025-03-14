package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member {
	private int id;
	private String firstName;
	private String lastName;
	private Date membershipDate;
	private boolean active;
	private List<Book> books;
	
	
	public Member(int id, String firstName, String lastName, Date membershipDate, boolean active) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.membershipDate = membershipDate;
		this.active = active;
		this.books = new ArrayList<Book>();
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

	public Date getMembershipDate() {
		return membershipDate;
	}

	public boolean isActive() {
		return active;
	}
	
	public List<Book> getBooks() {
		return books;
	}
	
}
