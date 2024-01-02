package com.main.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Document(collection = "finished_product_details")
public class FinishedProductDetail {

	@Id
	private String finishedProductId;
	private int sizeS;
	private int sizeM;
	private int sizeL;
	private int sizeXL;
	private int finishedProductQuantity;
	private double costPerPiece;
	private double otherCost;
	private double totalCost;

	// Getters and Setters

}
