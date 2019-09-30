/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciouriaprender;

import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class Exercicio1020 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idadeDias, ano, mes, meses, dia;
        
        idadeDias = entrada.nextInt();

        ano = idadeDias / 365;
        mes = (idadeDias % 365) / 30;
        dia = (idadeDias % 365) % 30;

        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dia);

    }
}
