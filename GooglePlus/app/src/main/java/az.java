import android.app.ActivityOptions;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;

public class az
{
  public static final int A = 2130969065;
  public static final int B = 2130969068;
  public static final int C = 2130969069;
  public static final int D = 2131427653;
  public static final int E = 2131427657;
  public static final int F = 2131427961;
  public static final int G = 2131427966;
  public static final int H = 2131560171;
  public static final int I = 2131560027;
  public static final int J = 2131559077;
  public static final int K = 2131558545;
  public static final int L = 2131559070;
  public static final int M = 2131559459;
  public static final int N = 2131560029;
  public static final int O = 2131559997;
  public static final int P = 2131428015;
  public static final int Q = 2131428063;
  public static final int R = 2131560008;
  public static final int S = 2131559187;
  public static final int T = 2131560005;
  public static final int U = 2131558903;
  public static final int V = 2131559287;
  public static final int W = 2131560007;
  public static final int X = 2131559332;
  public static final int Y = 2131820959;
  public static final int Z = 2131820964;
  public static final int a = 2131755294;
  public static final int aa = 2131820972;
  public static final int ab = 2131820997;
  public static final int ac = 2131820955;
  public static final int ad = 2131820969;
  public static final int ae = 2131820974;
  public static final int b = 2131755521;
  public static final int c = 2131755522;
  public static final int d = 2131755523;
  public static final int e = 2131755539;
  public static final int f = 2131755569;
  public static final int g = 2131755570;
  public static final int h = 2131755571;
  public static final int i = 2131756614;
  public static final int j = 2131756619;
  public static final int k = 2131755586;
  public static final int l = 2131755587;
  public static final int m = 2131755756;
  public static final int n = 2131756253;
  public static final int o = 2131558791;
  public static final int p = 2131558978;
  public static final int q = 2131558744;
  public static final int r = 2131558979;
  public static final int s = 2131559913;
  public static final int t = 2131558798;
  public static final int u = 2131558595;
  public static final int v = 2131558745;
  public static final int w = 2130968750;
  public static final int x = 2130969059;
  public static final int y = 2130969062;
  public static final int z = 2130969064;
  
  public static az a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return new ba(new gdd(ActivityOptions.makeScaleUpAnimation(paramView, 0, 0, paramInt3, paramInt4)));
    }
    return new az();
  }
  
  public Bundle a()
  {
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     az
 * JD-Core Version:    0.7.0.1
 */