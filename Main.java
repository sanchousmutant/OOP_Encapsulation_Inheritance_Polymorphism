public class Main {
    public static void main(String[] args) {
        Animals cat = new Cat("Барсик");
        Animals snake  = new Snake("Горыныч");
        Animals duck = new Duck("Макдак");

        System.out.println();
        System.out.println(cat.name);
        cat.jastDoIt();
        System.out.println();
        System.out.println(duck.name);
        duck.jastDoIt();
        System.out.println();
        System.out.println(snake.name);
        snake.jastDoIt();
        System.out.println();
    }
}
