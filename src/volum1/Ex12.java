package volum1;

public class Ex12 {
    public static void main(String[] args) {
        int horesTrebellades = 95;
        double preuHores = 12;
        double salariBrut;
        double salariNet;
        double irpf;

        if(horesTrebellades<=40) {
            salariBrut=horesTrebellades*preuHores;
        }
        else{
            int horesExtre = horesTrebellades-40;
            salariBrut=(40*preuHores) + (horesExtre*preuHores*2);
        }

        if(salariBrut<300){
            irpf = salariBrut*0.10;
        } else if(salariBrut<500){
            irpf = salariBrut*0.20;
        } else {
            irpf = salariBrut*0.30;
        }

       salariNet=salariBrut-irpf;

        System.out.println("el salari brut es de " + salariBrut + "€ i el salari net es " + salariNet + "€");
    }
}
