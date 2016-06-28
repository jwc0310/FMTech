import android.annotation.TargetApi;
import android.os.Handler;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;

final class lpn
  implements Runnable
{
  lpn(lpm paramlpm) {}
  
  @TargetApi(14)
  public final void run()
  {
    int i = 0;
    float f1 = 1.0F;
    if (this.a.d == null) {
      return;
    }
    this.a.invalidate();
    lpm locallpm1 = this.a;
    locallpm1.j = (1 + locallpm1.j);
    if (this.a.j > 2) {
      this.a.j = 0;
    }
    float f2;
    switch (this.a.j)
    {
    default: 
      f2 = f1;
    }
    for (;;)
    {
      if (this.a.getAlpha() != f1) {
        this.a.setAlpha(f1);
      }
      if (f1 != f2) {
        this.a.animate().alpha(f2).setDuration(i).setInterpolator(lpm.b).start();
      }
      if ((!this.a.h) || (i == 0)) {
        break;
      }
      long l = i;
      efj.m().postDelayed(this, l);
      return;
      lpm locallpm2 = this.a;
      locallpm2.g = (1 + locallpm2.g);
      int k = this.a.d.a();
      if (this.a.g >= k) {
        this.a.g = 0;
      }
      this.a.b();
      if (this.a.f != null) {}
      i = 400;
      f2 = f1;
      f1 = 0.0F;
      continue;
      StaticLayout localStaticLayout = this.a.e;
      int j = 0;
      CharSequence localCharSequence;
      if (localStaticLayout != null)
      {
        localCharSequence = this.a.e.getText();
        boolean bool = TextUtils.isEmpty(localCharSequence);
        j = 0;
        if (!bool) {
          break label338;
        }
      }
      for (;;)
      {
        i = Math.max(3000, Math.min(8000, j * 70));
        f2 = f1;
        break;
        label338:
        j = localCharSequence.length();
      }
      i = 400;
      f2 = 0.0F;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpn
 * JD-Core Version:    0.7.0.1
 */