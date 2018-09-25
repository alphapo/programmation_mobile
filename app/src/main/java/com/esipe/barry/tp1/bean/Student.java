package com.esipe.barry.tp1.bean;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable{
    String name;
    String surname;
    String sexe;
    String groupe;
    String birthDay;
    String mail;
    String redoublant;

    public Student(Parcel in) {
        name = in.readString();
        surname = in.readString();
        sexe = in.readString();
        groupe = in.readString();
        birthDay = in.readString();
        mail = in.readString();
        redoublant = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(surname);
        dest.writeString(sexe);
        dest.writeString(groupe);
        dest.writeString(birthDay);
        dest.writeString(mail);
        dest.writeString(redoublant);
    }
}
