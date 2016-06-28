import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class jzw
  extends gzf
{
  private final int a;
  private final String b;
  
  public jzw(int paramInt, String paramString)
  {
    super("getCoverPhotoTask");
    this.a = paramInt;
    this.b = paramString;
  }
  
  protected final hae a(Context paramContext)
  {
    jzv localjzv = new jzv(paramContext, new kch().a(paramContext, this.a).a(), this.b);
    localjzv.a.i();
    localjzv.a.c("getCoverPhotoOperation");
    if (localjzv.a.n()) {
      return new hae(localjzv.a.o, localjzv.a.q, null);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.a);
    ContentValues localContentValues = new ContentValues(1);
    localContentValues.put("cover_photo", qat.a(localjzv.a()));
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.b;
    localSQLiteDatabase.update("profile_header", localContentValues, "gaia_id=?", arrayOfString);
    paramContext.getContentResolver().notifyChange(((jyx)mbb.a(paramContext, jyx.class)).a(), null);
    return new hae(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jzw
 * JD-Core Version:    0.7.0.1
 */