package behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        Radio radio1 = new Radio(new PlayWithPlayerOne());

        Radio radio2 = new Radio(new PlayWithPlayerTwo());

        System.out.println("Radio 1 play");
        radio1.play();
        System.out.println("Radio 2 play");
        radio2.play();

    }
}
