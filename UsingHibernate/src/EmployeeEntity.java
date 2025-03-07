import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name  = "Employee_Details")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Ids")
	int id;
	@Column(name="Names")
	String name;
	@Column(name="Salary")
	long salary;
	@Column(name="Address")
	String address;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public EmployeeEntity() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeEntity(int id, String name, long salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}


	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}




}
