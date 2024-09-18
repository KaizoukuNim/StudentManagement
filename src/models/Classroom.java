package models;

public class Classroom {

    int class_number;
    String classname;
    boolean tv;
    boolean ac;

    public int getClass_number() {
        return class_number;
    }

    public void setClass_number(int class_number) {
        this.class_number = class_number;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public Classroom(int class_number, String classname, boolean tv, boolean ac) {
        this.class_number = class_number;
        this.classname = classname;
        this.tv = tv;
        this.ac = ac;


    }
}
