import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

class hby
{
  private static hby a;
  private final hci b;
  
  private hby(Context paramContext)
  {
    this.b = ((hci)mbb.a(paramContext.getApplicationContext(), hci.class));
  }
  
  public static hby a(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = new hby(paramContext);
      }
      hby localhby = a;
      return localhby;
    }
    finally {}
  }
  
  public final void a(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    if ((paramString1 == null) || (paramString3 == null))
    {
      Log.e("iu.FingerprintManager", "insertServerPhoto: Must provide ownerId and fingerprint");
      return;
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("photo_id", Long.valueOf(paramLong));
    localContentValues.put("owner_id", paramString1);
    localContentValues.put("image_url", paramString2);
    localContentValues.put("fingerprint", paramString3);
    this.b.getWritableDatabase().replace("server_fingerprints", null, localContentValues);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hby
 * JD-Core Version:    0.7.0.1
 */