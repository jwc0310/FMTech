import android.os.Bundle;

public final class anf
  implements mes, mew, mez, mfa, mfd
{
  private bw a;
  private bp b;
  private bk c;
  private boolean d;
  private boolean e;
  
  public anf(bk parambk, mek parammek)
  {
    this.c = parambk;
    parammek.a(this);
  }
  
  public anf(bp parambp, mek parammek)
  {
    this.b = parambp;
    parammek.a(this);
  }
  
  public final void a()
  {
    if (!this.d)
    {
      this.e = true;
      return;
    }
    bj localbj = (bj)this.a.a("com.google.android.apps.photos.ProgressDialogMixin.Pending");
    if (localbj != null) {
      localbj.a(false);
    }
    this.e = false;
  }
  
  public final void a(Bundle paramBundle)
  {
    if (this.b != null) {}
    for (this.a = this.b.b.a.d;; this.a = this.c.x)
    {
      if (paramBundle != null) {
        this.e = paramBundle.getBoolean("com.google.android.apps.photos.ProgressDialogMixin.DismissOnResume", false);
      }
      return;
    }
  }
  
  public final void a(String paramString)
  {
    if (!this.d) {
      return;
    }
    a();
    coo.a(null, paramString, false).a(this.a, "com.google.android.apps.photos.ProgressDialogMixin.Pending");
  }
  
  public final void b()
  {
    this.d = true;
    if (this.e) {
      a();
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("com.google.android.apps.photos.ProgressDialogMixin.DismissOnResume", this.e);
  }
  
  public final void c()
  {
    this.d = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     anf
 * JD-Core Version:    0.7.0.1
 */