public class StringConcat
{
   /*
    Silly method that concatenates strings on a array
    Might try to change it later somtime
   */
    public static void main(String[] args) {
        String [] strings = {"Hello ","World","!"};
        stringConcat(strings);
    }
    
    public static void stringConcat(String [] strings){
      String string = "";
      for(int i = 0; i <= strings.length-1; i++){
       string += strings[i];
      }
      System.out.println(string);
    }
}
