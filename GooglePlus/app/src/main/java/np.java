import android.view.View;

class np
  extends no
{
  np() {}
  
  np(byte paramByte)
  {
    this();
  }
  
  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final int t(View paramView)
  {
    return paramView.getLayoutDirection();
  }
  
  public final int u(View paramView)
  {
    return paramView.getPaddingStart();
  }
  
  public final int v(View paramView)
  {
    return paramView.getPaddingEnd();
  }
  
  public final int w(View paramView)
  {
    return paramView.getWindowSystemUiVisibility();
  }
  
  public final boolean x(View paramView)
  {
    return paramView.isPaddingRelative();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     np
 * JD-Core Version:    0.7.0.1
 */