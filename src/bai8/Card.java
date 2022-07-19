package bai8;

public class Card {
    private Student8 student;
    private String id;
    private int borrowDate;
    private int paymentDate;
    private int bookId;

    public Card(Student8 student, String id, int borrowDate, int paymentDate, int bookId) {
        this.student = student;
        this.id = id;
        this.borrowDate = borrowDate;
        this.paymentDate = paymentDate;
        this.bookId = bookId;
    }

    public Student8 getStudent() {
        return student;
    }

    public void setStudent(Student8 student) {
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(int borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(int paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String toString() {
        return "Thong tin" + "\n" +
                "Ten nguoi muon= " + student.getName() +
                ", Ngay muon=" + borrowDate +
                ", Ngay tra='" + paymentDate + '\'' +
                ", Ma sach='" + bookId + '\'' +
                +'\'';
    }
}
