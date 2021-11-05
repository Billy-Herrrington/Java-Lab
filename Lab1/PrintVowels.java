package Lab1;
//Знайти ті слова, які містять тільки символи латинського алфавіту. Серед них знайти
//ті слова, які містять рівну кількість голосних та приголосних. На вхід поступає рядок із
//словами. На виході – масив String.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class PrintVowels {
    public static char[] vowels = new char []{'a', 'i', 'u', 'e', 'o', 'y'};
    public static void main(String[] args) throws Exception {
        System.out.print("Ведіть будь-яке слово на латинською: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //читає текст з потоку введення символів
        //S - виражає будь-яку кількість пробілів
        String text = reader.readLine().replaceAll("\\s", "");
        StringBuilder stVowels = new StringBuilder();
        StringBuilder stConsonant = new StringBuilder();
        for (char c : text.toCharArray()) { //toCharArray() - повертає знову розподілене символьний масив
            if (isVowels(c)){
                stVowels.append(c);
            } else {
                stConsonant.append(c);
            }
        }
        System.out.println("Vowels: " + stVowels);
        System.out.println("Consonant: " + stConsonant);
    }

    public static boolean isVowels(char c){
        c = Character.toLowerCase(c);
        for (char d : vowels){
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
