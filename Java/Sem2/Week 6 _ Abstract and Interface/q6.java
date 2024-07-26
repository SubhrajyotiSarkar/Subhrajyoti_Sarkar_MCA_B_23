import java.util.*;

interface department {
    String deptName = "";
    String deptHead = "";

    abstract void Department();
}

class hostel {
    String hostelName, hostelLocation;
    int numberOfRooms;

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public void setHostelLocation(String hostelLocation) {
        this.hostelLocation = hostelLocation;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getHostelName() {
        return hostelName;
    }

    public String getHostelLocation() {
        return hostelLocation;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    void Hostel() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

class student extends hostel implements department {
    String studentName, electiveSubject, deptName, deptHead, hostelName, hostelLocation;
    int regdNo, numberOfRooms;
    double avgMarks;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setElectiveSubject(String electiveSubject) {
        this.electiveSubject = electiveSubject;
    }

    public void setRegdNo(int regdNo) {
        this.regdNo = regdNo;
    }

    public void setAvgMarks(double avgMarks) {
        this.avgMarks = avgMarks;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setDeptHead(String deptHead) {
        this.deptHead = deptHead;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getElectiveSubject() {
        return electiveSubject;
    }

    public int getregdNo() {
        return regdNo;
    }

    public double getAvgMarks() {
        return avgMarks;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getDeptHead() {
        return deptHead;
    }

    public void setData(String studentName, String electiveSubject, int regdNo, double avgMarks, String deptHead,
            String deptName, String hostelName, String hostelLocation, int numberOfRooms) {
        setStudentName(studentName);
        setElectiveSubject(electiveSubject);
        setRegdNo(regdNo);
        setAvgMarks(avgMarks);
        setDeptName(deptName);
        setDeptHead(deptHead);
        super.setHostelName(hostelName);
        super.setHostelLocation(hostelLocation);
        super.setNumberOfRooms(numberOfRooms);
    }

    public void getData() {
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Elective Subject: " + getElectiveSubject());
        System.out.println("Registration Number: " + getregdNo());
        System.out.println("Average Marks: " + getAvgMarks());
        System.out.println("Hostel Name: " + super.getHostelName());
        System.out.println("Hostel Location: " + super.getHostelLocation());
        System.out.println("Number of Rooms: " + super.getNumberOfRooms());
    }

    @Override
    public void Department() {
        System.out.println("Department Name: " + getDeptName());
        System.out.println("Department Head: " + getDeptHead());
    }
}

public class q6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Enter Number of Students: ");
        int n = sc.nextInt();
        student ar[] = new student[n];
        int count = 0;
        while (true) {
            System.out.println("1. Admit New Student");
            System.out.println("2. Migrate a Student");
            System.out.println("3. Details of a Student");
            System.out.println("4. Exit");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    ar[count++] = new student();
                    System.out.println("Enter Student Name: ");
                    String studentName = sc.next();
                    System.out.println("Enter Elective Subject: ");
                    String electiveSubject = sc.next();
                    System.out.println("Enter Registration Number: ");
                    int regdNo = sc.nextInt();
                    System.out.println("Enter Average Marks: ");
                    double avgMarks = sc.nextDouble();
                    System.out.println("Enter Department Name: ");
                    String deptName = sc.next();
                    System.out.println("Enter Department Head: ");
                    String deptHead = sc.next();
                    System.out.println("Enter Hostel Name: ");
                    String hostelName = sc.next();
                    System.out.println("Enter Hostel Location: ");
                    String hostelLocation = sc.next();
                    System.out.println("Enter Number of Rooms: ");
                    int numberOfRooms = sc.nextInt();
                    ar[count - 1].setData(studentName, electiveSubject, regdNo, avgMarks, deptHead, deptName,
                            hostelName, hostelLocation, numberOfRooms);
                    System.out.println("Student Added");
                    break;
                case 2:
                    System.out.println("Enter Registration Number of the Student: ");
                    int oldRegdNo = sc.nextInt();
                    student migrant = null;

                    for (int i = 0; i < count; i++) {
                        if (ar[i].regdNo == oldRegdNo) {
                            migrant = ar[i];
                            ar[i] = null;
                            break;
                        }
                    }

                    if (migrant != null) {
                        while (true) {
                            System.out
                                    .println("Do you want to Change any other Details of this Student?\n1. Yes\n2. No");
                            int x = sc.nextInt();
                            if (x == 1) {
                                System.out.println(
                                        "a. Elective Subject\nb. Registration Number\nc. Average Marks\nd. Department\n");
                                char choice = sc.next().charAt(0);
                                switch (choice) {
                                    case 'a':
                                        System.out.println("Enter New Elective Subject: ");
                                        migrant.setElectiveSubject(sc.next());
                                        break;
                                    case 'b':
                                        System.out.println("Enter Registration Number: ");
                                        migrant.setRegdNo(sc.nextInt());
                                        break;
                                    case 'c':
                                        System.out.println("Enter New Average Marks: ");
                                        migrant.setAvgMarks(sc.nextDouble());
                                        break;
                                    case 'd':
                                        System.out.println("Enter New Department Name: ");
                                        migrant.setDeptName(sc.next());
                                        System.out.println("Enter New Department Head: ");
                                        migrant.setDeptHead(sc.next());
                                        break;
                                }
                            } else {
                                break;
                            }
                        }

                        int newIndex = -1;
                        for (int i = 0; i < count; i++) {
                            if (ar[i] == null) {
                                newIndex = i;
                                break;
                            }
                        }

                        if (newIndex != -1) {
                            ar[newIndex] = migrant;
                            System.out.println("Student Migrated Successfully");
                        } else {
                            System.out.println("No Free Slots are Available Right Now");
                        }
                    } else {
                        System.out.println("Student Not Found");
                    }
                    break;
                case 3:
                    System.out.print("Enter Registration Number: ");
                    int r = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (ar[i].regdNo == r) {
                            ar[i].getData();
                            ar[i].Department();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting!");
                    System.exit(0);
                    break;
            }
        }
    }
}
