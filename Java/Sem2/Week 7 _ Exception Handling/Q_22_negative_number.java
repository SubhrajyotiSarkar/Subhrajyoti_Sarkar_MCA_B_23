class NotPositiveException extends Exception {
    public NotPositiveException(String message) {
        super(message);
    }
}

 class Q_22_negative_number {
    public static void checkNumber(int number) throws NotPositiveException {
        if (number <= 0) {
            throw new NotPositiveException("Number is not positive.");
        } else {
            System.out.println(number + " is a positive number.");
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5); 
        } catch (NotPositiveException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
