import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View;
import java.util.ArrayList;

final class dgb
  implements lpw
{
  dgb(dfz paramdfz) {}
  
  @SuppressLint({"NewApi"})
  public final void a(View paramView)
  {
    paramView.setVisibility(0);
    int i = Build.VERSION.SDK_INT;
    int j = 0;
    if (i >= 14) {
      j = 1;
    }
    if (j != 0) {
      paramView.setAlpha(1.0F);
    }
    if ((paramView instanceof lxj))
    {
      if (!(paramView instanceof dxu)) {
        break label64;
      }
      this.a.aE.remove(paramView);
    }
    for (;;)
    {
      ((lxj)paramView).D_();
      return;
      label64:
      if ((paramView instanceof lhw)) {
        this.a.aF.remove(paramView);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgb
 * JD-Core Version:    0.7.0.1
 */