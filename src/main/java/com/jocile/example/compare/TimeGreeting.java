package com.jocile.example.compare;

import java.io.IOException;
import java.util.Scanner;

public class TimeGreeting {

  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    while (leitor.hasNext()) {
      Double graus = leitor.nextDouble();

      if (graus <= 360) {
        if (graus < 90 || graus == 360) {
          System.out.println("Bom Dia!!");
        } else if (graus < 180) {
          System.out.println("Boa Tarde!!");
        } else if (graus < 270) {
          System.out.println("Boa Noite!!");
        } else if (graus < 360) {
          System.out.println("De Madrugada!!");
        } else {
          System.out.println("Bom Dia!!");
        }

        Double horas;
        if (graus >= 270) {
          horas = graus / 15 - 18;
        } else {
          horas = graus / 15 + 6;
        }

        Double minutos = (graus * 4) % 60.0;
        Double segundos = (graus * 240) % 60.0;

        if (segundos > 59) {
          segundos = 0.0;
          minutos += 1.0;
        }

        System.out.printf(
          "%02d:%02d:%02d%n",
          horas.intValue(),
          minutos.intValue(),
          segundos.intValue()
        );
      }
    }
    leitor.close();
  }
}
