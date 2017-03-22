package zmtec.userinfo;

/**
 * Description:
 * Copyright  : Copyright (c) 2015
 * Company    : 元征科技
 * Author     : peakfa@163.com
 * Date       : 2017/3/22 22:43
 */

public class UserInfo {
    private String name,date;
    private int  idInfo;

    public UserInfo(String name, String date, int idInfo) {
        this.name = name;
        this.date = date;
        this.idInfo = idInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIdInfo() {
        return idInfo;
    }

    public void setIdInfo(int idInfo) {
        this.idInfo = idInfo;
    }
}
