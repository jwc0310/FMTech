import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;

final class iie
  implements kbb
{
  kaz a;
  
  iie(iic paramiic) {}
  
  public final void a(kaz paramkaz)
  {
    int i = 1;
    int j;
    if (paramkaz.q == i)
    {
      j = i;
      if (j == 0) {
        break label55;
      }
      this.b.i = ((Bitmap)paramkaz.p);
      this.b.j = null;
      ap_();
      this.b.b();
    }
    label55:
    do
    {
      return;
      j = 0;
      break;
      switch (paramkaz.q)
      {
      default: 
        i = 0;
      }
    } while (i == 0);
    this.b.j = null;
    ap_();
    this.b.b();
  }
  
  public final void ap_()
  {
    iif localiif = new iif(this);
    efj.m().post(localiif);
  }
  
  public final void b()
  {
    if (this.a == null) {}
    for (int i = 1; i == 0; i = 0) {
      throw new IllegalStateException();
    }
    int j = ((ActivityManager)this.b.b.getSystemService("activity")).getLauncherLargeIconSize();
    ipf localipf = ipf.a(this.b.b, this.b.j, ipm.a);
    this.a = this.b.c.a(localipf, 0, j, j, null, 0, this.b.k);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iie
 * JD-Core Version:    0.7.0.1
 */