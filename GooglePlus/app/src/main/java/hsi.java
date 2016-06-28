import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public final class hsi
  implements hso
{
  public final void a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    long l1 = new File(localSQLiteDatabase.getPath()).length();
    long l2 = System.currentTimeMillis();
    if ((!paramBoolean) && (l1 < 1000000L)) {}
    do
    {
      return;
      localSQLiteDatabase.beginTransaction();
      try
      {
        Iterator localIterator = mbb.c(paramContext, hsa.class).iterator();
        while (localIterator.hasNext()) {
          ((hsa)localIterator.next()).a(paramContext, paramInt, localSQLiteDatabase);
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      localSQLiteDatabase.endTransaction();
    } while (!Log.isLoggable("PartitionedDatabase", 4));
    long l3 = new File(localSQLiteDatabase.getPath()).length();
    StringBuilder localStringBuilder = new StringBuilder();
    long l4 = System.currentTimeMillis() - l2;
    localStringBuilder.append(l4 / 1000L).append('.').append(l4 % 1000L).append(" seconds");
    String str = String.valueOf(localStringBuilder);
    new StringBuilder(85 + String.valueOf(str).length()).append(">>>>> cleanup db took ").append(str).append(" old size: ").append(l1).append(", new size: ").append(l3);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hsi
 * JD-Core Version:    0.7.0.1
 */