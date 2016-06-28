import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.notifications.service.GunsService;
import java.util.Iterator;
import java.util.List;

public final class jbz
  implements jdu
{
  public final void a(Intent paramIntent, Context paramContext)
  {
    try
    {
      jco localjco = (jco)mbb.b(paramContext, jco.class);
      if (localjco != null)
      {
        localjco.a(jak.f, jak.d);
        boolean bool1 = paramIntent.getBooleanExtra("force_gcm_registration", false);
        boolean bool2 = paramIntent.getBooleanExtra("force_clean_slate", false);
        jaj localjaj = GunsService.c(paramIntent);
        ((jaa)mbb.a(paramContext, jaa.class)).a(bool1, localjaj);
        if (bool2)
        {
          jan localjan = GunsService.b(paramIntent);
          izy localizy = (izy)mbb.a(paramContext, izy.class);
          Iterator localIterator = ((giz)mbb.a(paramContext, giz.class)).a().iterator();
          while (localIterator.hasNext())
          {
            int i = ((Integer)localIterator.next()).intValue();
            localizy.c(i);
            localizy.a(i, izx.a, localjan);
          }
        }
      }
    }
    finally
    {
      gk.a(paramIntent);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jbz
 * JD-Core Version:    0.7.0.1
 */