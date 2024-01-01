package com.main.entity;

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
@Entity
@Table(name = "fabric_details")
public class FabricDetail {

	@Id
	@GeneratedValue
	private Long id;
	private String fabricType;
	private String fabricColor;
	private String fabricPattern;
	private String image;
	private int quantity;
	private double lengthInMeter;
	private double pricePerMeter;

	// Getters and Setters

}
