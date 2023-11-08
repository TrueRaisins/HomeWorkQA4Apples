public class AppleStorage {
    public static void main(String[] args) {
        printAppleCount("Иван", 3);
        printAppleCount("Иван", 22);
        printAppleCount("Иван", 29);
    }

    public static void printAppleCount(String name, int count) {
        String apples;
        if (count % 10 == 1 && count % 100 != 11) {
            apples = "яблоко";
        } else if (count % 10 >= 2 && count % 10 <= 4 && (count % 100 < 10 || count % 100 >= 20)) {
            apples = "яблока";
        } else {
            apples = "яблок";
        }
        System.out.println(name + " хранит у себя " + count + " " + apples);
    }
}