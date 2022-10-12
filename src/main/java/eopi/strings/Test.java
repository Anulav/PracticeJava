package eopi.strings;

import java.util.*;

public class Test {
    public static void main(String[] args) {
       List<String> test = Arrays.asList("a","A","b","B");
       test.stream().map(e->{
           if(e.charAt(0) >= 'A' || e.charAt(0) <= 'Z'){
               return e.toLowerCase();
           }else{
               return e;
           }
       }).forEach(System.out::println);

        List<String> list = Arrays.asList("Asas","sas","fsdf","fsdf","Fsd");
        for (String a : args)
            list.add(a);
        Collections.shuffle(list, new Random());
        System.out.println(list);

        System.out.println(Collections.singletonList("A").getClass());
       list.subList(0, 1).forEach(System.out::println); //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
        //System.out.println(i);
        cards();

    }
    public static void cards(){
        int numHands = 4;
        int cardsPerHand = 4;

        // Make a normal 52-card deck.
        String[] suit = new String[] {
                "spades", "hearts",
                "diamonds", "clubs"
        };
        String[] rank = new String[] {
                "ace", "2", "3", "4",
                "5", "6", "7", "8", "9", "10",
                "jack", "queen", "king"
        };

        List<String> deck = new ArrayList<String>();
        for (int i = 0; i < suit.length; i++)
            for (int j = 0; j < rank.length; j++)
                deck.add(rank[j] + " of " + suit[i]);

        // Shuffle the deck.
        Collections.shuffle(deck);

        if (numHands * cardsPerHand > deck.size()) {
            System.out.println("Not enough cards.");
            return;
        }
        System.out.println("Cards");
        for (int i = 0; i < numHands; i++)
            System.out.println(dealHand(deck, cardsPerHand));
    }

    public static <E> List<E> dealHand(List<E> deck, int n) {
        int deckSize = deck.size();
        List<E> handView = deck.subList(deckSize - n, deckSize);
        List<E> hand = new ArrayList<E>(handView);
        handView.clear();
        return hand;
    }

}
