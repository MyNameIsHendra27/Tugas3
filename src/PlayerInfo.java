public class PlayerInfo {
    private String name;
    private int goals;

    /**
     * konstruktor untuk kelas PlayerInfo
     * @param name nama player
     * @param goals jumlah gol player
     */

    public PlayerInfo(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    /**
     * Mendapatkan nilai nama player
     * @return nama player
     */

    public String getName() {
        return name;
    }

    /**
     * mendapatkan nilai jumlah gol player
     * @return jumlah gol
     */

    public int getGoals() {
        return goals;
    }

}
