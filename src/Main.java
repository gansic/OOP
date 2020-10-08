public class   Main {
    public static void main(String[] args) {
        // double, float
        // long, int, short, byte
        // boolean
        // char
        // String
        // Shift + F6 переименовать

        String creditBankName = "Восточный банк"; // строки
        String creditName = "Комфорт";
        double creditPercent = 9.0;
        int creditPayment = 3180_00;

        // credit -> bankName, name, percent, payment
        // класс определяет новый тип данных
        Credit comfort = new Credit();// аналог добавления новой строки в табличке
        // 1. new - создает новый объект
        // 2. . (точка) - позволяет получить доступ к свойству
        System.out.println(comfort.name);
        System.out.println(comfort.bankName);
        System.out.println(comfort.percent);
        System.out.println(comfort.payment);
        // Название типов (кроме примитивов) пишуться всегда с большой буквы
        // String - строки
        // null - говорит нам об отсутсвие объекта (в примитив положить нельзя)
        comfort.name = "Комфорт";
        comfort.bankName = "Название банка";
        comfort.percent = 9.0;
        comfort.payment = 3180_00;
        System.out.println(comfort.name);
        // indentifier - номер уникальный в рамках конкретной системы.





    }
}
