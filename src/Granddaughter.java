public final class Granddaughter extends Mother {
    public Granddaughter(int age, String name, Appearance appearance, String character) {
        super(age, name, appearance, character);

    }
    public void makeVoice(){
        System.out.println("Внучка говорит: ");
    }
    public void makeVoice(String voice){
        System.out.println("Внучка говорит: " + voice);
    }
    }

