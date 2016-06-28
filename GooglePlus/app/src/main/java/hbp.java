import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.social.mediamonitor.MediaMonitor;
import java.util.Iterator;
import java.util.List;

final class hbp
  implements Runnable
{
  hbp(hbo paramhbo, String paramString) {}
  
  public final void run()
  {
    SQLiteDatabase localSQLiteDatabase;
    synchronized (this.b.e)
    {
      localSQLiteDatabase = this.b.d.getWritableDatabase();
      localSQLiteDatabase.beginTransaction();
      try
      {
        String[] arrayOfString = new String[1];
        arrayOfString[0] = this.a;
        localSQLiteDatabase.delete("exclude_bucket", "bucket_id = ?", arrayOfString);
        Iterator localIterator = ((hba)mbb.a(this.b.c, hba.class)).e().iterator();
        while (localIterator.hasNext())
        {
          hbm.a(localSQLiteDatabase, ((Integer)localIterator.next()).intValue(), this.a);
          continue;
          localObject2 = finally;
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
    Intent localIntent = new Intent(this.b.c, MediaMonitor.class);
    localIntent.setAction("com.google.android.libraries.social.mediamonitor.FORCE_RESCAN");
    this.b.c.sendBroadcast(localIntent);
    localSQLiteDatabase.setTransactionSuccessful();
    localSQLiteDatabase.endTransaction();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hbp
 * JD-Core Version:    0.7.0.1
 */