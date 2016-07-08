package parknshop.parknshopapp.Utils;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.OneActivity;
import parknshop.parknshopapp.R;

/**
 * Created by kwongyuenpan on 30/3/16.
 */
public class AlarmReceiver extends BroadcastReceiver {

    public static final String INTENT_ACTION = "parknshop.parknshopapp.ALARM";
    public static final String INTENT_DEVICE_BOOT_ACTION = "android.intent.action.BOOT_COMPLETED";

    public static final String START_ALARM = "START_ALARM";
    public static final String EXECUTE_ALARM = "EXECUTE_ALARM";

    @Override
    public void onReceive(Context context, Intent intent) {

        String type = intent.getExtras().getString("type");

        if(intent.getAction().equals(INTENT_ACTION)){
            if(type.equals(START_ALARM)){
                String pk = intent.getExtras().getString("pk", "");

                // Get set alarm time
                long dateTime = Hawk.get(pk + "_" + GlobalConstant.REMINDER_SET_DATE);

                Intent alarmIntent = new Intent(INTENT_ACTION);
                alarmIntent.putExtra("type", EXECUTE_ALARM);
                alarmIntent.putExtra("pk", pk);

                PendingIntent pendingIntent = PendingIntent.getBroadcast(context, pk.hashCode(), alarmIntent, 0);
                AlarmManager manager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
                manager.set(AlarmManager.RTC_WAKEUP, dateTime, pendingIntent);

            }else if(type.equals(EXECUTE_ALARM)){
                ArrayList<String> pkList = Hawk.get(GlobalConstant.REMINDER_PK_LIST, new ArrayList<String>());
                String pk = intent.getExtras().getString("pk", "");

                sendNotification(context, context.getResources().getString(R.string.grocery_list_alarm_msg), pk);

                // Get set alarm type
                // 0 = never
                // 1 = everyday
                // 2 = every week
                // 3 = every month
                // 4 = every year

                int repeatTime = Hawk.get(pk + "_" + GlobalConstant.REMINDER_REPEAT_TYPE, 0);
                // Get set alarm time
                long dateTime = Hawk.get(pk + "_" + GlobalConstant.REMINDER_SET_DATE, new Date().getTime());
                Date date = new Date();
                date.setTime(dateTime);
                final Calendar c = Calendar.getInstance();
                c.setTime(date);

                switch(repeatTime){
                    case 1:
                        c.add(Calendar.DAY_OF_WEEK, 1);
                        break;
                    case 2:
                        c.add(Calendar.WEEK_OF_MONTH, 1);
                        break;
                    case 3:
                        c.add(Calendar.MONTH, 1);
                        break;
                    case 4:
                        c.add(Calendar.YEAR, 1);
                        break;
                    case 0:
                        // never repeat

                        // Remove the pk in the pk list
                        if(pkList.contains(pk)) {
                            pkList.remove(pk);
                            Hawk.remove(pk+"_"+GlobalConstant.REMINDER_ON_OFF);
                            Hawk.remove(pk+"_"+GlobalConstant.REMINDER_SET_DATE);
                            Hawk.remove(pk+"_"+GlobalConstant.REMINDER_REPEAT_TYPE);
                        }
                        Hawk.put(GlobalConstant.REMINDER_PK_LIST, pkList);
                        return;
                }

                // Save next alarm time
                Hawk.put(pk + "_" + GlobalConstant.REMINDER_SET_DATE, c.getTimeInMillis());

                Intent alarmIntent = new Intent(INTENT_ACTION);
                alarmIntent.putExtra("type", START_ALARM);
                alarmIntent.putExtra("pk", pk);
                context.sendBroadcast(alarmIntent);
            }
        }else if(intent.getAction().equals(INTENT_DEVICE_BOOT_ACTION)){
            // Restart Alarm when the device reboot

            // Reset all saved pk alarm
            ArrayList<String> pkList = Hawk.get(GlobalConstant.REMINDER_PK_LIST, new ArrayList<String>());
            for(String pk : pkList){
                Intent alarmIntent = new Intent(AlarmReceiver.INTENT_ACTION);
                alarmIntent.putExtra("type", AlarmReceiver.START_ALARM);
                alarmIntent.putExtra("pk", pk);
                context.sendBroadcast(alarmIntent);
            }

        }

    }

    private void sendNotification(Context context, String message, String pk) {

        int msgId = new Random().nextInt(Integer.MAX_VALUE);

        Intent intent = new Intent(context, OneActivity.class);
        intent.setData((Uri.parse("custom://"+System.currentTimeMillis()))); // For multiple notification
        intent.putExtra("goTo", "GROCERY_LIST_CAT");
        intent.putExtra("PK", pk);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0 /* Request code */, intent,
                PendingIntent.FLAG_ONE_SHOT);

        int bgColor = context.getResources().getColor(R.color.color_primary);
        Bitmap largeIcon = BitmapFactory.decodeResource(context.getResources(),
                R.mipmap.app_icon_2);

        Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(context)
                .setSmallIcon(R.mipmap.push_icon)
                .setLargeIcon(largeIcon)
                .setColor(bgColor)
                .setContentTitle(context.getResources().getString(R.string.app_name))
                .setContentText(message)
                .setAutoCancel(true)
                .setSound(defaultSoundUri)
                .setContentIntent(pendingIntent);

        notificationBuilder.setStyle(new NotificationCompat.BigTextStyle()
                .bigText(message));

        NotificationManager notificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        try{
            notificationBuilder.build().contentView.setImageViewResource(android.R.id.icon, R.mipmap.app_icon);
        } catch (Exception e) {
        }

        notificationManager.notify(msgId, notificationBuilder.build());
    }
}
