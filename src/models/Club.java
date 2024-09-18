package models;

public class Club {
    String club_type;
    String club_name;
    String club_address;
    String club_teacher;

    public Club(String club_type, String club_name, String club_address, String club_teacher) {
        this.club_type = club_type;
        this.club_name = club_name;
        this.club_address = club_address;
        this.club_teacher = club_teacher;
    }

    public String getClub_type() {
        return club_type;
    }

    public void setClub_type(String club_type) {
        this.club_type = club_type;
    }

    public String getClub_name() {
        return club_name;
    }

    public void setClub_name(String club_name) {
        this.club_name = club_name;
    }

    public String getClub_address() {
        return club_address;
    }

    public void setClub_address(String club_address) {
        this.club_address = club_address;
    }

    public String getClub_teacher() {
        return club_teacher;
    }

    public void setClub_teacher(String club_teacher) {
        this.club_teacher = club_teacher;
    }
}
