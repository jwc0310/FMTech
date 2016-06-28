import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;

public final class lvz
  implements mbo, mec, mfd
{
  private static mcq c = new mcq("debug.plus.disable_swiperefresh", false);
  public SwipeRefreshLayoutWithUpScroll a;
  public int b = -1;
  private int d = efj.aad;
  private int e = efj.aae;
  private final lvy f;
  private Context g;
  private gxq h;
  private int[] i;
  
  public lvz(lvy paramlvy, mek parammek)
  {
    this.f = paramlvy;
    parammek.a(this);
  }
  
  public lvz(lvy paramlvy, mek parammek, int paramInt)
  {
    this.f = paramlvy;
    this.d = paramInt;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.g = paramContext;
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    View localView = paramView.findViewById(this.d);
    if ((localView instanceof SwipeRefreshLayoutWithUpScroll))
    {
      this.a = ((SwipeRefreshLayoutWithUpScroll)localView);
      this.a.a(this.f);
      if ((this.i != null) && (this.i.length > 0)) {
        this.a.b(this.i);
      }
      if (this.b >= 0)
      {
        SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = this.a;
        int j = this.b;
        localSwipeRefreshLayoutWithUpScroll.d = false;
        localSwipeRefreshLayoutWithUpScroll.e.setVisibility(8);
        localSwipeRefreshLayoutWithUpScroll.c = 0;
        localSwipeRefreshLayoutWithUpScroll.h = 0;
        localSwipeRefreshLayoutWithUpScroll.j = j;
        localSwipeRefreshLayoutWithUpScroll.l = true;
        localSwipeRefreshLayoutWithUpScroll.e.invalidate();
      }
      if (this.h != null) {
        efj.a(this.a, this.h);
      }
    }
  }
  
  public final void a(gxq paramgxq)
  {
    this.h = paramgxq;
    if (this.a != null) {
      efj.a(this.a, paramgxq);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (this.a != null)
    {
      localSwipeRefreshLayoutWithUpScroll = this.a;
      if (paramBoolean) {
        break label24;
      }
    }
    label24:
    for (boolean bool = true;; bool = false)
    {
      localSwipeRefreshLayoutWithUpScroll.setEnabled(bool);
      return;
    }
  }
  
  public final void a(int... paramVarArgs)
  {
    this.i = paramVarArgs;
    if (this.a != null) {
      this.a.b(paramVarArgs);
    }
  }
  
  public final boolean a()
  {
    return (this.a != null) && (this.a.b);
  }
  
  public final void b()
  {
    if (this.a == null) {
      return;
    }
    String str = this.g.getResources().getString(this.e);
    this.a.setContentDescription(str);
    if (efj.B(this.g)) {
      this.a.sendAccessibilityEvent(32);
    }
    this.a.setContentDescription(null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lvz
 * JD-Core Version:    0.7.0.1
 */