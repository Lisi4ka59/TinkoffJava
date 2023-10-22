package edu.hw2.task4;

public final class CallingInfoFunction {

    private CallingInfoFunction() {

    }

    public static final String MESSAGE = "no one called this method";

    public static CallingInfo callingInfo(String methodName) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        for (StackTraceElement element : stackTrace) {
            if (element.getMethodName().equals(methodName)) {
                return new CallingInfo(element.getClassName(), element.getMethodName());
            }
        }
        return new CallingInfo(MESSAGE, methodName);
    }


}
