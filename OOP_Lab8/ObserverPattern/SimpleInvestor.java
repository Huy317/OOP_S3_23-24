package ObserverPattern;

public class SimpleInvestor implements Investor{
    String name;
    Strategy strategy;

    public SimpleInvestor(String name) {
        this.name = name;
        this.strategy = Strategy.MonitorOnly;
    }
    @Override
    public Strategy adaptStrategy() {
        return strategy;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(String symbol, double newPrice) {
        System.out.println(name +" has been notified of " + symbol + "'s price changed to: $" + newPrice);
        if (newPrice < 50){
            this.strategy = Strategy.HedgingStrategies;
            System.out.println(" and changed strategy to " +this.strategy);
        }else if (newPrice > 200){
            this.strategy = Strategy.QuickTransactions;
            System.out.println(" and changed strategy to " +this.strategy);
        }else {
            System.out.println(" and decided to do nothing");
        }
    }
    
}
