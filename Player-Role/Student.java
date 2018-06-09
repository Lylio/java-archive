public class Student {

    String attendanceValue, levelValue;
    Level level;
    Attendance attendance;

    public Student(String attendance, String level) {
        attendanceValue = attendance;
        levelValue = level;
    }

    public void createRoles() {
        if(attendanceValue.equalsIgnoreCase("fulltime")) {
            attendance = new FullTime();
        } else if(attendanceValue.equalsIgnoreCase("parttime")) {
            attendance = new PartTime();
        }

        if(levelValue.equalsIgnoreCase("undergraduate")) {
            level = new Undergraduate();
        } else if(levelValue.equalsIgnoreCase("postgraduate")) {
            level = new Postgraduate();
        }
    }
}
