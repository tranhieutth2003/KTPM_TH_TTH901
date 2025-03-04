package com.journaldev.singleton;

import java.io.*;

public class SingletonSerializedTest {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        SerializedSingleton instanceOne = SerializedSingleton.getInstance();

        // Serialize object to file
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        // Deserialize object from file
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());
    }
}
