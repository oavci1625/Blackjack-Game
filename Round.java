import java.util.ArrayList;

public class Round
{
   //properties
   static int nextCard = 4;
   static ArrayList<Card> playerCards = new ArrayList<Card>();
   static ArrayList<Card> dealerCards = new ArrayList<Card>();
   static Deck deste = new Deck();
   static boolean hide = true;
   static int currentCount = 0;

   //constructors
   public boolean drawForPlayer()
   {
      playerCards.add( deste.deck[ nextCard]);
      if ( deste.deck[ nextCard].value > 1 &&  deste.deck[ nextCard].value < 7)
         currentCount = currentCount + 1;
      if (  deste.deck[ nextCard].value > 9 ||  deste.deck[ nextCard].value == 1)
         currentCount = currentCount - 1;
      nextCard++;
      return true;
   }

   public boolean drawForDealer()
   {
      dealerCards.add( deste.deck[ nextCard]);
      if ( deste.deck[ nextCard].value > 1 &&  deste.deck[ nextCard].value < 7)
         currentCount = currentCount + 1;
      if (  deste.deck[ nextCard].value > 9 ||  deste.deck[ nextCard].value == 1)
         currentCount = currentCount - 1;
      nextCard++;
      return true;
   }

   //methods
   public static void start()
   {
      playerCards.clear();
      dealerCards.clear();
      deste.deleteAll();
      nextCard = 4;
      currentCount = 0;
      hide = true;
      deste.createDeck();
      deste.shuffle();
      playerCards.add( deste.deck[ 0]);
      playerCards.add( deste.deck[ 2]);
      dealerCards.add( deste.deck[ 1]);
      dealerCards.add( deste.deck[ 3]);

      for ( int i = 0; i < 4; i++){
         if ( deste.deck[ i].value > 1 &&  deste.deck[ i].value < 7)
            currentCount = currentCount + 1;
         if (  deste.deck[ i].value > 9 ||  deste.deck[ i].value == 1)
            currentCount = currentCount - 1;
      }
   }

   public static void playOneMoreTime()
   {
      playerCards.clear();
      dealerCards.clear();

      playerCards.add( deste.deck[ nextCard]);
      if ( deste.deck[ nextCard].value > 1 &&  deste.deck[ nextCard].value < 7)
         currentCount = currentCount + 1;
      if (  deste.deck[ nextCard].value > 9 ||  deste.deck[ nextCard].value == 1)
         currentCount = currentCount - 1;
      nextCard++;
      dealerCards.add( deste.deck[ nextCard]);
      if ( deste.deck[ nextCard].value > 1 &&  deste.deck[ nextCard].value < 7)
         currentCount = currentCount + 1;
      if (  deste.deck[ nextCard].value > 9 ||  deste.deck[ nextCard].value == 1)
         currentCount = currentCount - 1;
      nextCard++;
      playerCards.add( deste.deck[ nextCard]);
      if ( deste.deck[ nextCard].value > 1 &&  deste.deck[ nextCard].value < 7)
         currentCount = currentCount + 1;
      if (  deste.deck[ nextCard].value > 9 ||  deste.deck[ nextCard].value == 1)
         currentCount = currentCount - 1;
      nextCard++;
      dealerCards.add( deste.deck[ nextCard]);
      if ( deste.deck[ nextCard].value > 1 &&  deste.deck[ nextCard].value < 7)
         currentCount = currentCount + 1;
      if (  deste.deck[ nextCard].value > 9 ||  deste.deck[ nextCard].value == 1)
         currentCount = currentCount - 1;
      nextCard++;

      hide = true;
   }

   public int getSumOfPlayer()
   {
      int sum = 0;
      boolean firstCase = true;
      boolean secondCase = true;
      for ( int i = 0; i < playerCards.size(); i++){
         sum = sum + Round.playerCards.get(i).realValue;
      }
      //First case for checking ace
      if ( sum > 21){
         for ( int i = 0; i < Round.playerCards.size(); i++){
            if ( Round.playerCards.get(i).value == 1 && firstCase){
               Round.playerCards.get(i).realValue = 1;
               firstCase = false;
            }
         }
         sum = 0;
         for ( int a = 0; a < playerCards.size(); a++){
            sum = sum + Round.playerCards.get(a).realValue;
         }
      }
      //Second for checking ace
      if ( sum > 21){
         for ( int i = 0; i < Round.playerCards.size(); i++){
            if ( Round.playerCards.get(i).value == 1 && secondCase && Round.playerCards.get(i).realValue != 1){
               Round.playerCards.get(i).realValue = 1;
               secondCase = false;
            }
         }
         sum = 0;
         for ( int a = 0; a < playerCards.size(); a++){
            sum = sum + Round.playerCards.get(a).realValue;
         }
      }
      return sum;
   }

   public int getSumOfDealer()
   {
      int sum = 0;
      boolean firstCase = true;
      boolean secondCase = true;
      for ( int i = 0; i < dealerCards.size(); i++){
         sum = sum + Round.dealerCards.get(i).realValue;
      }
      //First case for checking for ace
      if ( sum > 21){
         for ( int i = 0; i < Round.dealerCards.size(); i++){
            if ( Round.dealerCards.get(i).value == 1 && firstCase){
               Round.dealerCards.get(i).realValue = 1;
               firstCase = false;
            }
         }
         sum = 0;
         for ( int a = 0; a < dealerCards.size(); a++){
            sum = sum + Round.dealerCards.get(a).realValue;
         }
      }

      //Second case for checking for ace
      if ( sum > 21){
         for ( int i = 0; i < Round.dealerCards.size(); i++){
            if ( Round.dealerCards.get(i).value == 1 && secondCase && Round.dealerCards.get(i).realValue != 1){
               Round.dealerCards.get(i).realValue = 1;
               secondCase = false;
            }
         }
         sum = 0;
         for ( int a = 0; a < dealerCards.size(); a++){
            sum = sum + Round.dealerCards.get(a).realValue;
         }
      }
      return sum;
   }

   public boolean open()
   {
      hide = false;
      return true;
   }

   public String getPlayerCards()
   {
      String playerCards = "";

      for ( int i = 0; i < Round.playerCards.size(); i++){
         playerCards = playerCards + "  " + Round.playerCards.get(i);
      }
         return "Your cards are: " + playerCards + "\n";
   }

   public String getDealerCards()
   {
      String dealerCards = "";

      for ( int i = 0; i < Round.dealerCards.size(); i++){
         dealerCards = dealerCards + "  " + Round.dealerCards.get(i);
      }
      if ( hide)
         return "Dealer cards are: " + Round.dealerCards.get(0) + "   " + "Unknown";
      else
         return "Dealer cards are: " + dealerCards;
   }

   public String getCurrentCount()
   {
      return "Current count is " + currentCount;
   }

   public String toString()
   {
      String playerCards = "";
      String dealerCards = "";

      for ( int i = 0; i < Round.playerCards.size(); i++){
         playerCards = playerCards + "  " + Round.playerCards.get(i);
      }

      for ( int i = 0; i < Round.dealerCards.size(); i++){
         dealerCards = dealerCards + "  " + Round.dealerCards.get(i);
      }
      if ( hide)
         return "Your cards are: " + playerCards + "\n" + "Dealer cards are: " + Round.dealerCards.get(0) + "   " + "Unknown";
      else
         return "Your cards are: " + playerCards + "\n" + "Dealer cards are: " + dealerCards;
   }

}