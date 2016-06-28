import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class him
  implements jjs
{
  private final Context a;
  
  public him(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private final void a(int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    String str = jjf.c(paramString);
    if (str == null) {
      return;
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.a, paramInt1);
    ContentValues localContentValues = new ContentValues(1);
    localContentValues.put("follow_state", Integer.valueOf(paramInt3));
    String[] arrayOfString = new String[2];
    arrayOfString[0] = str;
    arrayOfString[1] = String.valueOf(paramInt2);
    localSQLiteDatabase.update("cxns", localContentValues, "owner_gaia_id = ? AND auto_follow_state = 1 AND follow_state = ?", arrayOfString);
    this.a.getContentResolver().notifyChange(((hho)mbb.a(this.a, hho.class)).b(str), null);
  }
  
  public final void a(int paramInt, String paramString)
  {
    a(paramInt, paramString, 1, 5);
  }
  
  public final void b(int paramInt, String paramString)
  {
    a(paramInt, paramString, 5, 1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     him
 * JD-Core Version:    0.7.0.1
 */