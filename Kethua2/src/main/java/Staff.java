import java.lang.Math;
import java.util.Arrays;

public class Staff extends Person {

    private String school;
    private double pay;
    /**
     *  Comment.
     */

    public Staff(String name, String address, String school, double pay) {
        super(name, address);

        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }


    private void display() {
        System.out.print(toString());
    }

    /**
     *  Comment.
     * @return a string.
     */

    public String toString() {
        return "Staff["
                + super.toString()
                + ",school="
                + school
                + ",pay="
                + pay
                + "]";
    }

}