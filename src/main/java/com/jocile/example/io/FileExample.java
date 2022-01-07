package com.jocile.example.io;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This is an example of a file manipulation class.
 */
public class FileExample {

  public static void main(String[] args) {
    File f = new File("read-and-write-files-IO.txt");
    System.out.println("Path: " + f.getName());
    System.out.println("Absolute path: " + f.getAbsolutePath());
    System.out.println("parent directory: " + f.getParent());
    System.out.println(f.exists() ? "exists" : "not exists");
    System.out.println(f.canWrite() ? "Can be saved" : "can not saved");
    System.out.println(f.canRead() ? "Can be read" : "can not read");
    System.out.println(f.isDirectory() ? "is directory" : "is not a directory");
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Date data = new Date(f.lastModified());
    System.out.println("The last modification of the file" + df.format(data));
    System.out.println("File size: " + f.length() + " bytes");
  }
}
