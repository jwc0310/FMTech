import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cut
  implements jay
{
  private final Context a;
  
  public cut(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private final Intent a(jah paramjah, int paramInt)
  {
    if (paramjah == null) {
      return null;
    }
    if (paramjah.c != null)
    {
      mlr localmlr = (mlr)paramjah.c.b(mlr.a);
      if (localmlr != null) {
        for (mlu localmlu : localmlr.b)
        {
          Iterator localIterator = mbb.c(this.a, jtk.class).iterator();
          while (localIterator.hasNext())
          {
            Intent localIntent = ((jtk)localIterator.next()).a(paramInt, localmlu);
            if (localIntent != null)
            {
              localIntent.putExtra("com.google.android.libraries.social.notifications.notif_id", paramjah.a);
              return localIntent;
            }
          }
        }
      }
    }
    String str = paramjah.b;
    if (!TextUtils.isEmpty(str)) {
      return efj.f(this.a, paramInt, str);
    }
    return null;
  }
  
  public final void a(int paramInt, jah[] paramArrayOfjah, jaz paramjaz)
  {
    if (paramInt == -1) {}
    Intent localIntent1;
    label145:
    do
    {
      for (;;)
      {
        return;
        if (paramArrayOfjah.length > 1)
        {
          dbh localdbh = new dbh(this.a);
          localdbh.a.putExtra("account_id", paramInt);
          localdbh.a.putExtra("show_notifications", true);
          localIntent1 = localdbh.a;
        }
        while (localIntent1 != null)
        {
          if (paramjaz != jaz.a) {
            break label145;
          }
          fe localfe = new fe(this.a);
          Intent localIntent2 = efj.b(this.a, paramInt);
          localfe.a.add(localIntent2);
          localfe.a.add(localIntent1);
          localfe.a();
          return;
          int i = paramArrayOfjah.length;
          localIntent1 = null;
          if (i == 1) {
            localIntent1 = a(paramArrayOfjah[0], paramInt);
          }
        }
      }
    } while (paramjaz != jaz.b);
    localIntent1.setFlags(268435456);
    this.a.startActivity(localIntent1);
  }
  
  public final void a(int paramInt, mkr[] paramArrayOfmkr, jah paramjah)
  {
    int i = 0;
    if (paramInt == -1) {}
    for (;;)
    {
      return;
      if ((paramArrayOfmkr.length == 1) && (!TextUtils.isEmpty(paramArrayOfmkr[0].b))) {}
      for (Object localObject = efj.a(this.a, paramInt, paramArrayOfmkr[0].b, paramjah.a, false); localObject != null; localObject = null) {
        for (;;)
        {
          ((Intent)localObject).setFlags(268435456);
          this.a.startActivity((Intent)localObject);
          return;
          if (paramArrayOfmkr.length > 1)
          {
            ArrayList localArrayList = new ArrayList(paramArrayOfmkr.length);
            while (i < paramArrayOfmkr.length)
            {
              if (!TextUtils.isEmpty(paramArrayOfmkr[i].b)) {
                localArrayList.add(new bpx(paramArrayOfmkr[i].b, paramArrayOfmkr[i].c, paramArrayOfmkr[i].a));
              }
              i++;
            }
            try
            {
              byte[] arrayOfByte = bpw.a(localArrayList);
              Intent localIntent1 = a(paramjah, paramInt);
              Intent localIntent2 = efj.a(this.a, paramInt, arrayOfByte, localIntent1);
              localObject = localIntent2;
            }
            catch (IOException localIOException) {}
          }
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cut
 * JD-Core Version:    0.7.0.1
 */