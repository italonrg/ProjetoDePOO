package interfacesNA;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class contract {
    private Integer number;
    private Date data;
    private Double totalValue;
//todo: Quando for fazer asociações de 1 para muitos faça uma lista;
private List<instalmenr> Installment = new ArrayList<>();


    public contract(int number, LocalDate dataAtual, double totalValue) {
    }

    public contract(Integer number, Date data, Double totalValue) {
        this.number = number;
        this.data = data;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<instalmenr> getInstallment() {
        return Installment;
    }
}
