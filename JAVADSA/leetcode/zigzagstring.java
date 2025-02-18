package leetcode;
import java.util.ArrayList;
import java.util.List;
/* Questions .
 *  The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 */
public class  zigzagstring{
    public String convert(String s, int numRows) {
        // If the number of rows is 1 or greater than or equal to the length of the string,
        // return the original string as it is already in zigzag format.
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Create a list of StringBuilder for each row
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int idx = 0;  // Current row index
        int d = 1;    // Direction: 1 for down, -1 for up

        // Iterate through the characters of the string and place them in the appropriate row
        for (char c : s.toCharArray()) {
            rows.get(idx).append(c);
            if (idx == 0) {
                d = 1;  // Change direction to down
            } else if (idx == numRows - 1) {
                d = -1; // Change direction to up
            }
            idx += d;
        }

        // Concatenate all rows to get the final result
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        ArrayList <String> s =new ArrayList<>();
        s.add("PAYPALISHIRING");
        s.convert(s,3);
        System.out.println;
    }
}


//// to the best analysis code 
// public class  Solution{
//     public String convert(String s, int numRows) {
     
//         if (numRows == 1 || numRows >= s.length()) {
//             return s;
//         }

//         List<StringBuilder> rows = new ArrayList<>();
//         for (int i = 0; i < numRows; i++) {
//             rows.add(new StringBuilder());
//         }

//         int idx = 0;  
//         int d = 1;    

//         for (char c : s.toCharArray()) {
//             rows.get(idx).append(c);
//             if (idx == 0) {
//                 d = 1; 
//             } else if (idx == numRows - 1) {
//                 d = -1;
//             }
//             idx += d;
//         }

//         StringBuilder result = new StringBuilder();
//         for (StringBuilder row : rows) {
//             result.append(row);
//         }

//         return result.toString();
//     }
// }

