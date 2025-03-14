package model;
import java.util.ArrayList;
import java.util.List;

public class Librarian {
	private int id;
	private String firstName;
	private String lastName;
	private List<Member> members;
	
	public Librarian(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.members = new ArrayList<Member>();
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
	
	public List<Member> getMemberss() {
		return members;
	}

	
}
