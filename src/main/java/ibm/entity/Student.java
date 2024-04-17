package ibm.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	@Column(name = "St_Name")
	private String name;
	private String gender;
	private String address;
	
	



	
	
public Student(int id, String name, String gender, String address)
{
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.address = address;
}

		
		
		
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "Employee [ id=" + id + ",name=" + name + ", gender=" + gender + ", address=" + address + "]";
		}
	}

		
	
		

