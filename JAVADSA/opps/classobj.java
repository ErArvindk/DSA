public class classobj {
    // to create  the instance variable
    int age;
    String name;     
    public static void main(String[] args) {

        //to create a object in this class 
        classobj obj = new classobj();
        classobj obj1 = new classobj();   
        obj.name="arvind";
        obj.age=19;
        obj1.name="kumar";
        obj1.age=20;
        System.out.println(obj.age);
        System.out.println(obj.name);                
        System.out.println(obj1.age);
        System.out.println(obj1.name);  
        
        
        // to create a local variable 

        int date=13;
        String month="july";
        System.out.println("to print the local variable value = " +date+" "+month);

    }
    
    
}
