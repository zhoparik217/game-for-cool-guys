public class Helper extends Monster {
    private Person person;
    Helper(int sizeBoard, Person person) {
        super(sizeBoard);
        this.person = person;
        setImage("👻"); // Смайлик привидения
    }
    @Override
    public boolean taskMonster(int difficultGame) {
        System.out.println("Ого! Это хелпер! =) ");
        System.out.println("Он дарит вам +1  жизнь!");
        person.upLive();
        return true;
    }
}