import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public final class aus
  implements auy
{
  private static final String[] a = { "COUNT(*)", "_data", "date_modified", "_id" };
  private final Context b;
  
  public aus(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public final String a(int paramInt, Uri paramUri)
  {
    ContentResolver localContentResolver = this.b.getContentResolver();
    long l1 = 0L;
    long l2 = 0L;
    long l3 = 0L;
    Cursor localCursor1 = localContentResolver.query(paramUri, a, null, null, "_id DESC LIMIT 1");
    String str1 = null;
    if (localCursor1 != null) {}
    for (;;)
    {
      try
      {
        boolean bool = localCursor1.moveToFirst();
        str1 = null;
        if (bool)
        {
          long l6 = localCursor1.getLong(0);
          long l7 = localCursor1.getLong(2);
          str1 = localCursor1.getString(1);
          long l8 = localCursor1.getLong(3);
          l2 = l7;
          l1 = l6;
          l3 = l8;
        }
        if (localCursor1 != null) {
          localCursor1.close();
        }
        Cursor localCursor2 = localContentResolver.query(paramUri, a, "mime_type NOT LIKE 'image/%' AND mime_type NOT LIKE 'video/%'", null, "_id DESC LIMIT 1");
        if (localCursor2 == null) {
          break label368;
        }
        long l5;
        String str2;
        String str3;
        String str4;
        String str6;
        String str5 = "";
      }
      finally
      {
        try
        {
          if (!localCursor2.moveToFirst()) {
            break label368;
          }
          l5 = localCursor2.getLong(0);
          l4 = l5;
          if (localCursor2 != null) {
            localCursor2.close();
          }
          str2 = String.valueOf(Long.toString(l1));
          str3 = String.valueOf(Long.toString(l4));
          str4 = String.valueOf(Long.toString(l2));
          if (str1 == null) {
            break label361;
          }
          str5 = str1;
          str6 = String.valueOf(Long.toString(l3));
          return 4 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + str2 + ":" + str3 + ":" + str4 + ":" + str5 + ":" + str6;
        }
        finally
        {
          if (localCursor2 == null) {
            break label358;
          }
          localCursor2.close();
        }
        localObject2 = finally;
        if (localCursor1 != null) {
          localCursor1.close();
        }
      }
      label358:
      label361:
      continue;
      label368:
      long l4 = 0L;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aus
 * JD-Core Version:    0.7.0.1
 */