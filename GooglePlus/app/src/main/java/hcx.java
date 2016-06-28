import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class hcx
{
  public static final String[] a = { "_id" };
  private static final Uri[] b;
  
  static
  {
    Uri[] arrayOfUri = new Uri[3];
    arrayOfUri[0] = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    arrayOfUri[1] = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
    arrayOfUri[2] = itf.b;
    b = arrayOfUri;
    Pattern.compile("(\\d+)[xX](\\d+)");
  }
  
  /* Error */
  public static long a(ContentResolver paramContentResolver, Uri paramUri)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 47	mfq:b	(Landroid/net/Uri;)Z
    //   4: ifne +11 -> 15
    //   7: ldc2_w 48
    //   10: lstore 7
    //   12: lload 7
    //   14: lreturn
    //   15: aload_0
    //   16: aload_1
    //   17: getstatic 16	hcx:a	[Ljava/lang/String;
    //   20: aconst_null
    //   21: aconst_null
    //   22: aconst_null
    //   23: invokevirtual 55	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   26: astore 4
    //   28: aload 4
    //   30: ifnull +42 -> 72
    //   33: aload 4
    //   35: invokeinterface 61 1 0
    //   40: ifeq +32 -> 72
    //   43: aload 4
    //   45: iconst_0
    //   46: invokeinterface 65 2 0
    //   51: lstore 5
    //   53: lload 5
    //   55: lstore 7
    //   57: aload 4
    //   59: ifnull -47 -> 12
    //   62: aload 4
    //   64: invokeinterface 68 1 0
    //   69: lload 7
    //   71: lreturn
    //   72: aload 4
    //   74: ifnull +10 -> 84
    //   77: aload 4
    //   79: invokeinterface 68 1 0
    //   84: ldc2_w 48
    //   87: lreturn
    //   88: astore_2
    //   89: aconst_null
    //   90: astore_3
    //   91: aload_3
    //   92: ifnull +9 -> 101
    //   95: aload_3
    //   96: invokeinterface 68 1 0
    //   101: aload_2
    //   102: athrow
    //   103: astore_2
    //   104: aload 4
    //   106: astore_3
    //   107: goto -16 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	paramContentResolver	ContentResolver
    //   0	110	1	paramUri	Uri
    //   88	14	2	localObject1	Object
    //   103	1	2	localObject2	Object
    //   90	17	3	localCursor1	Cursor
    //   26	79	4	localCursor2	Cursor
    //   51	3	5	l1	long
    //   10	60	7	l2	long
    // Exception table:
    //   from	to	target	type
    //   15	28	88	finally
    //   33	53	103	finally
  }
  
  static ArrayList<hdd> a(ContentResolver paramContentResolver)
  {
    ArrayList localArrayList = new ArrayList();
    int i = -1 + b.length;
    Uri localUri;
    if (i >= 0) {
      localUri = b[i];
    }
    try
    {
      localCursor2 = paramContentResolver.query(localUri, a, null, null, "_id DESC");
      if (localCursor2 == null) {}
    }
    finally
    {
      try
      {
        if (localCursor2.moveToFirst()) {}
        for (long l = localCursor2.getLong(0);; l = -1L)
        {
          localArrayList.add(new hdd(localUri, l));
          if (localCursor2 != null) {
            localCursor2.close();
          }
          i--;
          break;
        }
        localObject1 = finally;
        localCursor1 = null;
      }
      finally
      {
        for (;;)
        {
          Cursor localCursor2;
          Cursor localCursor1 = localCursor2;
        }
      }
      if (localCursor1 != null) {
        localCursor1.close();
      }
      throw localObject1;
      return localArrayList;
    }
  }
  
  static List<Uri> a(ContentResolver paramContentResolver, List<hdd> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramList == null) {
      return localArrayList;
    }
    int i = -1 + paramList.size();
    hdd localhdd;
    if (i >= 0) {
      localhdd = (hdd)paramList.get(i);
    }
    try
    {
      Uri localUri = localhdd.a;
      String[] arrayOfString1 = a;
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = String.valueOf(localhdd.b);
      Cursor localCursor2 = paramContentResolver.query(localUri, arrayOfString1, "_id > ?", arrayOfString2, null);
      localCursor1 = localCursor2;
      if (localCursor1 == null) {}
    }
    finally
    {
      try
      {
        if (localCursor1.moveToFirst())
        {
          boolean bool;
          do
          {
            localArrayList.add(localhdd.a.buildUpon().appendEncodedPath(String.valueOf(localCursor1.getLong(0))).build());
            bool = localCursor1.moveToNext();
          } while (bool);
        }
        if (localCursor1 != null) {
          localCursor1.close();
        }
        i--;
      }
      finally
      {
        Cursor localCursor1;
        label170:
        break label170;
      }
      localObject1 = finally;
      localCursor1 = null;
      if (localCursor1 != null) {
        localCursor1.close();
      }
      throw localObject1;
      return localArrayList;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hcx
 * JD-Core Version:    0.7.0.1
 */