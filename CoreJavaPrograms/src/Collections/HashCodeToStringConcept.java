package Collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashCodeToStringConcept {
	String name;
	int id;
	HashCodeToStringConcept(String name, int id){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", id=" + id;
	}

	public static void main(String[] args) {
		HashCodeToStringConcept emp1 = new HashCodeToStringConcept("manju", 2810);
		HashCodeToStringConcept emp2 = new HashCodeToStringConcept("manju", 2810);
		Set data = new HashSet();
		data.add(emp1);
		data.add(emp2);
		System.out.println("result"+ data);
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		
		HashCodeToStringConcept other = (HashCodeToStringConcept) obj;
		if(id != other.id) {
			return false;
		}
		return true;
	}

}
