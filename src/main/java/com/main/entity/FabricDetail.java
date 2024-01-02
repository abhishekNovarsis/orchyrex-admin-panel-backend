package com.main.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "fabric_details")
public class FabricDetail {

	@Id
	private String id;
	private String fabricType;
	private String fabricColor;
	private String fabricPattern;
	private String image;
	private int quantity;
	private double lengthInMeter;
	private double pricePerMeter;

	// Getters and Setters

}
