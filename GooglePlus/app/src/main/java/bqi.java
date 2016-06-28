import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

@Deprecated
public final class bqi
  implements hso
{
  public final void a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    long l = new File(localSQLiteDatabase.getPath()).length();
    if ((!paramBoolean) && (l < 1000000L)) {
      return;
    }
    localSQLiteDatabase.beginTransaction();
    try
    {
      bqo.a(localSQLiteDatabase);
      if (!((jaq)mbb.a(paramContext, jaq.class)).d()) {
        brg.a(localSQLiteDatabase);
      }
      brd.a();
      lnj.a(localSQLiteDatabase);
      brn.a(paramContext, localSQLiteDatabase, paramInt);
      efj.a(paramContext, localSQLiteDatabase, paramInt);
      localSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bqi
 * JD-Core Version:    0.7.0.1
 */