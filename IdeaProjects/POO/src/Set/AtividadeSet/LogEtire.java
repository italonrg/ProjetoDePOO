package Set.AtividadeSet;

import java.util.Date;
import java.util.Objects;

public class LogEtire {
    private String nameUser;
    private Date momento;

    public LogEtire(String nameUser, Date momento) {
        this.nameUser = nameUser;
        this.momento = momento;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogEtire logEtire)) return false;
        return Objects.equals(getNameUser(), logEtire.getNameUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameUser());
    }
}
