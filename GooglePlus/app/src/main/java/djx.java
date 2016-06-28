import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import com.google.android.apps.plus.widget.EsWidgetProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class djx
  implements lrl
{
  private static final mfl a = new mfl("debug.plus.activities_intrvl_w", String.valueOf(TimeUnit.HOURS.toMillis(1L)));
  private static final mfl b = new mfl("debug.plus.activities_intrvl", String.valueOf(TimeUnit.HOURS.toMillis(24L)));
  private static final mfl c = new mfl("debug.plus.activities_ignore", "2147483647");
  private final Context d;
  private final giz e;
  
  public djx(Context paramContext)
  {
    this.d = paramContext;
    this.e = ((giz)mbb.a(paramContext, giz.class));
  }
  
  public final lrm a()
  {
    Context localContext = this.d;
    AppWidgetManager localAppWidgetManager = eaq.b(localContext);
    int i = 0;
    int k;
    int n;
    if (localAppWidgetManager != null)
    {
      int[] arrayOfInt = localAppWidgetManager.getAppWidgetIds(new ComponentName(localContext, EsWidgetProvider.class));
      int j = arrayOfInt.length;
      i = 0;
      if (j > 0)
      {
        k = 0;
        int m = arrayOfInt.length;
        i = 0;
        if (k < m)
        {
          n = arrayOfInt[k];
          if (eaq.a(localContext, n) == null) {
            break label206;
          }
          i = 1;
        }
      }
    }
    if (i != 0) {}
    for (Long localLong = Long.valueOf(a.a);; localLong = Long.valueOf(b.a))
    {
      long l = localLong.longValue();
      lrg locallrg1 = new lrg();
      locallrg1.a = "activities";
      locallrg1.b = Integer.valueOf(5);
      locallrg1.c = Integer.valueOf(17);
      locallrg1.d = Integer.valueOf(18);
      lrg locallrg2 = locallrg1.a(l);
      if (i == 0)
      {
        lsd locallsd = new lsd(this.d);
        locallsd.b = Long.valueOf(c.a).longValue();
        locallrg2.a(locallsd.a());
      }
      return locallrg2.a();
      label206:
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(n);
      Log.e("EsWidgetUtils", String.format("Widget %d has no config associated with it.", arrayOfObject));
      k++;
      break;
    }
  }
  
  public final void a(kck paramkck, int paramInt, lrh paramlrh)
  {
    Context localContext;
    if (this.e.a(paramInt).c("is_google_plus"))
    {
      localContext = this.d;
      if ((!paramkck.b()) && (eaq.a)) {}
    }
    else
    {
      return;
    }
    paramkck.b("Activities:Sync");
    AppWidgetManager localAppWidgetManager = eaq.b(localContext);
    Object localObject1;
    if (localAppWidgetManager == null) {
      localObject1 = Collections.emptyList();
    }
    ear localear2;
    int k;
    Object localObject2;
    for (;;)
    {
      Iterator localIterator = ((List)localObject1).iterator();
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label301;
        }
        localear2 = (ear)localIterator.next();
        if (localear2.a == paramInt)
        {
          if (!"v.whatshot".equals(localear2.b)) {
            break;
          }
          k = 2;
          localObject2 = null;
          paramlrh.a(lmp.a(localContext, paramInt, k, (String)localObject2, null, null, true, null, null, 20, null, null, paramkck, false, false, 0L, null));
        }
      }
      localObject1 = new ArrayList();
      int[] arrayOfInt = localAppWidgetManager.getAppWidgetIds(new ComponentName(localContext, EsWidgetProvider.class));
      if (arrayOfInt.length > 0)
      {
        HashSet localHashSet = new HashSet();
        int i = arrayOfInt.length;
        for (int j = 0; j < i; j++)
        {
          ear localear1 = eaq.a(localContext, arrayOfInt[j]);
          if ((localear1 != null) && (!localHashSet.contains(localear1)))
          {
            localHashSet.add(localear1);
            ((List)localObject1).add(localear1);
          }
        }
      }
    }
    if ("v.all.circles".equals(localear2.b)) {}
    for (String str = null;; str = localear2.b)
    {
      k = 1;
      localObject2 = str;
      break;
    }
    label301:
    paramkck.d();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     djx
 * JD-Core Version:    0.7.0.1
 */