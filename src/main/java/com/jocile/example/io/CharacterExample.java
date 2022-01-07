package com.jocile.example.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

/**
 * This is an example of character input and output manipulation.
 */
public class CharacterExample {

  /**
   * This method receives characters from the
   *  keyboard and prints to the console
   * @throws IOException
   */
  public static void KeyboardInAndPrint() throws IOException {
    System.out.println("Enter 3 movie suggestions: ");

    //Opening a data stream to receive input via the keyboard
    //InputStream is = System.in;
    //Bridge that transforms InputStream stream into character
    //Reader isr = new InputStreamReader(is);
    //reads the character stream and stores it in a buffer to make reading these characters easier
    //BufferedReader br = new BufferedReader(isr);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //decorator patthern

    //Preparing writing on console:
    //Opening a data stream to send data to the console.
    //OutputStream os = System.out;
    //bridge that transforms the OutputStream stream into character
    //OutputStreamWriter osr = new OutputStreamWriter(os);
    //writes the character stream (text) and stores it in a buffer to facilitate writing these characters
    //BufferedWriter bw = new BufferedWriter(osr);

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //decorator patthern

    //Read from keyboard and send to console
    //readLine method reads each line of text and returns a String.
    String line = br.readLine();
    do { //take the line read from the keyboard and store it in a buffer
      bw.write(line);
      bw.newLine(); //then insert a line
      // after copying the line above, we fill the line again
      line = br.readLine();
      //when the line is empty, stop.
    } while (!line.isEmpty());
    // bw.flush(); // if closing flush is not necessary
    br.close(); // Close the input stream
    bw.close(); // And close the output stream
  }

  public static void main(String[] args) throws IOException {
    KeyboardInAndPrint();
  }
}
