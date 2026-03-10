/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacao01;

/**
 *
 * @author aluno
 */
public class Programacao01 {

    public static void main(String[] args) {
        Estudante mateus = new Estudante();
        Estudante joao = new Estudante();
        Estudante leonardoG = new Estudante();

        mateus.setNome("mateus");
         joao.setNome("joao");
          leonardoG.setNome("leonardoG");

        System.out.println(leonardoG.getNome());
        System.out.println(joao.getNome());
        System.out.println(mateus.getNome());



    }
}
