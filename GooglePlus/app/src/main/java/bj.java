import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class bj
  extends bk
  implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
{
  private int Z = 0;
  public int a = 0;
  private int aa = -1;
  private boolean ab;
  private boolean ac;
  private boolean ad;
  public boolean b = true;
  public boolean c = true;
  public Dialog d;
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.Z = paramInt1;
    if ((this.Z == 2) || (this.Z == 3)) {
      this.a = 16973913;
    }
    if (paramInt2 != 0) {
      this.a = paramInt2;
    }
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    if (!this.ad) {
      this.ac = false;
    }
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (this.C == 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.c = bool;
      if (paramBundle != null)
      {
        this.Z = paramBundle.getInt("android:style", 0);
        this.a = paramBundle.getInt("android:theme", 0);
        this.b = paramBundle.getBoolean("android:cancelable", true);
        this.c = paramBundle.getBoolean("android:showsDialog", this.c);
        this.aa = paramBundle.getInt("android:backStackId", -1);
      }
      return;
    }
  }
  
  public void a(bw parambw, String paramString)
  {
    this.ac = false;
    this.ad = true;
    cl localcl = parambw.a();
    localcl.a(this, paramString);
    localcl.b();
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.ac) {
      return;
    }
    this.ac = true;
    this.ad = false;
    if (this.d != null)
    {
      this.d.dismiss();
      this.d = null;
    }
    this.ab = true;
    if (this.aa >= 0)
    {
      this.x.a(this.aa, 1);
      this.aa = -1;
      return;
    }
    cl localcl = this.x.a();
    localcl.a(this);
    if (paramBoolean)
    {
      localcl.c();
      return;
    }
    localcl.b();
  }
  
  public LayoutInflater a_(Bundle paramBundle)
  {
    if (!this.c) {
      return super.a_(paramBundle);
    }
    this.d = c(paramBundle);
    if (this.d != null)
    {
      Dialog localDialog = this.d;
      switch (this.Z)
      {
      }
      for (;;)
      {
        return (LayoutInflater)this.d.getContext().getSystemService("layout_inflater");
        localDialog.getWindow().addFlags(24);
        localDialog.requestWindowFeature(1);
      }
    }
    return (LayoutInflater)this.y.b.getSystemService("layout_inflater");
  }
  
  public final void b(boolean paramBoolean)
  {
    this.b = paramBoolean;
    if (this.d != null) {
      this.d.setCancelable(paramBoolean);
    }
  }
  
  public Dialog c(Bundle paramBundle)
  {
    return new Dialog(f(), this.a);
  }
  
  public void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (!this.c) {}
    Bundle localBundle;
    do
    {
      do
      {
        return;
        View localView = this.N;
        if (localView != null)
        {
          if (localView.getParent() != null) {
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
          }
          this.d.setContentView(localView);
        }
        this.d.setOwnerActivity(f());
        this.d.setCancelable(this.b);
        this.d.setOnCancelListener(this);
        this.d.setOnDismissListener(this);
      } while (paramBundle == null);
      localBundle = paramBundle.getBundle("android:savedDialogState");
    } while (localBundle == null);
    this.d.onRestoreInstanceState(localBundle);
  }
  
  public void d_()
  {
    super.d_();
    if (this.d != null)
    {
      this.ab = true;
      this.d.dismiss();
      this.d = null;
    }
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.d != null)
    {
      Bundle localBundle = this.d.onSaveInstanceState();
      if (localBundle != null) {
        paramBundle.putBundle("android:savedDialogState", localBundle);
      }
    }
    if (this.Z != 0) {
      paramBundle.putInt("android:style", this.Z);
    }
    if (this.a != 0) {
      paramBundle.putInt("android:theme", this.a);
    }
    if (!this.b) {
      paramBundle.putBoolean("android:cancelable", this.b);
    }
    if (!this.c) {
      paramBundle.putBoolean("android:showsDialog", this.c);
    }
    if (this.aa != -1) {
      paramBundle.putInt("android:backStackId", this.aa);
    }
  }
  
  public void f_()
  {
    super.f_();
    if ((!this.ad) && (!this.ac)) {
      this.ac = true;
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if (!this.ab) {
      a(true);
    }
  }
  
  public void p_()
  {
    super.p_();
    if (this.d != null)
    {
      this.ab = false;
      this.d.show();
    }
  }
  
  public void q_()
  {
    super.q_();
    if (this.d != null) {
      this.d.hide();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bj
 * JD-Core Version:    0.7.0.1
 */