public class Player {
    private String name;
    private char symbol;

    Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    String getName() {
        return name;
    }

    char getSymbol() {
        return symbol;
    }
}