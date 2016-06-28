import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import java.util.Calendar;

class ixg
  implements BaseColumns, ixo
{
  final ixp a;
  final Calendar b;
  
  public ixg(Context paramContext)
  {
    this.a = new ixp(paramContext);
    this.b = Calendar.getInstance();
  }
  
  public long a(int paramInt1, int paramInt2, long paramLong)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("hour", Integer.valueOf(paramInt1));
    localContentValues.put("day", Integer.valueOf(paramInt2));
    localContentValues.put("speed", Long.valueOf(paramLong));
    return this.a.getWritableDatabase().replace("historical_speed", null, localContentValues);
  }
  
  public void a(long paramLong)
  {
    a(this.b.get(11), this.b.get(7), paramLong);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ixg
 * JD-Core Version:    0.7.0.1
 */