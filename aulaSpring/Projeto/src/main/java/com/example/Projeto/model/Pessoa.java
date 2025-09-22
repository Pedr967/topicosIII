package com.example.projeto.model;

import java.lang.annotation.Inherited;
import java.security.Identity;

import jakarta.persistence.Entity;
import jakarta.persistence.Tabel;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name= "pessoas")
public class Pessoa {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;

    public Pessoa(){
        this("",0);
    }

    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }
     public String setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public Integer setIdade(Integer idade){
        this.idade = idade;
    }
    
    public Integer getIdade(){
        return idade;
    }

}
