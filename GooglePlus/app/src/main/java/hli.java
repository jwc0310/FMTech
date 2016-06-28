import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

public final class hli
  extends gzf
{
  private final int a;
  private final String b;
  private final boolean c;
  
  private hli(int paramInt, boolean paramBoolean, String paramString)
  {
    super("GetFeaturedCollexionsTask");
    this.a = paramInt;
    this.c = paramBoolean;
    this.b = paramString;
  }
  
  private final hae a(Context paramContext, String paramString, boolean paramBoolean)
  {
    hkh localhkh = new hkh(paramContext, new kch().a(paramContext, this.a).a(), this.b);
    localhkh.i();
    qat localqat1;
    qat localqat2;
    label80:
    qat localqat3;
    if (!localhkh.n())
    {
      if (!localhkh.x) {
        break label530;
      }
      localqat1 = localhkh.w;
      if (localqat1 != null)
      {
        if (!localhkh.x) {
          break label536;
        }
        localqat2 = localhkh.w;
        if (((mto)localqat2).a != null)
        {
          if (!localhkh.x) {
            break label542;
          }
          localqat3 = localhkh.w;
          label106:
          if (((mto)localqat3).a.a != null) {
            if (!localhkh.x) {
              break label548;
            }
          }
        }
      }
    }
    label524:
    label530:
    label536:
    label542:
    label548:
    for (qat localqat4 = localhkh.w;; localqat4 = null)
    {
      nfq localnfq = ((mto)localqat4).a;
      nej localnej = localnfq.a;
      String str = localnfq.b;
      SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.a);
      localSQLiteDatabase.beginTransaction();
      for (;;)
      {
        int k;
        try
        {
          efj.a(localSQLiteDatabase, paramString, 3, str);
          efj.a(localSQLiteDatabase, ((giz)mbb.a(paramContext, giz.class)).a(this.a).b("gaia_id"), 0);
          if (paramBoolean) {
            localSQLiteDatabase.delete("fcxns", null, null);
          }
          if (localnej.a != null)
          {
            nei[] arrayOfnei = localnej.a;
            int j = arrayOfnei.length;
            k = 0;
            if (k < j)
            {
              nei localnei = arrayOfnei[k];
              if ((localnei == null) || (localnei.b == null) || (localnei.b.a == null)) {
                break label524;
              }
              efj.a(localSQLiteDatabase, localnei, null);
              ContentValues localContentValues = new ContentValues(2);
              localContentValues.put("cxn_id", localnei.b.a.a);
              localContentValues.put("suggestion_id", localnei.h);
              localSQLiteDatabase.insertWithOnConflict("fcxns", null, localContentValues, 5);
              break label524;
            }
          }
          localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
          hae localhae3 = new hae(localhkh.o, localhkh.q, null);
          localhae3.a().putString("continuation_token", localnfq.b);
          i = 3;
          localObject1 = localhae3;
          hhn localhhn = (hhn)mbb.a(paramContext, hhn.class);
          Uri localUri = ((hho)mbb.a(paramContext, hho.class)).b();
          localhhn.a(localUri, i);
          if (i == 3) {
            paramContext.getContentResolver().notifyChange(localUri, null);
          }
          return localObject1;
        }
        finally
        {
          localSQLiteDatabase.endTransaction();
        }
        hae localhae2 = new hae(0, null, null);
        int i = 2;
        Object localObject1 = localhae2;
        continue;
        hae localhae1 = new hae(localhkh.o, localhkh.q, null);
        i = 2;
        localObject1 = localhae1;
        continue;
        k++;
      }
      localqat1 = null;
      break;
      localqat2 = null;
      break label80;
      localqat3 = null;
      break label106;
    }
  }
  
  public static void a(Context paramContext, gzj paramgzj, int paramInt, boolean paramBoolean, String paramString)
  {
    if (!((hhn)mbb.a(paramContext, hhn.class)).a(((hho)mbb.a(paramContext, hho.class)).b(), 1)) {
      return;
    }
    hli localhli = new hli(paramInt, paramBoolean, paramString);
    if (paramgzj == null)
    {
      gzj.a(paramContext, localhli);
      return;
    }
    paramgzj.b(localhli);
  }
  
  protected final hae a(Context paramContext)
  {
    String str1 = ((giz)mbb.a(paramContext, giz.class)).a(this.a).b("gaia_id");
    long l = efj.b(paramContext, this.a, str1, 0);
    if ((this.c) || (System.currentTimeMillis() - l > 86400000L)) {}
    for (int i = 1; i != 0; i = 0) {
      return a(paramContext, str1, true);
    }
    String str2 = efj.d(paramContext, this.a, str1, 3);
    if (TextUtils.isEmpty(this.b))
    {
      hae localhae = new hae(true);
      ((hhn)mbb.a(paramContext, hhn.class)).a(((hho)mbb.a(paramContext, hho.class)).b(), 3);
      return localhae;
    }
    if (!this.b.equals(str2)) {
      return a(paramContext, str1, true);
    }
    return a(paramContext, str1, false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hli
 * JD-Core Version:    0.7.0.1
 */