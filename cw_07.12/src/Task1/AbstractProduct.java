package Task1;
class Product{

}
//Методы:
//addToArray(Product[] products): Добавляет продукт в массив.
//removeFromArray(Product[] products): Удаляет продукт из массива.
public abstract class AbstractProduct {

    abstract void addToArray(Product[] products);
    abstract void removeFromArray(Product[] products);
}

//AbstractDatabaseOperation:
//Методы:
//searchInArray(Product[] products, String query): Поиск продукта в массиве.
//updateArray(Product[] products, Product product): Обновление информации о продукте в массиве.
abstract class AbstractDatabaseOperation {
    abstract void searchInArray(Product[] products, String query);
    abstract void updateArray(Product[] products, Product product);
}

//Интерфейсы:
//IArrayProcessing:
//Методы:
//sortArray(Product[] products): Сортировка массива продуктов.
//filterArray(Product[] products, String criteria): Фильтрация массива по критериям.
interface IArrayProcessing{
    void sortArray(Product[] products);
    void filterArray(Product[] products, String criteria);
}

//IProductManagement:
//Методы:
//addProduct(Product product): Добавление продукта.
//removeProduct(Product product): Удаление продукта.
interface IProductManagement{
    void addProduct(Product product);
    void removeProduct(Product product);
}

//Классы:
//FoodProduct (наследует AbstractProduct):
//Методы:
//calculateExpiration(Product[] products): Вычисление срока годности.
//applyDiscount(Product[] products, double discount): Применение скидки.
class FoodProduct extends AbstractProduct{

    @Override
    void addToArray(Product[] products) {
    }

    @Override
    void removeFromArray(Product[] products) {
    }

    void calculateExpiration(Product[] products) {
    }
    void applyDiscount(Product[] products, double discount){
    }
}

//NonFoodProduct (наследует AbstractProduct):
//Методы:
//checkWarranty(Product[] products): Проверка гарантии.
//updatePrice(Product[] products, double price): Обновление цены.
class NonFoodProduct extends AbstractProduct{
    void checkWarranty(Product[] products){
    }
    void updatePrice(Product[] products, double price){
    }
    @Override
    void addToArray(Product[] products) {
    }

    @Override
    void removeFromArray(Product[] products) {
    }
}

//ProductDatabase (наследует AbstractDatabaseOperation, реализует IArrayProcessing и IProductManagement):
//Методы:
//backupDatabase(Product[] products): Создание резервной копии базы данных.
//restoreDatabase(Product[] products): Восстановление базы данных из резервной копии.
class ProductDatabase implements IArrayProcessing, IProductManagement{



    @Override
    public void sortArray(Product[] products) {
    }

    @Override
    public void filterArray(Product[] products, String criteria) {
    }

    @Override
    public void addProduct(Product product) {
    }

    @Override
    public void removeProduct(Product product) {
    }
}

//ProductAnalytics (реализует IArrayProcessing):
//Методы:
//calculateAveragePrice(Product[] products): Вычисление средней цены продуктов.
//findMostPopularProduct(Product[] products): Поиск самого популярного продукта.
class ProductAnalytics implements IArrayProcessing{

    @Override
    public void sortArray(Product[] products) {
    }

    @Override
    public void filterArray(Product[] products, String criteria) {
    }
    void calculateAveragePrice(Product[] products){
    }
    void findMostPopularProduct(Product[] products){
    }
}

//InventoryManagement (реализует IProductManagement):
//Методы:
//countProducts(Product[] products): Подсчет количества продуктов.
//listExpiredProducts(Product[] products): Список просроченных продуктов.
class InventoryManagement implements IProductManagement{

    @Override
    public void addProduct(Product product) {
    }

    @Override
    public void removeProduct(Product product) {
    }
    void countProducts(Product[] products){
    }
    void listExpiredProducts(Product[] products){
    }
}
//SpecialOfferProduct (наследует NonFoodProduct):
//Методы:
//addSpecialOffer(Product[] products, SpecialOffer offer): Добавление специального предложения.
//removeSpecialOffer(Product[] products, SpecialOffer offer): Удаление специального предложения.
class SpecialOfferProduct extends NonFoodProduct{
    void addSpecialOffer(Product[] products, SpecialOffer offer){
    }
    void removeSpecialOffer(Product[] products, SpecialOffer offer){
    }
}