package com.mysite.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {
	@Id
	private Integer empid;
	@Column(length=25)
	private String empName;
	private String email;
	private String empAddress;
}
