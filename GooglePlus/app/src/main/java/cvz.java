import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import java.util.HashMap;

public final class cvz
  extends lvp
{
  cvu a;
  
  public cvz(Context paramContext, ViewGroup paramViewGroup, cvu paramcvu)
  {
    super(paramContext, paramViewGroup, paramcvu);
    this.a = paramcvu;
  }
  
  public final Float a(ListView paramListView, int paramInt, HashMap<Object, Float> paramHashMap)
  {
    return Float.valueOf(0.0F);
  }
  
  public final void a(View paramView, boolean paramBoolean)
  {
    if (paramView != null)
    {
      ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
      if (localViewGroup != null)
      {
        View localView1 = localViewGroup.findViewById(aau.wG);
        if (localView1 != null) {
          localView1.setVisibility(4);
        }
        View localView2 = localViewGroup.findViewById(aau.wH);
        if (localView2 != null) {
          localView2.setVisibility(0);
        }
      }
    }
  }
  
  public final void a(ViewGroup paramViewGroup)
  {
    if (paramViewGroup.getParent() != null) {
      paramViewGroup.getParent().requestDisallowInterceptTouchEvent(true);
    }
  }
  
  @TargetApi(17)
  public final boolean a(float paramFloat)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      if (this.c.getLayoutDirection() == 0) {
        if (paramFloat >= 0.0F) {}
      }
    }
    while (paramFloat < 0.0F)
    {
      do
      {
        return true;
        return false;
      } while (paramFloat > 0.0F);
      return false;
    }
    return false;
  }
  
  public final boolean b(View paramView)
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cvz
 * JD-Core Version:    0.7.0.1
 */