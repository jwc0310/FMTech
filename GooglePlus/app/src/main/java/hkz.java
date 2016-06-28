import android.content.ContentResolver;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class hkz
  extends gzf
{
  private final String a;
  private final int b;
  private final String c;
  
  public hkz(int paramInt, String paramString1, String paramString2)
  {
    super("DeleteCollexion");
    this.b = paramInt;
    this.c = paramString1;
    this.a = paramString2;
  }
  
  protected final hae a(Context paramContext)
  {
    hjz localhjz = new hjz(paramContext, new kch().a(paramContext, this.b).a(), this.a);
    localhjz.i();
    if (localhjz.n()) {
      return new hae(localhjz.o, localhjz.q, null);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.b);
    localSQLiteDatabase.beginTransaction();
    try
    {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = this.a;
      localSQLiteDatabase.delete("cxns", "cxn_id = ?", arrayOfString);
      String str = efj.a(this.c, null, false, null, null, 5, this.a);
      lmp.g(paramContext, this.b, str);
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      paramContext.getContentResolver().notifyChange(((hho)mbb.a(paramContext, hho.class)).a(), null);
      return new hae(localhjz.o, localhjz.q, null);
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(efj.Im);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hkz
 * JD-Core Version:    0.7.0.1
 */