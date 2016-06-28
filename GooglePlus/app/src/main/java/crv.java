import android.content.Context;
import android.os.Handler;
import java.util.List;

public final class crv
  implements hal
{
  final gxx a;
  
  public crv(Context paramContext)
  {
    this.a = ((gxx)mbb.a(paramContext, gxx.class));
  }
  
  public final void a(Context paramContext, int paramInt)
  {
    gxw localgxw = new gxw(paramContext, paramInt);
    localgxw.c = gxz.dB;
    localgxw.d = gya.M;
    crw localcrw = new crw(this, localgxw);
    efj.m().post(localcrw);
  }
  
  public final void b(Context paramContext, int paramInt)
  {
    gxw localgxw = new gxw(paramContext, paramInt);
    localgxw.c = gxz.dC;
    localgxw.d = gya.M;
    crw localcrw = new crw(this, localgxw);
    efj.m().post(localcrw);
  }
  
  public final void c(Context paramContext, int paramInt)
  {
    gxw localgxw = new gxw(paramContext, paramInt);
    localgxw.c = gxz.dD;
    localgxw.d = gya.M;
    crw localcrw = new crw(this, localgxw);
    efj.m().post(localcrw);
  }
  
  public final void d(Context paramContext, int paramInt)
  {
    gxt localgxt = pjm.g;
    gxr localgxr = new gxr();
    gxq localgxq1 = new gxq(localgxt);
    localgxr.b.add(localgxq1);
    gxq localgxq2 = new gxq(pjt.e);
    localgxr.b.add(localgxq2);
    gwz localgwz = new gwz(-1, localgxr);
    localgwz.c = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("account_name");
    localgwz.b(paramContext);
  }
  
  public final void e(Context paramContext, int paramInt)
  {
    gxt localgxt = pjm.b;
    gxr localgxr = new gxr();
    gxq localgxq1 = new gxq(localgxt);
    localgxr.b.add(localgxq1);
    gxq localgxq2 = new gxq(pjt.e);
    localgxr.b.add(localgxq2);
    gwz localgwz = new gwz(-1, localgxr);
    localgwz.c = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("account_name");
    localgwz.b(paramContext);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     crv
 * JD-Core Version:    0.7.0.1
 */