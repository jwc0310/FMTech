import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;

public final class hbu
{
  public static final String a = Integer.toString(-2147483648);
  public static final Uri b;
  private static final Uri c;
  
  static
  {
    Uri localUri = Uri.parse("content://com.google.android.apps.plus.iu.IuStatus");
    c = localUri;
    b = Uri.withAppendedPath(localUri, "uploads");
  }
  
  public static Uri a(Context paramContext)
  {
    String str1 = String.valueOf(((ham)mbb.a(paramContext, ham.class)).a());
    if (str1.length() != 0) {}
    for (String str2 = "content://".concat(str1);; str2 = new String("content://")) {
      return Uri.withAppendedPath(Uri.parse(str2), "media");
    }
  }
  
  public static Uri a(Context paramContext, long paramLong)
  {
    return e(paramContext).buildUpon().appendPath(String.valueOf(paramLong)).build();
  }
  
  public static String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "unknown";
    case 0: 
      return "SYNC_STATE_IDLE";
    case 1: 
      return "SYNC_STATE_SYNCING";
    case 2: 
      return "SYNC_STATE_REJECT_ON_WIFI";
    case 3: 
      return "SYNC_STATE_REJECT_ON_ROAMING";
    case 4: 
      return "SYNC_STATE_REJECT_ON_POWER";
    case 5: 
      return "SYNC_STATE_REJECT_ON_USER_AUTH";
    case 6: 
      return "SYNC_STATE_REJECT_ON_AUTO_SYNC";
    case 7: 
      return "SYNC_STATE_REJECT_ON_DISABLED_DOWNSYNC";
    case 8: 
      return "SYNC_STATE_REJECT_ON_BACKGROUND_DATA";
    case 9: 
      return "SYNC_STATE_STOP_ON_QUOTA_REACHED";
    case 10: 
      return "SYNC_STATE_STOP_ON_USER_AUTH";
    case 11: 
      return "SYNC_STATE_WAIT_ON_SDCARD";
    case 12: 
      return "SYNC_STATE_STOP_ON_SDCARD";
    case 13: 
      return "SYNC_STATE_YIELD";
    case 14: 
      return "SYNC_STATE_STOP_ON_NETWORK";
    }
    return "SYNC_STATE_STOP_ON_IOE";
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    Uri localUri = d(paramContext);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("account_id", Integer.valueOf(paramInt));
    paramContext.getContentResolver().insert(localUri, localContentValues);
  }
  
  public static Uri b(Context paramContext)
  {
    String str1 = String.valueOf(((ham)mbb.a(paramContext, ham.class)).a());
    if (str1.length() != 0) {}
    for (String str2 = "content://".concat(str1);; str2 = new String("content://")) {
      return Uri.withAppendedPath(Uri.parse(str2), "settings");
    }
  }
  
  public static Uri c(Context paramContext)
  {
    String str1 = String.valueOf(((ham)mbb.a(paramContext, ham.class)).a());
    if (str1.length() != 0) {}
    for (String str2 = "content://".concat(str1);; str2 = new String("content://")) {
      return Uri.withAppendedPath(Uri.parse(str2), "iu");
    }
  }
  
  public static Uri d(Context paramContext)
  {
    String str1 = String.valueOf(((ham)mbb.a(paramContext, ham.class)).a());
    if (str1.length() != 0) {}
    for (String str2 = "content://".concat(str1);; str2 = new String("content://")) {
      return Uri.withAppendedPath(Uri.parse(str2), "upload_all");
    }
  }
  
  public static Uri e(Context paramContext)
  {
    String str1 = String.valueOf(((ham)mbb.a(paramContext, ham.class)).a());
    if (str1.length() != 0) {}
    for (String str2 = "content://".concat(str1);; str2 = new String("content://")) {
      return Uri.withAppendedPath(Uri.parse(str2), "uploads");
    }
  }
  
  public static String f(Context paramContext)
  {
    return ((ham)mbb.a(paramContext, ham.class)).a();
  }
  
  public static void g(Context paramContext)
  {
    hau localhau = (hau)mbb.b(paramContext, hau.class);
    if (localhau != null) {
      localhau.c.sendEmptyMessageDelayed(1, 0L);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hbu
 * JD-Core Version:    0.7.0.1
 */