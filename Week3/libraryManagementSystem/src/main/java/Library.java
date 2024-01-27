import java.util.ArrayList;

public class Library {
    private String name;
    private int libraryCode;
    private ArrayList<Book>bookList;

    public Library(String name, int libraryCode) {
        this.name=name;
        this.libraryCode=libraryCode;
        bookList= new ArrayList<>();

    }
    //getter
    public String getName() {
        return name;
    }

    public int getCode() {
        return libraryCode;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.libraryCode = libraryCode;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", libraryCode=" + libraryCode +
                ", bookList=" + bookList +
                '}';
    }
}






