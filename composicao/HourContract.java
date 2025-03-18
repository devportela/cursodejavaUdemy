package composicao;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;


    public HourContract(){
    }

    public HourContract(Date date,Double valuePerhour,Integer hours){

        this.date = date;
        this.valuePerhour = valuePerhour;
        this.hours = hours;
    }

}

