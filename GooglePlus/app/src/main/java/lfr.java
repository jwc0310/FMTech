import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class lfr
  implements View.OnClickListener, cw<Cursor>, gzi, lfe
{
  private static final String[] d = { "square_id", "joinability", "membership_status", "suggestion_id" };
  public final Map<String, lft> a;
  public boolean b = false;
  @Deprecated
  public lfs c = null;
  private final Map<String, Integer> e;
  private final WeakHashMap<lfv, String> f;
  private final Context g;
  private final int h;
  private final gzj i;
  private final lfq j;
  private final ill k;
  
  public lfr(Context paramContext, bk parambk, int paramInt)
  {
    this.g = paramContext;
    this.h = paramInt;
    this.i = ((gzj)mbb.a(paramContext, gzj.class));
    this.j = new lfq(paramContext, parambk, paramInt, this);
    this.a = new HashMap();
    this.e = new HashMap();
    this.f = new WeakHashMap();
    this.i.a.add(this);
    if (((git)mbb.a(this.g, git.class)).f().c("is_google_plus")) {
      parambk.k().a(48121620, null, this);
    }
    this.c = ((lfs)mbb.b(paramContext, lfs.class));
    ill localill = new ill(paramContext, paramInt);
    localill.a.add(ine.class);
    this.k = localill;
  }
  
  private final void b(lfv paramlfv)
  {
    if (this.a.containsKey(paramlfv.a()))
    {
      kxg localkxg = ((lft)this.a.get(paramlfv.a())).a;
      if ((this.b) && (localkxg == kxg.a)) {
        localkxg = kxg.i;
      }
      paramlfv.a(localkxg);
    }
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    return new kzp(this.g, this.h, d);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(String paramString)
  {
    if (!this.e.containsKey(paramString)) {
      return;
    }
    if (this.c != null) {
      this.c.c(((Integer)this.e.get(paramString)).intValue());
    }
    lfp locallfp = new lfp(this.g, this.h, paramString, ((Integer)this.e.get(paramString)).intValue());
    locallfp.f = "join_action";
    this.i.b(locallfp);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    Integer localInteger;
    int m;
    if (("join_action".equals(paramString)) && (paramhae != null))
    {
      String str = paramhae.a().getString("square_id");
      localInteger = (Integer)this.e.get(str);
      this.i.d.a("join_action");
      this.e.remove(str);
      if (paramhae.b == 200) {
        break label83;
      }
      m = 1;
      if (m == 0) {
        break label89;
      }
    }
    label83:
    label89:
    do
    {
      return;
      m = 0;
      break;
      this.j.a(paramhaa);
    } while ((this.c == null) || (localInteger == null));
    this.c.d(localInteger.intValue());
  }
  
  public final void a(String paramString, kxg paramkxg)
  {
    if (this.e.containsKey(paramString)) {}
    Integer localInteger;
    do
    {
      return;
      if (!this.k.a())
      {
        this.g.startActivity(this.k.b());
        return;
      }
      if (paramkxg == kxg.i)
      {
        this.g.startActivity(((kyp)mbb.a(this.g, kyp.class)).a(this.h, paramString, null));
        return;
      }
      localInteger = efj.a(paramkxg);
    } while (localInteger == null);
    this.e.put(paramString, localInteger);
    this.i.d.a(this.g.getString(efj.b(paramkxg)), null, "join_action", false);
    if (efj.o(localInteger.intValue()))
    {
      this.j.a(paramString, localInteger.intValue());
      return;
    }
    a(paramString);
  }
  
  public final void a(lfv paramlfv)
  {
    efj.k();
    String str = paramlfv.a();
    if (str == null) {
      throw new IllegalArgumentException("JoinButton missing Square Id during registration.");
    }
    this.f.put(paramlfv, str);
    paramlfv.setOnClickListener(this);
    b(paramlfv);
  }
  
  public void onClick(View paramView)
  {
    lfv locallfv = (lfv)paramView;
    if ((paramView instanceof gxs)) {
      gwz.a(paramView, 4);
    }
    a(locallfv.a(), locallfv.b());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lfr
 * JD-Core Version:    0.7.0.1
 */