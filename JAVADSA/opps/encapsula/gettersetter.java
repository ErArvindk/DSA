package encapsula;

import string.shortstringpaths;

/**
 * setergatter
 */
class Person {
    private String name; // private = restricted access
    private int age;
  
    // Getter
    public String getName() {
       return this.name;
    }
    // Getter
    public int getage() {
       return this.age;
    }
    // Setter
    public void setName(String newName) {
        this.name =newName;
     
      }
  
    // Setter
    public void setage(int age) {
       this.age =age;
    }
  }

public class gettersetter {
    public static void main(String[] args) {
        Person pr =new Person();
        pr.setName("arvind kumar");
        pr.setage(19);
        System.out.println(pr.getName());
        System.out.println(pr.getage());
    }


    
}
