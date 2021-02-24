public class Gallows{

    private int errorCount;
    private static final int MAXLIFE = 8;
    private  int life = MAXLIFE;

    public void incrementHangman(){
        int currentLife = life-errorCount;
        System.out.println("ERROR, Lives Left: "+ currentLife);
        errorCount++;
    }
    public boolean isDead(){
        if (errorCount == life) return false;
        else return true;
    }
    public String toString(){
        String gallowMsg = "";
        if(errorCount == 1){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |              \n"+
            " |              \n"+
            " |              \n"+
            " |              \n"+
            " |              \n"+
            "_|_              \n";
        }
        if(errorCount == 2){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |          O   \n"+
            " |             \n"+
            " |             \n"+
            " |              \n"+
            " |              \n"+
            "_|_              \n";
        }
        if(errorCount == 3){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |          O   \n"+
            " |          |   \n"+
            " |             \n"+
            " |              \n"+
            " |              \n"+
            "_|_              \n";
        }
        if(errorCount == 4){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |          O   \n"+
            " |          |   \n"+
            " |         /    \n"+
            " |              \n"+
            " |              \n"+
            "_|_              \n";
        }
        if(errorCount == 5){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |          O   \n"+
            " |          |   \n"+
            " |         / \\    \n"+
            " |              \n"+
            " |              \n"+
            "_|_              \n";
        }
        if(errorCount == 6){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |          O   \n"+
            " |          |   \n"+
            " |         / \\    \n"+
            " |          |    \n"+
            " |              \n"+
            "_|_              \n";
        }
        if(errorCount == 7){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |          O   \n"+
            " |          |   \n"+
            " |         / \\    \n"+
            " |          |    \n"+
            " |         /    \n"+
            "_|_              \n";
        }
        if(errorCount == 8){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |          O   \n"+
            " |          |   \n"+
            " |         / \\    \n"+
            " |          |    \n"+
            " |         / \\    \n"+
            "_|_              \n";
        }
        if(errorCount == 0){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |              \n"+
            " |              \n"+
            " |              \n"+
            " |              \n"+
            " |              \n"+
            " |              \n"+
            "_|_              \n";
        }
        return gallowMsg;
    }
}