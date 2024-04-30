package Task2;

//Абстрактные Классы:
//AbstractBook:
//Методы:
//addToCatalog(Book[] books): Добавление книги в каталог.
//removeFromCatalog(Book[] books): Удаление книги из каталога.
abstract class AbstractBook {
    abstract void addToCatalog(Book[] books);
    abstract void removeFromCatalog(Book[] books);
}

//AbstractUser:
//Методы:
//borrowBook(Book[] books): Взятие книги на время.
//returnBook(Book[] books): Возврат книги.
abstract class AbstractUser{
    abstract void borrowBook(Book[] books);

    abstract void returnBook(Book[] books);

}

//Интерфейсы:
//ICatalogManagement:
//Методы:
//sortBooksByTitle(Book[] books): Сортировка книг по названию.
//findBooksByAuthor(Book[] books, String author): Поиск книг по автору.
interface ICatalogManagement{
    default void sortBooksByTitle(Book[] books){
    }
    default void findBooksByAuthor(Book[] books, String author){
    }
}

//IUserManagement:
//Методы:
//registerUser(User user): Регистрация пользователя.
//deleteUser(User user): Удаление пользователя.
interface IUserManagement{
    default void registerUser(User user){
    }
    default void deleteUser(User user){
    }
}

//Классы:















