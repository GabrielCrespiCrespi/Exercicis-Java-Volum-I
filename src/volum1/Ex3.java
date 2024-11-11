package volum1;

public class Ex3 {
    public static void main(String[] args) {


        int tempsSegons = 3668;
        int hores = tempsSegons / 3600;
        tempsSegons = tempsSegons%3600;
        int minuts = tempsSegons / 60;
        tempsSegons = tempsSegons%60;



        System.out.println("El temps donat es de" + hores + " hores, " + minuts + " minuts i " + tempsSegons + " segons");

    }


}
