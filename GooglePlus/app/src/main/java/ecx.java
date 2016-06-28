import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class ecx
  extends eib<edg>
{
  static final edm a = new edm("CastClientImpl");
  static final Object g = new Object();
  static final Object h = new Object();
  private Bundle A;
  private eft<ebo> B;
  private eft<Status> C;
  public final Map<String, ebu> b;
  public boolean c;
  public double d;
  public final AtomicLong e;
  public final Map<Long, eft<Status>> f;
  private ApplicationMetadata n;
  private final CastDevice o;
  private final ebt p;
  private final long q;
  private edk r;
  private String s;
  private boolean t;
  private boolean u;
  private boolean v;
  private int w;
  private int x;
  private String y;
  private String z;
  
  public ecx(Context paramContext, Looper paramLooper, ehq paramehq, CastDevice paramCastDevice, long paramLong, ebt paramebt, efg paramefg, efi paramefi)
  {
    super(paramContext, paramLooper, 10, paramehq, paramefg, paramefi);
    this.o = paramCastDevice;
    this.p = paramebt;
    this.q = paramLong;
    this.b = new HashMap();
    this.e = new AtomicLong(0L);
    this.f = new HashMap();
    n();
  }
  
  private final void n()
  {
    this.v = false;
    this.w = -1;
    this.x = -1;
    this.n = null;
    this.s = null;
    this.d = 0.0D;
    this.c = false;
  }
  
  private final void o()
  {
    a.a("removing all MessageReceivedCallbacks", new Object[0]);
    synchronized (this.b)
    {
      this.b.clear();
      return;
    }
  }
  
  public final void a()
  {
    edm localedm1 = a;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = this.r;
    arrayOfObject1[1] = Boolean.valueOf(g());
    localedm1.a("disconnect(); ServiceListener=%s, isConnected=%b", arrayOfObject1);
    edk localedk = this.r;
    this.r = null;
    if ((localedk == null) || (localedk.b() == null))
    {
      a.a("already disposed, so short-circuiting", new Object[0]);
      return;
    }
    o();
    try
    {
      if ((g()) || (j())) {
        ((edg)l()).a();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      edm localedm2 = a;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localRemoteException.getMessage();
      localedm2.a(localRemoteException, "Error while disconnecting the controller interface: %s", arrayOfObject2);
      return;
    }
    finally
    {
      super.a();
    }
  }
  
  protected final void a(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    edm localedm = a;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    localedm.a("in onPostInitHandler; statusCode=%d", arrayOfObject);
    if ((paramInt1 == 0) || (paramInt1 == 1001))
    {
      this.v = true;
      this.t = true;
      this.u = true;
    }
    for (;;)
    {
      if (paramInt1 == 1001)
      {
        this.A = new Bundle();
        this.A.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
        paramInt1 = 0;
      }
      super.a(paramInt1, paramIBinder, paramBundle, paramInt2);
      return;
      this.v = false;
    }
  }
  
  public final void a(ConnectionResult paramConnectionResult)
  {
    super.a(paramConnectionResult);
    o();
  }
  
  public final void a(eft<ebo> parameft)
  {
    synchronized (g)
    {
      if (this.B != null) {
        this.B.a(new ecy(new Status(2002)));
      }
      this.B = parameft;
      return;
    }
  }
  
  public final void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Channel namespace cannot be null or empty");
    }
    synchronized (this.b)
    {
      ebu localebu = (ebu)this.b.remove(paramString);
      if (localebu == null) {}
    }
    edm localedm;
    Object[] arrayOfObject;
  }
  
  public final Bundle b()
  {
    if (this.A != null)
    {
      Bundle localBundle = this.A;
      this.A = null;
      return localBundle;
    }
    return super.b();
  }
  
  protected final String c()
  {
    return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
  }
  
  protected final String d()
  {
    return "com.google.android.gms.cast.internal.ICastDeviceController";
  }
  
  protected final Bundle e()
  {
    Bundle localBundle = new Bundle();
    edm localedm = a;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.y;
    arrayOfObject[1] = this.z;
    localedm.a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", arrayOfObject);
    localBundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this.o);
    localBundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.q);
    this.r = new edk(this);
    localBundle.putParcelable("listener", new BinderWrapper(this.r.asBinder()));
    if (this.y != null)
    {
      localBundle.putString("last_application_id", this.y);
      if (this.z != null) {
        localBundle.putString("last_session_id", this.z);
      }
    }
    return localBundle;
  }
  
  public final void f()
  {
    if ((!this.v) || (this.r == null) || (this.r.c())) {
      throw new IllegalStateException("Not connected to a device");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ecx
 * JD-Core Version:    0.7.0.1
 */