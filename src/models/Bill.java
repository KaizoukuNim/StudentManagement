package models;

public class Bill {

    int admission_fee;
    int monthly_fee;
    int total;

    public Bill(int admission_fee, int monthly_fee, int total) {
        this.admission_fee = admission_fee;
        this.monthly_fee = monthly_fee;
        this.total = total;
    }

    public int getAdmission_fee() {
        return admission_fee;
    }

    public void setAdmission_fee(int admission_fee) {
        this.admission_fee = admission_fee;
    }

    public int getMonthly_fee() {
        return monthly_fee;
    }

    public void setMonthly_fee(int monthly_fee) {
        this.monthly_fee = monthly_fee;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
