import java.util.Random;

public class Message {

    private String[] message = {"Lakers","Warriors","Nets","Celtic","Raptors","Jazz","Clippers","Heat","Knicks","Bulls","Hornets","Rockets","Nuggets","Mavericks","Suns","Pelicans","Bucks","Wizards","Blazers","Spurs","Cavaliers","Timberwolves","Kings","Pistons"};

    Random rand = new Random();
    private String word = message[rand.nextInt(message.length)];
    private int wordLength = word.length() + 1;

    public boolean guess(char c){
        return true;
    }
}
