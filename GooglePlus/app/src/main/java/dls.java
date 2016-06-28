import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.apps.plus.service.EsService;

public final class dls
  implements Runnable
{
  public dls(EsService paramEsService, Context paramContext, int paramInt, long paramLong, Intent paramIntent) {}
  
  public final void run()
  {
    try
    {
      dka localdka = (dka)mbb.a(this.a, dka.class);
      int i = this.b;
      long l1 = this.c;
      efj.l();
      localdka.b(i).b("pressed_load_more", true).d();
      if (l1 >= jqx.a(localdka.a, i)) {}
      synchronized (localdka.c(i))
      {
        long l2 = jqx.a(localdka.a, i);
        if (Log.isLoggable("AllPhotosSyncManager", 3))
        {
          String str = String.valueOf("loadMoreMedia accountId: ");
          int k = localdka.a(i).a("current_metadata_limit", 24000);
          long l3 = jqx.b(localdka.a, i);
          boolean bool = bry.c(localdka.a, i);
          new StringBuilder(191 + String.valueOf(str).length()).append(str).append(i).append(" target item count: ").append(l1).append(" current item count: ").append(l2).append(" current metadata cap: ").append(k).append(" current metadata count: ").append(l3).append(" syncComplete: ").append(bool);
        }
        while ((l1 > l2) && (!bry.c(localdka.a, i)))
        {
          int j = localdka.a(i).a("current_metadata_limit", 24000);
          localdka.b(i).b("current_metadata_limit", j + 2000).d();
          localdka.a(i, null, bsn.d);
          l2 = jqx.a(localdka.a, i);
        }
        this.e.b(this.d, new dmx(), null);
        return;
      }
      return;
    }
    catch (Exception localException)
    {
      this.e.b(this.d, new dmx(0, null, localException), null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dls
 * JD-Core Version:    0.7.0.1
 */