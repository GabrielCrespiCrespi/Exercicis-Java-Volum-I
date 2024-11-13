package volum1;

public class Ex18 {
    public static void main(String[] args) {
        int inici=4;
        int fi=18;

        if(inici>fi){
             System.out.println("Error: inici ha de ser menor o igual que fi");
        }else{
                int i=inici;
                while (inici <= fi) { 
                    if (inici % 2 == 0) 
                    { System.out.println(inici); } inici++; } 
        } 
    } 
}
