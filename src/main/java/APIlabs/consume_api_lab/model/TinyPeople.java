package APIlabs.consume_api_lab.model;

public class TinyPeople implements Comparable<TinyPeople> {

	private String name;
	private String invented;
	private Long year;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInvented() {
		return invented;
	}
	public void setInvented(String invented) {
		this.invented = invented;
	}
	public Long getYear() {
		return year;
	}
	public void setYear(Long year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "TinyPeople [name=" + name + ", invented=" + invented + ", year=" + year + "]";
	}
	
	@Override
	public int compareTo(TinyPeople person) {
		return this.year.compareTo(person.year);
	}
	
}
