import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;

public final class lwo
{
  private static final Rect a = new Rect();
  private static final Rect b = new Rect();
  private static final int[] c = new int[2];
  
  public static int a(Context paramContext)
  {
    TypedValue localTypedValue = new TypedValue();
    if (!paramContext.getTheme().resolveAttribute(16842829, localTypedValue, true)) {
      throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
    }
    return (int)localTypedValue.getDimension(paramContext.getResources().getDisplayMetrics());
  }
  
  @TargetApi(16)
  public static void a(Activity paramActivity, boolean paramBoolean)
  {
    int i;
    if (Build.VERSION.SDK_INT >= 14)
    {
      i = 1;
      if ((i != 0) && (paramActivity != null)) {
        break label24;
      }
    }
    label24:
    View localView;
    do
    {
      Window localWindow;
      do
      {
        return;
        i = 0;
        break;
        localWindow = paramActivity.getWindow();
      } while (localWindow == null);
      localView = localWindow.getDecorView();
    } while (localView == null);
    int j = 2;
    if (Build.VERSION.SDK_INT >= 16)
    {
      j = 6;
      if (paramBoolean) {
        j = 1286;
      }
    }
    localView.setSystemUiVisibility(j);
  }
  
  public static boolean a(View paramView)
  {
    return paramView.getWindowToken() != null;
  }
  
  public static boolean a(View paramView1, View paramView2)
  {
    boolean bool = true;
    if ((paramView1 == null) || (paramView2 == null)) {
      bool = false;
    }
    do
    {
      return bool;
      paramView2.getLocationOnScreen(c);
      a.set(c[0], c[bool], c[0] + paramView2.getWidth(), c[bool] + paramView2.getHeight());
      paramView1.getLocationOnScreen(c);
      b.set(c[0], c[bool], c[0] + paramView1.getWidth(), c[bool] + paramView1.getHeight());
      if (!b.intersect(a)) {
        break;
      }
    } while (b.width() * b.height() / (paramView1.getWidth() * paramView1.getHeight()) >= 0.7F);
    return false;
    return false;
  }
  
  public static String b(View paramView)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramView);
    ViewParent localViewParent1 = paramView.getParent();
    int i = 1;
    ViewParent localViewParent2;
    for (Object localObject = localViewParent1; localObject != null; localObject = localViewParent2)
    {
      for (int j = 0; j < i; j++) {
        localStringBuilder.append(' ');
      }
      localStringBuilder.append(localObject);
      localStringBuilder.append('\n');
      localViewParent2 = ((ViewParent)localObject).getParent();
      i++;
    }
    return localStringBuilder.toString();
  }
  
  public static void c(View paramView)
  {
    if (paramView == null) {}
    do
    {
      return;
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        for (int i = -1 + localViewGroup.getChildCount(); i >= 0; i--) {
          c(localViewGroup.getChildAt(i));
        }
      }
    } while (!(paramView instanceof lxz));
    ((lxz)paramView).m();
  }
  
  public static void d(View paramView)
  {
    if (paramView == null) {}
    do
    {
      return;
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        for (int i = -1 + localViewGroup.getChildCount(); i >= 0; i--) {
          d(localViewGroup.getChildAt(i));
        }
      }
    } while (!(paramView instanceof lxz));
    ((lxz)paramView).l();
  }
  
  public static void e(View paramView)
  {
    if (paramView == null) {}
    for (;;)
    {
      return;
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        for (int i = -1 + localViewGroup.getChildCount(); i >= 0; i--) {
          f(localViewGroup.getChildAt(i));
        }
      }
    }
  }
  
  public static void f(View paramView)
  {
    if (paramView == null) {}
    do
    {
      return;
      e(paramView);
    } while (!(paramView instanceof lxj));
    ((lxj)paramView).D_();
  }
  
  @TargetApi(17)
  public static void g(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      paramView.setLayoutDirection(0);
    }
  }
  
  @TargetApi(14)
  public static void h(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 14) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        paramView.animate().cancel();
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lwo
 * JD-Core Version:    0.7.0.1
 */