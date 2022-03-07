package Lesson4.Ts2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phone {
    private HashMap<String, List<String>> book;

    public Phone(){
        this.book = new HashMap<>();
    }

    public void add(String surname, String number){
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Номер >  %s добавлен для фамилии %s", number, surname));
            } else {
                System.out.println(String.format("Номер > %s уже существует для фамилии %s", number, surname));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Номер > %s добавлен для фамилии %s", number, surname));
        }
    }

    public List<String> get(String surname){
        if(book.containsKey(surname)){
            return book.get(surname);
        } else {
            System.out.println(String.format("В СПРАВОЧНИКЕ НЕТ ЗАПИСИ ДЛЯ  %s", surname));
            return new ArrayList<>();
        }
    }




}
