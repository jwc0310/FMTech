import android.content.Context;
import android.database.Cursor;
import com.google.android.apps.plus.content.EsProvider;

public final class ckd
  extends hqj
{
  final String r;
  final boolean s;
  final boolean t;
  private final fv u;
  private final int v;
  private final jiw w;
  private final jjm<jjg> x;
  
  public ckd(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramContext);
    this.w = ((jiw)mbb.a(paramContext, jiw.class));
    this.u = new fv(this);
    this.d = EsProvider.f(paramContext);
    this.v = paramInt;
    this.r = paramString1;
    this.s = true;
    this.t = false;
    this.x = new cke(this);
  }
  
  public ckd(Context paramContext, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramContext);
    this.w = ((jiw)mbb.a(paramContext, jiw.class));
    this.u = new fv(this);
    this.d = EsProvider.f(this.l);
    this.v = paramInt;
    this.r = null;
    this.s = paramBoolean1;
    this.t = paramBoolean2;
    this.x = new cke(this);
  }
  
  public final Cursor o()
  {
    jmd localjmd = new jmd(this.w.a(this.v, 2, this.x));
    localjmd.registerContentObserver(this.u);
    return localjmd;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ckd
 * JD-Core Version:    0.7.0.1
 */