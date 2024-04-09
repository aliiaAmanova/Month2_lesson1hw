public class Main {
    public static void main(String[] args) {
        Appearance appearance = new Appearance(170, 60, ColorOfEyes.BLUE);

        Mother mother = new Mother(32,"Alice",appearance,"kind");
        System.out.println(mother.getInfo());
        mother.makeVoice();
        mother.makeVoice("Иди домой");
        mother.makeAction();
        mother.makeAction("Уборку");
        Appearance appearance1= new Appearance(140,35,ColorOfEyes.GREEN);
        Granddaughter granddaughter= new Granddaughter(10," Katya", appearance1, "cute");
        System.out.println(granddaughter.getInfo());
        granddaughter.makeVoice();
        granddaughter.makeVoice("Хорошо,уже иду");
        granddaughter.makeAction();
        granddaughter.makeAction("Уроки");

        Appearance appearance2 = new Appearance(174, 50,ColorOfEyes.BLACK);

        Granddaughter granddaughter1= new Granddaughter(18, "Alexandra",appearance2, "brave");
        System.out.println(granddaughter.getInfo());
      granddaughter1.makeVoice();
      granddaughter1.makeVoice("Сейчас приду");
      granddaughter1.makeAction();
      granddaughter1.makeAction("Зарядку");

    }
}