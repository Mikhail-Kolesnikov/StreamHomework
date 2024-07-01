import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class HomeworkNumbers {
    public static void main(String[] args) {
        //Решите задания с использованием Стримов (Stream) и лямбда-выражений
        //
        //1.1. Существует список из чисел (заполнить его можно как угодно)
        //1.2. Добавьте к каждому из чисел из списка 15
        //1.3. Оставьте только числа, большие чем 50
        //1.4. Найдите сумму чисел


        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {


            list.add(random.nextInt(1, 1000));

        }
        Optional<Integer> result = list.stream()
                .map(x -> x + 15)
                .filter(x -> x >= 50)
                .reduce((x, y) -> x + y);
            System.out.println(result.get());


        }




    }










