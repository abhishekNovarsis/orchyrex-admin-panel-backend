package com.main.entity;

import org.springframework.data.mongodb.core.mapping.Document;

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
@Document(collection = "labour")
public class Labour {
	@Id
	private String id;
	private String labourerName;
	private String date;
	private String typeOfWork;
	private String hoursWorked;
	private String paymentPerHour;
	private String costPerPiece;
	private String totalPieces;
	private String totalCostByWorkHour;
	private String totalCostByPiece;

	// Getters and setters
}
