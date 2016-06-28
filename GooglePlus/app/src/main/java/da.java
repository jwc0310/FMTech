import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;

public class da
{
  public static final int A = 2131558791;
  public static final int B = 2131558801;
  public static final int C = 2131755141;
  public static final int D = 2131756619;
  public static final int E = 2131757071;
  public static final int F = 2131757075;
  public static final int G = 2131757076;
  public static final int H = 2131757078;
  public static final int I = 2131757079;
  public static final int J = 2131757080;
  public static final int K = 2131757081;
  public static final int L = 2131757084;
  public static final int M = 2131757085;
  public static final int N = 2131558757;
  public static final int O = 2131559817;
  public static final int P = 2131558454;
  public static final int Q = 2131559812;
  public static final int R = 2131558744;
  public static final int S = 2131558797;
  public static final int T = 2131559818;
  public static final int U = 2131559142;
  public static final int V = 2131558798;
  public static final int W = 2131559410;
  public static final int X = 2131559611;
  public static final int Y = 2131559816;
  public static final int Z = 2131558745;
  public static final int a = 2131558949;
  public static final int aA = 2131427986;
  public static final int aB = 2131427987;
  public static final int aC = 2131427988;
  public static final int aD = 2131427989;
  public static final int aE = 2131427990;
  public static final int aF = 2131427991;
  public static final int aG = 2131427992;
  public static final int aH = 2131427993;
  public static final int aI = 2131427994;
  public static final int aJ = 2131427995;
  public static final int aK = 2131428009;
  public static final int aL = 2131428044;
  public static final int aM = 2131428046;
  public static final int aN = 2131428047;
  public static final int aO = 2131428055;
  public static final int aP = 2131428063;
  public static final int aQ = 2130837619;
  public static final int aR = 2130837621;
  public static final int aS = 2130837623;
  public static final int aT = 2130837624;
  public static final int aU = 2130837658;
  public static final int aV = 2130837768;
  public static final int aW = 2130837873;
  public static final int aX = 2130838330;
  public static final int aY = 2130838331;
  public static final int aZ = 2131820955;
  public static final int aa = 2131559811;
  public static final int ab = 2131756253;
  public static final int ac = 2131756621;
  public static final int ad = 2131756651;
  public static final int ae = 2131758159;
  public static final int af = 2131558774;
  public static final int ag = 2131559459;
  public static final int ah = 2131560020;
  public static final int ai = 2131427793;
  public static final int aj = 2131427796;
  public static final int ak = 2131427961;
  public static final int al = 2131428015;
  public static final int am = 2131427657;
  public static final int an = 2131427365;
  public static final int ao = 2131427392;
  public static final int ap = 2131427407;
  public static final int aq = 2131427412;
  public static final int ar = 2131427413;
  public static final int as = 2131427520;
  public static final int at = 2131427530;
  public static final int au = 2131427636;
  public static final int av = 2131427638;
  public static final int aw = 2131427654;
  public static final int ax = 2131427741;
  public static final int ay = 2131427816;
  public static final int az = 2131427817;
  public static final int b = 2131559086;
  public static final int ba = 2131820957;
  public static final int bb = 2131820958;
  public static final int bc = 2131820959;
  public static final int bd = 2131820960;
  public static final int be = 2131820965;
  public static final int bf = 2131820972;
  public static final int bg = 2131820974;
  public static final int bh = 2131820980;
  public static final int bi = 2131820981;
  public static final int bj = 2131820984;
  public static final int bk = 2131820986;
  public static final int bl = 2131820987;
  public static final int bm = 2131820988;
  public static final int bn = 2131820993;
  public static final int c = 2131558962;
  public static final int d = 2131559148;
  public static final int e = 2131559189;
  public static final int f = 2131559085;
  public static final int g = 2131558981;
  public static final int h = 2131559091;
  public static final int i = 2131559087;
  public static final int j = 2131755290;
  public static final int k = 2131755292;
  public static final int l = 2131755295;
  public static final int m = 2131755417;
  public static final int n = 2131755753;
  public static final int o = 2131756147;
  public static final int p = 2131756309;
  public static final int q = 2131756310;
  public static final int r = 2131756356;
  public static final int s = 2131756614;
  public static final int t = 2131756658;
  public static final int u = 2131756728;
  public static final int v = 2131756729;
  public static final int w = 2131758021;
  public static final int x = 2131758085;
  public static final int y = 2131758086;
  public static final int z = 2131758186;
  
  public Intent a(Activity paramActivity)
  {
    String str = cz.a(paramActivity);
    if (str == null) {
      return null;
    }
    ComponentName localComponentName = new ComponentName(paramActivity, str);
    try
    {
      if (cz.b(paramActivity, localComponentName) == null) {
        return fr.a.a(localComponentName);
      }
      Intent localIntent = new Intent().setComponent(localComponentName);
      return localIntent;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + str + "' in manifest");
    }
    return null;
  }
  
  public String a(Context paramContext, ActivityInfo paramActivityInfo)
  {
    String str;
    if (paramActivityInfo.metaData == null) {
      str = null;
    }
    do
    {
      return str;
      str = paramActivityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
      if (str == null) {
        return null;
      }
    } while (str.charAt(0) != '.');
    return paramContext.getPackageName() + str;
  }
  
  public boolean a(Activity paramActivity, Intent paramIntent)
  {
    String str = paramActivity.getIntent().getAction();
    return (str != null) && (!str.equals("android.intent.action.MAIN"));
  }
  
  public void b(Activity paramActivity, Intent paramIntent)
  {
    paramIntent.addFlags(67108864);
    paramActivity.startActivity(paramIntent);
    paramActivity.finish();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     da
 * JD-Core Version:    0.7.0.1
 */