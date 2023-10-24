package bt.bt1;

import config.Config;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bt1 {
    static List products = new ArrayList<>();
    static int maxid;
    static File dataPro = new File("src/bt/bt1/dataPro.dat");

    public static void main(String[] args) {
        products = getData();
        maxid = getMaxId();
        try {
            dataPro.createNewFile();
        } catch (IOException ignored) {
        }
        int choice;
        while (true) {
            System.out.println("""
                    ++++++MENU++++++
                    1.thêm
                    2.hiển thị
                    3.tìm kiếm thông tin sản
                    4. thoát
                    """);
            choice = Integer.parseInt(Config.scanner().nextLine());
            switch (choice) {
                case 1:
                    addNew();
                    break;
                case 2:
                    showPro();
                    break;
                case 3:
                    findPro();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    private static int getMaxId(){
        for (Object pro : products) {
            Product product = (Product) pro;
            if (maxid < product.getProductId()) {
                maxid = product.getProductId();
            }
        }
        return maxid + 1;
    }

    private static void findPro() {
        System.out.println("Nhập tên sp:");
        String find = Config.scanner().nextLine();
        for (Object pro : products) {
            Product product = (Product) pro;
            if (product.getProductName().contains(find)) {
                System.out.println(product);
            }
        }
    }

    private static List getData() {
        try {
            FileInputStream in = new FileInputStream(dataPro);
            ObjectInputStream ois = new ObjectInputStream(in);
            return (List) ois.readObject();
        } catch (ClassNotFoundException e) {
            System.err.println("Không tìm thấy class");
            return new ArrayList<>();
        } catch (IOException e) {
            System.err.println("lỗi");
            return new ArrayList<>();
        }
    }

    private static void showPro() {
        products.forEach(System.out::println);
    }

    private static void addNew() {
        try {
            FileOutputStream out = new FileOutputStream(dataPro);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            System.out.println("Nhập số sản phẩm muốn thêm");
            int count = Integer.parseInt(Config.scanner().nextLine());
            for (int i = 0; i < count; i++) {
                System.out.println("Nhập tên sp:");
                String na = Config.scanner().nextLine();
                System.out.println("Nhập nơi sx:");
                String pl = Config.scanner().nextLine();
                System.out.println("Nhập giá:");
                float pr = Float.parseFloat(Config.scanner().nextLine());
                System.out.println("Nhập mô tả:");
                String de = Config.scanner().nextLine();
                Product product = new Product(maxid, na, pl, pr, de);
                products.add(product);
                maxid ++;
            }
            oos.writeObject(products);

        } catch (IOException e) {
            System.out.println("Có lỗi đã sảy ra");
        }
    }
}