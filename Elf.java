public class Elf {
    private String name;
    private int moves;
    private String shenanigan;
    public Elf() {
name = "bob";
moves = 1;
shenanigan = "";
    }
    public Elf(String name) {
        this.name = name;
        moves = 1;
        shenanigan = "";
    }
    public String getName() {
        return name;
    }
    public int getMoves() {
        return moves;
    }
    public void setMoves(int moves) {
        this.moves = moves;
    }
}
