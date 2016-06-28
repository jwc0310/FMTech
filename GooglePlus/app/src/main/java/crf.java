import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import java.util.HashMap;

public final class crf
  extends lvp
{
  cqm a;
  
  public crf(Context paramContext, ViewGroup paramViewGroup, lvw paramlvw)
  {
    super(paramContext, paramViewGroup, paramlvw);
  }
  
  public static View a(View paramView)
  {
    if (paramView != null) {
      return (View)paramView.getParent();
    }
    return null;
  }
  
  static boolean a(View paramView1, View paramView2)
  {
    if ((paramView1 == null) || (paramView2 == null)) {
      return false;
    }
    for (;;)
    {
      View localView;
      paramView2 = localView;
      try
      {
        localView = (View)paramView2.getParent();
        boolean bool = paramView1.equals(localView);
        if (!bool)
        {
          if (localView != null) {
            continue;
          }
          return false;
        }
      }
      catch (ClassCastException localClassCastException)
      {
        return false;
      }
    }
    return true;
  }
  
  public final Float a(ListView paramListView, int paramInt, HashMap<Object, Float> paramHashMap)
  {
    return (Float)paramHashMap.get(Long.valueOf(this.a.getItemId(paramInt)));
  }
  
  public final void a(View paramView, boolean paramBoolean)
  {
    if (paramView != null)
    {
      ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
      if (localViewGroup != null)
      {
        View localView1 = localViewGroup.findViewById(aaw.gw);
        if (localView1 != null) {
          localView1.setVisibility(4);
        }
        View localView2 = localViewGroup.findViewById(aaw.gx);
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
  
  public final boolean a(float paramFloat)
  {
    return paramFloat < 0.0F;
  }
  
  public final boolean b(View paramView)
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     crf
 * JD-Core Version:    0.7.0.1
 */