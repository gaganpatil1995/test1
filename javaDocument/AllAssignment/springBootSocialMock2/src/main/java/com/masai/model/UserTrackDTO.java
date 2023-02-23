package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserTrackDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userTrackId ;
	
	private Integer userId ;
	
	private String phoneNumber ;
}
