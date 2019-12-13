public class Zoo {
    
    private String name;
    private String location;
    private double size;
    private double lastYearCost;
    private int lastYearVisitors;
    private double ticketPrice;
    private double annualProfit;
    
    // Default constructor
    public Zoo(){
    
    }
    
    // Overloaded Constructor
    public Zoo(String name, String location, double size, double lastYearCost, 
            int lastYearVisitors, double ticketPrice, double annualProfit){
            this.name = name;
            this.location = location;
            this.size = size;
            this.lastYearCost = lastYearCost;
            this.lastYearVisitors = lastYearVisitors;
            this.ticketPrice = ticketPrice;
            this.annualProfit = annualProfit;   
            
            this.computeAnnualProfit();
    }
    
    // Mutator for name
    public void setName(String name) {
        this.name = name;
    } 
    
    // Accessor for name
    public String getName(){ 
        return name;
    }
    
    // Mutator for location
    public void setLocation(String location){
        this.location = location; 
    }
    
    // Accessor for location
    public String getLocation(){ 
        return location;
    }
    
    // Output: A string with line breaks 
    // Zoo: LA Zoo
    // Location: Los Angeles
    // Size: 10
    public String print(){
        String out = "Zoo: ";
        out = out.concat(name);
        out = out.concat("\nLocation: ");
        out = out.concat(location);
        out = out.concat("\nSize: ");
        out = out.concat(Double.toString(size));
        
        return out;    
    }
    
    
    private double computeIncome(){
        return ticketPrice * lastYearVisitors;
    }
    
    private void computeAnnualProfit(){
        annualProfit = computeIncome() - lastYearCost;
    }
    
    public double getAnnualProfit(){
        return annualProfit;
    }
    
        
}
