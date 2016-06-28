import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class khq
  implements llf
{
  public String a;
  private final otk b;
  private final pbn c;
  private final giz d;
  private final quu e;
  private List<rac> f;
  private final String g;
  
  khq(String paramString, Map<rac, rgq<khi>> paramMap, otk paramotk, pbn parampbn, giz paramgiz, quu paramquu)
  {
    this.g = paramString;
    this.b = paramotk;
    this.c = parampbn;
    this.d = paramgiz;
    this.e = paramquu;
    this.f = new ArrayList(paramMap.keySet());
  }
  
  public final String a()
  {
    String str1 = this.g;
    String str2 = this.a;
    return 1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + ":" + str2;
  }
  
  public final pic<lkf> a(String paramString, List<rac> paramList)
  {
    pyg localpyg = ((pyg)qva.d.l()).k(this.g);
    if (!TextUtils.isEmpty(this.a)) {
      localpyg.l(this.a);
    }
    localpyg.b(((pyg)rae.c.l()).a(this.f));
    pye localpye1 = (pye)localpyg.e();
    if (!localpye1.ao_()) {
      throw new pzr();
    }
    qva localqva = (qva)localpye1;
    pcf localpcf = new pcf(this.c.a(this.b));
    gjb localgjb = this.d.a(this.b.a());
    if (localgjb.c("is_managed_account"))
    {
      String str = localgjb.b("effective_gaia_id");
      pye localpye2 = (pye)((pyg)mgw.c.l()).h(str).e();
      if (!localpye2.ao_()) {
        throw new pzr();
      }
      mgw localmgw = (mgw)localpye2;
      if (localmgw == null) {
        throw new NullPointerException();
      }
      localpcf.b = ((mgw)localmgw);
    }
    return phu.a(this.e.a(localpcf, localqva), pdt.a(new khr(this)), pii.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     khq
 * JD-Core Version:    0.7.0.1
 */