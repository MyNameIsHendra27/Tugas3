public class Main {

    /**
     * Method utama untuk memulai program
     * @param args argumen command line
     */
    public static void main(String[] args) {
        PlayerInfo playerInfo1 = new PlayerInfo("Lionel Messi", 30);
        PlayerInfo playerInfo2 = new PlayerInfo("Cristiano Ronaldo", 28);
        PlayerInfo playerInfo3 = new PlayerInfo("Neymar Jr", 25);

        Player player1 = new Player(playerInfo1);
        Player player2 = new Player(playerInfo2);
        Player player3 = new Player(playerInfo3);

        Player[] players = {player1, player2, player3};
        Team team = new Team("Dream Team", players);

        team.displayTeamInfo();
        // Calculate total goals using player method
        int totalGoals = player1.getGoals() + player2.getGoals() + player3.getGoals();
        System.out.println("Total Goals: " + totalGoals);
    }
}