import android.view.View;

public final class lve
{
  private final View a;
  private boolean b;
  private boolean c;
  private int d;
  private int e;
  
  public lve(View paramView)
  {
    this.a = paramView;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 1;
    this.c = i;
    this.d = (paramInt3 - paramInt1);
    View localView1 = this.a;
    if (nj.a.t(localView1) == i) {}
    for (;;)
    {
      this.b = i;
      View localView2 = this.a;
      this.e = nj.a.u(localView2);
      View localView3 = this.a;
      nj.a.v(localView3);
      return;
      i = 0;
    }
  }
  
  public final void a(View paramView, int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramView.getParent() == this.a)
    {
      bool2 = bool1;
      efj.c(bool2, "Given View is not a child of the parentView that this RtlLayoutHelper was initialized with.");
      if (this.c != bool1) {
        break label101;
      }
    }
    int i;
    for (;;)
    {
      efj.d(bool1, "RtlLayoutHelper.setLayoutBounds() was not called.");
      i = paramInt2 + this.a.getPaddingTop();
      if (!this.b) {
        break label107;
      }
      int k = this.d - paramInt1 - this.e;
      paramView.layout(k - paramView.getMeasuredWidth(), i, k, i + paramView.getMeasuredHeight());
      return;
      bool2 = false;
      break;
      label101:
      bool1 = false;
    }
    label107:
    int j = paramInt1 + this.e;
    paramView.layout(j, i, j + paramView.getMeasuredWidth(), i + paramView.getMeasuredHeight());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lve
 * JD-Core Version:    0.7.0.1
 */