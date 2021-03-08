package com.bishe.smartcommunity.smartcommunitycommon.utils;

public class R {
    private int code;
    private Object object;
    private String msg;

    public int getCode(){return code;}
    public Object getObject(){return object;}
    public String getMsg(){return msg;}

    public void setCode(int code){this.code=code;}
    public void setObject(Object object){this.object=object;}
    public void setMsg(String msg){this.msg=msg;}

    private R(int code,Object object,String msg){
        super();
        this.code=code;
        this.object=object;
        this.msg=msg;
    }

    public static R success(Object object){
        return new R(0,object,"");
    }

    public static R message(int code,Object object,String msg){
        return new R(code,object,msg);
    }

    public static R error(String msg){
        return new R(-1,"",msg);
    }
}
