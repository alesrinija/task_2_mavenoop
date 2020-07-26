package com.epam.Task_2_maven_oop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws InterruptedException
    {
        System.out.println( "New year's Gifts!\n" );
        Thread.sleep(2000);
    
        Child alice = new Child("Alice");
        Child bob = new Child("Bob");

        System.out.println( "Created two children Alice and Bob.\n" );
        
        alice.addChocolate(new Chocolates(50,150,"Red"));
        alice.addChocolate(new Chocolates(5,50,"Blue"));
        alice.addChocolate(new Chocolates(100,500,"Yellow"));
        
        bob.addChocolate(new Chocolates(200,190,"Green"));
        bob.addChocolate(new Chocolates(45,90,"Pink"));
        bob.addChocolate(new Chocolates(160,40,"Brown"));
        
        alice.addSweet(new Sweets(23,95,"lemon"));
        alice.addSweet(new Sweets(63,85,"orange"));
        alice.addSweet(new Sweets(33,34,"apple"));

        bob.addSweet(new Sweets(35,68,"berry"));
        bob.addSweet(new Sweets(46,95,"rose"));
        bob.addSweet(new Sweets(13,85,"mango"));
        
        
        System.out.println( "Giving 3 chocolates and 3 candies to Alice and Bob each...\n" );
        Thread.sleep(2000);
        
        System.out.println( "Done." );

        System.out.println( "\nAlice Sweets-\n" );
        Thread.sleep(500);
        for(Sweets sweet:alice.getSweets()) {
            System.out.println( sweet.getName()+" of weight "+sweet.getWeight()+"g having sweetness "+sweet.getSweetness() );
        }
        
        System.out.println( "\nAlice Chocolates-\n" );
        Thread.sleep(500);
        for(Chocolates chocolate:alice.getChocolates()) {
            System.out.println( chocolate.getName()+" of weight "+chocolate.getWeight()+"g having sweetness "+chocolate.getSweetness() );
        }
        
        System.out.println( "\nBob Sweets-\n" );
        Thread.sleep(500);
        for(Sweets sweet:bob.getSweets()) {
            System.out.println( sweet.getName()+" of weight "+sweet.getWeight()+"g having sweetness "+sweet.getSweetness() );
        }
        
        System.out.println( "\nBob Chocolates-\n" );
        Thread.sleep(500);
        for(Chocolates chocolate:bob.getChocolates()) {
            System.out.println( chocolate.getName()+" of weight "+chocolate.getWeight()+"g having sweetness "+chocolate.getSweetness() );
        }
        
        System.out.println("Calculating total weight of chocolates...\n");
        Thread.sleep(2000);
        
        System.out.println("Alice has "+ alice.getTotalGiftWeight() +" grams of gifts in total.");
        System.out.println("Bob has "+ bob.getTotalGiftWeight() +" grams of gifts in total.");
        
        System.out.println("\nBob wants to sort his Chocolates by sweetness...\n");
        Thread.sleep(2000);
        
        System.out.println("Done.");
        
        bob.sortChocolatesBySweetness();
        
        System.out.println( "\nBob Chocolates-" );
        for(Chocolates chocolate:bob.getChocolates()) {
            System.out.println( chocolate.getName()+" of weight "+chocolate.getWeight()+"g having sweetness "+chocolate.getSweetness() );
        }
        
        System.out.println( "\nAlice wants to find lemon in her sweets-" );
        System.out.println( "searching...\n" );
        Thread.sleep(2000);
        System.out.println( alice.findSweetInSweets("lemon")?"Found":"Not Found" );
        
        System.out.println( "\nAlice wants to find mango in her sweets-" );
        System.out.println( "searching...\n" );
        Thread.sleep(1000);
        System.out.println( alice.findSweetInSweets("mango")?"Found":"Not Found" );
        
        System.out.println( "\nAlice wants to find apple in her sweets-" );
        System.out.println( "searching...\n" );
        Thread.sleep(3000);
        System.out.println( alice.findSweetInSweets("apple")?"Found":"Not Found" );

        
        System.out.println("\nBye World!");
            
    }
}
