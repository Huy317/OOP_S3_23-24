package ObserverPattern;
import java.util.ArrayList;
public class ConcreteStock implements Stock {
    private String symbol;
    private double price;
    private ArrayList<Investor> investors = new ArrayList<Investor>();

    public ConcreteStock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }
    @Override
    public void addObserver(Investor investor) {
        this.investors.add(investor);
    }

    @Override
    public void notifyInvestors(double newPrice) {
        price = newPrice;
        for (Investor investor : investors) {
            investor.update(symbol, newPrice);
        }
    }

    @Override
    public void removeObserver(Investor investor) {
        this.investors.remove(investor);
    }
    
}
