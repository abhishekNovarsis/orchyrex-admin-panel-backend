package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Distributor {
	@Id
	@GeneratedValue
	private long id;
	private String distributorName;
	private String distributorAddress;
	private String distributorContact;
	private int sizeS;
	private int sizeM;
	private int sizeL;
	private int sizeXL;
	private String sellingPrice;
	private String profit;
}
