import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;

public final class mfq
{
  private static final String[] a = { "_data" };
  
  public static String a(ContentResolver paramContentResolver, Uri paramUri)
  {
    Cursor localCursor = paramContentResolver.query(paramUri, new String[] { "_data" }, null, null, null);
    if (localCursor == null)
    {
      if (Log.isLoggable("ContentUriUtils", 5))
      {
        String str4 = String.valueOf(paramUri);
        new StringBuilder(48 + String.valueOf(str4).length()).append("getFilePath: query returned null cursor for uri=").append(str4);
      }
      return null;
    }
    try
    {
      if (!localCursor.moveToFirst())
      {
        if (Log.isLoggable("ContentUriUtils", 5))
        {
          String str3 = String.valueOf(paramUri);
          new StringBuilder(49 + String.valueOf(str3).length()).append("getFilePath: query returned empty cursor for uri=").append(str3);
        }
        return null;
      }
      String str1 = localCursor.getString(0);
      if (TextUtils.isEmpty(str1))
      {
        if (Log.isLoggable("ContentUriUtils", 5))
        {
          String str2 = String.valueOf(paramUri);
          new StringBuilder(49 + String.valueOf(str2).length()).append("getFilePath: MediaColumns.DATA was empty for uri=").append(str2);
        }
        return null;
      }
      return str1;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static String a(ContentResolver paramContentResolver, Uri paramUri, String paramString)
  {
    Cursor localCursor = paramContentResolver.query(paramUri, new String[] { "bucket_display_name", "_data" }, null, null, null);
    if ((localCursor == null) || (!localCursor.moveToNext()))
    {
      if (Log.isLoggable("ContentUriUtils", 5))
      {
        String str1 = String.valueOf(paramUri);
        new StringBuilder(49 + String.valueOf(str1).length()).append("getBucketName: query returned no results for uri=").append(str1);
      }
      return null;
    }
    try
    {
      String str2 = localCursor.getString(0);
      String str3 = localCursor.getString(1);
      if ((str3 != null) && (str3.contains("/DCIM/"))) {
        str2 = paramString;
      }
      if (TextUtils.isEmpty(str2))
      {
        if (Log.isLoggable("ContentUriUtils", 5))
        {
          String str4 = String.valueOf(paramUri);
          new StringBuilder(66 + String.valueOf(str4).length()).append("getBucketName: ImageColumns.BUCKET_DISPLAY_NAME was empty for uri=").append(str4);
        }
        return null;
      }
      return str2;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static boolean a(Uri paramUri)
  {
    return (paramUri != null) && ("file".equals(paramUri.getScheme()));
  }
  
  public static boolean a(String paramString)
  {
    return "image/gif".equals(paramString);
  }
  
  public static String b(ContentResolver paramContentResolver, Uri paramUri)
  {
    Object localObject = null;
    try
    {
      localObject = d(paramContentResolver, paramUri);
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        localObject = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(paramUri.toString()));
      }
      if (("*/*".equals(localObject)) && (b(paramUri)))
      {
        String str2 = c(paramContentResolver, paramUri);
        localObject = str2;
      }
    }
    catch (Exception localException)
    {
      while (!Log.isLoggable("ContentUriUtils", 5)) {}
      String str1 = String.valueOf(paramUri);
      new StringBuilder(27 + String.valueOf(str1).length()).append("getMimeType failed for uri=").append(str1);
    }
    return localObject;
    return localObject;
  }
  
  public static boolean b(Uri paramUri)
  {
    return (paramUri != null) && ("content".equals(paramUri.getScheme())) && ("media".equals(paramUri.getAuthority()));
  }
  
  public static boolean b(String paramString)
  {
    return (paramString != null) && (paramString.startsWith("image/"));
  }
  
  private static String c(ContentResolver paramContentResolver, Uri paramUri)
  {
    Cursor localCursor = paramContentResolver.query(paramUri, a, null, null, null);
    if (localCursor != null) {}
    for (;;)
    {
      try
      {
        if (!localCursor.moveToFirst()) {
          break label93;
        }
        String str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(localCursor.getString(0)));
        str1 = str2;
        if (localCursor != null) {
          localCursor.close();
        }
        if (TextUtils.isEmpty(str1))
        {
          if (c(paramUri)) {
            str1 = "video/*";
          }
        }
        else {
          return str1;
        }
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
      return "image/*";
      label93:
      String str1 = null;
    }
  }
  
  public static boolean c(Uri paramUri)
  {
    return (b(paramUri)) && (paramUri.toString().contains("/video/"));
  }
  
  public static boolean c(String paramString)
  {
    return (paramString != null) && (paramString.startsWith("video/"));
  }
  
  private static String d(ContentResolver paramContentResolver, Uri paramUri)
  {
    try
    {
      String str3 = paramContentResolver.getType(paramUri);
      str1 = str3;
    }
    catch (Exception localException)
    {
      boolean bool;
      do
      {
        bool = Log.isLoggable("ContentUriUtils", 5);
        String str1 = null;
      } while (!bool);
      String str2 = String.valueOf(paramUri);
      new StringBuilder(31 + String.valueOf(str2).length()).append("safeGetMimeType failed for uri=").append(str2);
    }
    return str1;
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mfq
 * JD-Core Version:    0.7.0.1
 */