package com.TayJc;

// Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Main {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "ACe10710314d7e95f4df42576aa8287135";
    public static final String AUTH_TOKEN =
            "9d0a425f7161469223710bf9de4f198a";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+19739013302"), // to
                        new PhoneNumber("+12563716280"), // from
                        "Where's Wallace?")
                .create();

        System.out.println(message.getSid());
    }
}