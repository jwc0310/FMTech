import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;

public final class ehe
  extends bk
  implements DialogInterface.OnCancelListener, cw<ConnectionResult>
{
  private final Handler Z = new Handler(Looper.getMainLooper());
  final SparseArray<ehg> a = new SparseArray();
  private boolean b;
  private int c = -1;
  private ConnectionResult d;
  
  public static ehe a(bp parambp)
  {
    efj.e("Must be called from main thread of process");
    bz localbz = parambp.b.a.d;
    try
    {
      ehe localehe = (ehe)localbz.a("GmsSupportLoaderLifecycleFragment");
      if ((localehe == null) || (localehe.r))
      {
        localehe = new ehe();
        localbz.a().a(localehe, "GmsSupportLoaderLifecycleFragment").b();
        localbz.b();
      }
      return localehe;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", localClassCastException);
    }
  }
  
  private final void a(int paramInt, ConnectionResult paramConnectionResult)
  {
    ehg localehg = (ehg)this.a.get(paramInt);
    if (localehg != null)
    {
      this.a.remove(paramInt);
      k().a(paramInt);
      efi localefi = localehg.b;
      if (localefi != null) {
        localefi.a(paramConnectionResult);
      }
    }
    v();
  }
  
  private final void v()
  {
    int i = 0;
    this.b = false;
    this.c = -1;
    this.d = null;
    cv localcv = k();
    while (i < this.a.size())
    {
      int j = this.a.keyAt(i);
      ehf localehf = a(j);
      if ((localehf != null) && (localehf.b))
      {
        localcv.a(j);
        localcv.a(j, null, this);
      }
      i++;
    }
  }
  
  final ehf a(int paramInt)
  {
    try
    {
      ehf localehf = (ehf)k().b(paramInt);
      return localehf;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", localClassCastException);
    }
  }
  
  public final fu<ConnectionResult> a(int paramInt, Bundle paramBundle)
  {
    return new ehf(f(), ((ehg)this.a.get(paramInt)).a);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
      i = 0;
    }
    for (;;)
    {
      if (i == 0) {
        break label62;
      }
      v();
      return;
      if (eer.a(f()) != 0) {
        break;
      }
      continue;
      if (paramInt2 != -1) {
        break;
      }
    }
    label62:
    a(this.c, this.d);
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    int i = 0;
    if (i < this.a.size())
    {
      int j = this.a.keyAt(i);
      ehf localehf = a(j);
      if ((localehf != null) && (((ehg)this.a.valueAt(i)).a != localehf.a)) {
        k().b(j, null, this);
      }
      for (;;)
      {
        i++;
        break;
        k().a(j, null, this);
      }
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.b = paramBundle.getBoolean("resolving_error", false);
      this.c = paramBundle.getInt("failed_client_id", -1);
      if (this.c >= 0) {
        this.d = new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution"));
      }
    }
  }
  
  public final void a(fu<ConnectionResult> paramfu) {}
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("resolving_error", this.b);
    if (this.c >= 0)
    {
      paramBundle.putInt("failed_client_id", this.c);
      paramBundle.putInt("failed_status", this.d.c);
      paramBundle.putParcelable("failed_resolution", this.d.d);
    }
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    a(this.c, new ConnectionResult(13, null));
  }
  
  public final void p_()
  {
    super.p_();
    if (!this.b) {
      for (int i = 0; i < this.a.size(); i++) {
        k().a(this.a.keyAt(i), null, this);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ehe
 * JD-Core Version:    0.7.0.1
 */