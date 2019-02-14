package com.sitech.echn.springboot.dao.model;

import java.io.Serializable;

public class MalltEnterpriceInfo implements Serializable {

    private Integer id;

    private String networkElementNumber;

    private String networkElementName;

    private String engineRoomName;

    private String engineFloorName;

    private String deviceModel;

    private String deviceAddress;

    private String district;

    private String street;

    private String buildingName;

    private String bureauBoundary;

    private String linkConfiged;

    private String parkPortAssigned;

    private String parkPortOccupied;

    private String enterpricePortAssigned;

    private String enterpricePortOccupied;

    private String resourceCanOpen;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNetworkElementNumber() {
        return networkElementNumber;
    }

    public void setNetworkElementNumber(String networkElementNumber) {
        this.networkElementNumber = networkElementNumber;
    }

    public String getNetworkElementName() {
        return networkElementName;
    }

    public void setNetworkElementName(String networkElementName) {
        this.networkElementName = networkElementName;
    }

    public String getEngineRoomName() {
        return engineRoomName;
    }

    public void setEngineRoomName(String engineRoomName) {
        this.engineRoomName = engineRoomName;
    }

    public String getEngineFloorName() {
        return engineFloorName;
    }

    public void setEngineFloorName(String engineFloorName) {
        this.engineFloorName = engineFloorName;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceAddress() {
        return deviceAddress;
    }

    public void setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBureauBoundary() {
        return bureauBoundary;
    }

    public void setBureauBoundary(String bureauBoundary) {
        this.bureauBoundary = bureauBoundary;
    }

    public String getLinkConfiged() {
        return linkConfiged;
    }

    public void setLinkConfiged(String linkConfiged) {
        this.linkConfiged = linkConfiged;
    }

    public String getParkPortAssigned() {
        return parkPortAssigned;
    }

    public void setParkPortAssigned(String parkPortAssigned) {
        this.parkPortAssigned = parkPortAssigned;
    }

    public String getParkPortOccupied() {
        return parkPortOccupied;
    }

    public void setParkPortOccupied(String parkPortOccupied) {
        this.parkPortOccupied = parkPortOccupied;
    }

    public String getEnterpricePortAssigned() {
        return enterpricePortAssigned;
    }

    public void setEnterpricePortAssigned(String enterpricePortAssigned) {
        this.enterpricePortAssigned = enterpricePortAssigned;
    }

    public String getEnterpricePortOccupied() {
        return enterpricePortOccupied;
    }

    public void setEnterpricePortOccupied(String enterpricePortOccupied) {
        this.enterpricePortOccupied = enterpricePortOccupied;
    }

    public String getResourceCanOpen() {
        return resourceCanOpen;
    }

    public void setResourceCanOpen(String resourceCanOpen) {
        this.resourceCanOpen = resourceCanOpen;
    }
}