
public class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {

		return 31;
	}

	@Override
	public boolean equals(Object obj) {

		return true;
	}
}
