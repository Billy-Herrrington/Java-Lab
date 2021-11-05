package Lab3;

import java.util.Scanner;

public class Turniket {
    private String Students;
    private String Children;
    private String Tickets;

    public Turniket() {
        super();
    }

    public String getStudents() {
        return Students;
    }

    public void setStudents(String Students){
        this.Students = Students;
    }

    public String getTickets() {
        return Tickets;
    }

    public void setTickets(String Tickets){
        this.Tickets = Tickets;
    }

    public String getChildren() {
        return Children;
    }

    public void setChildren(String Children){
        this.Children = Children;
    }

    public static void main(String[] args){
        Turniket turniket = new Turniket();
        turniket.setTickets("Звичайні");
        turniket.setStudents("Студентські");
        turniket.setChildren("Учнівськ");

        System.out.println("Ведіть номер карти за якою здійснюте прохід через турнікет");
        System.out.println(" 1. "+turniket.getTickets());
        System.out.println(" 2. "+turniket.getStudents());
        System.out.println(" 3. "+turniket.getChildren());
        System.out.println("Enter number: ");

        int quantity, term;

        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.next();

        if(input.matches("2")) {
            System.out.println("Ви обрали студентську картку \nТурнікет, що здійснював облік дозволів вампроходу");
        }else if(input.matches("1")){
            System.out.println("Ви обрали звичайну картку \nВедіть кількість поїздок: ");
            quantity = sc.nextInt();
            System.out.println("Ведіть термін дії: ");
            term = sc.nextInt();
            if (quantity <= 0 || term <=0 ){
                System.out.println("Вхід заборонено, будь-ласку поповніть карту та проведіть операцію ще раз!");
            }else {
                System.out.println("Вхід дозволено");
            }
        }else if(input.matches("3")){
            System.out.println("Ви обрали учнівську картку \nТурнікет здійснює облік дозволів проходу");
        }else{
            System.out.println("Турнікет не вдалось зчитувати дані");
        }

    }

}
