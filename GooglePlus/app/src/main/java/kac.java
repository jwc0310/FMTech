import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class kac
  extends gzf
{
  private final int a;
  private final String b;
  
  public kac(int paramInt, String paramString)
  {
    super("getPhotoTask");
    this.a = paramInt;
    this.b = paramString;
  }
  
  protected final hae a(Context paramContext)
  {
    kab localkab = new kab(paramContext, new kch().a(paramContext, this.a).a(), this.b);
    localkab.a.i();
    localkab.a.c("getPhotoOperation");
    if (localkab.a.n()) {
      return new hae(localkab.a.o, localkab.a.q, null);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.a);
    ContentValues localContentValues = new ContentValues(1);
    localContentValues.put("photo", qat.a(localkab.a()));
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.b;
    localSQLiteDatabase.update("profile_header", localContentValues, "gaia_id=?", arrayOfString);
    paramContext.getContentResolver().notifyChange(((jyx)mbb.a(paramContext, jyx.class)).a(), null);
    return new hae(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kac
 * JD-Core Version:    0.7.0.1
 */