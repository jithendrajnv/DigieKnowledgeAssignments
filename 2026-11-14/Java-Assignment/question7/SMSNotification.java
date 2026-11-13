package Batch10.AssignmentNov1st.question7;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("sms notification sent with message: " + message);
    }
}
