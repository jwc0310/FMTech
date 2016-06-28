import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class fmq
  extends eib<fml>
{
  private static volatile Bundle d;
  private static volatile Bundle e;
  public final HashMap<flo, fnb> a = new HashMap();
  private String b;
  private String c;
  
  public fmq(Context paramContext, Looper paramLooper, efg paramefg, efi paramefi, String paramString, ehq paramehq)
  {
    super(paramContext.getApplicationContext(), paramLooper, 5, paramehq, paramefg, paramefi);
    this.b = paramString;
    this.c = paramehq.e;
  }
  
  private void a(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    for (;;)
    {
      return;
      try
      {
        fme.a = paramBundle.getBoolean("use_contactables_api", true);
        fmp.a.a(paramBundle.getStringArray("config.url_uncompress.patterns"), paramBundle.getStringArray("config.url_uncompress.replacements"));
        d = paramBundle.getBundle("config.email_type_map");
        e = paramBundle.getBundle("config.phone_type_map");
      }
      finally {}
    }
  }
  
  public final fnb a(efd paramefd, flo paramflo)
  {
    synchronized (this.a)
    {
      if (this.a.containsKey(paramflo))
      {
        fnb localfnb2 = (fnb)this.a.get(paramflo);
        return localfnb2;
      }
      fnb localfnb1 = new fnb(paramefd.a(paramflo));
      this.a.put(paramflo, localfnb1);
      return localfnb1;
    }
  }
  
  public final void a()
  {
    for (;;)
    {
      fnb localfnb;
      synchronized (this.a)
      {
        if (!g()) {
          break;
        }
        Iterator localIterator = this.a.values().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        localfnb = (fnb)localIterator.next();
        localfnb.a.b = null;
      }
      try
      {
        ((fml)super.l()).a(localfnb, false, null, null, 0);
      }
      catch (RemoteException localRemoteException)
      {
        efj.d(5);
        continue;
        localObject = finally;
        throw localObject;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        efj.d(5);
      }
    }
    this.a.clear();
    super.a();
  }
  
  protected final void a(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramBundle != null)) {
      a(paramBundle.getBundle("post_init_configuration"));
    }
    if (paramBundle == null) {}
    for (Bundle localBundle = null;; localBundle = paramBundle.getBundle("post_init_resolution"))
    {
      super.a(paramInt1, paramIBinder, localBundle, paramInt2);
      return;
    }
  }
  
  public final void a(eft<flh> parameft, String paramString1, String paramString2, String paramString3, Collection<String> paramCollection, int paramInt1, boolean paramBoolean, long paramLong, String paramString4, int paramInt2, int paramInt3, int paramInt4)
  {
    super.k();
    fms localfms = new fms(parameft);
    try
    {
      fml localfml = (fml)super.l();
      if (paramCollection == null) {}
      for (Object localObject = null;; localObject = new ArrayList(paramCollection))
      {
        localfml.a(localfms, paramString1, paramString2, paramString3, (List)localObject, paramInt1, paramBoolean, paramLong, paramString4, paramInt2, paramInt3, paramInt4);
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localfms.a(8, null, null);
    }
  }
  
  protected final String c()
  {
    return "com.google.android.gms.people.service.START";
  }
  
  protected final String d()
  {
    return "com.google.android.gms.people.internal.IPeopleService";
  }
  
  protected final Bundle e()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("social_client_application_id", this.b);
    localBundle.putString("real_client_package_name", this.c);
    localBundle.putBoolean("support_new_image_callback", true);
    return localBundle;
  }
  
  public final fml f()
  {
    return (fml)super.l();
  }
  
  public final void n()
  {
    super.k();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fmq
 * JD-Core Version:    0.7.0.1
 */