public class CinemaTicket {
    String seatType;
    int showTime;
    double basePrice;
    public CinemaTicket(String seatType,int showTime,double basePrice){
        this.seatType=seatType;
        this.showTime=showTime;
        this.basePrice=basePrice;
    }

    public String getSeatType() {
        return seatType;
    }

    public int getShowTime() {
        return showTime;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
