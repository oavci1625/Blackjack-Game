public class Card
{
   //properties
   int type;
   int value;
   int realValue;
   String valueString;

   //constructors

   public Card ( int t, int v)
   {
      type = t;
      value = v;
      if ( value > 10){
         realValue = 10;
      }
      else if ( value == 1)
         realValue = 11;
      else{
         realValue = value;
      }
      if ( value == 11)
         valueString = "J";
      else if ( value == 12)
         valueString = "Q";
      else if ( value == 13)
         valueString = "K";
      else if ( value == 1)
         valueString = "A";
      else
         valueString = "" + value;
   }

   //methods
   public String toString()
   {
      if ( type == 1)
      {
         return "Kupa-" + valueString;
      }

      else if ( type == 2)
      {
         return "Karo-" + valueString;
      }

      else if ( type == 3)
      {
         return "Maça-" + valueString;
      }

      else if ( type == 4)
      {
         return "Sinek-" + valueString;
      }

      else
         return "Not a valid card";
   }
}