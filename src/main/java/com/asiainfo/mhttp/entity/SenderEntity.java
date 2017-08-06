package com.asiainfo.mhttp.entity;

/**
 * Created by renshunyu on 2017/7/23.
 */
public class SenderEntity {
    String string;



    public void setString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SenderEntity)) return false;

        SenderEntity that = (SenderEntity) o;

        return getString() != null ? getString().equals(that.getString()) : that.getString() == null;
    }

    @Override
    public int hashCode() {
        return getString() != null ? getString().hashCode() : 0;
    }
}
