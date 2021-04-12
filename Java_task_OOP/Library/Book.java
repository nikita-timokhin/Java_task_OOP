package Java_task_OOP.Library;


import java.util.Arrays;

public class Book {

    private String name;
    private double price;
    private int qti;
    private Author[] authors;

    public Book(String name, double price, int qti, Author[] authors) {
        this.name = name;
        this.price = price;
        this.qti = qti;
        this.authors = authors;
    }

    public Book(String name, double price, Author[] authors) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQti() {
        return qti;
    }

    public void setQti(int qti) {
        this.qti = qti;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", qti=" + qti +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }

    public String getAuthorNames() {
        String[] s = new String[authors.length];
        for (int i = 0; i < authors.length; i++) {
            s[i] = this.authors[i].getName();
        }
        return String.join(",", s);
    }
}
