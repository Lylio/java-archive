public class PlayerRoleMain {

    public static void main(String[] args) {

        Student student0912407c = new Student("FULLTIME", "postgraduate");

        student0912407c.createRoles();

        student0912407c.attendance.attendanceStatus();
        student0912407c.level.levelStatus();
    }
}
