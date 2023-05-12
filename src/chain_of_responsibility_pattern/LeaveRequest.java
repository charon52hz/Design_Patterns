package chain_of_responsibility_pattern;

public class LeaveRequest {
    private String leave_person;
    private int days;

    public LeaveRequest(String leave_person, int days) {
        this.leave_person = leave_person;
        this.days = days;
    }

    public String getLeave_person() {
        return leave_person;
    }

    public void setLeave_person(String leave_person) {
        this.leave_person = leave_person;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
