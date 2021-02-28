package Java.Foods;

public class Money {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents){
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money add(Money money){
        int totalCents = this.cents + money.cents;
        int dollars = this.dollars + money.dollars + (totalCents/100);
        return new Money(dollars, totalCents % 100);
    }

    public Money multiply(float percent){
        int cents = Math.round(this.cents * percent);
        int dollars = Math.round(this.dollars * percent) + (cents/100);
        return new Money(cents, dollars);
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(!(obj instanceof Money)) return false;
        final Money ob = (Money) obj;
        return this.dollars == ob.dollars && this.cents == ob.cents;
    }

    @Override
    public int hashCode() {
        return (this.dollars * 100) + this.cents;
    }

    @Override
    public String toString(){
        return String.format("$%d.%d", dollars, cents);
    }

}
