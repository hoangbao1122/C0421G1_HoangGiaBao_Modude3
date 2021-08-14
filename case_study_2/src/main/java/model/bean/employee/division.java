package model.bean.employee;

public class division {
    private int idDi;
    private String name;

    public division(){

    }

    public division(int idDi, String name) {
        this.idDi = idDi;
        this.name = name;
    }

    public int getIdDi() {
        return idDi;
    }

    public void setIdDi(int idDi) {
        this.idDi = idDi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
