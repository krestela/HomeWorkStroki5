public class Stroki {

    public static void main(String[] args) {
        task3();
        String firstName = ("Ivan");
        String middleName = ("Ivanovich");
        String lastName = ("Ivanov");
        String fullName = lastName + " " + firstName + " " + middleName;
        String fullName2 = fullName.toUpperCase();
        System.out.println("ФИО сотрудника — " + fullName2);
    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String[] words = fullName.split(" ");
        if (fullName.contains("ё")){
            fullName = fullName.replace("ё", "е");
        }
        System.out.println("ФИО сотрудника — " + fullName);
    }
}
