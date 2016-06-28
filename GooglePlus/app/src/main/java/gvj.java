import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;

public final class gvj
  implements mfc, mfd
{
  View a;
  View b;
  private final Activity c;
  private final Runnable d = new gvk(this);
  
  public gvj(Activity paramActivity, mek parammek)
  {
    this.c = paramActivity;
    parammek.a(this);
  }
  
  private static boolean c(View paramView)
  {
    return (paramView != null) && (paramView.getVisibility() == 0);
  }
  
  @TargetApi(21)
  public final Bundle a()
  {
    if ((this.b != null) && (this.a != null)) {
      throw new IllegalStateException("Can't have both source and shared views.");
    }
    if (Build.VERSION.SDK_INT >= 21) {}
    for (int i = 1; (i != 0) && (c(this.b)); i = 0) {
      return ActivityOptions.makeSceneTransitionAnimation(this.c, this.b, this.b.getTransitionName()).toBundle();
    }
    if ((Build.VERSION.SDK_INT >= 16) && (c(this.a))) {
      return ActivityOptions.makeScaleUpAnimation(this.a, 0, 0, this.a.getWidth(), this.a.getHeight()).toBundle();
    }
    return null;
  }
  
  @TargetApi(21)
  public final gvj a(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (int i = 1;; i = 0)
    {
      if ((i != 0) && (paramView != null) && (TextUtils.isEmpty(paramView.getTransitionName()))) {
        paramView.setTransitionName("shared_view_name");
      }
      this.b = paramView;
      this.a = null;
      Runnable localRunnable = this.d;
      efj.m().post(localRunnable);
      return this;
    }
  }
  
  public final void aK_()
  {
    this.a = null;
    this.b = null;
  }
  
  public final gvj b(View paramView)
  {
    this.a = paramView;
    this.b = null;
    Runnable localRunnable = this.d;
    efj.m().post(localRunnable);
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gvj
 * JD-Core Version:    0.7.0.1
 */