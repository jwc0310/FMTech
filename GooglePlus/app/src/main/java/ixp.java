import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

final class ixp
  extends SQLiteOpenHelper
{
  public ixp(Context paramContext)
  {
    super(paramContext, "networkstatistics.sqlite", null, 1);
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE historical_speed(day INTEGER NOT NULL, hour INTEGER NOT NULL, speed INTEGER NOT NULL,  timestamp DATETIME DEFAULT CURRENT_TIMESTAMP);");
    paramSQLiteDatabase.execSQL(String.format("CREATE UNIQUE INDEX day_index ON %s (%s, %s)", new Object[] { "historical_speed", "day", "hour" }));
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTShistorical_speed;");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ixp
 * JD-Core Version:    0.7.0.1
 */