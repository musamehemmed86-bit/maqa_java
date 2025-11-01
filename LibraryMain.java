package Library;

public class LibraryMain {
  public  static void main() {
        Library library = new Library();
        library.showContent();
    }
}

class Library {
    String book1 = "Прогульшик Шамиль" ;
    String book2 = "повор Татьяна" ;


    void showContent(){
        Book book = new Book();
        book.showBooks();
    }

    class Book {
        void showBooks(){
            System.out.println("эта книга про: " + book1);
            System.out.println("Но если ты хочешь про готовку тогда : " + book2);
        }
    }

}
