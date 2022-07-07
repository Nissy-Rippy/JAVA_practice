import java.io.*;
import java.util.*;

import javax.xml.stream.FactoryConfigurationError;

public class EmployeeFile {
  public static void main(String[] args) throws Exception {

    Employee emp = new Employee("田中太郎", 41);// Department dep = new Department("総務部", new Employee("田中太郎、41"));
    Department dep = new Department("総務部", emp);
    try (FileOutputStream fos = new FileOutputStream("company.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);) {
      oos.writeObject(dep);
      oos.flush();
    } catch (IOException e) {
      System.out.println(e);
      e.printStackTrace();
    }

      FileInputStream fis = new FileInputStream("company.dat");
      ObjectInputStream ois = new ObjectInputStream(fis);
      Department dep1 = (Department) ois.readObject();//Object型をＤepartment形に変換させる read(クラス型); readHero()readEmployee();
      System.out.println(dep1);
  
      ois.close();

  }

}
