import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import java.util.List;
import java.util.Map;

final class coc
  extends SharedElementCallback
{
  coc(cob paramcob, Resources paramResources, boolean paramBoolean, Window paramWindow) {}
  
  public final void onMapSharedElements(List<String> paramList, Map<String, View> paramMap)
  {
    if ((!this.d.g) && (!this.d.f))
    {
      paramMap.put(paramList.get(0), this.d.j);
      this.d.i.setVisibility(0);
      this.d.c.a(false);
    }
  }
  
  public final void onSharedElementEnd(List<String> paramList, List<View> paramList1, List<View> paramList2)
  {
    FrameLayout localFrameLayout;
    View localView;
    if ((paramList2.size() > 0) && (paramList1.size() > 0) && ((paramList1.get(0) instanceof FrameLayout)))
    {
      localFrameLayout = (FrameLayout)paramList1.get(0);
      localView = (View)paramList2.get(0);
      if (localView != null) {}
    }
    else
    {
      return;
    }
    int i = this.a.getDimensionPixelSize(efj.no);
    int j = this.a.getDimensionPixelSize(efj.nk);
    int k = this.a.getDimensionPixelSize(efj.ns);
    cob localcob = this.d;
    Resources localResources = localcob.a.getResources();
    int m;
    float f2;
    label154:
    int n;
    if (localResources.getConfiguration().orientation == 2)
    {
      m = 1;
      float f1 = localcob.a.getWindow().getDecorView().getMeasuredWidth();
      if (m == 0) {
        break label308;
      }
      f2 = 3.55F;
      n = Math.round(f1 / f2) + localResources.getDimensionPixelSize(efj.ns) - localResources.getDimensionPixelSize(efj.nk);
      if (!this.b) {
        break label315;
      }
      int i1 = this.c.getDecorView().getMeasuredWidth();
      localFrameLayout.setLeft(i1 - k - i);
      localFrameLayout.setRight(i1 - k);
    }
    for (;;)
    {
      localFrameLayout.setTop(n);
      localFrameLayout.setBottom(n + j);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(i, j);
      localLayoutParams.setMarginStart(k);
      localLayoutParams.topMargin = n;
      localFrameLayout.setLayoutParams(localLayoutParams);
      localView.setLeft(0);
      localView.setRight(i);
      localView.setTop(0);
      localView.setBottom(j);
      return;
      m = 0;
      break;
      label308:
      f2 = 1.777778F;
      break label154;
      label315:
      localFrameLayout.setLeft(k);
      localFrameLayout.setRight(k + i);
    }
  }
  
  public final void onSharedElementStart(List<String> paramList, List<View> paramList1, List<View> paramList2)
  {
    FrameLayout localFrameLayout;
    View localView;
    if ((paramList2.size() > 0) && (paramList1.size() > 0) && ((paramList1.get(0) instanceof FrameLayout)))
    {
      localFrameLayout = (FrameLayout)paramList1.get(0);
      localView = (View)paramList2.get(0);
      if (localView != null) {}
    }
    else
    {
      return;
    }
    localFrameLayout.addView(localView);
    int i = efj.A(this.d.b);
    int j = localFrameLayout.getMeasuredWidth();
    int k = localFrameLayout.getMeasuredHeight();
    int m = localView.getLeft();
    int n = localView.getTop() - i;
    localFrameLayout.setLeft(m);
    localFrameLayout.setRight(m + j);
    localFrameLayout.setTop(n);
    localFrameLayout.setBottom(n + k);
    localView.setLeft(0);
    localView.setRight(j);
    localView.setTop(0);
    localView.setBottom(k);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     coc
 * JD-Core Version:    0.7.0.1
 */