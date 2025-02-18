package string;

public class shortstringpaths {
    public static float shorteshetpath(String paths){
        int x=0,y=0;
        for(int i=0; i<paths.length(); i++){

            char dir=paths.charAt(i);
             // paths jab west ke traf jay to 

            if(dir=='W'){
                x--;  
            }
              // paths jab North ke traf jay to 
            else if (dir=='N') {
                y++;
                
            }
              // paths jab East ke traf jay to 
            else if (dir=='E') {
                x++;
                
            }
              // paths jab south ke traf jay to 
            else {
                y--;
                
            }

        }
        int X2=x*x;
        int Y2=y*y;

        return (float) Math.sqrt(X2 + Y2);

    }
    public static void main(String[] args) {
        String paths ="WNEENESENNN";
        System.out.println(shorteshetpath(paths));
       

    }
    
}
