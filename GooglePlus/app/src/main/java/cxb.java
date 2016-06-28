import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;

public final class cxb
  extends gzf
{
  private final kcg a;
  private int b;
  private String c;
  
  public cxb(Context paramContext, int paramInt, String paramString)
  {
    super("GetFollowersTask");
    this.a = new kch().a(paramContext, paramInt).a();
    this.b = paramInt;
    this.c = paramString;
  }
  
  protected final hae a(Context paramContext)
  {
    int i = 0;
    cxa localcxa = new cxa(paramContext, this.a, this.c);
    localcxa.b.i();
    localcxa.b.c("GetFollowersOperation");
    if (localcxa.b.n()) {
      return new hae(localcxa.b.o, localcxa.b.q, null);
    }
    qpw[] arrayOfqpw;
    if (localcxa.b.n()) {
      arrayOfqpw = null;
    }
    while (arrayOfqpw == null)
    {
      return new hae(0, null, null);
      int j = localcxa.b.a(cxa.a);
      if (j == -1)
      {
        arrayOfqpw = null;
      }
      else
      {
        qxc localqxc2 = (qxc)localcxa.b.a(j, qxc.a);
        if ((localqxc2 == null) || (localqxc2.b == null)) {
          arrayOfqpw = null;
        } else {
          arrayOfqpw = localqxc2.b.a;
        }
      }
    }
    String str;
    if (localcxa.b.n()) {
      str = null;
    }
    for (;;)
    {
      this.c = str;
      SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.b);
      localSQLiteDatabase.beginTransaction();
      try
      {
        for (;;)
        {
          if (i < arrayOfqpw.length)
          {
            if (arrayOfqpw[i].a == 103985984)
            {
              qwz localqwz = (qwz)arrayOfqpw[i].b(qwz.a);
              if (localqwz != null)
              {
                ContentValues localContentValues = new ContentValues(1);
                localContentValues.put("follower_payload", qwz.a(localqwz));
                localSQLiteDatabase.insertWithOnConflict("followers", null, localContentValues, 5);
              }
            }
            i++;
            continue;
            int k = localcxa.b.a(cxa.a);
            if (k == -1)
            {
              str = null;
              break;
            }
            qxc localqxc1 = (qxc)localcxa.b.a(k, qxc.a);
            if ((localqxc1 == null) || (localqxc1.b == null) || (localqxc1.b.b == null))
            {
              str = null;
              break;
            }
            str = localqxc1.b.b.a;
            break;
          }
        }
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        hae localhae = new hae(localcxa.b.o, localcxa.b.q, null);
        localhae.a().putString("continuation_token", this.c);
        paramContext.getContentResolver().notifyChange(Uri.parse("content://com.google.android.apps.plus.people/followers"), null);
        return localhae;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cxb
 * JD-Core Version:    0.7.0.1
 */