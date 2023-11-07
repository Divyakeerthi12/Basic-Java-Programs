public class Switchstatements {
    public static void main(String args[]) {
        //Try giving different grades and check the conditions
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Average");
                break;
            case 'E':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

