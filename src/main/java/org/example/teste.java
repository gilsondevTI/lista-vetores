//Leia o faturamento dos 7 dias da semana. Mostre o total, a média
// diária e o dia que mais vendeu


package org.example;

import java.util.Scanner;

public class teste {
  public  static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double[]semanal=new double[7];
      String[]dias=new String[]{"segunda","terça","quarta","quinta","sexta","sabado","domingo"};

      for(int i =0;i<semanal.length;i++){
          System.out.println("me informe seu fatureamento "+dias[i]);
          semanal[i]=sc.nextDouble();
      }

    }
}
