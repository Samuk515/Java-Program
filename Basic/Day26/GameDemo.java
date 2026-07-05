package Day26;

abstract class Game {
    abstract void intialize();
    abstract void startPlay();
    abstract void endplay();

    // Template method - final so order cannot be changed
    final void play() {
        intialize();
        startPlay();
        endplay();
    }
}

class Cricket extends Game {
    @Override void intialize() { System.out.println("Cricket: Arranging players on field");}
    @Override void startPlay() { System.out.println("Cricket:  playing cricket");}
    @Override void endplay() { System.out.println("Cricket:  players leaving field");}
}

class Football extends Game {
    @Override void intialize() { System.out.println("Football: Arranging players on field");}
    @Override void startPlay() { System.out.println("Football: playing football");}
    @Override void endplay() { System.out.println("Football: players leaving field");}
}
public class GameDemo {
    public static void main(String[] args) {
        Game game1 = new Cricket();
        game1.play();
        System.out.println();
        Game game2 = new Football();
        game2.play();

    }
}
