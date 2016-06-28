import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class azd
  extends mca
  implements gzi
{
  static boolean b = false;
  static boolean c = false;
  private View Z;
  int a;
  private final gzj aa = new gzj(this, this.bp);
  private bdk d;
  
  public azd()
  {
    new jeq(this.bp, new aze(this), '\000');
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.Z = paramLayoutInflater.inflate(efj.vM, paramViewGroup, false);
    this.aa.b(new azf(this, this.bn, "CheckAutoEnhancePromo"));
    return this.Z;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.a = this.m.getInt("account_id", -1);
    this.aa.a.add(this);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    paramhaa.c = false;
    if (paramString.equals("CheckAutoEnhancePromo"))
    {
      v();
      if ((!hae.a(paramhae)) || (!Log.isLoggable("PhotoAutoEnhancePromo", 3))) {}
    }
    while ((!paramString.equals("SendAutoEnhancePromo")) || (!Log.isLoggable("PhotoAutoEnhancePromo", 3))) {
      return;
    }
    hae.a(paramhae);
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.d = ((bdk)this.bo.a(bdk.class));
  }
  
  public final void m()
  {
    super.m();
    v();
  }
  
  final void v()
  {
    boolean bool1 = true;
    if ((this.d == null) || (this.d.b == null) || (this.d.b.g() == null))
    {
      if (this.Z != null) {
        this.Z.setVisibility(8);
      }
      return;
    }
    bcp localbcp = this.d.b;
    boolean bool2 = this.d.c;
    boolean bool3;
    if ((localbcp.e() != null) && (localbcp.e() == localbcp.f()))
    {
      bool3 = bool1;
      label94:
      if (jqx.a(localbcp.g(), localbcp.a().e, bool2, bool3, jpt.b(localbcp.e())) != 2) {
        break label226;
      }
      label128:
      if (localbcp.g().N == null) {
        break label240;
      }
    }
    label226:
    label231:
    label240:
    for (boolean bool4 = localbcp.g().N.booleanValue();; bool4 = false)
    {
      if ((bool1) && (bool4) && (b))
      {
        if (!this.d.e) {
          break label231;
        }
        if (this.Z.getVisibility() != 0) {
          break;
        }
        this.aa.b(new azg(this, this.bn, "SendAutoEnhancePromo"));
      }
      this.Z.setVisibility(8);
      return;
      bool3 = false;
      break label94;
      bool1 = false;
      break label128;
      this.Z.setVisibility(0);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     azd
 * JD-Core Version:    0.7.0.1
 */