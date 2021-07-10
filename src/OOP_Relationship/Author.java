package OOP_Relationship;

public class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name= '" + name + '\'' +
                ", email='" + email + '\'';
    }

    public static void main(String[] args) {
        Author[] authors = new Author[3];
        authors[0] = new Author("Viet", "VietCV@codelearn.io");
        authors[1] = new Author("Tuan", "TuanLQ@codelearn.io");
        authors[2] = new Author("Kien", "KienNT@Codelearn.io");

        Book book1 = new Book("C++ for Beginners", authors, 210.000);
        System.out.println(book1.getAuthorNames());
    }
}

class Book {
    private String name;
    private Double price;
    private Author[] authors;

    public Book(String name, Author[] authors, Double price) {
        this.name = name;
        this.price = price;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthorNames() {
        String name = "";
        for (int i = 0; i < authors.length; i++) {
           name += authors[i].getName() + ", ";
        }
        return name;
    }


}

