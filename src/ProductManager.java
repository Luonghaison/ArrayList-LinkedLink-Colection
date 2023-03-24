import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ProductManager {
    public static ArrayList<Product> sanPham = new ArrayList<>();
    static {
        sanPham.add(new Product(1, "dien thoai", 2500, 2));
    }


    public void createProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id can them vao: ");
        int newId = sc.nextInt();
        System.out.println("Nhap ten san pham: ");
        String newSp = sc.next();
        System.out.println("Nhap gia san pham: ");
        int newGia = sc.nextInt();
        System.out.println("Nhap so luong san pham: ");
        int newSl = sc.nextInt();

        Product sP = new Product(newId, newSp, newGia, newSl);
        sanPham.add(sP);
        System.out.println("List sp sau khi them: " + sanPham);
    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id can sua: ");
        int suaId = sc.nextInt();
        System.out.println("Nhap name can sua: ");
        String suaName = sc.nextLine();
        System.out.println("Nhap gia san pham can sua: ");
        int suaGia = sc.nextInt();
        System.out.println("Nhap so luong can sua: ");
        int suaSl = sc.nextInt();

        Product newSanpham = new Product(suaId, suaName, suaGia, suaSl);
        for (int i = 0; i < sanPham.size(); i++) {
            if (sanPham.get(i).getId() == suaId) {
                sanPham.get(i).setName(suaName);
                sanPham.get(i).setGia(suaGia);
                sanPham.get(i).setSoLuong(suaSl);
            }
        }
        System.out.println(sanPham.toString());
    }

    public void xoa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Id can xoa: ");
        int xoa = sc.nextInt();
        for (int i = 0; i < sanPham.size(); i++) {
            if(sanPham.get(i).getId()==xoa){
                sanPham.remove(sanPham.get(i));
            }
        }
        System.out.println("List sau khi xoa la: "+ sanPham);
    }

    public  void search(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can tim kiem: ");
        String search = sc.nextLine();
        for (int i = 0; i < sanPham.size(); i++) {
            if(sanPham.get(i).getName().equalsIgnoreCase(search)){
                System.out.println(sanPham.get(i));
                break;
            }
        }
//        for (int i = 0; i < sanPham.size(); i++) {
//            System.out.println("San pham " + search + "co ten trong danh sach ko: " + sanPham.get(i).getName().contains(search));
//            break;
//        }
    }

    public static void sort(){
        Collections.sort(sanPham);
        System.out.println("Danh sach sau khi sap xep: "+ sanPham.toString());
    }
}
