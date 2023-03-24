import java.util.Comparator;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double gia;
    private int soLuong;

    public Product() {
    }

    public Product(int id, String name, double gia, int soLuong) {
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return (int) (this.gia - o.gia);
    }
}
