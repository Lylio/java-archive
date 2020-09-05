public class UniStudent {

    private String name;
    private String degree;
    private String studentId;
    private AttendanceRole attendanceRole;
    private LevelRole levelRole;
    private boolean hasPaidFees;

    public UniStudent(String name, String degree, String studentId, boolean hasPaidFees) {
        this.name = name;
        this.degree = degree;
        this.studentId = studentId;
        this.hasPaidFees = hasPaidFees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public AttendanceRole getAttendanceRole() {
        return attendanceRole;
    }

    public void setAttendanceRole(AttendanceRole attendanceRole) {
        this.attendanceRole = attendanceRole;
    }

    public LevelRole getLevelRole() {
        return levelRole;
    }

    public void setLevelRole(LevelRole levelRole) {
        this.levelRole = levelRole;
    }

    public boolean isHasPaidFees() {
        return hasPaidFees;
    }

    public void setHasPaidFees(boolean hasPaidFees) {
        this.hasPaidFees = hasPaidFees;
    }

    @Override
    public String toString() {
        return "UniStudent{" +
                "name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", studentId='" + studentId + '\'' +
                ", attendanceRole=" + attendanceRole +
                ", levelRole=" + levelRole +
                ", hasPaidFees=" + hasPaidFees +
                '}';
    }
}
