package com.example.demo.data;

import java.sql.Date;

public interface ApartmentInterface {
    public int getId();

    public void setId(int id);

    public String getName();

    public void setName(String name);

    public String getAddress();

    public void setAddress(String address);

    public String getSalesrep();

    public void setSalesrep(String salesrep);

    public float getFloorarea();

    public void setFloorarea(float floorarea);

    public Date getRegisterdate();

    public void setRegisterdate(Date registerdate);
}
