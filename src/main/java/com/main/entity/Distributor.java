package com.main.entity;

import org.springframework.data.mongodb.core.mapping.Document;

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
@Document(collection = "distibutors")
public class Distributor {
	@Id
	private String id;
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
