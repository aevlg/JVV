package Lesson4.Ts2;

public class Run {
    public static void main(String[] args) {

        Phone phonebook = new Phone();

        System.out.println("СПИСОК КОНТАКТОВ");
        phonebook.add("Дмитриев", "324535463334");
        phonebook.add("Горшунова", "32453466743334");
        phonebook.add("Голубев", "32453447563334");
        phonebook.add("Тимохин", "324534635557334");
        phonebook.add("Дмитриев", "32453463334");
        System.out.println("------------------------------------");

        System.out.println("ПРИСВОЕНИЕ НОМЕРОВ");
        System.out.println("Дмитриев");
        System.out.println(phonebook.get("Дмитриев"));
        System.out.println("Горшунова");
        System.out.println(phonebook.get("Горшунова"));
        System.out.println("Голубев");
        System.out.println(phonebook.get("Голубев"));
        System.out.println("----------------------------------");

        System.out.println("ЗАПИСЬ ОТСУТСТВУЕТ: ");
        System.out.println("Тимохин");
        System.out.println(phonebook.get("Тимохин"));
        System.out.println("-------------------------------------");

        System.out.println("ЗАПИСЬ СУЩЕСТВУЮЩЕГО НОМЕРА");
        phonebook.add("Дмитриев", "324535463334");
        System.out.println("Дмитриев");
        System.out.println(phonebook.get("Дмитриев"));
    }
    }
