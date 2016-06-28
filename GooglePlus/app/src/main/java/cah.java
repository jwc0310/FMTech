import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;

public final class cah
  extends cjx
  implements jih
{
  private final cw<Cursor> Z;
  Map<String, List<jgw>> a;
  String b;
  caj c;
  boolean d;
  
  public cah()
  {
    gxl localgxl = new gxl(pkf.t);
    this.bo.a(gxs.class, localgxl);
    new jiy(this.bp).a = this;
    this.Z = new cai(this);
  }
  
  protected final void A() {}
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    a(this.c);
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null) {
      this.b = paramBundle.getString("continuation_token");
    }
    this.c = new caj(this, aI_());
    this.c.a(false);
    k().a(2, null, this.Z);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("GetFollowersTask".equals(paramString))
    {
      this.d = false;
      if (paramhae != null)
      {
        if (paramhae.b != 200) {}
        for (int i = 1; i == 0; i = 0)
        {
          this.b = paramhae.a().getString("continuation_token");
          return;
        }
      }
      this.c.a(false);
      this.ad = false;
      J();
      return;
    }
    super.a(paramString, paramhae, paramhaa);
  }
  
  public final void a(Map<String, List<jgw>> paramMap)
  {
    this.a = paramMap;
    this.c.notifyDataSetChanged();
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("continuation_token", this.b);
  }
  
  protected final int w()
  {
    return efj.vs;
  }
  
  protected final CharSequence x()
  {
    int i = aau.my;
    return g().getString(i);
  }
  
  protected final void z() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cah
 * JD-Core Version:    0.7.0.1
 */