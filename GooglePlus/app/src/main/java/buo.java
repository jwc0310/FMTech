import android.content.ContentResolver;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;

public final class buo
  extends hqe<String>
{
  private String d;
  private String e;
  private String f;
  private int h;
  private final fv r = new fv(this);
  
  public buo(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    super(paramContext);
    this.d = paramString1;
    this.e = paramString3;
    this.f = paramString2;
    this.h = paramInt;
  }
  
  private String r()
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(this.l, this.h).getReadableDatabase();
    String[] arrayOfString;
    if (!TextUtils.isEmpty(this.d))
    {
      arrayOfString = new String[2];
      arrayOfString[0] = this.d;
      arrayOfString[1] = this.f;
    }
    try
    {
      String str = DatabaseUtils.stringForQuery(localSQLiteDatabase, "SELECT tile_id FROM all_tiles WHERE photo_id = ? AND view_id = ?", arrayOfString);
      if (!TextUtils.equals(str, this.e)) {
        this.e = str;
      }
      label71:
      return this.e;
    }
    catch (SQLiteDoneException localSQLiteDoneException)
    {
      break label71;
    }
  }
  
  protected final boolean o()
  {
    ContentResolver localContentResolver = this.l.getContentResolver();
    String str = this.e;
    localContentResolver.registerContentObserver(jrf.b.buildUpon().appendEncodedPath(str).build(), false, this.r);
    return true;
  }
  
  protected final boolean p()
  {
    this.l.getContentResolver().unregisterContentObserver(this.r);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     buo
 * JD-Core Version:    0.7.0.1
 */