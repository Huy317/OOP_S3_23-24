package ObserverPattern;

public interface Investor {
    String getName();
    Strategy adaptStrategy();
    void update(String symbol, double newPrice);
    
}
