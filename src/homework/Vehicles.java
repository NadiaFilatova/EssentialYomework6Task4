package homework;

//Створіть проект за допомогою IntelliJ IDEA.
// Створіть перечислювальний тип (enum) Vehicles, що містить конструктор,
// який повинен набувати цілого числа (вартість автомобіля), містити метод getColor(),
// який повертає рядок з кольором автомобіля, і містити перевантажений метод toString(),
// який повинен повертати рядок з назвою екземпляра, кольором та вартістю автомобіля.
public enum Vehicles {
    AUDI(1200, "red"),
    BMW(2300, "black"),
    FORD(3400, "green"),
    HONDA(4500, "yellow"),
    HYUNDAI(5600, "white"),
    KIA(6700, "red");
    private final int price;
    private final String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.name() + ", " + getColor() + ", " + price;
    }
}
