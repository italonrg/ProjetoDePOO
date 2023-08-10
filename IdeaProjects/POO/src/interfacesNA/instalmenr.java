package interfacesNA;

import java.time.LocalDate;

public class instalmenr {
    private LocalDate date;
    private  Double ammount;

    public instalmenr() {
    }

    public instalmenr(LocalDate date, Double ammount) {
        this.date = date;
        this.ammount = ammount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmmount() {
        return ammount;
    }

    public void setAmmount(Double ammount) {
        this.ammount = ammount;
    }
}
