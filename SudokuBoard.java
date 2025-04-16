import java.util.*;
import java.io.*;

public class SudokuBoard{

   private char[][] board;
   
   public SudokuBoard(String filename){
      try {
         Scanner file = new Scanner(new File(filename));
         int row = 0;
         while(file.hasNextLine()){
            String s = file.nextLine();
            for(int i = 0; i < s.length(); i++){
               board[row][i] = s.charAt(i);
            }
            row++;
         }
      }catch (FileNotFoundException e){
         System.out.println("File does not exist");
      }
   }
   
   public String toString(){
      return "";
   }
   
}