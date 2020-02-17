package com.cts.training.bootapphibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/*@Getter
@Setter
@AllArgsConstructor
@ToString*/

// to convert into JPA entity
@Entity // Registers the class as entity
// Define the mappings
@Table(name = "product")
public class Product {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique key and Auto Increment
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column
	private String category;
	
	@Column
	private int costs;

	private Integer cost;
	
	public Product() {}

	
	public Product( String name, String category,Integer cost,Integer id) {
		this.id=id;
		this.name = name;
		this.category = category;
		this.cost = cost;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", category=" + category + ", cost="+ cost +"]";
	}


	
		// TODO Auto-generated method stub
		
	
	
	
	
}
