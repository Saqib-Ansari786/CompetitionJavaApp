public class LudoCompetitor extends Competitor {
    private int[] scores;

    public LudoCompetitor(int competitorNumber, Name competitorName, String country, String level, int age,
            int[] scores) {
        super(competitorNumber, competitorName, country, level, age);
        this.scores = scores;
    }

    public double getOverallScore() {
        // Calculate the overall score based on your own decision
        // For example, let's calculate the average of all scores
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public String getFullDetails() {
        return super.getFullDetails() + " has an list of scores " + scores[0] + ", " + scores[1] + ", " + scores[2]
                + ", " + scores[3] + " and an overall score of "
                + getOverallScore();
    }

    public String toString() {
        return super.toString() + "has an overall score of " + getOverallScore();
    }

}
