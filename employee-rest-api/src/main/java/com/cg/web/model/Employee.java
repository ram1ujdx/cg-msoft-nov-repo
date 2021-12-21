package com.cg.web.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@JsonProperty("id")
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private float salary;
	
	//@JsonIgnore
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate joinedDate;
	
	
}
