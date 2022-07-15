package oo.heranca;

public class Jogo {

    public static void main(String[] args) {

        DrWatsson drwatsson = new DrWatsson(10, 10);
        drwatsson.x = 10;
        drwatsson.y = 10;

        CalviceMonster calviceMonster = new CalviceMonster();
        calviceMonster.x = 10;
        calviceMonster.y = 11;

        System.out.println("DrWatsson, Life: " + (drwatsson.vida));
        System.out.println("CalviceMonster, Life: " + calviceMonster.vida);

        drwatsson.atacar(calviceMonster);
        drwatsson.atacar(calviceMonster);
        drwatsson.atacar(calviceMonster);
        calviceMonster.atacar(drwatsson);
        calviceMonster.atacar(drwatsson);
        drwatsson.andar(Direcao.NORTE);

        System.out.println("DrWatsson, Life: " + (drwatsson.vida));
        System.out.println("CalviceMonster, Life: " + calviceMonster.vida);
    }

}
