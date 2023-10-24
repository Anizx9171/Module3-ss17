package tl.binaryfile;

import java.io.*;

public class DemoDataOutputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Viết các kiểu dữ liệu bt
        File studentFile = new File("student.dat");
        studentFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(studentFile);
        boolean status = true;
        double PI = 3.14;
        String language = "Java";
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF(language);
        dos.writeDouble(PI);
        dos.writeBoolean(status);
        dos.close();

        //Đọc các kiểu dữ liệu bt
        FileInputStream fis = new FileInputStream("student.dat");
        DataInputStream dosS = new DataInputStream(fis);
        System.out.println(dosS.readUTF());
        System.out.println(dosS.readBoolean());
        System.out.println(dosS.readDouble());

        ////Object
        // ghi
        File obj = new File("ObjData.dat");
        obj.createNewFile();
        FileOutputStream os = new FileOutputStream(obj);
        FileInputStream oi = new FileInputStream(obj);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
        Student student2 = new Student(1, "Ani", 18, true);
        objectOutputStream.writeObject(student2);
        objectOutputStream.close();

        //đọc
        ObjectInputStream objectInputStream = new ObjectInputStream(oi);
        Student stu = (Student) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(stu);
        System.out.println("Kết thúc đọc file");
    }
}
