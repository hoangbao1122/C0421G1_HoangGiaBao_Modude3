package model.bean.employee;

public class Employee {
    private int idEmp;
    private String nameEmp;
    private String birthdayEmp;
    private String idCardEmp;
    private String salaryEmp;
    private String phoneEmp;
    private String emailEmp;
    private String addressEmp;
    private int positionEmp;
    private int educationEmp;
    private int divisionEmp;
    private String userNameEmp;

    public Employee(){

    }

    public Employee(int idEmp, String nameEmp, String birthdayEmp, String idCardEmp, String salaryEmp, String phoneEmp, String emailEmp, String addressEmp, int positionEmp, int educationEmp, int divisionEmp, String userNameEmp) {
        this.idEmp = idEmp;
        this.nameEmp = nameEmp;
        this.birthdayEmp = birthdayEmp;
        this.idCardEmp = idCardEmp;
        this.salaryEmp = salaryEmp;
        this.phoneEmp = phoneEmp;
        this.emailEmp = emailEmp;
        this.addressEmp = addressEmp;
        this.positionEmp = positionEmp;
        this.educationEmp = educationEmp;
        this.divisionEmp = divisionEmp;
        this.userNameEmp = userNameEmp;
    }

    public Employee(String nameEmp, String birthdayEmp, String idCardEmp, String salaryEmp, String phoneEmp, String emailEmp, String addressEmp, int positionEmp, int educationEmp, int divisionEmp, String userNameEmp) {
        this.nameEmp = nameEmp;
        this.birthdayEmp = birthdayEmp;
        this.idCardEmp = idCardEmp;
        this.salaryEmp = salaryEmp;
        this.phoneEmp = phoneEmp;
        this.emailEmp = emailEmp;
        this.addressEmp = addressEmp;
        this.positionEmp = positionEmp;
        this.educationEmp = educationEmp;
        this.divisionEmp = divisionEmp;
        this.userNameEmp = userNameEmp;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public String getNameEmp() {
        return nameEmp;
    }

    public void setNameEmp(String nameEmp) {
        this.nameEmp = nameEmp;
    }

    public String getBirthdayEmp() {
        return birthdayEmp;
    }

    public void setBirthdayEmp(String birthdayEmp) {
        this.birthdayEmp = birthdayEmp;
    }

    public String getIdCardEmp() {
        return idCardEmp;
    }

    public void setIdCardEmp(String idCardEmp) {
        this.idCardEmp = idCardEmp;
    }

    public String getSalaryEmp() {
        return salaryEmp;
    }

    public void setSalaryEmp(String salaryEmp) {
        this.salaryEmp = salaryEmp;
    }

    public String getPhoneEmp() {
        return phoneEmp;
    }

    public void setPhoneEmp(String phoneEmp) {
        this.phoneEmp = phoneEmp;
    }

    public String getEmailEmp() {
        return emailEmp;
    }

    public void setEmailEmp(String emailEmp) {
        this.emailEmp = emailEmp;
    }

    public String getAddressEmp() {
        return addressEmp;
    }

    public void setAddressEmp(String addressEmp) {
        this.addressEmp = addressEmp;
    }

    public int getPositionEmp() {
        return positionEmp;
    }

    public void setPositionEmp(int positionEmp) {
        this.positionEmp = positionEmp;
    }

    public int getEducationEmp() {
        return educationEmp;
    }

    public void setEducationEmp(int educationEmp) {
        this.educationEmp = educationEmp;
    }

    public int getDivisionEmp() {
        return divisionEmp;
    }

    public void setDivisionEmp(int divisionEmp) {
        this.divisionEmp = divisionEmp;
    }

    public String getUserNameEmp() {
        return userNameEmp;
    }

    public void setUserNameEmp(String userNameEmp) {
        this.userNameEmp = userNameEmp;
    }
}
