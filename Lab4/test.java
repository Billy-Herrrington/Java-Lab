package Lab4;

import java.util.ArrayList;
import java.util.List;

/**
* @Author Mai Tien
*/
public class test {
    public static void main(String[] args){
        //створюэмо порожній список масивів з початковою ємністю
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1, "Mammant"));
        listOfAnimal.add(new Animal(2, "Bird"));

        List<Wild> listOfWild = new ArrayList<>();
        listOfWild.add(new Wild());

        List<Bird> listOfBird = new ArrayList<>();
        listOfBird.add(new Bird());

        //Класс ввивод аргументу
        test(listOfAnimal);
        test(listOfWild);
        test(listOfBird);

        ArrayList<String> mammant_list = new ArrayList<String>(4);
        // використовуємо метод add (), щоб додати значення в список
        mammant_list.add("Lion");
        mammant_list.add("Horse");
        mammant_list.add("Zebra");
        mammant_list.add("Giraffe");

        System.out.println("\n----Wild list----");
        for (int i = 0; i < 4; i++)
        {
            System.out.println(mammant_list.get(i));
        }

        // створити порожній зразок масиву з початковою ємністю
        ArrayList<String> bird_list = new ArrayList<>(2);
        bird_list.add("Eagle");
        bird_list.add("Crow");


        // Now add sample with Animal_list
        mammant_list.addAll(bird_list);

        //New size of the list
        System.out.println("New size of the list is: " + mammant_list.size());

        // Print out the Animal
        System.out.println("\n----Birds list----");
        for (int i = 0; i < 6; i++)
        {
            System.out.println(mammant_list.get(i).toString());
        }

    }

    private static void test(List<? extends Animal> list){
        for (Animal animal : list){
            animal.animals();
        }
    }
}
