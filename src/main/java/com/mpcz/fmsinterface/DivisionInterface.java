package com.mpcz.fmsinterface;

public interface DivisionInterface extends BeanInterface {

    public long getId();

    public void setId(long id);

    public String getCode();

    public void setCode(String code);

    public String getName();

    public void setName(String name);

    public CircleInterface getCircle();

    public void setCircle(CircleInterface circle);

}
