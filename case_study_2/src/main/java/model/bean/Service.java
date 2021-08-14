package model.bean;

public class Service {
    private int id;
    private String name;
    private int are;
    private String cost;
    private int maxPeople;
    private String rendType;
    private String serviceType;
    private String standandRoom;
    private String descriptionOtherConvenience;
    private String poolArea;
    private int numberOfFloor;


    public Service() {
    }

    public Service(int id, String name, int are, String cost, int maxPeople, String rendType, String serviceType, String standandRoom, String descriptionOtherConvenience, String poolArea, int numberOfFloor) {
        this.id = id;
        this.name = name;
        this.are = are;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rendType = rendType;
        this.serviceType = serviceType;
        this.standandRoom = standandRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public Service(String name, int are, String cost, int maxPeople, String rendType, String serviceType, String standandRoom, String descriptionOtherConvenience, String poolArea, int numberOfFloor) {
        this.name = name;
        this.are = are;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rendType = rendType;
        this.serviceType = serviceType;
        this.standandRoom = standandRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAre() {
        return are;
    }

    public void setAre(int are) {
        this.are = are;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRendType() {
        return rendType;
    }

    public void setRendType(String rendType) {
        this.rendType = rendType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStandandRoom() {
        return standandRoom;
    }

    public void setStandandRoom(String standandRoom) {
        this.standandRoom = standandRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", are=" + are +
                ", cost='" + cost + '\'' +
                ", maxPeople=" + maxPeople +
                ", rendType='" + rendType + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", standandRoom='" + standandRoom + '\'' +
                ", descriptionOtherConvenience='" + descriptionOtherConvenience + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}
