package main.java;

public class Transaction {

    private String transactionId;
    private String type;

    private double amount;

    private String date;

    private String category;

    private String description;

    public Transaction(String transactionId, String type, double amount, String date, 
    String category, String description){

        this.transactionId = transactionId;
        this.type  = type;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.description = description;
    }

    public Object getType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getType'");
    }

    public double getAmount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAmount'");
    }
    
}
