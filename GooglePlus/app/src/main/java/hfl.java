import android.annotation.TargetApi;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;

final class hfl
  implements Runnable
{
  hfl(hfk paramhfk) {}
  
  @TargetApi(14)
  public final void run()
  {
    int i = 0;
    float f1 = 1.0F;
    if (this.a.e <= 0) {
      return;
    }
    hfk localhfk1 = this.a;
    localhfk1.c = (1 + localhfk1.c);
    if (this.a.c > 2) {
      this.a.c = 0;
    }
    float f2;
    switch (this.a.c)
    {
    default: 
      f2 = f1;
    }
    for (;;)
    {
      if (this.a.b.getAlpha() != f1) {
        this.a.b.setAlpha(f1);
      }
      if (f1 != f2) {
        this.a.b.animate().alpha(f2).setDuration(i).setInterpolator(hfk.a).start();
      }
      if (i == 0) {
        break;
      }
      efj.m().removeCallbacks(this);
      long l = i;
      efj.m().postDelayed(this, l);
      return;
      CharSequence localCharSequence = this.a.b.a.getText();
      boolean bool = TextUtils.isEmpty(localCharSequence);
      int j = 0;
      if (bool) {}
      for (;;)
      {
        i = Math.max(3000, Math.min(8000, j * 70));
        f2 = f1;
        break;
        j = localCharSequence.length();
      }
      i = 400;
      f2 = 0.0F;
      continue;
      hfk localhfk2 = this.a;
      localhfk2.d = (1 + localhfk2.d);
      if (this.a.d >= this.a.e) {
        this.a.d = 0;
      }
      hfk localhfk3 = this.a;
      if (localhfk3.f != null) {
        localhfk3.a(localhfk3.f, localhfk3.d);
      }
      localhfk3.requestLayout();
      i = 400;
      f2 = f1;
      f1 = 0.0F;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfl
 * JD-Core Version:    0.7.0.1
 */