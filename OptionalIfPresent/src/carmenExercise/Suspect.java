package carmenExercise;

public class Suspect {
	private String name;
	private String country;
	
	@Override
	public String toString() {
		return "Suspect [name=" + name + ", country=" + country + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
