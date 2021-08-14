package model.bean.Customer;

public class CustomerType {
    private int cusTypeId;
    private String nameType;

    public CustomerType(){

    }

    public CustomerType(int cusTypeId, String nameType) {
        this.cusTypeId = cusTypeId;
        this.nameType = nameType;
    }

    public int getCusTypeId() {
        return cusTypeId;
    }

    public void setCusTypeId(int cusTypeId) {
        this.cusTypeId = cusTypeId;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    @Override
    public String toString() {
        return "CustomerType{" +
                "cusTypeId=" + cusTypeId +
                ", nameType='" + nameType + '\'' +
                '}';
    }
}
