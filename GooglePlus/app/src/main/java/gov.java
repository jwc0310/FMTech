import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.widget.TextView;

public final class gov
  extends TextView
{
  public gov(Context paramContext)
  {
    super(paramContext, null);
    setTextAppearance(getContext(), aau.xZ);
    Resources localResources = getResources();
    int j = localResources.getDimensionPixelSize(efj.DY);
    int k = localResources.getDimensionPixelSize(efj.DZ);
    setPadding(k, j, k, j);
    int m;
    if (Build.VERSION.SDK_INT >= 17)
    {
      m = i;
      if ((m == 0) || (getResources().getConfiguration().getLayoutDirection() != i)) {
        break label118;
      }
      label84:
      if (i == 0) {
        break label123;
      }
    }
    label118:
    label123:
    for (int n = 3;; n = 5)
    {
      setGravity(n);
      setTextColor(getResources().getColor(efj.DQ));
      return;
      m = 0;
      break;
      i = 0;
      break label84;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gov
 * JD-Core Version:    0.7.0.1
 */