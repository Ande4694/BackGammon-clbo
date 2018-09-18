public class BackGammonGame {

    BackGammonBoard board = new BackGammonBoard();

    public static void main(String[] args) {

        Player player1 = new Player("Hans");
        Player player2 = new Player("Grethe");

        Player[] players = {player1, player2};


        if(player1.winner){
            System.out.println("player 1 wins");
        }
        if(player2.winner){
            System.out.println("player 2 wins");
        }
        System.out.println("Hello World!");
    }
}
