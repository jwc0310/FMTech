import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Bundle;

public class ev
  implements es
{
  public static final int A = 2131757940;
  public static final int B = 2131757942;
  public static final int C = 2131757943;
  public static final int D = 2131757944;
  public static final int E = 2131757945;
  public static final int F = 2131757946;
  public static final int G = 2131757947;
  public static final int H = 2131757949;
  public static final int I = 2131757950;
  public static final int J = 2131757951;
  public static final int K = 2131757956;
  public static final int L = 2131757958;
  public static final int M = 2131757959;
  public static final int N = 2131757961;
  public static final int O = 2131757962;
  public static final int P = 2131757996;
  public static final int Q = 2131757997;
  public static final int a = 2131755294;
  public static final int b = 2131755756;
  public static final int c = 2131756614;
  public static final int d = 2131756651;
  public static final int e = 2131757579;
  public static final int f = 2131757773;
  public static final int g = 2131757894;
  public static final int h = 2131757901;
  public static final int i = 2131757902;
  public static final int j = 2131757903;
  public static final int k = 2131757904;
  public static final int l = 2131757905;
  public static final int m = 2131757907;
  public static final int n = 2131757908;
  public static final int o = 2131757909;
  public static final int p = 2131757911;
  public static final int q = 2131757919;
  public static final int r = 2131757926;
  public static final int s = 2131757929;
  public static final int t = 2131757930;
  public static final int u = 2131757931;
  public static final int v = 2131757933;
  public static final int w = 2131757935;
  public static final int x = 2131757936;
  public static final int y = 2131757937;
  public static final int z = 2131757939;
  
  public final Bundle a(Intent paramIntent)
  {
    ClipData localClipData = paramIntent.getClipData();
    if (localClipData != null)
    {
      ClipDescription localClipDescription = localClipData.getDescription();
      if ((localClipDescription.hasMimeType("text/vnd.android.intent")) && (localClipDescription.getLabel().equals("android.remoteinput.results"))) {
        return (Bundle)localClipData.getItemAt(0).getIntent().getExtras().getParcelable("android.remoteinput.resultsData");
      }
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ev
 * JD-Core Version:    0.7.0.1
 */