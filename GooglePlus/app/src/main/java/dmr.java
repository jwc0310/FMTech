import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import com.google.android.apps.photos.phone.PhotosHomeActivity;
import java.util.ArrayList;

public final class dmr
{
  public static final SparseArray<Long> a = new SparseArray();
  private static final long[] b = new long[0];
  private static final Uri c = null;
  
  public static int a()
  {
    return (int)System.currentTimeMillis();
  }
  
  public static Intent a(Context paramContext, int paramInt, Intent paramIntent)
  {
    paramIntent.putExtra("com.google.android.libraries.social.notifications.FROM_NOTIFICATION", true);
    paramIntent.putExtra("skip_interstitials", true);
    if (bgp.a(paramContext, paramInt))
    {
      ikx localikx = new ikx(paramContext);
      ilf localilf = new ilf();
      localilf.c = paramInt;
      localikx.a = localilf;
      localikx.b = paramIntent;
      paramIntent = localikx.a();
    }
    return paramIntent;
  }
  
  public static String a(int paramInt)
  {
    String str = String.valueOf("prefetch_notifications");
    return 11 + String.valueOf(str).length() + str + paramInt;
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    try
    {
      String str = efj.y(paramContext, paramInt);
      NotificationManager localNotificationManager = (NotificationManager)paramContext.getSystemService("notification");
      int[] arrayOfInt = dmq.a;
      int i = arrayOfInt.length;
      for (int j = 0; j < i; j++) {
        localNotificationManager.cancel(str, arrayOfInt[j]);
      }
      hcw.a(paramContext, paramInt);
      return;
    }
    finally {}
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2)
  {
    try
    {
      String str = efj.y(paramContext, paramInt1);
      ((NotificationManager)paramContext.getSystemService("notification")).cancel(str, paramInt2);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public static void a(Context paramContext, int paramInt1, Notification paramNotification, int paramInt2, boolean paramBoolean)
  {
    paramNotification.flags = (0x10 | paramNotification.flags);
    paramNotification.flags = (0x1 | paramNotification.flags);
    paramNotification.flags = (0x8 | paramNotification.flags);
    paramNotification.ledARGB = -1;
    paramNotification.ledOnMS = 500;
    paramNotification.ledOffMS = 2000;
    if ((cux.b(paramContext, paramInt1)) && (!paramBoolean))
    {
      paramNotification.defaults = (0x2 | paramNotification.defaults);
      if ((!cux.d(paramContext, paramInt1)) || (paramBoolean)) {
        break label126;
      }
    }
    label126:
    for (paramNotification.sound = cux.c(paramContext, paramInt1);; paramNotification.sound = null)
    {
      ((NotificationManager)paramContext.getSystemService("notification")).notify(efj.y(paramContext, paramInt1), paramInt2, paramNotification);
      return;
      paramNotification.vibrate = b;
      break;
    }
  }
  
  public static void a(Context paramContext, int paramInt1, Intent paramIntent, fe paramfe, int paramInt2, long paramLong, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    Intent localIntent2;
    if (paramIntent != null)
    {
      paramIntent.putExtra("com.google.android.libraries.social.notifications.updated_version", paramLong);
      paramIntent.putExtra("com.google.android.libraries.social.notifications.NOTIFICATION_READ", paramBoolean1);
      if (!paramArrayList1.isEmpty()) {
        paramIntent.putExtra("com.google.android.libraries.social.notifications.notif_id", (String)paramArrayList1.get(0));
      }
      paramIntent.putStringArrayListExtra("com.google.android.libraries.social.notifications.coalescing_codes", paramArrayList1);
      paramIntent.putStringArrayListExtra("com.google.android.libraries.social.notifications.ext_ids", paramArrayList2);
      ArrayList localArrayList = new ArrayList(1);
      localArrayList.add(Integer.valueOf(paramInt2));
      paramIntent.putExtra("com.google.android.libraries.social.notifications.notif_types", localArrayList);
      paramIntent.setPackage(paramContext.getPackageName());
      if (paramfe != null) {
        if (paramfe.a.size() == 0)
        {
          if (paramBoolean2) {
            break label181;
          }
          localIntent2 = efj.b(paramContext, paramInt1);
        }
      }
    }
    for (;;)
    {
      if (localIntent2 != null)
      {
        Intent localIntent3 = a(paramContext, paramInt1, localIntent2);
        paramfe.a.add(localIntent3);
      }
      paramIntent.putExtra("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION", paramBoolean4);
      Intent localIntent1 = a(paramContext, paramInt1, paramIntent);
      paramfe.a.add(localIntent1);
      return;
      label181:
      if (paramBoolean3)
      {
        localIntent2 = new Intent(paramContext, PhotosHomeActivity.class);
        localIntent2.setAction("android.intent.action.VIEW");
        if (paramInt1 != -1) {
          localIntent2.putExtra("account_id", paramInt1);
        }
        localIntent2.putExtra("tabs", 6);
        localIntent2.addFlags(335544320);
      }
      else
      {
        localIntent2 = null;
      }
    }
  }
  
  public static boolean a(String paramString)
  {
    return paramString.contains("prefetch_notifications");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dmr
 * JD-Core Version:    0.7.0.1
 */