package com.jocile.example.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This is an example of character input and output manipulation,
 *  and save to a file.
 */
public class CharacterToFileExample {

  /**
   * This method receives characters from the
   *  keyboard and saves to a file
   * @throws IOException
   */
  public static void KeyboardInAndPrint() throws IOException {
    //Opens the stream to write to the console
    PrintWriter pw = new PrintWriter(System.out);
    //write to console
    pw.println("Enter 3 movie suggestions: ");
    pw.flush();

    //read keyboard entries
    Scanner scan = new Scanner(System.in);
    //Saves keyboard entries to a variable
    String line = scan.nextLine();

    //Saves keyboard entries to a file
    File f = new File("Recomendations.txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

    do { //write to file
      bw.write(line);
      bw.newLine();
      bw.flush();
      line = scan.nextLine();
      //until the end
    } while (!(line.equalsIgnoreCase("end")));

    //Shows a confirmation
    pw.printf("The file \"%s\" was created successfully!", f.getName());

    //Closing the flows
    pw.close();
    scan.close();
    bw.close();
  }

  public static void main(String[] args) throws IOException {
    KeyboardInAndPrint();
  }
}
