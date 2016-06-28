import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;

public final class jdx
{
  public Context a;
  
  public jdx(Context paramContext)
  {
    this.a = paramContext;
  }
  
  @TargetApi(19)
  public static void a(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      paramView.setImportantForAccessibility(4);
    }
    while (Build.VERSION.SDK_INT < 16) {
      return;
    }
    paramView.setImportantForAccessibility(2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jdx
 * JD-Core Version:    0.7.0.1
 */