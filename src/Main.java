import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductManager mainProduct = new ProductManager();
        int luaChon = 0;

        do {

            sc.nextLine();
            System.out.println("..........................MENU.......................");
            System.out.println(
                    "1. Thêm doi tuong)\n"
                            + "2. sua doi tuong\n"
                            + "3. Xoa doi tuong\n"
                            + "4. Tim kiem doi tuong\n"
                            + "5. Sap xep doi tuong\n"
                            + "6. Thoat khoi chuong trinh"
            );
            System.out.println("lua chon ban muon nhap vao");
            luaChon = sc.nextInt();
            if (luaChon == 1) {
                mainProduct.createProduct();
            } else if (luaChon == 2) {
                mainProduct.update();
            } else if (luaChon == 3) {
                mainProduct.xoa();
            } else if (luaChon == 4) {
                mainProduct.search();
            } else if (luaChon == 5) {
                mainProduct.sort();
            }



        }
        while (luaChon < 6) ;
    }
}