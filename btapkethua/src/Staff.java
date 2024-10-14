public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * constructor.
     * @param name Ten person.
     * @param address Dia chi.
     * @param school Truong hoc.
     * @param pay So tien thanh toan.
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

    @Override
    public String toString() {
        String tempName = "Staff[Person[name=" + this.getName();
        String tempAddress = ",address=" + this.getAddress();
        String tempSchool =  "],school=" + this.school;
        String tempPay = ",pay=" + this.pay + "]";
        return tempName + tempAddress + tempSchool + tempPay;
    }
}
