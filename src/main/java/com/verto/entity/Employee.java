package com.verto.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="Emp_data")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("eId") 
	private Integer eId;
	@Nonnull
	@JsonProperty("eName")
	private String eName;
	@Nonnull
	 @JsonProperty("eEmail")
	private String eEmail;
	@Nonnull
	 @JsonProperty("ePosition")
	private String ePosition;
}
