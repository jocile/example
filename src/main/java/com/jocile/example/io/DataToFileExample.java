package com.jocile.example.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * This is an example of data flow using a file
 */
public class DataToFileExample {

  /**
   * Receiving a product's name, quantity and price and saving it to a file
   *
   * @throws IOException
   */
  public static void addProduct() throws IOException {
    //Referencing the file
    File f = new File("/home/joc/Documentos/product.bin");

    //Selecting output to console
    PrintStream ps = new PrintStream(System.out, true); //Auto flush true

    //Persisting primal types in the file
    // OutputStream os = new FileOutputStream(f.getPath());
    // DataOutputStream dos = new DataOutputStream(os);
    DataOutputStream dos = new DataOutputStream(
      new FileOutputStream(f.getPath())
    ); // Decorator

    //Opening the stream by keyboard
    Scanner scan = new Scanner(System.in);

    ps.print("Product's name: ");
    String name = scan.nextLine(); //Receive a string
    dos.writeUTF(name); //writing in the file

    ps.print("Choose your product size (P/M/G/U): ");
    //Takes an integer and transforms it into a character
    char size = (char) System.in.read();
    dos.writeChar(size);

    ps.print("Quantity: ");
    int quant = scan.nextInt();
    dos.writeInt(quant);

    ps.print("Unit price: ");
    double price = scan.nextDouble();
    dos.writeDouble(price);

    ps.printf( //Shows a confirmation
      "The file %s has been created successfully with %d bytes \nin the directory: '%s'\n",
      f.getName(),
      f.length(),
      f.getAbsolutePath()
    );

    readProduct(f.getPath()); //Read the file

    dos.close(); //closing the flows
    scan.close();
    ps.close();
  }

  /**
   * Receive the path and read the file
   *
   * @param fileName
   * @throws IOException
   */
  public static void readProduct(String fileName) throws IOException {
    File f = new File(fileName);

    // InputStream is = new FileInputStream(f.getPath());
    // DataInputStream dis = new DataInputStream(is);
    DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));

    //Reading the first line containing the product name
    String name = dis.readUTF();
    //Reading the second third line containing the character
    char size = dis.readChar();
    //Reading the third line that contains the integer
    int quantity = dis.readInt();
    //Reading the fourth line containing the double
    double price = dis.readDouble();

    System.out.printf("\nName..........: %s\n", name);
    System.out.printf("\nSize..........: %s\n", size);
    System.out.printf("\nQuantity......: %d\n", quantity);
    System.out.printf("\nPrice..........: %f\n", price);
    System.out.print("Total value of the product: " + (quantity * price));

    dis.close();
  }

  public static void main(String[] args) throws IOException {
    addProduct();
  }
}
