package Day24;

class Notification {
    String recipient, message;

    Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message   = message;
    }

    void send() {
        System.out.println("Notification to " + recipient + ": " + message);
    }

    String getLog() {
        return "[" + getClass().getSimpleName() + "] → " + recipient;
    }
}

class EmailNotification extends Notification {
    EmailNotification(String email, String message) { super(email, message); }

    @Override
    void send() {
        System.out.println("📧 Email to " + recipient + ": " + message);
    }
}

class SMSNotification extends Notification {
    SMSNotification(String phone, String message) { super(phone, message); }

    @Override
    void send() {
        System.out.println("📱 SMS to " + recipient + ": " + message);
    }
}

class PushNotification extends Notification {
    PushNotification(String deviceId, String message) { super(deviceId, message); }

    @Override
    void send() {
        System.out.println("🔔 Push to " + recipient + ": " + message);
    }
}

class NotificationService {
    int sentCount = 0;

    void sendAll(Notification[] notifications) {
        for (Notification n : notifications) {
            n.send();         // polymorphism — right send() called at runtime
            sentCount++;
        }
        System.out.println("Sent " + sentCount + " notifications successfully.");
    }
}

public class NotificationDemo {
    public static void main(String[] args) {
        Notification[] batch = {
                new EmailNotification("arjun@mail.com",   "Welcome to Java!"),
                new SMSNotification("+977-9841234567",    "OTP: 4521"),
                new PushNotification("device#A12",        "New message received")
        };

        new NotificationService().sendAll(batch);
    }
}