package com.tanat.smssample;

import android.telephony.SmsManager;

/**
 * Constants helper class
 */

public class SmsHelper {

    public static final String SMS_CONDITION = "Some condition";
    public static final String[] SMS_ERRORS = new String[]{"Ошибка N3", "Error N35", "GL N3", "Заказ N5", "HT N14", "MMT N15", "Успешно  N7"};

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return android.util.Patterns.PHONE.matcher(phoneNumber).matches();
    }

    public static void sendDebugSms(String number, String smsBody) {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(number, null, smsBody, null, null);
    }
}
