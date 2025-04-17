import java.util.*;
import java.io.*;

public class SudokuBoard{

   private char[][] board = new char[9][9];
   
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
      String s = "+---------------------------------+\n";
      int horizontalBarrierCounter = 0;
      
      for(int r = 0; r < board.length; r++){
         if(horizontalBarrierCounter == 3){
            s += "+---------------------------------+\n";
            horizontalBarrierCounter = 0;
         }
         
         int verticalBarrierCounter = 0;
         s += "|";
         
         for(int c = 0; c < board[r].length; c++){
            s += " " + board[r][c] + " ";
            verticalBarrierCounter++;

            if (verticalBarrierCounter == 3 && c!= board[r].length - 1){
               s += " | ";
               verticalBarrierCounter = 0;
            }
         }
            
         s += "|\n";
         horizontalBarrierCounter++;
      }
      
      s += "+---------------------------------+";
      return s;
   }
   
}