
public class Competitor {
    private int competitorNumber;
    private String competitorName;
    private String country;
    private String level;
    private int age;
    private int[] scores;

    public Competitor(int competitorNumber, String competitorName, String country, String level, int age,
            int[] scores) {
        this.competitorNumber = competitorNumber;
        this.competitorName = competitorName;
        this.country = country;
        this.level = level;
        this.age = age;
        this.scores = scores;
    }

    // get and set methods

    public int getCompetitorNumber() {
        return competitorNumber;
    }

    public void setCompetitorNumber(int competitorNumber) {
        this.competitorNumber = competitorNumber;
    }

    public String getCompetitorName() {
        return competitorName;
    }

    public void setCompetitorName(String competitorName) {
        this.competitorName = competitorName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // methods

    public double getOverallScore() {

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public String getFullDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Competitor number ").append(competitorNumber)
                .append(", name ").append(competitorName)
                .append(", country ").append(country)
                .append(".\n").append(competitorName).append(" is a ")
                .append(level).append(" aged ").append(age)
                .append(" and received these scores: ");
        for (int score : scores) {
            details.append(score).append(", ");
        }
        details.delete(details.length() - 2, details.length()); // Remove trailing comma and space
        details.append("\nThis gives him an overall score of ").append(getOverallScore()).append(".");
        return details.toString();
    }

    public String getShortDetails() {
        return "CN " + competitorNumber + " (" + getInitials() + ") has overall score " + getOverallScore() + ".";
    }

    private String getInitials() {
        String[] nameParts = competitorName.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String part : nameParts) {
            initials.append(part.charAt(0));
        }
        return initials.toString().toUpperCase();
    }

    public String getLevelDescription() {
        switch (level) {
            case "Beginner":
                return "This is a beginner.";
            case "Intermediate":
                return "This is an intermediate.";
            case "Advanced":
                return "This is an advanced.";
            default:
                return "This is an unknown level.";
        }
    }

    public String getAgeDescription() {
        if (age < 18) {
            return "This is a junior.";
        } else if (age < 40) {
            return "This is an adult.";
        } else {
            return "This is a senior.";
        }
    }

    public static void main(String[] args) {
        int[] scores = { 10, 20, 30, 40, 50 };
        Competitor c = new Competitor(1, "John Smith", "UK", "Beginner", 17, scores);
        System.out.println(c.getFullDetails());
        System.out.println(c.getShortDetails());
        System.out.println(c.getLevelDescription());
        System.out.println(c.getAgeDescription());
    }

}
