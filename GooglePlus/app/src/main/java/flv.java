import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.RawContacts;
import android.text.TextUtils;

public final class flv
{
  private static final String[] a;
  private static final String[] b;
  
  static
  {
    new String[] { "_id" };
    a = new String[] { "contact_id" };
    b = new String[] { "lookup" };
    new String[] { "photo_id" };
    new String[] { "data15" };
  }
  
  public static long a(Context paramContext, String paramString1, String paramString2)
  {
    return a(paramContext, paramString1, paramString2, a);
  }
  
  private static long a(Context paramContext, String paramString1, String paramString2, String[] paramArrayOfString)
  {
    if (TextUtils.isEmpty(paramString1)) {
      return -1L;
    }
    if (Build.VERSION.SDK_INT < 15) {
      return -1L;
    }
    String str = fne.a(paramString2);
    ContentResolver localContentResolver = paramContext.getContentResolver();
    Uri localUri = ContactsContract.RawContacts.CONTENT_URI;
    String[] arrayOfString = (String[])fne.c.get();
    arrayOfString[0] = paramString1;
    arrayOfString[1] = str;
    Cursor localCursor = localContentResolver.query(localUri, paramArrayOfString, "account_name=?1 AND account_type='com.google' AND sourceid=?2 AND data_set IS 'plus'", arrayOfString, null);
    if (localCursor == null)
    {
      efj.d(5);
      return -1L;
    }
    try
    {
      if (localCursor.moveToFirst())
      {
        int i = localCursor.getInt(0);
        long l = i;
        return l;
      }
      localCursor.close();
      efj.d(3);
      return -1L;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static Uri a(Context paramContext, long paramLong)
  {
    if (paramLong < 0L) {
      return null;
    }
    Uri localUri1 = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, paramLong);
    Cursor localCursor = paramContext.getContentResolver().query(localUri1, b, null, null, null);
    if (localCursor == null)
    {
      efj.d(5);
      return null;
    }
    try
    {
      if (localCursor.moveToFirst())
      {
        String str = localCursor.getString(0);
        if (TextUtils.isEmpty(str))
        {
          efj.d(3);
          return null;
        }
        Uri localUri2 = ContactsContract.Contacts.CONTENT_LOOKUP_URI.buildUpon().appendPath(str).appendPath(String.valueOf(paramLong)).build();
        return localUri2;
      }
      localCursor.close();
      efj.d(3);
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     flv
 * JD-Core Version:    0.7.0.1
 */