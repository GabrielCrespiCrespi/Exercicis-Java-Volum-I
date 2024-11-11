package volum1;

public class Ex5 {
    public static void main(String[] args) {
        int horesTrebellades = 50;
        double preuHores = 12;
        double salari;

        if(horesTrebellades<=40) {
            salari=horesTrebellades*preuHores;
        }
        else{
            int horesExtre = horesTrebellades-40;
            salari=(40*preuHores) + (horesExtre*preuHores*2);
        }

        System.out.println("el salari es de " + salari + "€");
    }
}
