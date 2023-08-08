package exception.model;

import exception.exepoinPacks.EXx;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class resevation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    //todo: para que não seja instanciado um novo SimpleDate para cada objeto da classe reservation , coloca-se o static pois vai presisar de apenas 1;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public resevation() {
    }

    public resevation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }
    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();//todo:aqui o check pega o momento em milesegundo e da pra fazer uma operção ainda;
       return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);//todo:esse timeUnit , ele converte todo tipo de unidade de tempo , e bem util;
    }
    public void updateDates(Date checkIn ,Date checkOut) throws EXx {//todo:fazer o checkIn do obejeto receber o "checkIn" do parametro do metodo para isso o this;
//todo: No caso esse "Thows" Serve para propagar por todo o metodo , dizendo que : esse metodo pode lançar uma exeção
        Date checkInn = null;
        Date checkOtt = null;
        Date agora = new Date();
        if (checkInn.before(agora) || checkOtt.before(agora)) {
       throw  new EXx(" as datas não podem ser passadas para datas futuras!!!");

        }
        if (!checkOtt.after(checkInn)) {
            throw  new EXx(" as datas não podem ser passadas para datas futuras!!!");

        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }
    @Override
    public String toString() {
        return " Room"+
                roomNumber+
                " Date of CheckIn "+
                checkIn+
                " Date of CheckOut "+
                checkOut+
                "Resume of reservation "+
                sdf.format(checkIn)+
                ">>>>>"+
                sdf.format(checkOut)+
                ">>>>>"+
                duration()+
                " Nigths";

    }
}
