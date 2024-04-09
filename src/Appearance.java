public class Appearance {
    private int height;
    private int weight;
    private ColorOfEyes colorOfEyes;


    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public ColorOfEyes getColorOfEyes() {
        return colorOfEyes;
    }

    public Appearance(int height, int weight, ColorOfEyes colorOfEyes) {
        this.height = height;
        this.weight = weight;
        this.colorOfEyes = colorOfEyes;
    }
}
