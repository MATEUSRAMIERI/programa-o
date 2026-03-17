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
    private String nivelEnsino;
    private int telefone;
    private String AnodeEntrada;
    private String Situação;
    private String SemestreEn;
    private String digito;

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
        return AnodeEntrada + SemestreEn + digito;
    }

    public void setMatricula(String _digito) {
        digito = _digito;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        email = _email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int _telefone) {
        telefone = _telefone;
    }

    public String getAnodeEntrada() {
        return AnodeEntrada;
    }

    public void setAnodeEntrada(String _AnodeEntrada) {
        AnodeEntrada = _AnodeEntrada;
    }

    public String getSituação() {
        return Situação;
    }

    public void setSituação(String _Situação) {
        Situação = _Situação;
    }

    public String getSemestreEn() {
        return SemestreEn;
    }

    public void setSituaçãoEn(String _SemestreEn) {
        SemestreEn = _SemestreEn;
    }

    public String getnivelEnsino() {
        return nivelEnsino;
    }

    public void setnivelEnsino(String _nivelEnsino) {
        nivelEnsino = _nivelEnsino;
    }

}
