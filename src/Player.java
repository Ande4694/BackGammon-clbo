import java.util.ArrayList;

public class Player {

    private String name;
    private int score = 0;

    private ArrayList<Piece> pieces = new ArrayList<>();
    private Piece piece = new Piece();

    @Override
    public String toString() {
        return "Player{" +
                "pieces=" + pieces +
                ", piece=" + piece +
                '}';
    }

    boolean winner = pieces.size()<1;

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player() {
    }
}
