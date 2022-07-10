public class Main {
    /*
     * Обработайте число и верните слово дня соответствующее числу.
     * Например:
     * int day = 1, возвращаем "Понедельник"
     * day = 2 - Вторник
     * и т.д.
     * При выходе за пределы допусимых значений вернуть:
     * Такого дня нет! :(
     */
    static String integerToDay(int day) {
        String[] week = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        String toDay;
        if (day > 0 && day <= 7) {
            toDay = week[day - 1];
        } else {
            toDay = "Такого дня нет! :(";
        }
        return toDay;
    }

    public static void main(String[] args) {
        String result;
        String message = " - это день недели под цифрой ";

        int day = 2;
        result = integerToDay(day);
        System.out.println(result + message + day);

        day = 5;
        result = integerToDay(day);
        System.out.println(result + message + day);

        day = 7;
        result = integerToDay(day);
        System.out.println(result + message + day);

        day = 10;
        result = integerToDay(day);
        System.out.println(result + message + day);
    }
}
