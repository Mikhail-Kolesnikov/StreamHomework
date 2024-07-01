import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HomeworkStrings {
    public static void main(String[] args) {
        //        //2.1 Существует список строк (заполнить его можно как угодно)
        //        //2.2 Среди всех строк, оставьте только те строки, которые состоят из 15 символов или меньшего количества
        //        //2.3 Найдите самую длинную строку

        List<String> strings = new ArrayList<>();
        strings.add("Мне осталась одна забава:" +
                "Пальцы в рот — и веселый свист." +
                "Прокатилась дурная слава," +
                "Что похабник я и скандалист.");
        List<Integer> result = strings.stream()
                .map(str -> str.length())
                .filter(integer -> integer <= 15)
                        .collect(Collectors.toList());





        System.out.println(result);

        //                .max(Comparator.comparingInt();



    }
}
