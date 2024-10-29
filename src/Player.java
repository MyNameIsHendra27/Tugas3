class Player {
    private PlayerInfo playerInfo;

    /**
     * konstruktor untuk player
     * @param playerInfo objek informasi player
     */

    public Player(PlayerInfo playerInfo) {
        this.setPlayerInfo(playerInfo);
    }

    /**
     * mendapatkan nama player dari method player info
     * @return nama player
     */

    public String getName() {
        return getPlayerInfo().getName();
    }

    /**
     * mendapatkan jumlah gol dari setiap player yang berasal dari Playerinfo
     * @return jumlah gol
     */

    public int getGoals() {
        return getPlayerInfo().getGoals();
    }

    /**
     * Menampilkan informasi player
     */

    public void displayPlayerInfo() {
        System.out.println("Player: " + getName() + ", Goals: " + getGoals());
    }

    public PlayerInfo getPlayerInfo() {
        return playerInfo;
    }

    public void setPlayerInfo(PlayerInfo playerInfo) {
        this.playerInfo = playerInfo;
    }
}