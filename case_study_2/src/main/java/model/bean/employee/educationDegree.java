package model.bean.employee;

public class educationDegree {
    private int idEdu;
    private  String nameEdu;

    public educationDegree(){

    }

    public educationDegree(int idEdu, String nameEdu) {
        this.idEdu = idEdu;
        this.nameEdu = nameEdu;
    }

    public int getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(int idEdu) {
        this.idEdu = idEdu;
    }

    public String getNameEdu() {
        return nameEdu;
    }

    public void setNameEdu(String nameEdu) {
        this.nameEdu = nameEdu;
    }
}
