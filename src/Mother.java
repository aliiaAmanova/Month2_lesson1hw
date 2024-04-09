public class Mother extends Grandmother {
    private Appearance appearance;

    public Mother (int age, String name, Appearance appearance, String character) {
        super(age, name, character);
        this.appearance = appearance;
    }
    public void makeVoice(){
        System.out.println("Мама говорит: ");

    }
    public void makeVoice(String voice){
        System.out.println("Мама говорит: " + voice);
    }
    public final void makeAction(){
        System.out.println("Мама делает: ");
    }
    public final void makeAction(String action){
        System.out.println("Мама делает: " + action);
    }
    public  String getInfo(){
        return "\nAge: "+ getAge() +
                "\nName: " + getName() +
                "\nHeight: "+ appearance.getHeight()+
                "\nWeight: " +appearance.getWeight()+
                "\nColorOfEyes: "+ appearance.getColorOfEyes()+
                "\nCharacter: " + getCharacter();
    }
}
