import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.ListView;
import com.google.android.libraries.social.stream.legacy.views.StreamTooltipView;
import java.util.HashMap;

public final class hvl
  extends lvp
{
  public boolean a;
  
  public hvl(Context paramContext, ViewGroup paramViewGroup, lvw paramlvw)
  {
    super(paramContext, paramViewGroup, paramlvw);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, ViewGroup paramViewGroup, ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool1 = true;
    StreamTooltipView localStreamTooltipView;
    boolean bool2;
    ViewPropertyAnimator localViewPropertyAnimator;
    if (paramContext == null)
    {
      SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
      String str = paramContext.getResources().getString(paramInt1);
      localSharedPreferences.edit().putBoolean(str, bool1).commit();
      localStreamTooltipView = new StreamTooltipView(paramContext);
      localStreamTooltipView.b = paramInt2;
      localStreamTooltipView.requestLayout();
      localStreamTooltipView.invalidate();
      localStreamTooltipView.a(0, loj.a(paramContext).ar, 0, 0);
      paramViewGroup.addView(localStreamTooltipView, paramLayoutParams);
      Runnable localRunnable1 = localStreamTooltipView.c;
      efj.m().removeCallbacks(localRunnable1);
      localStreamTooltipView.setVisibility(0);
      localStreamTooltipView.setClickable(bool1);
      localStreamTooltipView.invalidate();
      if (Build.VERSION.SDK_INT < 14) {
        break label207;
      }
      bool2 = bool1;
      if (bool2)
      {
        localViewPropertyAnimator = localStreamTooltipView.animate().alpha(255.0F).setDuration(200L);
        localStreamTooltipView.setAlpha(0.0F);
        if (Build.VERSION.SDK_INT < 16) {
          break label213;
        }
      }
    }
    for (;;)
    {
      if (bool1) {
        localViewPropertyAnimator.withLayer();
      }
      Runnable localRunnable2 = localStreamTooltipView.c;
      efj.m().postDelayed(localRunnable2, 4000L);
      return;
      label207:
      bool2 = false;
      break;
      label213:
      bool1 = false;
    }
  }
  
  public static boolean a(Context paramContext, int paramInt)
  {
    if (paramContext != null) {}
    for (boolean bool1 = PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean(paramContext.getResources().getString(paramInt), false);; bool1 = false)
    {
      boolean bool2 = false;
      if (!bool1) {
        bool2 = true;
      }
      return bool2;
    }
  }
  
  public final Float a(ListView paramListView, int paramInt, HashMap<Object, Float> paramHashMap)
  {
    Object localObject = paramListView.getItemAtPosition(paramInt);
    String str;
    if (localObject != null) {
      if ((localObject instanceof ors)) {
        str = efj.b(((ors)localObject).a);
      }
    }
    for (;;)
    {
      return (Float)paramHashMap.get(str);
      if ((localObject instanceof odg))
      {
        odg localodg = (odg)localObject;
        if (localodg.a != null) {
          str = efj.b(localodg.a.a);
        }
      }
      else if ((localObject instanceof String))
      {
        str = (String)localObject;
        continue;
      }
      str = null;
    }
  }
  
  public final void a(View paramView, boolean paramBoolean) {}
  
  public final void a(ViewGroup paramViewGroup) {}
  
  public final boolean a(float paramFloat)
  {
    return (!this.a) || (paramFloat > 0.0F);
  }
  
  public final boolean b(View paramView)
  {
    return paramView.findViewById(ehr.cx).getVisibility() != 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hvl
 * JD-Core Version:    0.7.0.1
 */