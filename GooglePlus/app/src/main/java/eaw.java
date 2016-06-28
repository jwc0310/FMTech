import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService.RemoteViewsFactory;
import com.google.android.apps.plus.widget.locations.LocationsWidgetProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class eaw
  implements RemoteViewsService.RemoteViewsFactory
{
  HashMap<String, nve> a;
  List<eaz> b;
  private Context c;
  private int d;
  private ipb e;
  private hdg f;
  
  public eaw(Context paramContext, Intent paramIntent)
  {
    this.c = paramContext;
    this.d = paramIntent.getIntExtra("appWidgetId", 0);
    this.a = new HashMap();
  }
  
  private final Bitmap a(eaz parameaz)
  {
    try
    {
      ipf localipf = ipf.a(this.c, parameaz.d.g, ipm.a);
      Bitmap localBitmap = (Bitmap)new ipc(this.e, null, localipf, 0, 290, 210, 0).a();
      return localBitmap;
    }
    catch (kbm localkbm)
    {
      Object[] arrayOfObject = new Object[0];
      if (Log.isLoggable("LWStackViewsFactory", 3)) {
        String.format("Cannot download map", arrayOfObject);
      }
      return null;
    }
    catch (kbc localkbc) {}
    return null;
  }
  
  private static eaz a(String paramString, nve paramnve)
  {
    if ((paramString == null) || (paramnve == null)) {}
    eaz localeaz;
    do
    {
      return null;
      localeaz = new eaz();
      localeaz.d = efj.a(paramnve.b);
    } while (localeaz.d == null);
    localeaz.a = paramString;
    localeaz.b = paramnve.c;
    localeaz.c = efj.E(paramnve.d);
    return localeaz;
  }
  
  private final Bitmap b(eaz parameaz)
  {
    try
    {
      Bitmap localBitmap = (Bitmap)this.f.b(parameaz.c, 2, 2);
      return localBitmap;
    }
    catch (kbm localkbm)
    {
      Object[] arrayOfObject = new Object[0];
      if (Log.isLoggable("LWStackViewsFactory", 3)) {
        String.format("Cannot download avatar", arrayOfObject);
      }
      return null;
    }
    catch (kbc localkbc) {}
    return null;
  }
  
  final List<eaz> a(int paramInt, String paramString)
  {
    jmd localjmd = new jmd(((jiw)mbb.a(this.c, jiw.class)).a(paramInt, 0, new eay(this, paramString)));
    ArrayList localArrayList = new ArrayList();
    try
    {
      while (localjmd.moveToNext())
      {
        String str = localjmd.getString(11);
        eaz localeaz = a(str, (nve)this.a.get(str));
        if (localeaz != null) {
          localArrayList.add(localeaz);
        }
      }
    }
    finally
    {
      localjmd.close();
    }
    return localArrayList;
  }
  
  public final int getCount()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.size();
  }
  
  public final long getItemId(int paramInt)
  {
    return ((eaz)this.b.get(paramInt)).a.hashCode();
  }
  
  public final RemoteViews getLoadingView()
  {
    Object[] arrayOfObject = new Object[0];
    if (Log.isLoggable("LWStackViewsFactory", 3)) {
      String.format("getLoadingView", arrayOfObject);
    }
    return null;
  }
  
  public final RemoteViews getViewAt(int paramInt)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    if (Log.isLoggable("LWStackViewsFactory", 3)) {
      String.format("getViewAt(%d)", arrayOfObject1);
    }
    if ((this.b == null) || (paramInt >= this.b.size()))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(getCount());
      if (Log.isLoggable("LWStackViewsFactory", 3)) {
        String.format("Invalid mWidgetItems when getCount() = %d", arrayOfObject2);
      }
      return null;
    }
    eaz localeaz = (eaz)this.b.get(paramInt);
    Object[] arrayOfObject3 = new Object[3];
    arrayOfObject3[0] = localeaz.b;
    arrayOfObject3[1] = localeaz.d.f;
    arrayOfObject3[2] = localeaz.c;
    if (Log.isLoggable("LWStackViewsFactory", 3)) {
      String.format("%s, %s, %s", arrayOfObject3);
    }
    RemoteViews localRemoteViews = new RemoteViews(this.c.getPackageName(), efj.uy);
    localRemoteViews.setTextViewText(aaw.bK, localeaz.b);
    localRemoteViews.setTextViewText(aaw.bJ, localeaz.d.f);
    localRemoteViews.setTextViewText(aaw.bI, efj.a(this.c, localeaz.d.d.longValue()));
    Bitmap localBitmap1 = a(localeaz);
    if (localBitmap1 == null)
    {
      Object[] arrayOfObject5 = new Object[2];
      arrayOfObject5[0] = Integer.valueOf(paramInt);
      arrayOfObject5[1] = localeaz.b;
      if (Log.isLoggable("LWStackViewsFactory", 3)) {
        String.format("Error downloading map (%d): %s", arrayOfObject5);
      }
      return null;
    }
    Bitmap localBitmap2 = b(localeaz);
    localRemoteViews.setImageViewBitmap(aaw.eU, localBitmap1);
    localRemoteViews.setImageViewBitmap(aaw.at, localBitmap2);
    Intent localIntent = new Intent();
    localIntent.putExtra("appWidgetId", this.d);
    localIntent.putExtra("gaia_id", localeaz.a);
    localRemoteViews.setOnClickFillInIntent(aaw.hP, localIntent);
    Object[] arrayOfObject4 = new Object[1];
    arrayOfObject4[0] = Integer.valueOf(paramInt);
    if (Log.isLoggable("LWStackViewsFactory", 3)) {
      String.format("getViewAt(%d) finishing", arrayOfObject4);
    }
    return localRemoteViews;
  }
  
  public final int getViewTypeCount()
  {
    return 1;
  }
  
  public final boolean hasStableIds()
  {
    return true;
  }
  
  public final void onCreate()
  {
    Object[] arrayOfObject = new Object[0];
    if (Log.isLoggable("LWStackViewsFactory", 3)) {
      String.format("onCreate", arrayOfObject);
    }
    this.e = ((ipb)mbb.a(this.c, ipb.class));
    this.f = ((hdg)mbb.a(this.c, hdg.class));
  }
  
  public final void onDataSetChanged()
  {
    Object[] arrayOfObject1 = new Object[0];
    if (Log.isLoggable("LWStackViewsFactory", 3)) {
      String.format("onDataSetChanged", arrayOfObject1);
    }
    eba localeba = efj.o(this.c, this.d);
    if (localeba == null)
    {
      LocationsWidgetProvider.a(this.c, this.d, true);
      return;
    }
    int i = localeba.a;
    Object[] arrayOfObject2 = new Object[0];
    if (Log.isLoggable("LWStackViewsFactory", 3)) {
      String.format("Configuration OK. Getting friends sharing.", arrayOfObject2);
    }
    ijb localijb = new ijb(this.c, i, 0, false);
    localijb.i();
    if (localijb.n())
    {
      LocationsWidgetProvider.a(this.c, this.d, true);
      return;
    }
    nve[] arrayOfnve = localijb.a;
    this.a.clear();
    int j = arrayOfnve.length;
    for (int k = 0; k < j; k++)
    {
      nve localnve2 = arrayOfnve[k];
      this.a.put(localnve2.a, localnve2);
    }
    Object[] arrayOfObject3 = new Object[1];
    arrayOfObject3[0] = Integer.valueOf(this.a.size());
    if (Log.isLoggable("LWStackViewsFactory", 3)) {
      String.format("%d friends currently sharing", arrayOfObject3);
    }
    if (!TextUtils.isEmpty(localeba.c))
    {
      nve localnve1 = (nve)this.a.get(localeba.c);
      eaz localeaz = a(localeba.c, localnve1);
      if (localeaz != null)
      {
        this.b = new ArrayList();
        this.b.add(localeaz);
      }
    }
    for (;;)
    {
      LocationsWidgetProvider.a(this.c, this.d, true);
      return;
      if (TextUtils.isEmpty(localeba.b)) {
        continue;
      }
      eax localeax = new eax(this, localeba);
      localeax.start();
      try
      {
        localeax.join();
        label326:
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Integer.valueOf(this.b.size());
        if (!Log.isLoggable("LWStackViewsFactory", 3)) {
          continue;
        }
        String.format("%d friends in selected circle", arrayOfObject4);
      }
      catch (InterruptedException localInterruptedException)
      {
        break label326;
      }
    }
  }
  
  public final void onDestroy()
  {
    Object[] arrayOfObject = new Object[0];
    if (Log.isLoggable("LWStackViewsFactory", 3)) {
      String.format("onDestroy", arrayOfObject);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eaw
 * JD-Core Version:    0.7.0.1
 */