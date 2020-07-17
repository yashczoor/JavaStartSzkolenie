package data;

public class Book extends Publication {
	private static final long serialVersionUID = 567572007159905747L;
	// Fields
	private String authorSurname;
	private String authorName;
	private int pages;
	private String isbn;
	
	// setters getters
	public String getAuthorSurname() {
		return authorSurname;
	}

	public void setAuthorSurname(String authorSurname) {
		this.authorSurname = authorSurname;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	// Construct
	public Book(String title, String authorName, String authorSurname, int releaseDate, int pages, String publisher,
			String isbn) {
		super(releaseDate, title, publisher);
		this.setAuthorName(authorName);
		this.setAuthorSurname(authorSurname);
		this.setPages(pages);
		this.setIsbn(isbn);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + ((authorSurname == null) ? 0 : authorSurname.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + pages;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (authorSurname == null) {
			if (other.authorSurname != null)
				return false;
		} else if (!authorSurname.equals(other.authorSurname))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (pages != other.pages)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder print = new StringBuilder(32); //jak bêdzie d³u¿sze to podwoi pojemnosc samo
		print.append(getTitle());
		print.append("; ");
		print.append(getAuthorName());
		print.append(" ");
		print.append(getAuthorSurname());
		print.append("; ");
		print.append(getYear());
		print.append("; ");
		print.append(getPages());
		print.append("; ");
		print.append(getPublisher());
		print.append("; ");
		print.append(getIsbn());
		return print.toString();
	}
	

	/*public Book(Book book) {
		this(book.getTitle(), book.getAuthorName(), book.getAuthorSurname(), book.getYear(), book.getPages(),
				book.getPublisher(), book.getIsbn());
	}*/

	// methods
	
}
