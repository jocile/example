package com.jocile.example.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

/**
 * This class serializes an object
 */
public class ObjectIoExample {

  public static void serialization() throws IOException {
    Cat cat = new Cat("Simba", 6, "yellow", true, true);

    File f = new File("cat");

    // OutputStream os = new FileOutputStream(f.getName());
    // ObjectOutputStream oos = new ObjectOutputStream(os);
    ObjectOutputStream oos = new ObjectOutputStream(
      new FileOutputStream(f.getName())
    );

    oos.writeObject(cat);

    PrintStream ps = new PrintStream(System.out);
    ps.printf(
      "File \"%s\" created successfully! With the size '%d' bytes\n",
      f.getName(),
      f.length()
    );

    oos.close();
    ps.close();
  }

  public static void deserialization(String file)
    throws FileNotFoundException, IOException, ClassNotFoundException {
    // InputStream is = new FileInputStream(file);
    // ObjjectInputStream ois = new ObjjectInputStream(is);
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
    Cat objCat = (Cat) ois.readObject();

    System.out.printf("\n Name ...........: %s", objCat.getName());
    System.out.printf("\n Age  ...........: %s", objCat.getAge());
    System.out.printf("\n Color ..........: %s", objCat.getColor());
    System.out.printf("\n Castratet ......: %s", objCat.isCastrated());
    System.out.printf("\n Purrs ..........: %s\n", objCat.isPurrs());
    System.out.println(objCat);

    ois.close();
  }

  public static void main(String[] args)
    throws IOException, ClassNotFoundException {
    // serialization(); // Uncomment to serialize and comment deserialization
    deserialization("cat");
  }
}
