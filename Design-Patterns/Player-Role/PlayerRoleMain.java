public class PlayerRoleMain {
    public static void main(String[] args) {

        UniStudent s3654 = new UniStudent("Bertie Bomp", "BSc Physics", "3654", true);
        s3654.setAttendanceRole(new FullTime());
        s3654.setLevelRole(new Undergraduate());

        System.out.println(s3654);
        System.out.println(s3654.getLevelRole());
        System.out.println(s3654.getLevelRole().fees());

        /*Student finishes undergrad course and moves into postgraduate study
        Admin team update his record:
         */
        s3654.setLevelRole(new Postgraduate());
        s3654.setDegree("MSc Physics");

        System.out.println("\n-----------------\n");
        System.out.println(s3654);
        System.out.println(s3654.getLevelRole());
        System.out.println(s3654.getLevelRole().fees());

    }
}
