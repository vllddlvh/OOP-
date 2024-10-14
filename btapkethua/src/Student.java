public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * constructor.
     * @param name Ten person.
     * @param address Dia chi.
     * @param program Ten khoa hoc.
     * @param year Nam vao hoc.
     * @param fee Hoc phi.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        String tempName = "Student[Person[name=" + this.getName();
        String tempAddress = ",address=" + this.getAddress();
        String tempProgram = "],program=" + this.program;
        String tempYear = ",year=" + this.year;
        String tempFee = ",fee=" + this.fee + "]";
        return tempName + tempAddress + tempProgram + tempYear + tempFee;
    }
}
