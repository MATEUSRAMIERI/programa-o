/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao01;

/**
 *
 * @author aluno
 */
public class Professor {
    private  String nome;
    private String SIAPE;
    private String email;
    private int numero;
    
        public Professor() {
        nome = "nobody";

    }
        
        
        public  String getNome() {
        return nome;
    }

    public  void setNome(String _nome) {
        nome = _nome;
    }
    public  String getSIAPE() {
        return SIAPE;
    }

    public  void setSIAPE(String _SIAPE) {
       SIAPE  = _SIAPE;
    }
  public  String getemail() {
        return email;
    }

    public  void setemail(String _email) {
       email  = _email;
    }
    public  int getnumero() {
        return numero;
    }

    public  void setnumero(int _numero) {
       numero  = _numero;
    }

}
