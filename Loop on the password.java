import java.lang.reflect.Method;

class Main {
    public static void main(String[] args) {
      // The printPassword method is a static method that is called from the main method. This method is responsible for generating and printing a password
      printPassword();
    }
  
    public static void printPassword(){
      //Declaring and initializing a character array temp with a size of 32 characters
      char[] temp = new char[32];
      //Assign individual characters to specific indices of the 'temp' array
      temp[0]  = 'd';
      temp[29] = '9';
      temp[4]  = 'r';
      temp[2] = '5' ;
      temp[23] = 'r';
      temp[3] ='c' ;
      temp[17] = '4';
      temp[1]  = '3';
      temp[7]  = 'b';
      temp[10] = '_';
      temp[5] = '4' ;
      temp[9] = '3' ;
      temp[11] = 't' ;
      temp[15] = 'c' ;
      temp[8]  = 'l' ;
      temp[12] = 'H';
      temp[20] ='c';
      temp[14] = '_' ;
      temp[6] = 'm' ;
      temp[24] ='5' ;
      temp[18] ='r' ;
      temp[13] = '3' ;
      temp[19] ='4' ;
      temp[21] ='T' ;
      temp[16]='H' ;
      temp[27] = '5';
      temp[30] = '2' ;
      temp[25]= '_';
      temp[22] = '3' ;
      temp[28] = '0' ;
      temp[26] = '7' ;
      temp[1]= 'e';
  
  
  //Creating a string with the specific format of https://picoctf.org/
      String t = "picoCTF{";
  
      //A 'for' loop is used to iterate through the 'temp' array
      for (char x : temp){
        // each character is concatenated to the t string using the += operator
          t += x;
      }
 //After the loop, the t string is concatenated with a closing brace '}' using the '+=' operator
      t += "}";
      
      //Finally, the complete password string t is printed to the console
      System.out.println(t);
    }
  }
