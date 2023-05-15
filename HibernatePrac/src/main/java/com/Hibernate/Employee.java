/*
 * package com.sachin.HibernatePrac;
 * 
 * 
 * 
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.Id; import javax.persistence.ManyToMany; import
 * javax.persistence.OneToMany; import javax.persistence.OneToOne; import
 * javax.persistence.Table; import javax.persistence.Transient;
 * 
 * @Entity
 * 
 * @Table(name="emp_table") public class Employee { // POJO -> Plain Java Object
 * 
 * @Id private int id; // @Column(name="first_name")
 * 
 * 
 * private EmployeeName name; //@Transient private String country;
 * 
 * 
 * @OneToMany(mappedBy = "employee") private List<Equipment> equipments = new
 * ArrayList<Equipment>();
 * 
 * @ManyToMany private List<Equipment> equipments = new ArrayList<Equipment>();
 * 
 * 
 * 
 * @OneToOne private Equipment equipment;
 * 
 * 
 * public int getId() { return id; } public void setId(int id) { this.id = id; }
 * 
 * public EmployeeName getName() { return name; } public void
 * setName(EmployeeName name) { this.name = name; } public String getCountry() {
 * return country; } public void setCountry(String country) { this.country =
 * country; }
 * 
 * 
 * 
 * public List<Equipment> getEquipments() { return equipments; } public void
 * setEquipments(List<Equipment> equipments) { this.equipments = equipments; }
 * 
 * public Equipment getEquipment() { return equipment; } public void
 * setEquipment(Equipment equipment) { this.equipment = equipment; }
 * 
 * @Override public String toString() { return "Employee [id=" + id + ", name="
 * + name + ", country=" + country + "]"; }
 * 
 * 
 * 
 * 
 * }
 */


package com.Hibernate;




import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="emp_table")
public class Employee {  // POJO -> Plain Java Object

	@Id
	private int id;
	// @Column(name="first_name")
	
	
	private EmployeeName name;
	//@Transient
	private String country;
	
	/*
	 * @OneToMany(mappedBy = "employee") private List<Equipment> equipments = new
	 * ArrayList<Equipment>();
	 */
	@ManyToMany
	private List<Equipment> equipments = new ArrayList<Equipment>();
	
	
	/*
	@OneToOne
	private Equipment equipment;
	*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public EmployeeName getName() {
		return name;
	}
	public void setName(EmployeeName name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	public List<Equipment> getEquipments() {
		return equipments;
	}
	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}
	/*
	 * public Equipment getEquipment() { return equipment; } public void
	 * setEquipment(Equipment equipment) { this.equipment = equipment; }
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	
	
	
	
}

