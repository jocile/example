package com.jocile.example.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * This is an example of character input and output manipulation,
 *  and updates a file.
 */
public class CharacterToFileUpdateExample {

  /**
   * This method copies a file
   * @throws IOException
   */
  public static void fileCopy() throws IOException {
    File f = new File("Recomendations.txt");
    String fileName = f.getName();

    // Reader r = new FileReader(fileName);
    // BufferedReader br = new BufferedReader(r);
    BufferedReader br = new BufferedReader(new FileReader(fileName));
    String line = br.readLine();

    String fileNameCopy = fileName
      .substring(0, fileName.indexOf("."))
      .concat("-copy.txt");
    File fcopy = new File(fileNameCopy);

    BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));

    do {
      bw.write(line);
      bw.newLine();
      bw.flush();
      line = br.readLine();
    } while (!(line == null));

    System.out.printf(
      "The file \"%s\" copied successfully! With the size '%d' bytes.\n",
      f.getName(),
      f.length()
    );
    System.out.printf(
      "The file \"%s\" copied successfully! With the size '%d' bytes.\n",
      fcopy.getName(),
      fcopy.length()
    );

    PrintWriter pw = new PrintWriter(System.out);
    pw.println("Enter 3 new movie suggestions: and type end");
    pw.flush();

    fileUpdate(fcopy.getName());

    pw.printf(
      "File updated successfully, with the size '%d' bytes.\n",
      fcopy.length()
    );

    br.close();
    bw.close();
    pw.close();
  }

  /**
   * This method updates a file,
   * adding updates at the end.
   *
   * @param file copy of the file name
   * @throws IOException
   */
  public static void fileUpdate(String file) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();

    BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

    do {
      bw.write(line);
      bw.newLine();
      line = br.readLine();
    } while (!(line.equalsIgnoreCase("end")));

    br.close();
    bw.close();
  }

  public static void main(String[] args) throws IOException {
    fileCopy();
  }
}
