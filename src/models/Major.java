package models;

public class Major {
    private String major_faculty;
    private String major_subject;

    public Major(String major_faculty, String major_subject) {
        this.major_faculty = major_faculty;
        this.major_subject = major_subject;

    }

    public String getMajor_faculty() {
        return major_faculty;
    }

    public void setMajor_faculty(String major_faculty) {
        this.major_faculty = major_faculty;
    }

    public String getMajor_subject() {
        return major_subject;
    }

    public void setMajor_subject(String major_subject) {
        this.major_subject = major_subject;
    }
}
