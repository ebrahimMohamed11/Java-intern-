public class Book {
    private String title;
    private String author;
    private int id;
    private int version;
    private boolean availability;

    public Book(String title, String author, int id, int version, boolean availability ) {
        this.title = title;
        this.author=author;
        this.id=id;
        this.version=version;
        this.availability=availability;
    }
    //getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    public boolean isAvailability() {
        return availability;
    }

    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", id=" + id +
                ", version=" + version +
                ", availability=" + availability +
                '}';
    }
}









