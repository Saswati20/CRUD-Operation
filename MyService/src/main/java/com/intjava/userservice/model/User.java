package com.intjava.userservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Accessors(chain = true)
@Document(collection ="test")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class User 
{
	@Id
	@NotBlank
	private int id;
	@NotBlank
	private String username;
	@NotBlank
	@Size(min = 3, max = 30)
	private String full_name;
	@NotBlank
	@Email(message = "Please enter a valid email")
	private String email;
	@NotBlank
	private Long age;
	@NotBlank
	@Size(min = 8, max = 15)
	private String password;
	@NotBlank
	@Size(min = 8, max = 15)
	private String passwordConfirm ;
	
	
}
