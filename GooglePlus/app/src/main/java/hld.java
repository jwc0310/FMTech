import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

public final class hld
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final boolean d;
  
  private hld(int paramInt, String paramString1, boolean paramBoolean, String paramString2)
  {
    super("GetCollexionFollowers");
    this.a = paramInt;
    this.b = paramString1;
    this.d = paramBoolean;
    this.c = paramString2;
  }
  
  private final long a(Context paramContext, boolean paramBoolean, ndp[] paramArrayOfndp, String paramString)
  {
    int i = 0;
    long l = 0L;
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.a);
    localSQLiteDatabase.beginTransaction();
    try
    {
      ContentValues localContentValues1 = new ContentValues();
      localContentValues1.put("followers_continuation_token", paramString);
      localContentValues1.put("followers_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = this.b;
      localSQLiteDatabase.update("cxns", localContentValues1, "cxn_id = ? ", arrayOfString1);
      if (paramBoolean)
      {
        String[] arrayOfString2 = new String[1];
        arrayOfString2[0] = this.b;
        localSQLiteDatabase.delete("cxns_followers", "cxn_id = ? ", arrayOfString2);
      }
      int j = paramArrayOfndp.length;
      while (i < j)
      {
        ndp localndp = paramArrayOfndp[i];
        ContentValues localContentValues2 = new ContentValues();
        localContentValues2.put("cxn_id", this.b);
        localContentValues2.put("name", localndp.b);
        localContentValues2.put("gaia_id", localndp.a);
        localContentValues2.put("photo_url", localndp.c);
        localSQLiteDatabase.insertWithOnConflict("cxns_followers", null, localContentValues2, 5);
        l += 1L;
        i++;
      }
      localSQLiteDatabase.setTransactionSuccessful();
      return l;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  private final hae a(Context paramContext, boolean paramBoolean)
  {
    int i = 2;
    if (Log.isLoggable("GetClxFwrsTask", 3)) {
      new StringBuilder(49).append("Syncing collexion followers. Drop old data: ").append(paramBoolean);
    }
    kcg localkcg = new kch().a(paramContext, this.a).a();
    String str1 = this.b;
    String str2;
    hka localhka;
    qat localqat1;
    label107:
    qat localqat2;
    label127:
    qat localqat3;
    label153:
    qat localqat4;
    label182:
    qat localqat5;
    label214:
    hae localhae1;
    if (paramBoolean)
    {
      str2 = null;
      localhka = new hka(paramContext, localkcg, str1, str2);
      localhka.i();
      if (localhka.n()) {
        break label389;
      }
      if (!localhka.x) {
        break label344;
      }
      localqat1 = localhka.w;
      if (localqat1 == null) {
        break label374;
      }
      if (!localhka.x) {
        break label350;
      }
      localqat2 = localhka.w;
      if (((msy)localqat2).a == null) {
        break label374;
      }
      if (!localhka.x) {
        break label356;
      }
      localqat3 = localhka.w;
      if (((msy)localqat3).a.a == null) {
        break label374;
      }
      if (!localhka.x) {
        break label362;
      }
      localqat4 = localhka.w;
      if (((msy)localqat4).a.a.a == null) {
        break label374;
      }
      if (!localhka.x) {
        break label368;
      }
      localqat5 = localhka.w;
      nfm localnfm = ((msy)localqat5).a;
      a(paramContext, paramBoolean, localnfm.a.a, localnfm.b);
      hae localhae2 = new hae(true);
      localhae2.a().putString("continuation_token", localnfm.b);
      i = 3;
      localhae1 = localhae2;
    }
    for (;;)
    {
      String str3 = this.b;
      Uri localUri = ((hho)mbb.a(paramContext, hho.class)).c(str3);
      ((hhn)mbb.a(paramContext, hhn.class)).a(localUri, i);
      if (i == 3) {
        paramContext.getContentResolver().notifyChange(localUri, null);
      }
      return localhae1;
      str2 = this.c;
      break;
      label344:
      localqat1 = null;
      break label107;
      label350:
      localqat2 = null;
      break label127;
      label356:
      localqat3 = null;
      break label153;
      label362:
      localqat4 = null;
      break label182;
      label368:
      localqat5 = null;
      break label214;
      label374:
      localhae1 = new hae(0, null, null);
      continue;
      label389:
      localhae1 = new hae(localhka.o, localhka.q, null);
    }
  }
  
  public static void a(Context paramContext, int paramInt, gzj paramgzj, String paramString1, boolean paramBoolean, String paramString2)
  {
    if (!((hhn)mbb.a(paramContext, hhn.class)).a(((hho)mbb.a(paramContext, hho.class)).c(paramString1), 1)) {
      return;
    }
    hld localhld = new hld(paramInt, paramString1, paramBoolean, paramString2);
    if (paramgzj == null)
    {
      gzj.a(paramContext, localhld);
      return;
    }
    paramgzj.b(localhld);
  }
  
  private final String f(Context paramContext)
  {
    Cursor localCursor = ((hhh)mbb.a(paramContext, hhh.class)).e(this.a, this.b);
    try
    {
      boolean bool = localCursor.moveToFirst();
      Object localObject2 = null;
      if (bool)
      {
        String str = localCursor.getString(localCursor.getColumnIndexOrThrow("followers_continuation_token"));
        localObject2 = str;
      }
      return localObject2;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private final long g(Context paramContext)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(paramContext, this.a);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("cxns");
    String[] arrayOfString1 = { "followers_sync_timestamp" };
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = this.b;
    Cursor localCursor = localSQLiteQueryBuilder.query(localSQLiteDatabase, arrayOfString1, "cxn_id = ? ", arrayOfString2, null, null, null);
    for (;;)
    {
      try
      {
        if ((localCursor.moveToFirst()) && (!localCursor.isNull(0)))
        {
          long l2 = localCursor.getLong(0);
          l1 = l2;
          return l1;
        }
      }
      finally
      {
        localCursor.close();
      }
      long l1 = 0L;
    }
  }
  
  protected final hae a(Context paramContext)
  {
    long l = g(paramContext);
    if ((this.d) || (System.currentTimeMillis() - l > 3600000L)) {}
    for (int i = 1; i != 0; i = 0) {
      return a(paramContext, true);
    }
    String str1 = f(paramContext);
    if (TextUtils.isEmpty(this.c))
    {
      hhn localhhn = (hhn)mbb.a(paramContext, hhn.class);
      String str2 = this.b;
      localhhn.a(((hho)mbb.a(paramContext, hho.class)).c(str2), 3);
      return new hae(true);
    }
    if (!this.c.equals(str1)) {
      return a(paramContext, true);
    }
    return a(paramContext, false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hld
 * JD-Core Version:    0.7.0.1
 */