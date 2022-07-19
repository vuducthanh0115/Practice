package bai2;

public class Book extends Document {
    private String author;
    private int numerPage;


    public Book(String id, String nameNXB, int numberBPH, String author, int numberPage) {
        super(id, nameNXB, numberBPH);
        this.author = author;
        this.numerPage = numberPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumerPage() {
        return numerPage;
    }

    public void setNumerPage(int numerPage) {
        this.numerPage = numerPage;
    }

    public String toString() {
        return "Book" + "\n" +
                "Author='" + author + '\'' +
                ", NumerPage=" + numerPage +
                ", Id='" + getId() + '\'' +
                ", Name NXB='" + getNameNXB() + '\'' +
                ", Number BPH='" + getNumberBPH() + '\'' +
                '}';
    }
}
