import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.apps.plus.service.EsService;

public final class dlr
  implements Runnable
{
  public dlr(EsService paramEsService, boolean paramBoolean, Context paramContext, int paramInt, Intent paramIntent) {}
  
  public final void run()
  {
    Process.setThreadPriority(19);
    for (;;)
    {
      try
      {
        bsn localbsn;
        dka localdka;
        int i;
        if (this.a)
        {
          localbsn = bsn.c;
          localdka = (dka)mbb.a(this.b, dka.class);
          i = this.c;
          if (localbsn == bsn.c)
          {
            localdka.e(i);
            localdka.a(false);
            localdka.a(i, null, bsn.c);
            this.e.b(this.d, new dmx(), null);
          }
        }
        else
        {
          localbsn = bsn.b;
          continue;
        }
        boolean bool;
        if (localbsn != bsn.c)
        {
          bool = true;
          localdka.a(bool);
          localdka.a(i, null, localbsn);
        }
        else
        {
          bool = false;
        }
      }
      catch (Exception localException)
      {
        this.e.b(this.d, new dmx(0, null, localException), null);
        return;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dlr
 * JD-Core Version:    0.7.0.1
 */