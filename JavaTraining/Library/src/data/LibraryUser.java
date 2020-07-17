package data;

import java.util.List;

public class LibraryUser extends User{
	private static final long serialVersionUID = 8110324437740947497L;
	
	private List<Publication>publicationHistory;
	private List<Publication>borrowedPublications;
	
	public LibraryUser(String firstName, String lastName, String pesel) {
		super(firstName, lastName, pesel);
	}

	public List<Publication> getPublicationHistory() {
		return publicationHistory;
	}

	public List<Publication> getBorrowedPublications() {
		return borrowedPublications;
	}
	
	private void addPublicationToHistory(Publication pub) {
		publicationHistory.add(pub);
	}

	public void borrowPublication(Publication pub) {
		borrowedPublications.add(pub);
	}
	
	public boolean returnPublication(Publication pub) {
		boolean result = false;
		if(borrowedPublications.remove(pub)) {
			result = true;
			addPublicationToHistory(pub);
		}
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((borrowedPublications == null) ? 0 : borrowedPublications.hashCode());
		result = prime * result + ((publicationHistory == null) ? 0 : publicationHistory.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof LibraryUser))
			return false;
		LibraryUser other = (LibraryUser) obj;
		if (borrowedPublications == null) {
			if (other.borrowedPublications != null)
				return false;
		} else if (!borrowedPublications.equals(other.borrowedPublications))
			return false;
		if (publicationHistory == null) {
			if (other.publicationHistory != null)
				return false;
		} else if (!publicationHistory.equals(other.publicationHistory))
			return false;
		return true;
	}
	
	
}
