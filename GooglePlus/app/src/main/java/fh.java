import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public class fh
  implements fg
{
  public static final int a = 2131755294;
  public static final int b = 2131755666;
  public static final int c = 2131755667;
  public static final int d = 2131755669;
  public static final int e = 2131756587;
  public static final int f = 2131757577;
  public static final int g = 2131757780;
  public static final int h = 2131757781;
  public static final int i = 2131757784;
  public static final int j = 2131757785;
  public static final int k = 2131757808;
  public static final int l = 2131757833;
  public static final int m = 2131757834;
  public static final int n = 2131757852;
  public static final int o = 2131757853;
  public static final int p = 2131757854;
  public static final int q = 2131757855;
  public static final int r = 2131757861;
  public static final int s = 2131757862;
  public static final int t = 2131758059;
  public static final int u = 2131758063;
  public static final int v = 2131758065;
  public static final int w = 2131758118;
  
  public final PendingIntent a(Context paramContext, Intent[] paramArrayOfIntent, int paramInt1, int paramInt2)
  {
    Intent localIntent = new Intent(paramArrayOfIntent[(-1 + paramArrayOfIntent.length)]);
    localIntent.addFlags(268435456);
    return PendingIntent.getActivity(paramContext, paramInt1, localIntent, paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fh
 * JD-Core Version:    0.7.0.1
 */