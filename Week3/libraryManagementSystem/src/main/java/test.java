import java.io.File;
import java.io.PrintWriter;

public class test {

    public static void main(String [] args){

        Library elibrary=new Library("Elandalos",1);

        //add new book to library
        User.add_new_book(elibrary,"Algorithms","Robert Sedgewick",1,4,true);
        User.add_new_book(elibrary, "CP handbook", "Antti Laaksonen", 2,3,true);





        User.checkout(2,elibrary);
        User.display_book(1,elibrary);
        User.checkout(3,elibrary);
        User.display_all_books(elibrary);
        User.remove_book(2,elibrary);
        User.remove_book(2,elibrary);

        System.out.println(User.random_Book(elibrary));



            File f = new File("TestCases.txt");
            try{

                PrintWriter pr = new PrintWriter(f);

                    pr.println(elibrary.toString());

                pr.close();

            }
            catch( Exception e){
                System.out.println("there is an error: "+e);
            }
            finally {
                System.out.println("finally");
            }








    }

}
