import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.LinearLayout.LayoutParams;

public final class atm
  implements atq
{
  private final asv a;
  private final int b;
  private final int c;
  private final int d;
  
  public atm(asv paramasv, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramasv;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  public final int a()
  {
    return this.b;
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    View localView1;
    if (paramView == null)
    {
      LayoutInflater localLayoutInflater = LayoutInflater.from(paramViewGroup.getContext());
      int n = paramViewGroup.getMeasuredWidth();
      localView1 = localLayoutInflater.inflate(efj.sS, paramViewGroup, false);
      localView1.setLayoutParams(new AbsListView.LayoutParams(n, -2));
    }
    for (;;)
    {
      ViewGroup localViewGroup = (ViewGroup)localView1;
      int i = (paramViewGroup.getWidth() - this.c * (-1 + this.d)) / this.d;
      int j = 0;
      int k = 0;
      if (j < this.a.a())
      {
        View localView2 = localViewGroup.getChildAt(j);
        View localView3 = this.a.a(j, i, localView2, localViewGroup);
        if (localView2 == null) {
          localViewGroup.addView(localView3);
        }
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(localView3.getLayoutParams());
        localLayoutParams.bottomMargin = this.c;
        if (k != 0) {}
        for (int m = this.c;; m = 0)
        {
          localLayoutParams.leftMargin = m;
          localView3.setLayoutParams(localLayoutParams);
          if (localView3.getVisibility() == 0) {
            k = 1;
          }
          j++;
          break;
        }
      }
      return localView1;
      localView1 = paramView;
    }
  }
  
  public final void a(atr paramatr)
  {
    this.a.a(paramatr);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     atm
 * JD-Core Version:    0.7.0.1
 */