/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao01;

import java.util.Date;

/**
 *
 * @author aluno
 */
 public class Estudante {

    private static String nome;
    private Date Datanascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;

    public Estudante() {
        nome = "nobody";

    }

    private int obterIdade(Date hoje) {

        int idade = 0;

        return idade;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String _nome) {
        nome = _nome;    
    }

    public Date getDatanascimento() {
        return Datanascimento;
    }

    public void setDatanascimento(Date _Datanascimento) {
        Datanascimento = _Datanascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String _cpf) {
        cpf = _cpf;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char _genero) {
        genero = _genero;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String _matricula) {
        matricula = _matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        email = _email;
    }

}
