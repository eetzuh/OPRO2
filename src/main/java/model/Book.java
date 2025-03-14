package model;
import java.util.ArrayList;
import java.util.List;

public class Book {
	private int id;
    private String title;
    private boolean available;
    private int numPages;
    
	public Book(int id, String title, boolean available, int numPages) {
		super();
		this.id = id;
		this.title = title;
		this.available = available;
		this.numPages = numPages;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public boolean isAvailable() {
		return available;
	}

	public int getNumPages() {
		return numPages;
	}
  
}
