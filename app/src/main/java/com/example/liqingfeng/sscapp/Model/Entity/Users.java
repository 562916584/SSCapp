package com.example.liqingfeng.sscapp.Model.Entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 用户实体类
 */
public class Users implements Parcelable {
    private int id;
    private String usName;
    private String usPassword;
    private String usAge;
    private String usNickname;
    private String usSex;
    private String usSign;
    private String usClass;
    private String usMajor;
    private String usInstitution;
    private String usRoomid;
    private String usStatus;
    private String usRole;

    public Users()
    {
        super();
    }
    public String getUsSex() {
        return usSex;
    }

    public void setUsSex(String usSex) {
        this.usSex = usSex;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsName() {
        return usName;
    }

    public String getUsAge() {
        return usAge;
    }

    public void setUsAge(String usAge) {
        this.usAge = usAge;
    }

    public String getUsNickname() {
        return usNickname;
    }

    public String getUsSign() {
        return usSign;
    }

    public void setUsSign(String usSign) {
        this.usSign = usSign;
    }

    public String getUsClass() {
        return usClass;
    }

    public void setUsClass(String usClass) {
        this.usClass = usClass;
    }

    public String getUsMajor() {
        return usMajor;
    }

    public void setUsMajor(String usMajor) {
        this.usMajor = usMajor;
    }

    public String getUsInstitution() {
        return usInstitution;
    }

    public void setUsInstitution(String usInstitution) {
        this.usInstitution = usInstitution;
    }

    public String getUsRoomid() {
        return usRoomid;
    }

    public void setUsRoomid(String usRoomid) {
        this.usRoomid = usRoomid;
    }

    public String getUsStatus() {
        return usStatus;
    }

    public void setUsStatus(String usStatus) {
        this.usStatus = usStatus;
    }

    public String getUsRole() {
        return usRole;
    }

    public void setUsRole(String usRole) {
        this.usRole = usRole;
    }

    public Users(String usName, String usPassword, String usAge,
                 String usNickname, String usSign, String usClass,
                 String usMajor, String usInstitution,
                 String usRoomid, String usStatus, String usRole) {
        this.usName = usName;
        this.usPassword = usPassword;
        this.usAge = usAge;
        this.usNickname = usNickname;
        this.usSign = usSign;
        this.usClass = usClass;
        this.usMajor = usMajor;
        this.usInstitution = usInstitution;
        this.usRoomid = usRoomid;

        this.usStatus = usStatus;
        this.usRole = usRole;
    }

    public void setUser_ID(int ID)
    {
        this.id=ID;
    }
    public int getUser_ID()
    {
        return id;
    }
    public void setUsName(String usName)
    {
        this.usName=usName;
    }
    public String getUsnName()
    {
        return usName;
    }
    public void setUsNickname(String usNickname)
    {
        this.usNickname=usNickname;
    }
    public String getUsnNickname()
    {
        return usNickname;
    }
    public String getUsPassword()
    {
        return usPassword;
    }
    public void setUsPassword(String usPassword)
    {
        this.usPassword=usPassword;
    }

    //序列化实体类
    public static final Parcelable.Creator<Users> CREATOR =new Creator<Users>() {
        @Override
        public Users createFromParcel(Parcel parcel) {
            Users users=new Users();
            users.id=parcel.readInt();
            users.usName=parcel.readString();
            users.usNickname=parcel.readString();
            users.usPassword=parcel.readString();
            return users;
        }

        @Override
        public Users[] newArray(int i) {
            return new Users[i];
        }
    };
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(usName);
        parcel.writeString(usNickname);
        parcel.writeString(usPassword);
    }
}
