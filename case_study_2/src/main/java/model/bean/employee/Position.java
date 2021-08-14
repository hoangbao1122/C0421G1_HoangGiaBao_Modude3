package model.bean.employee;

public class Position {
    private int idPos;
    private String namePos;

    public Position(){

    }

    public Position(int idPos, String namePos) {
        this.idPos = idPos;
        this.namePos = namePos;
    }

    public int getIdPos() {
        return idPos;
    }

    public void setIdPos(int idPos) {
        this.idPos = idPos;
    }

    public String getNamePos() {
        return namePos;
    }

    public void setNamePos(String namePos) {
        this.namePos = namePos;
    }
}
