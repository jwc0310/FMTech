import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;

public final class hlh
  extends gzf
{
  private final String a;
  private final int b;
  private final String c;
  private final boolean d;
  
  private hlh(int paramInt, String paramString1, boolean paramBoolean, String paramString2)
  {
    super("GetCollexionsFromCircles");
    this.b = paramInt;
    this.a = paramString1;
    this.c = paramString2;
    this.d = paramBoolean;
  }
  
  private final int a(Context paramContext, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.b);
    localSQLiteDatabase.beginTransaction();
    try
    {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = this.a;
      localSQLiteDatabase.delete("cxnsfromcircles", "circles_owner_gaia_id =?", arrayOfString);
      efj.a(localSQLiteDatabase, this.a, 4, paramString);
      efj.a(localSQLiteDatabase, this.a, 3);
      localSQLiteDatabase.setTransactionSuccessful();
      return 1;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  private final int a(Context paramContext, boolean paramBoolean, nej paramnej, String paramString)
  {
    int i = 0;
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.b);
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      int k;
      try
      {
        efj.a(localSQLiteDatabase, this.a, 4, paramString);
        efj.a(localSQLiteDatabase, this.a, 3);
        if (paramBoolean)
        {
          String[] arrayOfString = new String[1];
          arrayOfString[0] = this.a;
          localSQLiteDatabase.delete("cxnsfromcircles", "circles_owner_gaia_id =?", arrayOfString);
        }
        efj.a(localSQLiteDatabase, paramnej);
        nei[] arrayOfnei = paramnej.a;
        int j = arrayOfnei.length;
        k = 0;
        if (k < j)
        {
          nei localnei = arrayOfnei[k];
          if ((localnei != null) && (localnei.b != null) && (localnei.b.a != null))
          {
            ContentValues localContentValues = new ContentValues();
            localContentValues.put("cxn_id", localnei.b.a.a);
            localContentValues.put("circles_owner_gaia_id", this.a);
            localSQLiteDatabase.insertWithOnConflict("cxnsfromcircles", null, localContentValues, 5);
            i++;
          }
        }
        else
        {
          localSQLiteDatabase.setTransactionSuccessful();
          return i;
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      k++;
    }
  }
  
  private final hae a(Context paramContext, boolean paramBoolean)
  {
    hkf localhkf = new hkf(paramContext, new kch().a(paramContext, this.b).a(), this.a, this.c);
    localhkf.i();
    int i = localhkf.o;
    Exception localException = localhkf.q;
    qat localqat1;
    qat localqat2;
    label89:
    qat localqat3;
    if (!localhkf.n())
    {
      if (!localhkf.x) {
        break label211;
      }
      localqat1 = localhkf.w;
      if (localqat1 != null)
      {
        if (!localhkf.x) {
          break label217;
        }
        localqat2 = localhkf.w;
        if (((mtc)localqat2).a != null)
        {
          if (!localhkf.x) {
            break label223;
          }
          localqat3 = localhkf.w;
          label113:
          if (((mtc)localqat3).a.a != null) {
            break label229;
          }
        }
      }
    }
    i = 0;
    Object localObject = localException;
    for (;;)
    {
      hhn localhhn = (hhn)mbb.a(paramContext, hhn.class);
      String str1 = this.a;
      Uri localUri = ((hho)mbb.a(paramContext, hho.class)).d(str1);
      if (i == 200)
      {
        localhhn.a(localUri, 3);
        paramContext.getContentResolver().notifyChange(localUri, null);
      }
      for (;;)
      {
        return new hae(i, (Exception)localObject, null);
        label211:
        localqat1 = null;
        break;
        label217:
        localqat2 = null;
        break label89;
        label223:
        localqat3 = null;
        break label113;
        label229:
        qat localqat4;
        label242:
        nej localnej;
        String str2;
        if (localhkf.x)
        {
          localqat4 = localhkf.w;
          nfo localnfo = ((mtc)localqat4).a;
          localnej = localnfo.a;
          str2 = localnfo.b;
          if ((localnej.a != null) && (localnej.a.length != 0)) {
            break label320;
          }
        }
        label320:
        for (int j = a(paramContext, str2);; j = a(paramContext, paramBoolean, localnej, str2))
        {
          if (j != 0) {
            break label349;
          }
          localObject = new IllegalStateException("Expected non-zero inserted rows");
          i = 0;
          break;
          localqat4 = null;
          break label242;
        }
        localhhn.a(localUri, 2);
      }
      label349:
      localObject = localException;
    }
  }
  
  public static void a(Context paramContext, gzj paramgzj, int paramInt, String paramString1, boolean paramBoolean, String paramString2)
  {
    if (!((hhn)mbb.a(paramContext, hhn.class)).a(((hho)mbb.a(paramContext, hho.class)).d(paramString1), 1)) {
      return;
    }
    hlh localhlh = new hlh(paramInt, paramString1, paramBoolean, paramString2);
    if (paramgzj == null)
    {
      gzj.a(paramContext, localhlh);
      return;
    }
    paramgzj.b(localhlh);
  }
  
  protected final hae a(Context paramContext)
  {
    long l = efj.b(paramContext, this.b, this.a, 3);
    if ((this.d) || (System.currentTimeMillis() - l > 900000L)) {}
    for (int i = 1; i != 0; i = 0) {
      return a(paramContext, true);
    }
    String str1 = efj.d(paramContext, this.b, this.a, 4);
    if (TextUtils.isEmpty(this.c))
    {
      hae localhae = new hae(true);
      hhn localhhn = (hhn)mbb.a(paramContext, hhn.class);
      String str2 = this.a;
      localhhn.a(((hho)mbb.a(paramContext, hho.class)).d(str2), 3);
      return localhae;
    }
    if (!this.c.equals(str1)) {
      return a(paramContext, true);
    }
    return a(paramContext, false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hlh
 * JD-Core Version:    0.7.0.1
 */