package hashMaps;

import java.util.Objects;

final public class Students {
	private String name;

	public Students(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Students [name=" + name + "]";
	}
	

}
