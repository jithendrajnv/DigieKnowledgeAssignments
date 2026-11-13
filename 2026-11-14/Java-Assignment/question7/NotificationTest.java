package Batch10.AssignmentNov1st.question7;

public class NotificationTest {

    public static void main(String[] args) {
        Notification sms = new SMSNotification();
        Notification email = new EmailNotification();

        sms.send("Good morning");
        email.send("Good night");
    }
}
