package QuestionOneAndTwo;

public class Meal {

    private String name;
    private Double proteinContentInMiligram;
    private Double carbonHydrateContentInMiligram;
    private Double fatContentInMiligrm;

    public Meal(String name, Double proteinContentInMiligram, Double carbonHydrateContentInMiligram, Double fatContentInMiligrm) {
        this.name = name;
        this.proteinContentInMiligram = proteinContentInMiligram;
        this.carbonHydrateContentInMiligram = carbonHydrateContentInMiligram;
        this.fatContentInMiligrm = fatContentInMiligrm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getProteinContentInMiligram() {
        return proteinContentInMiligram;
    }

    public void setProteinContentInMiligram(Double proteinContentInMiligram) {
        this.proteinContentInMiligram = proteinContentInMiligram;
    }

    public Double getCarbonHydrateContentInMiligram() {
        return carbonHydrateContentInMiligram;
    }

    public void setCarbonHydrateContentInMiligram(Double carbonHydrateContentInMiligram) {
        this.carbonHydrateContentInMiligram = carbonHydrateContentInMiligram;
    }

    public Double getFatContentInMiligrm() {
        return fatContentInMiligrm;
    }

    public void setFatContentInMiligrm(Double fatContentInMiligrm) {
        this.fatContentInMiligrm = fatContentInMiligrm;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", proteinContentInMiligram=" + proteinContentInMiligram +
                ", carbonHydrateContentInMiligram=" + carbonHydrateContentInMiligram +
                ", fatContentInMiligrm=" + fatContentInMiligrm +
                '}';
    }


}
