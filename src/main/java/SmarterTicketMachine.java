package src.main.java;
 
/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MyTicketMachine
{
    private int seniorPrice;
    private int childPrice;
    // The price of a ticket from this machine.
    private int regularPrice;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    /**
     * Create a machine that issues tickets of the given price.
     */
    public MyTicketMachine(int cost)
    {
        regularPrice = cost;
        seniorPrice = cost/4;
        childPrice = cost/2;
        balance = 0;
        total = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPriceRegular()
    {
        return regularPrice;
    }
    
    /**
     * @Return The price of a ticket.
     */
    public int getPriceSenior()
    {
        return seniorPrice;
    }
    
    /**
     * @Return The price of a ticket.
     */
    public int getPriceChild()
    {
        return childPrice;
    }
    
    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printRegularTicket()
    {
        boolean checkPrice = (balance >= regularPrice);
        if(checkPrice) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + regularPrice + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + regularPrice;
            // Reduce the balance by the price.
            balance = balance - regularPrice;
        }
        else {
            int amountLeftToPay = regularPrice - balance;
            System.out.println("You must insert at least: " +
                               amountLeftToPay + " more cents.");
                    
        }
    }

        /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printSeniorTicket()
    {
        boolean checkPrice = (balance >= seniorPrice);
        if(checkPrice) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + seniorPrice + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + seniorPrice;
            // Reduce the balance by the price.
            balance = balance - seniorPrice;
        }
        else {
            int amountLeftToPay = seniorPrice - balance;
            System.out.println("You must insert at least: " +
                               amountLeftToPay + " more cents.");
                    
        }
    }
    
        /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printChildTicket()
    {
        boolean checkPrice = (balance >= childPrice);
        if(checkPrice) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + childPrice + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + childPrice;
            // Reduce the balance by the price.
            balance = balance - childPrice;
        }
        else {
            int amountLeftToPay = childPrice - balance;
            System.out.println("You must insert at least: " +
                               amountLeftToPay + " more cents.");
                    
        }
    }
    
    public int emptyMachine(){
        int originalTotal = total;
        total = 0;
        return originalTotal;
    }
    
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
