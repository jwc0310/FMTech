import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

final class brz
  implements Runnable
{
  brz(Context paramContext, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, bsc parambsc) {}
  
  public final void run()
  {
    Thread.currentThread().setPriority(10);
    Context localContext = this.a;
    int i = this.b;
    boolean bool = this.c;
    int j = this.d;
    int k = this.e;
    bsc localbsc = this.f;
    jqx.a(localContext, i, localbsc.c, localbsc.d, localbsc.e, false);
    if (bool)
    {
      String str2 = localbsc.b;
      if (Log.isLoggable("EsTileSync", 2)) {
        new StringBuilder(71 + String.valueOf(str2).length()).append("Got next sync token in current page account: ").append(i).append(" nextSyncToken=").append(str2);
      }
      if (str2 == null)
      {
        ((dka)mbb.a(localContext, dka.class)).e(i);
        String str5 = String.valueOf("We got a null sync token from the server, pages read: ");
        throw new IllegalStateException(43 + String.valueOf(str5).length() + str5 + j + ", resume token type: " + k);
      }
      if (Log.isLoggable("EsTileSync", 2))
      {
        String str4 = String.valueOf(localbsc.a);
        new StringBuilder(108 + String.valueOf(str4).length() + String.valueOf(str2).length()).append("insertResumeAndNextSyncTokens account=").append(i).append(" resume token=").append(str4).append(" nextSyncToken=").append(str2).append(" resume token type=").append(k);
      }
      String str3 = localbsc.a;
      SQLiteDatabase localSQLiteDatabase = bqj.a(localContext, i).getWritableDatabase();
      localSQLiteDatabase.beginTransaction();
      try
      {
        bry.a(localSQLiteDatabase, str3, k);
        bry.a(localSQLiteDatabase, str2, 1);
        localSQLiteDatabase.setTransactionSuccessful();
        return;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
    if (Log.isLoggable("EsTileSync", 2))
    {
      String str1 = String.valueOf(localbsc.a);
      new StringBuilder(82 + String.valueOf(str1).length()).append("insertRequestToken account=").append(i).append(" resume token=").append(str1).append(" resume token type=").append(k);
    }
    bry.a(localContext, i, localbsc.a, k);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     brz
 * JD-Core Version:    0.7.0.1
 */