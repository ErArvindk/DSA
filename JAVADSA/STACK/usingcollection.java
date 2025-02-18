package STACK;
/// to using stack collection framework 
import java.util.Stack;

public class usingcollection {
    public static void main(String[] args) {
        Stack <Integer> sd =new Stack<>();
        sd.push(12);
        sd.push(14);
        sd.push(16);
        sd.push(22);
        sd.push(42);
        sd.push(52);
        System.out.println(sd);
        sd.pop();
        System.out.println(sd);

        
    }
    
}
