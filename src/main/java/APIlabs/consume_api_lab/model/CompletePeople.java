package APIlabs.consume_api_lab.model;

public class CompletePeople implements Comparable<CompletePeople> {

	private String firstName;
	private String lastName;
	private String innovation;
	private Long year;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getInnovation() {
		return innovation;
	}
	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}
	public Long getYear() {
		return year;
	}
	public void setYear(Long year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "CompletePeople [firstName=" + firstName + ", lastName=" + lastName + ", innovation=" + innovation
				+ ", year=" + year + "]";
	}
	
	@Override
	public int compareTo(CompletePeople person) {
		return this.year.compareTo(person.year);
	}
	
}
