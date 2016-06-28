import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class apk
{
  private static final String[] a = { "_id", "image_url", "local_content_uri", "media_attr", "user_actions", "photo_id", "has_edit_list", "signature" };
  private static final String[] b = { "_id", "image_url", "local_content_uri", "media_attr", "user_actions", "data", "photo_id", "has_edit_list", "signature" };
  
  private static apm a(Context paramContext, int paramInt, Cursor paramCursor, apn paramapn)
  {
    long l1 = paramCursor.getLong(paramCursor.getColumnIndexOrThrow("_id"));
    long l2 = paramCursor.getLong(paramCursor.getColumnIndexOrThrow("user_actions"));
    long l3 = paramCursor.getLong(paramCursor.getColumnIndexOrThrow("media_attr"));
    String str1 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("image_url"));
    String str2 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("local_content_uri"));
    long l4 = paramCursor.getLong(paramCursor.getColumnIndexOrThrow("photo_id"));
    int i;
    String str3;
    int j;
    if (paramCursor.getInt(paramCursor.getColumnIndexOrThrow("has_edit_list")) != 0)
    {
      i = 1;
      str3 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("signature"));
      j = paramCursor.getColumnIndex("data");
      if (j == -1) {
        break label382;
      }
    }
    label376:
    label382:
    for (byte[] arrayOfByte = paramCursor.getBlob(j);; arrayOfByte = null)
    {
      if ((str1 == null) && (str2 == null))
      {
        if (Log.isLoggable("AllPhotosData", 5)) {
          new StringBuilder(73).append("Missing both image url and local content uri for id: ").append(l1);
        }
        if (!dun.b())
        {
          return null;
          i = 0;
          break;
        }
      }
      ixf localixf = (ixf)mbb.a(paramContext.getApplicationContext(), ixf.class);
      ipm localipm = jrf.a(l3);
      ipf localipf;
      if ((TextUtils.isEmpty(str2)) || ((i != 0) && (!TextUtils.isEmpty(str1)) && (localixf.a())))
      {
        localipf = ipf.a(paramContext, ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id"), l4, str1, null, localipm, null);
        if (arrayOfByte == null) {
          break label376;
        }
      }
      for (;;)
      {
        try
        {
          localojf1 = (ojf)qat.b(new ojf(), arrayOfByte, 0, arrayOfByte.length);
          localojf2 = localojf1;
        }
        catch (qas localqas)
        {
          ojf localojf2 = null;
          continue;
        }
        return new apm(paramapn, l1, l2, l3, str2, localipf, localojf2);
        localipf = ipf.a(paramContext, Uri.parse(str2), localipm, str3);
        break;
        ojf localojf1 = null;
      }
    }
  }
  
  public static apm a(Context paramContext, int paramInt, Long paramLong, apn paramapn)
  {
    localObject1 = null;
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    try
    {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = Long.toString(paramLong.longValue());
      localCursor = localSQLiteDatabase.query("all_photos", a(paramapn), "_id = ?", arrayOfString, null, null, null);
      boolean bool;
      Object localObject4;
      apm localapm;
      if (localObject1 == null) {
        break label125;
      }
    }
    finally
    {
      try
      {
        bool = localCursor.moveToFirst();
        if (!bool)
        {
          if (localCursor != null) {
            localCursor.close();
          }
          localObject4 = null;
        }
        do
        {
          return localObject4;
          localapm = a(paramContext, paramInt, localCursor, paramapn);
          localObject4 = localapm;
        } while (localCursor == null);
        localCursor.close();
        return localObject4;
      }
      finally
      {
        for (;;)
        {
          Cursor localCursor;
          localObject1 = localCursor;
        }
      }
      localObject2 = finally;
    }
    localObject1.close();
    label125:
    throw localObject2;
  }
  
  public static String a(apm paramapm)
  {
    if ((paramapm.f != null) && (paramapm.f.c != null)) {
      return paramapm.f.c;
    }
    if ((paramapm.g != null) && (paramapm.g.a != null)) {
      return paramapm.g.a.a;
    }
    return null;
  }
  
  public static List<apm> a(Context paramContext, int paramInt, List<Long> paramList, apn paramapn)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    if (localmfz.b == 1) {}
    for (StringBuilder localStringBuilder = localmfz.a;; localStringBuilder = new StringBuilder(256))
    {
      localStringBuilder.append("_id IN (");
      for (int i = 0; i < paramList.size(); i++)
      {
        localStringBuilder.append(((Long)paramList.get(i)).toString());
        if (i != -1 + paramList.size()) {
          localStringBuilder.append(", ");
        }
      }
    }
    localStringBuilder.append(')');
    String str = mfx.b(localStringBuilder);
    localArrayList = new ArrayList();
    Cursor localCursor = localSQLiteDatabase.query("all_photos", a(paramapn), str, null, null, null, null);
    try
    {
      if (localCursor.moveToNext()) {
        localArrayList.add(a(paramContext, paramInt, localCursor, paramapn));
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private static String[] a(apn paramapn)
  {
    switch (apl.a[paramapn.ordinal()])
    {
    default: 
      throw new IllegalStateException();
    case 1: 
      return a;
    }
    return b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     apk
 * JD-Core Version:    0.7.0.1
 */