import android.view.View;

class nq
  extends np
{
  nq()
  {
    super((byte)0);
  }
  
  public final void c(View paramView, int paramInt)
  {
    paramView.setImportantForAccessibility(paramInt);
  }
  
  public final boolean y(View paramView)
  {
    return paramView.isLaidOut();
  }
  
  public final boolean z(View paramView)
  {
    return paramView.isAttachedToWindow();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nq
 * JD-Core Version:    0.7.0.1
 */