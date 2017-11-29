package lesson24.exercise;

public class Tool {
    private String namr;
    private String description;

    public Tool(String namr, String description) {
        this.namr = namr;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "namr='" + namr + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
