package HomeWork5;

//Создание класса Сотрудник
public class Worker {
    private String fullName;//ФИО
    private String position;//Должность
    private String email;//Электронная почта
    private String phoneNumber;//Номер телефона
    private int salary;//Заработная плата
    private int age;//Возраст

    //Конструктор
    public Worker(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    //Метод для вывода информации об объекте в консоль
    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "ФИО - " + fullName +
                "; Должность - " + position +
                "; email - " + email +
                "; Номер телефона - " + phoneNumber +
                "; Зарплата - " + salary +
                "; Возраст - " + age +
                ".";
    }

    public static void main(String[] args) {
        Worker[] arrWorker = new Worker[5];// Вначале объявляем массив объектов
        //Для каждой ячейки массива задаем объект
        arrWorker[0] = new Worker("Подлёнова Александра Игоревна", "Директор магазина", "podlenovaal20@mail.ru", "+79065135879", 200000, 41);
        arrWorker[1] = new Worker("Мудрова Людмила Олеговна", "Бухгалтер", "lumud@yandex.ru", "+79671725589", 65000, 27);
        arrWorker[2] = new Worker("Усьянцев Алексей Александрович", "Начальник отдела логистики", "usyancevaa@mail.ru", "+79095881345", 134000, 45);
        arrWorker[3] = new Worker("Ульянов Дмитрий Сергеевич", "Специалист по управлению торговыми местами", "dmuly@mail.ru", "+79639913278", 71000, 25);
        arrWorker[4] = new Worker("Кириллова Виктория Робертовна", "Начальник отдела продаж", "vigev@gmail.ru", "+79176634419", 118000, 34);

        //Выводим информацию в консоль только о сотрудниках старше 40 лет
        for (int i = 0; i < arrWorker.length; i++) {
            if (arrWorker[i].age > 40) {
                arrWorker[i].info();
            }
        }
    }
}
