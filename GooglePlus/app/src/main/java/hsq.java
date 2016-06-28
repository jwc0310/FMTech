import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public final class hsq
  implements hsp
{
  private static void a(Context paramContext, int paramInt, long paramLong)
  {
    ((giz)mbb.a(paramContext, giz.class)).b(paramInt).b("cleanup_timestamp", paramLong).d();
  }
  
  public final long a()
  {
    try
    {
      StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
      long l = localStatFs.getAvailableBlocks() * localStatFs.getBlockSize();
      if (Log.isLoggable("DataCleanupManager", 3)) {
        new StringBuilder(41).append("getAvailableStorage: ").append(l);
      }
      return l;
    }
    catch (Exception localException)
    {
      Log.e("DataCleanupManager", "getAvailableStorage", localException);
    }
    return -1L;
  }
  
  public final void a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      long l = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).a("cleanup_timestamp", 0L);
      if (System.currentTimeMillis() - l < 39600000L) {
        return;
      }
    }
    try
    {
      Iterator localIterator = mbb.c(paramContext, hso.class).iterator();
      while (localIterator.hasNext()) {
        ((hso)localIterator.next()).a(paramContext, paramInt, paramBoolean);
      }
    }
    finally
    {
      a(paramContext, paramInt, System.currentTimeMillis());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hsq
 * JD-Core Version:    0.7.0.1
 */