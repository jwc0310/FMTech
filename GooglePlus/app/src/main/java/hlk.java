import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

public final class hlk
  extends gzf
{
  private final int a;
  private final boolean b;
  private final String c;
  private final String d;
  
  private hlk(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    super("getuserfollowedclx");
    this.a = paramInt;
    this.b = paramBoolean;
    this.c = paramString1;
    this.d = paramString2;
  }
  
  private final long a(Context paramContext, boolean paramBoolean, nej paramnej, String paramString)
  {
    int i = 0;
    long l = 0L;
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.a);
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      try
      {
        efj.a(localSQLiteDatabase, this.c, 1, paramString);
        efj.a(localSQLiteDatabase, this.c, 2);
        if (paramBoolean)
        {
          String[] arrayOfString = new String[1];
          arrayOfString[0] = this.c;
          localSQLiteDatabase.delete("ufcxns", "follower_gaia_id=?", arrayOfString);
        }
        efj.a(localSQLiteDatabase, paramnej);
        if (paramnej.a != null)
        {
          nei[] arrayOfnei = paramnej.a;
          int j = arrayOfnei.length;
          if (i < j)
          {
            nei localnei = arrayOfnei[i];
            if ((localnei == null) || (localnei.b == null) || (localnei.b.a == null)) {
              break label216;
            }
            ContentValues localContentValues = new ContentValues();
            localContentValues.put("cxn_id", localnei.b.a.a);
            localContentValues.put("follower_gaia_id", this.c);
            l += localSQLiteDatabase.insertWithOnConflict("ufcxns", null, localContentValues, 5);
            break label216;
          }
        }
        localSQLiteDatabase.setTransactionSuccessful();
        return l;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      label216:
      i++;
    }
  }
  
  private final hae a(Context paramContext, boolean paramBoolean)
  {
    int i = 2;
    if (Log.isLoggable("GetUsrFlwClxTask", 3)) {
      new StringBuilder(49).append("Syncing followed collexions. Drop old data: ").append(paramBoolean);
    }
    kcg localkcg = new kch().a(paramContext, this.a).a();
    String str1 = this.c;
    String str2;
    hkj localhkj;
    qat localqat1;
    label107:
    qat localqat2;
    label127:
    qat localqat3;
    label153:
    qat localqat4;
    label182:
    hae localhae1;
    if (paramBoolean)
    {
      str2 = null;
      localhkj = new hkj(paramContext, localkcg, str1, str2);
      localhkj.i();
      if (localhkj.n()) {
        break label348;
      }
      if (!localhkj.x) {
        break label309;
      }
      localqat1 = localhkj.w;
      if (localqat1 == null) {
        break label333;
      }
      if (!localhkj.x) {
        break label315;
      }
      localqat2 = localhkj.w;
      if (((mva)localqat2).a == null) {
        break label333;
      }
      if (!localhkj.x) {
        break label321;
      }
      localqat3 = localhkj.w;
      if (((mva)localqat3).a.a == null) {
        break label333;
      }
      if (!localhkj.x) {
        break label327;
      }
      localqat4 = localhkj.w;
      nfs localnfs = ((mva)localqat4).a;
      a(paramContext, paramBoolean, localnfs.a, localnfs.b);
      hae localhae2 = new hae(true);
      localhae2.a().putString("continuation_token", localnfs.b);
      i = 3;
      localhae1 = localhae2;
    }
    for (;;)
    {
      String str3 = this.c;
      Uri localUri = ((hho)mbb.a(paramContext, hho.class)).f(str3);
      ((hhn)mbb.a(paramContext, hhn.class)).a(localUri, i);
      if (i == 3) {
        paramContext.getContentResolver().notifyChange(localUri, null);
      }
      return localhae1;
      str2 = this.d;
      break;
      label309:
      localqat1 = null;
      break label107;
      label315:
      localqat2 = null;
      break label127;
      label321:
      localqat3 = null;
      break label153;
      label327:
      localqat4 = null;
      break label182;
      label333:
      localhae1 = new hae(0, null, null);
      continue;
      label348:
      localhae1 = new hae(localhkj.o, localhkj.q, null);
    }
  }
  
  public static void a(Context paramContext, gzj paramgzj, boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    if (!((hhn)mbb.a(paramContext, hhn.class)).a(((hho)mbb.a(paramContext, hho.class)).f(paramString1), 1)) {
      return;
    }
    hlk localhlk = new hlk(paramBoolean, paramInt, paramString1, paramString2);
    if (paramgzj == null)
    {
      gzj.a(paramContext, localhlk);
      return;
    }
    paramgzj.b(localhlk);
  }
  
  protected final hae a(Context paramContext)
  {
    long l = efj.b(paramContext, this.a, this.c, 2);
    if ((this.b) || (System.currentTimeMillis() - l > 3600000L)) {}
    for (int i = 1; i != 0; i = 0) {
      return a(paramContext, true);
    }
    String str1 = efj.d(paramContext, this.a, this.c, 1);
    if (TextUtils.isEmpty(this.d))
    {
      hae localhae = new hae(true);
      hhn localhhn = (hhn)mbb.a(paramContext, hhn.class);
      String str2 = this.c;
      localhhn.a(((hho)mbb.a(paramContext, hho.class)).f(str2), 3);
      return localhae;
    }
    if (!this.d.equals(str1)) {
      return a(paramContext, true);
    }
    return a(paramContext, false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hlk
 * JD-Core Version:    0.7.0.1
 */