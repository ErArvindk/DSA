package problempracticsmind;

public class claculatemonthssar {
    public static void main(String[] args) {
        double total;
        double perday=1;
        int n=30;
        for(int i=0; i<n-1; i++){
             perday =perday*2;
             total =+ perday;
        }
        System.out.println(perday);

    }
    
}
