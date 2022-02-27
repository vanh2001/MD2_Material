import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate time = LocalDate.now();
        Material bot1 = new CrispyFlour("1", "Bột mì", time ,4, 5);
        Material bot2 = new CrispyFlour("2", "Bột mì 2", time ,7, 2);
        Material bot3 = new CrispyFlour("3", "Bột mì 3", time ,9, 6);
        Material bot4 = new CrispyFlour("4", "Bột mì 4", time ,10, 7);

        Material thit6 = new Meat("6", "Thit bò",time, 6,9);
        Material thit7 = new Meat("7", "Thit lợn",time, 4,6);
        Material thit8 = new Meat("8", "Thit gà",time, 8,3);
        Material thit9 = new Meat("9", "Thit dê",time, 1,7);
        Material thit10 = new Meat("10", "Thit chó",time, 3,9);

        Material[] m1 = {bot1,bot2,bot3,bot4,thit6,thit7,thit8,thit9,thit10};

    }
}
