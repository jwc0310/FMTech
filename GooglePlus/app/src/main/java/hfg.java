import android.content.Context;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedList;

public final class hfg
  extends ViewGroup
  implements lxj
{
  public ArrayList<hfm> a = new ArrayList();
  public LinkedList<hfm> b = new LinkedList();
  
  public hfg(Context paramContext)
  {
    super(paramContext);
    for (int i = 0; i < 3; i++)
    {
      hfm localhfm = new hfm(getContext());
      localhfm.a(3);
      this.b.add(localhfm);
    }
    setVisibility(8);
  }
  
  public final void D_()
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      hfm localhfm = (hfm)this.a.get(j);
      localhfm.c();
      localhfm.setVisibility(8);
      localhfm.D_();
      removeView(localhfm);
      this.b.add(localhfm);
    }
    this.a.clear();
    setVisibility(8);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.a.size();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      hfm localhfm = (hfm)this.a.get(j);
      localhfm.layout(0, k, 0 + localhfm.getMeasuredWidth(), k + localhfm.getMeasuredHeight());
      k += localhfm.getMeasuredHeight();
      j++;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    if ((i == 0) || (this.a.size() == 0))
    {
      setMeasuredDimension(0, 0);
      return;
    }
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = this.a.size();
    int m = 0;
    int n = 0;
    while (m < k)
    {
      hfm localhfm = (hfm)this.a.get(m);
      localhfm.measure(paramInt1, j);
      n += localhfm.getMeasuredHeight();
      m++;
    }
    setMeasuredDimension(i, n);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfg
 * JD-Core Version:    0.7.0.1
 */