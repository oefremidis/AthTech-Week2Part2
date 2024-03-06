public class Movie {
    private String title;
    private int nominated;
    private int win;
    private double budget;
    private double profit;

    public Movie(){}

    public Movie(String title, int nominated, int win, double budget, double profit) {
        this.title = title;
        this.nominated = nominated;
//        this.win = win;
        setWin(win);
        this.budget = budget;
        this.profit = profit;
    }

    // ----------------------------------------------------

        public boolean isProfitable(){
            return profit > budget;
        }

        public double getDifference(){
            return profit - budget;
        }

    // ----------------------------------------------------

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNominated() {
        return nominated;
    }

    public void setNominated(int nominated) {
        this.nominated = nominated;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        if (win <= nominated) {
            this.win = win;
        } else {
            this.win = -99999;
        }
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "Movie {" +
                "title='" + title + '\'' +
                ", nominated=" + nominated +
                ", win=" + win +
                ", budget=" + budget +
                ", profit=" + profit +
                '}';
    }
}
