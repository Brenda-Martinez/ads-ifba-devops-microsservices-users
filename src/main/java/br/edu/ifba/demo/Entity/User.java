package br.edu.ifba.demo.Entity;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "\"user\"")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "Nome nao pode ser nulo.")
    private String name;
    
    @NotBlank(message = "Email nao pode ser nulo.")
    private String email;

    @NotBlank(message = "Password nao pode ser nulo.")
    private String password;

}