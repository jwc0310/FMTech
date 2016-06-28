import android.text.TextUtils;
import java.util.List;

public final class grl
  implements llf
{
  private static final String b = Integer.toString(96372017);
  public String a;
  private final otk c;
  private final pbn d;
  private final qri e;
  private final giz f;
  private final grb g;
  
  grl(otk paramotk, pbn parampbn, qri paramqri, giz paramgiz, grb paramgrb)
  {
    this.c = paramotk;
    this.d = parampbn;
    this.e = paramqri;
    this.f = paramgiz;
    this.g = paramgrb;
  }
  
  public final String a()
  {
    String str1 = String.valueOf(b);
    String str2 = String.valueOf(this.a);
    if (str2.length() != 0) {
      return str1.concat(str2);
    }
    return new String(str1);
  }
  
  public final pic<lkf> a(String paramString, List<rac> paramList)
  {
    boolean bool;
    pyg localpyg1;
    pyg localpyg2;
    if (!paramList.isEmpty())
    {
      bool = true;
      efj.c(bool, "Require Card Types");
      localpyg1 = (pyg)qsf.d.l();
      if (this.a != null) {
        localpyg1.j(this.a);
      }
      localpyg1.b(this.g.a());
      localpyg2 = (pyg)qpx.d.l();
      if (!TextUtils.isEmpty(paramString)) {
        break label132;
      }
      localpyg2.e(30);
    }
    pye localpye1;
    for (;;)
    {
      localpye1 = (pye)((pyg)rae.c.l()).a(paramList).a(raw.b).e();
      if (localpye1.ao_()) {
        break label150;
      }
      throw new pzr();
      bool = false;
      break;
      label132:
      localpyg2.e(10);
      localpyg2.i(paramString);
    }
    label150:
    rae localrae = (rae)localpye1;
    pye localpye2 = (pye)localpyg1.a(localpyg2).a(localrae).e();
    if (!localpye2.ao_()) {
      throw new pzr();
    }
    qsf localqsf = (qsf)localpye2;
    pcf localpcf = new pcf(this.d.a(this.c));
    gjb localgjb = this.f.a(this.c.a());
    if (localgjb.c("is_managed_account"))
    {
      String str = localgjb.b("effective_gaia_id");
      pye localpye3 = (pye)((pyg)mgw.c.l()).h(str).e();
      if (!localpye3.ao_()) {
        throw new pzr();
      }
      mgw localmgw = (mgw)localpye3;
      if (localmgw == null) {
        throw new NullPointerException();
      }
      localpcf.b = ((mgw)localmgw);
    }
    return phu.a(this.e.a(localpcf, localqsf), new grm(this), pii.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     grl
 * JD-Core Version:    0.7.0.1
 */