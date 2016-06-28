import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hll
  extends gzf
{
  private final int a;
  private final String b;
  
  private hll(int paramInt, String paramString)
  {
    super("GetUserOwnedCollexions");
    this.a = paramInt;
    this.b = paramString;
  }
  
  public static void a(Context paramContext, gzj paramgzj, int paramInt, String paramString)
  {
    if (!((hhn)mbb.a(paramContext, hhn.class)).a(((hho)mbb.a(paramContext, hho.class)).b(paramString), 1)) {
      return;
    }
    gzj.a(paramContext, new hll(paramInt, paramString));
  }
  
  private final void a(Context paramContext, nej paramnej)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.a);
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      ArrayList localArrayList;
      int j;
      try
      {
        localArrayList = new ArrayList();
        nei[] arrayOfnei = paramnej.a;
        int i = arrayOfnei.length;
        j = 0;
        if (j < i)
        {
          nei localnei = arrayOfnei[j];
          Object localObject2 = null;
          if (localnei != null)
          {
            ndy localndy = localnei.b;
            localObject2 = null;
            if (localndy != null)
            {
              ndt localndt = localnei.b.a;
              localObject2 = null;
              if (localndt != null)
              {
                String[] arrayOfString1 = new String[1];
                arrayOfString1[0] = localnei.b.a.a;
                Cursor localCursor = localSQLiteDatabase.query("cxns", null, "cxn_id = ? ", arrayOfString1, null, null, null);
                localObject2 = localCursor;
              }
            }
          }
          if (localObject2 == null) {
            break label297;
          }
          try
          {
            if (!localObject2.moveToFirst()) {
              break label297;
            }
            localObject3 = localObject2;
            localArrayList.add(efj.a(localnei, localObject3));
          }
          finally
          {
            if (localObject2 != null) {
              localObject2.close();
            }
          }
        }
        arrayOfString2 = new String[1];
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      String[] arrayOfString2;
      arrayOfString2[0] = this.b;
      localSQLiteDatabase.delete("cxns", "owner_gaia_id = ? ", arrayOfString2);
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext()) {
        localSQLiteDatabase.insertWithOnConflict("cxns", null, (ContentValues)localIterator.next(), 5);
      }
      efj.a(localSQLiteDatabase, this.b, 1);
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      return;
      j++;
      continue;
      label297:
      Object localObject3 = null;
    }
  }
  
  private final void f(Context paramContext)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.a);
    localSQLiteDatabase.beginTransaction();
    try
    {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = this.b;
      localSQLiteDatabase.delete("cxns", "owner_gaia_id = ? ", arrayOfString);
      efj.a(localSQLiteDatabase, this.b, 1);
      localSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  protected final hae a(Context paramContext)
  {
    hkk localhkk = new hkk(paramContext, new kch().a(paramContext, this.a).a(), this.b);
    localhkk.i();
    int i = localhkk.o;
    Exception localException = localhkk.q;
    qat localqat1;
    qat localqat2;
    label84:
    qat localqat3;
    if (!localhkk.n())
    {
      if (!localhkk.x) {
        break label235;
      }
      localqat1 = localhkk.w;
      if (localqat1 != null)
      {
        if (!localhkk.x) {
          break label241;
        }
        localqat2 = localhkk.w;
        if (((mvi)localqat2).a != null)
        {
          if (!localhkk.x) {
            break label247;
          }
          localqat3 = localhkk.w;
          label108:
          if (((mvi)localqat3).a.a != null) {
            break label253;
          }
        }
      }
    }
    if (((ixf)mbb.a(paramContext, ixf.class)).a()) {
      efj.a(hsb.a(paramContext, this.a), this.b, 1);
    }
    int j = 0;
    label158:
    hhn localhhn = (hhn)mbb.a(paramContext, hhn.class);
    String str = this.b;
    Uri localUri = ((hho)mbb.a(paramContext, hho.class)).b(str);
    if (j == 200)
    {
      localhhn.a(localUri, 3);
      paramContext.getContentResolver().notifyChange(localUri, null);
    }
    for (;;)
    {
      return new hae(j, localException, null);
      label235:
      localqat1 = null;
      break;
      label241:
      localqat2 = null;
      break label84;
      label247:
      localqat3 = null;
      break label108;
      label253:
      if (localhkk.x) {}
      nej localnej;
      for (qat localqat4 = localhkk.w;; localqat4 = null)
      {
        localnej = ((mvi)localqat4).a.a;
        if ((localnej.a != null) && (localnej.a.length != 0)) {
          break label313;
        }
        f(paramContext);
        j = i;
        break;
      }
      label313:
      a(paramContext, localnej);
      j = i;
      break label158;
      localhhn.a(localUri, 2);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hll
 * JD-Core Version:    0.7.0.1
 */