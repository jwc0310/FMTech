import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.View;

final class cuc
  implements iwv
{
  private final int a;
  private final int b;
  
  public cuc(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(new int[] { 16843534 });
      this.a = localTypedArray.getResourceId(0, 0);
      localTypedArray.recycle();
    }
    for (;;)
    {
      this.b = paramContext.getResources().getColor(efj.zI);
      return;
      this.a = paramContext.getResources().getColor(efj.zH);
    }
  }
  
  public final void a(View paramView, boolean paramBoolean)
  {
    if ((Build.VERSION.SDK_INT >= 19) && (!paramBoolean))
    {
      paramView.setBackgroundResource(this.a);
      return;
    }
    if (paramBoolean) {}
    for (int i = this.b;; i = this.a)
    {
      paramView.setBackgroundColor(i);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cuc
 * JD-Core Version:    0.7.0.1
 */