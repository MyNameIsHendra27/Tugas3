class Team {
    private String teamName;
    private Player[] players;

    /**
     * Konstruktor untuk kelas Team
     * @param teamName
     * @param players
     */

    public Team(String teamName, Player[] players) {
        this.teamName = teamName;
        this.players = players;
    }

    /**
     * Menampilkan informasi tim termasuk semua player
     */

    public void displayTeamInfo() {
        System.out.println("Team: " + teamName);
        for (Player player : players) {
            displayPlayer(player);
        }


    }

    // Extracted Method for displaying player info

    /**
     * Menampilkan Informasi setiap player
     * @param player informasi player akan ditampilkan
     */
    private void displayPlayer(Player player) {
        System.out.println(player.getName() + ": " + player.getGoals());
    }
}


