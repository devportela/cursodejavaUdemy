package excecoes.application;

import java.sql.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNuber;
    private Date checkIn;
    private Date checkOut;

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNuber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    public Date getCheckIn() {
        return checkIn;
    }


    public Date getCheckOut() {
        return checkOut;
    }


    public Integer getRoomNuber() {
        return roomNuber;
    }

    public void setRoomNuber(Integer roomNuber) {
        this.roomNuber = roomNuber;
    }
     public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
         return  TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn,Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    @Override
    public String toString(){
        return "Room"
                +roomNuber
                +", check-in";


    }


}
