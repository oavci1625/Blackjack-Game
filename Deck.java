import java.util.Arrays;

public class Deck
{
   //properties
   int numberOfDecks = 1;
   Card[] deck = new Card[52 * numberOfDecks];

   //constructors

   //methods
   public String toString()
   {
      return Arrays.toString(deck);
   }

   public  boolean createDeck()
   {
      for ( int i = 0; i < 4; i++){
         for ( int loop = 0; loop < 13 * numberOfDecks; loop++){
            int revisedLoop;
            revisedLoop = loop;
            while ( revisedLoop > 12 ){
               revisedLoop = revisedLoop - 13;
            }
            
            Card newCard = new Card(i + 1, revisedLoop + 1);
            deck[ i * ( 13 * numberOfDecks) + loop] = newCard;
         }
      }
      return true;
   }

   public boolean shuffle()
   {
      for ( int loop = numberOfDecks * 52; loop > 0; loop--){
         int randomNumber = (int)(Math.random() * loop) ;
         Card backupCard = new Card(deck[randomNumber].type, deck[randomNumber].value);
         deck[randomNumber] = deck[ loop - 1];
         deck[ loop - 1] = backupCard;
      }
      return true;
   }
   
   public boolean deleteAll()
   {
      for ( int i = 0; i < numberOfDecks * 52; i++){
          deck[i] = null;
      }
      return true;
   }
}