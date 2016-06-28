import android.content.Context;
import java.util.Arrays;
import java.util.List;

public final class bnn
  extends gzf
{
  private final int a;
  private final List<String> b;
  private final long[] c;
  private final boolean d;
  private final boolean l;
  private final boolean m;
  private final String n;
  
  public bnn(Context paramContext, int paramInt, String paramString1, long paramLong, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString2)
  {
    this(paramContext, paramInt, Arrays.asList(new String[] { paramString1 }), new long[] { paramLong }, false, true, paramBoolean3, paramString2);
  }
  
  public bnn(Context paramContext, int paramInt, List<String> paramList, long[] paramArrayOfLong, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString)
  {
    super(paramContext, "MarkGunsNotificationsReadTask");
    this.a = paramInt;
    this.b = paramList;
    this.c = paramArrayOfLong;
    this.d = paramBoolean1;
    this.l = paramBoolean2;
    this.m = paramBoolean3;
    this.n = paramString;
  }
  
  public final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    brg.b(localContext, this.a);
    dmr.a(localContext, this.a);
    int i;
    bls localbls;
    if ((this.b == null) || (this.b.isEmpty()))
    {
      i = 1;
      if (i != 0) {
        break label159;
      }
      brg.a(localContext, this.a, this.b, this.d, this.l);
      localbls = new bls(localContext, this.a, this.b, this.c, 2, this.n);
      localbls.i();
    }
    label159:
    for (hae localhae = new hae(localbls.o, localbls.q, null);; localhae = new hae(true))
    {
      if (this.m) {
        new bir(localContext, this.a, null).i();
      }
      return localhae;
      i = 0;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bnn
 * JD-Core Version:    0.7.0.1
 */