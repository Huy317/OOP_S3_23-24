package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        Stock appleStock = new ConcreteStock("APPLE", 100);
        Stock dellStock = new ConcreteStock("DELL", 100);
    
        Investor tomInvestor = new SimpleInvestor("Tom");
        Investor johnInvestor = new SimpleInvestor("John");
        Investor maryInvestor = new SimpleInvestor("Mary");
        
        appleStock.addObserver(tomInvestor);
        appleStock.addObserver(johnInvestor);
        dellStock.addObserver(maryInvestor);

        appleStock.notifyInvestors(100);
        appleStock.notifyInvestors(40d);
        appleStock.notifyInvestors(10d);
        appleStock.notifyInvestors(5d);
        dellStock.notifyInvestors(300);
        dellStock.notifyInvestors(200d);

    }

}
