import java.io.File;

public class User {

    File f = new File("TestCases.txt");

    public static void add_new_book( Library library ,String title,String author,int id,int version,boolean availability){

        Book b=new Book(title,author, id, version, availability);
        boolean flag= true;
       for (int i=0 ; i<library.getBookList().size() ; i++){

           if (library.getBookList().get(i).getId()==id){
               flag=false;
               break;
           }

       }
       if (flag) {
           library.getBookList().add(b);
           System.out.println("Book with id="+ id + " added successfully");

       }
       else  System.out.println("Book with id="+ id + " is already exists");


    }


    public static void remove_book(int bookId, Library library){
        boolean flag=false;
        for (int i=0 ; i< library.getBookList().size() ; i++){

            if (library.getBookList().get(i).getId()==bookId){
                library.getBookList().remove(i);
                flag = true;
                break;
            }

        }
        if (flag) System.out.println(bookId + " deleted successfully");
        else System.out.println("We can not found book wiht id=" + bookId + " to delete");

    }


    public static void checkout(int bookId, Library e){
        boolean flag=false;
        for (int i=0 ; i< e.getBookList().size() ; i++){

            if (e.getBookList().get(i).getId()==bookId){
                flag=true;
                break;
            }

        }
        if (flag) System.out.println(bookId + " Found");
        else System.out.println(bookId + " Not found");


    }


    public static Book random_Book(Library library){

        int random=(int) (library.getBookList().size()*Math.random());

        return library.getBookList().get(random) ;
    }


    public static void display_all_books(Library library){

        for (Book b : library.getBookList()) {
            System.out.println(b.toString());
        }

    }


    public static void display_borrowed_books(Library library){

        for (Book b : library.getBookList()) {
            if (!b.isAvailability()){
                System.out.println(b.toString());
            }
        }

    }

    public static void display_book(int bookId, Library library){
        boolean flag= true;
        for (Book b : library.getBookList()){
            if (b.getId()==bookId){
                System.out.println(b.toString());
                flag=false;
            }

        }
        if (flag) System.out.println(("Cant not display book with id=" + bookId + " because it not found"));

    }














}
