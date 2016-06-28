import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class azt
  extends BaseAdapter
{
  final Context a;
  final loy b;
  final bdg c;
  final bdf d;
  final ArrayList<atq> e = new ArrayList();
  private final bas f;
  private final bdk g;
  
  public azt(Context paramContext, bas parambas, loy paramloy)
  {
    this.a = paramContext;
    this.f = parambas;
    this.b = paramloy;
    this.g = ((bdk)mbb.a(paramContext, bdk.class));
    this.c = ((bdg)mbb.a(paramContext, bdg.class));
    this.d = ((bdf)mbb.a(paramContext, bdf.class));
    this.g.a.a(new azu(this), false);
    this.c.a.a(new azv(this), false);
    this.d.a.a(new azw(this), false);
  }
  
  final void a()
  {
    if ((this.g == null) || (this.g.b == null)) {
      return;
    }
    bar localbar = new bar(this.a);
    loy localloy1 = this.b;
    localbar.a.a = localloy1;
    loy localloy2 = this.b;
    localbar.a.b = localloy2;
    String str1 = this.c.b;
    localbar.a.c = str1;
    String str2 = this.c.c;
    localbar.a.d = str2;
    String str3 = this.c.d;
    localbar.a.e = str3;
    String str4 = this.c.e;
    localbar.a.f = str4;
    long l = this.c.f;
    localbar.a.g = l;
    baq localbaq = localbar.a;
    bav localbav = new bav(this.a);
    bas localbas = this.f;
    localbav.a.a = localbas;
    int i = this.c.g;
    localbav.a.b = i;
    boolean bool1 = this.g.b.w();
    localbav.a.c = bool1;
    boolean bool2 = this.g.b.A();
    localbav.a.d = bool2;
    String str5 = this.c.h;
    localbav.a.e = str5;
    int j = this.c.i;
    localbav.a.f = j;
    boolean bool3 = this.c.j;
    localbav.a.g = bool3;
    if (this.g.b != null) {}
    for (boolean bool4 = this.g.b.t();; bool4 = false)
    {
      localbav.a.h = bool4;
      bat localbat = localbav.a;
      if (this.e.size() > 0)
      {
        this.e.remove(0);
        this.e.remove(0);
      }
      this.e.add(0, localbaq);
      this.e.add(1, localbat);
      return;
    }
  }
  
  public final int getCount()
  {
    return this.e.size();
  }
  
  public final Object getItem(int paramInt)
  {
    return this.e.get(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public final int getItemViewType(int paramInt)
  {
    return ((atq)this.e.get(paramInt)).a();
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return ((atq)this.e.get(paramInt)).a(paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return bao.a().length;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     azt
 * JD-Core Version:    0.7.0.1
 */