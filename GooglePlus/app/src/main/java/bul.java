import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Log;
import com.google.android.apps.plus.content.EsProvider;
import com.google.android.apps.plus.service.EsSyncAdapterService;

public final class bul
{
  public static bum a = new bum();
  private final Context b;
  private final int c;
  private final SQLiteDatabase d;
  private final ContentResolver e;
  
  bul(Context paramContext, int paramInt)
  {
    this.b = paramContext;
    this.c = paramInt;
    this.d = bqj.a(paramContext, paramInt).getWritableDatabase();
    this.e = paramContext.getContentResolver();
  }
  
  private static String a(String paramString)
  {
    if ((paramString != null) && (paramString.startsWith("g:"))) {
      return paramString.substring(2);
    }
    return null;
  }
  
  private static nxl a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    try
    {
      nxl localnxl = (nxl)qat.b(new nxl(), paramArrayOfByte, 0, paramArrayOfByte.length);
      return localnxl;
    }
    catch (qas localqas)
    {
      String str = String.valueOf(localqas);
      Log.e("PeopleData", 52 + String.valueOf(str).length() + "Unable to deserialize simple profile from database: " + str);
    }
    return null;
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (Log.isLoggable("PeopleData", 3)) {
      new StringBuilder(40 + String.valueOf(paramString1).length()).append("setBlockedState - User: ").append(paramString1).append("; isMuted: ").append(paramBoolean);
    }
    this.d.beginTransaction();
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("blocked", Boolean.valueOf(paramBoolean));
      if (paramBoolean) {
        localContentValues.put("in_my_circles", Integer.valueOf(0));
      }
      if ((this.d.update("contacts", localContentValues, "person_id=?", new String[] { paramString1 }) == 0) && (paramBoolean))
      {
        localContentValues.put("person_id", paramString1);
        localContentValues.put("gaia_id", a(paramString1));
        localContentValues.put("name", paramString2);
        this.d.insert("contacts", null, localContentValues);
      }
      localContentValues.clear();
      localContentValues.put("contact_update_time", Long.valueOf(System.currentTimeMillis()));
      this.d.update("profiles", localContentValues, "profile_person_id=?", new String[] { paramString1 });
      if (paramBoolean)
      {
        this.d.delete("circle_contact", "link_person_id=?", new String[] { paramString1 });
        brn.a(this.d);
      }
      lmp.g(this.b, this.c, a(paramString1), paramBoolean);
      this.d.setTransactionSuccessful();
      this.d.endTransaction();
      this.e.notifyChange(EsProvider.f(this.b), null);
      this.e.notifyChange(EsProvider.e(this.b), null);
      if (paramBoolean) {
        EsSyncAdapterService.a(this.b, this.c);
      }
      return;
    }
    finally
    {
      this.d.endTransaction();
    }
  }
  
  public final boolean a(String paramString, boolean paramBoolean)
  {
    if (Log.isLoggable("PeopleData", 3)) {
      new StringBuilder(37 + String.valueOf(paramString).length()).append("setMuteState - User: ").append(paramString).append("; isMuted: ").append(paramBoolean);
    }
    String str1 = String.valueOf(paramString);
    String str2;
    if (str1.length() != 0)
    {
      str2 = "g:".concat(str1);
      this.d.beginTransaction();
    }
    for (;;)
    {
      try
      {
        Cursor localCursor = this.d.query("profiles", new String[] { "profile_proto" }, "profile_person_id=?", new String[] { str2 }, null, null, null);
        if (!localCursor.moveToFirst()) {
          break label367;
        }
        arrayOfByte1 = localCursor.getBlob(0);
        localCursor.close();
        Boolean localBoolean;
        if (arrayOfByte1 == null)
        {
          localnxl = null;
          if ((localnxl == null) || (localnxl.c == null) || (localnxl.c.e == null)) {
            break label361;
          }
          localBoolean = localnxl.c.e.c;
          if (localBoolean != null) {
            continue;
          }
          bool2 = false;
          if (bool2 == paramBoolean) {
            break label361;
          }
          localnxl.c.e.c = Boolean.valueOf(paramBoolean);
          ContentValues localContentValues = new ContentValues();
          if (localnxl != null) {
            continue;
          }
          localObject2 = null;
          localContentValues.put("profile_proto", (byte[])localObject2);
          this.d.update("profiles", localContentValues, "profile_person_id=?", new String[] { str2 });
          bool1 = true;
          this.d.setTransactionSuccessful();
          this.d.endTransaction();
          if (bool1) {
            this.e.notifyChange(Uri.withAppendedPath(EsProvider.g(this.b), str2), null);
          }
          return bool1;
          str2 = new String("g:");
          break;
        }
        nxl localnxl = a(arrayOfByte1);
        continue;
        boolean bool2 = localBoolean.booleanValue();
        continue;
        byte[] arrayOfByte2 = qat.a(localnxl);
        Object localObject2 = arrayOfByte2;
        continue;
        boolean bool1 = false;
      }
      finally
      {
        this.d.endTransaction();
      }
      label361:
      continue;
      label367:
      byte[] arrayOfByte1 = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bul
 * JD-Core Version:    0.7.0.1
 */