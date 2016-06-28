import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class ehb
  extends bk
  implements DialogInterface.OnCancelListener
{
  private ConnectionResult Z;
  boolean a;
  private final Handler aa = new Handler(Looper.getMainLooper());
  boolean b;
  final SparseArray<ehc> c = new SparseArray();
  private int d = -1;
  
  public static ehb a(bp parambp)
  {
    efj.e("Must be called from main thread of process");
    bz localbz = parambp.b.a.d;
    try
    {
      ehb localehb = (ehb)localbz.a("GmsSupportLifecycleFragment");
      if ((localehb == null) || (localehb.r)) {
        localehb = null;
      }
      return localehb;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", localClassCastException);
    }
  }
  
  private final void a(int paramInt, ConnectionResult paramConnectionResult)
  {
    ehc localehc1 = (ehc)this.c.get(paramInt);
    if (localehc1 != null)
    {
      ehc localehc2 = (ehc)this.c.get(paramInt);
      this.c.remove(paramInt);
      if (localehc2 != null)
      {
        localehc2.b.c(localehc2);
        localehc2.b.d();
      }
      efi localefi = localehc1.c;
      if (localefi != null) {
        localefi.a(paramConnectionResult);
      }
    }
    v();
  }
  
  public static ehb b(bp parambp)
  {
    ehb localehb = a(parambp);
    bz localbz = parambp.b.a.d;
    if (localehb == null)
    {
      localehb = new ehb();
      localbz.a().a(localehb, "GmsSupportLifecycleFragment").c();
      localbz.b();
    }
    return localehb;
  }
  
  private final void v()
  {
    this.b = false;
    this.d = -1;
    this.Z = null;
    for (int i = 0; i < this.c.size(); i++) {
      ((ehc)this.c.valueAt(i)).b.b();
    }
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
    a(this.d, this.Z);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.b = paramBundle.getBoolean("resolving_error", false);
      this.d = paramBundle.getInt("failed_client_id", -1);
      if (this.d >= 0) {
        this.Z = new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution"));
      }
    }
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    for (int i = 0; i < this.c.size(); i++)
    {
      ehc localehc = (ehc)this.c.valueAt(i);
      paramPrintWriter.append(paramString).append("GoogleApiClient #").print(localehc.a);
      paramPrintWriter.println(":");
      localehc.b.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("resolving_error", this.b);
    if (this.d >= 0)
    {
      paramBundle.putInt("failed_client_id", this.d);
      paramBundle.putInt("failed_status", this.Z.c);
      paramBundle.putParcelable("failed_resolution", this.Z.d);
    }
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    a(this.d, new ConnectionResult(13, null));
  }
  
  public final void p_()
  {
    super.p_();
    this.a = true;
    if (!this.b) {
      for (int i = 0; i < this.c.size(); i++) {
        ((ehc)this.c.valueAt(i)).b.b();
      }
    }
  }
  
  public final void q_()
  {
    super.q_();
    this.a = false;
    for (int i = 0; i < this.c.size(); i++) {
      ((ehc)this.c.valueAt(i)).b.d();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ehb
 * JD-Core Version:    0.7.0.1
 */