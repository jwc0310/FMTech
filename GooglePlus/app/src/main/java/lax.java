import android.app.Dialog;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class lax
  extends mca
  implements cw<Cursor>, gzi, kxx, lat, lbe, lcf, luu
{
  private String Z;
  public boolean a;
  private ListView aa;
  private lca ab;
  private int ac;
  private String ad;
  private int ae;
  private boolean af;
  private git b;
  private ArrayList<kzc> c;
  private las d;
  
  private final void a(int paramInt, String paramString1, String paramString2)
  {
    this.ac = paramInt;
    this.af = true;
    kzc localkzc = (kzc)this.c.get(this.ac);
    lbd locallbd1 = new lbd();
    int j;
    if (TextUtils.isEmpty(localkzc.a)) {
      j = ev.Q;
    }
    int i;
    for (String str = g().getString(j);; str = g().getString(i))
    {
      locallbd1.a.putString("dialog_title", str);
      locallbd1.a.putString("name_error_msg", paramString2);
      lbd locallbd2 = locallbd1.a(Boolean.valueOf(false));
      if (paramString1 == null) {
        paramString1 = localkzc.b;
      }
      locallbd2.a.putString("name_value", paramString1);
      lbb locallbb = locallbd2.a();
      locallbb.n = this;
      locallbb.p = 0;
      locallbb.a(f().b.a.d, "editListItemDialogTag");
      return;
      i = ev.p;
    }
  }
  
  private final void w()
  {
    if (TextUtils.isEmpty(((kzc)this.c.get(-1 + this.c.size())).a))
    {
      this.ab.f = false;
      return;
    }
    if (this.c.size() < 20)
    {
      this.c.add(new kzc("", "", ""));
      this.d.notifyDataSetChanged();
      this.ab.f = false;
      return;
    }
    this.ab.f = true;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(aw.ea, paramViewGroup, false);
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException();
    }
    return new kzo(this.bn, this.b.c(), this.Z, kzq.c);
  }
  
  public final void a(int paramInt)
  {
    a(paramInt, null, null);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    kzc localkzc = (kzc)this.c.get(paramInt1);
    this.c.remove(paramInt1);
    this.c.add(paramInt2, localkzc);
    this.d.notifyDataSetChanged();
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    d(true);
    this.Z = this.m.getString("square_id");
    this.c = new ArrayList();
    this.d = new las(this, f(), this.c, 20);
    if (paramBundle != null)
    {
      Parcelable[] arrayOfParcelable = paramBundle.getParcelableArray("streams_data");
      Collections.addAll(this.c, Arrays.copyOf(arrayOfParcelable, arrayOfParcelable.length, [Lkzc.class));
      this.ac = paramBundle.getInt("update_position");
      this.ad = paramBundle.getString("update_name");
      this.ae = paramBundle.getInt("current_action");
      this.a = paramBundle.getBoolean("order_changed");
      this.af = paramBundle.getBoolean("cat_changed");
    }
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    ((lay)this.bo.a(lay.class)).f();
  }
  
  public final void a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.a(paramMenu, paramMenuInflater);
    paramMenuInflater.inflate(efj.WX, paramMenu);
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.aa = ((ListView)paramView.findViewById(dl.M));
    this.aa.setAdapter(this.d);
    this.ab = new lca(this.aa, this, dl.F, false);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(String paramString, Bundle paramBundle)
  {
    if ("EditCategoriesFragment".equals(paramString))
    {
      int i = paramBundle.getInt("delete_index_key");
      if (!this.d.a())
      {
        this.ae = 2;
        this.ac = i;
        kzc localkzc = (kzc)this.c.get(i);
        qxt localqxt = new qxt();
        localqxt.a = localkzc.a;
        localqxt.b = localkzc.b;
        lbh locallbh = new lbh(this.bn, this.b.c(), this.Z, localqxt, this.ae);
        ((gzj)this.bo.a(gzj.class)).c(locallbh);
      }
    }
    else
    {
      return;
    }
    Toast.makeText(this.bn, ev.E, 0).show();
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("EditSquareStreamOrderTask".equals(paramString)) {
      ((lay)this.bo.a(lay.class)).f();
    }
    while (!"EditSquareStreamTask".equals(paramString)) {
      return;
    }
    if (paramhae.b != 200) {}
    for (int i = 1; i == 0; i = 0) {
      switch (this.ae)
      {
      default: 
        throw new IllegalArgumentException("Specified action cannot be recognized.");
      }
    }
    String str = paramhae.a().getString("stream_id");
    kzc localkzc2 = (kzc)this.c.get(this.ac);
    this.c.set(this.ac, new kzc(str, this.ad, localkzc2.c));
    w();
    this.d.notifyDataSetChanged();
    this.af = true;
    return;
    kzc localkzc1 = (kzc)this.c.get(this.ac);
    this.c.set(this.ac, new kzc(localkzc1.a, this.ad, localkzc1.c));
    this.d.notifyDataSetChanged();
    this.af = true;
    return;
    this.af = true;
    this.c.remove(this.ac);
    w();
    this.d.notifyDataSetChanged();
  }
  
  public final void a(String paramString1, String paramString2, int paramInt, lbb paramlbb)
  {
    if (paramInt == -2) {
      return;
    }
    if (TextUtils.isEmpty(paramString1))
    {
      int i1 = ev.l;
      paramlbb.a(g().getString(i1));
      return;
    }
    int i = this.ac;
    int j = 0;
    int k;
    if (j < this.c.size()) {
      if ((j != i) && (paramString1.equalsIgnoreCase(((kzc)this.c.get(j)).b)))
      {
        k = 1;
        label87:
        if (k == 0) {
          break label134;
        }
        n = ev.r;
        a(i, paramString1, g().getString(n));
      }
    }
    label134:
    while (paramString1.equals(((kzc)this.c.get(i)).b))
    {
      int n;
      paramlbb.d.dismiss();
      return;
      j++;
      break;
      k = 0;
      break label87;
    }
    this.ac = i;
    this.ad = paramString1;
    kzc localkzc = (kzc)this.c.get(this.ac);
    qxt localqxt = new qxt();
    localqxt.b = paramString1;
    localqxt.a = localkzc.a;
    boolean bool = TextUtils.isEmpty(localqxt.a);
    int m = 0;
    if (bool) {}
    for (;;)
    {
      this.ae = m;
      lbh locallbh = new lbh(f(), this.b.c(), this.Z, localqxt, this.ae);
      ((gzj)this.bo.a(gzj.class)).c(locallbh);
      break;
      m = 1;
    }
  }
  
  public final boolean a_(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == dl.ab)
    {
      if ((!this.af) && (!this.a)) {
        ((lay)this.bo.a(lay.class)).f();
      }
      for (;;)
      {
        return true;
        if ((!this.c.isEmpty()) && (TextUtils.isEmpty(((kzc)this.c.get(-1 + this.c.size())).a))) {
          this.c.remove(-1 + this.c.size());
        }
        lbx locallbx = new lbx(this.bn, this.b.c(), this.Z, (kzc[])this.c.toArray(new kzc[this.c.size()]), this.a);
        ((gzj)this.bo.a(gzj.class)).c(locallbx);
      }
    }
    return super.a_(paramMenuItem);
  }
  
  public final void b(int paramInt)
  {
    int i = ev.k;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = ((kzc)this.c.get(paramInt)).b;
    String str1 = g().getString(i, arrayOfObject);
    int j = ev.j;
    String str2 = g().getString(j);
    int k = ev.i;
    String str3 = g().getString(k);
    int m = ev.h;
    String str4 = g().getString(m);
    int n = ev.a;
    lau locallau = lau.a(str1, str2, str3, str4, g().getString(n));
    locallau.m.putInt("delete_index_key", paramInt);
    locallau.a(h(), "EditCategoriesFragment");
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void c(int paramInt)
  {
    String str1 = ((kzc)this.d.getItem(paramInt)).b;
    String str2 = this.bn.getString(ev.P);
    int i = this.d.getCount();
    SparseArray localSparseArray = new SparseArray();
    int j = 0;
    if (j < i)
    {
      kzc localkzc = (kzc)this.d.getItem(j);
      String str5 = localkzc.b;
      if ((!TextUtils.equals(str5, str1)) && (!TextUtils.isEmpty(localkzc.b)))
      {
        if (TextUtils.isEmpty(str1)) {
          str5 = str2;
        }
        if (j <= paramInt) {
          break label167;
        }
      }
      label167:
      for (int k = ev.w;; k = ev.x)
      {
        mbf localmbf = this.bn;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(j + 1);
        arrayOfObject[1] = str5;
        localSparseArray.put(j, localmbf.getString(k, arrayOfObject));
        j++;
        break;
      }
    }
    if (TextUtils.isEmpty(str1)) {}
    for (String str3 = str2;; str3 = str1)
    {
      String str4 = str3.toString();
      lck locallck = new lck().a(paramInt, str4, localSparseArray);
      locallck.n = this;
      locallck.p = 0;
      locallck.a(f().b.a.d, "reorderElementsDialogTag");
      return;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(kxx.class, this);
    this.b = ((git)this.bo.a(git.class));
    ((gzj)this.bo.a(gzj.class)).a.add(this);
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (paramBundle == null) {
      k().a(2, null, this);
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putParcelableArray("streams_data", (Parcelable[])this.c.toArray(new kzc[this.c.size()]));
    paramBundle.putInt("update_position", this.ac);
    paramBundle.putString("update_name", this.ad);
    paramBundle.putInt("current_action", this.ae);
    paramBundle.putBoolean("order_changed", this.a);
    paramBundle.putBoolean("cat_changed", this.af);
  }
  
  public final void v()
  {
    this.a = true;
    mbf localmbf = this.bn;
    gxr localgxr = new gxr();
    gxq localgxq = new gxq(pjo.ag);
    localgxr.b.add(localgxq);
    new gwz(30, localgxr.a(this.bn)).b(localmbf);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lax
 * JD-Core Version:    0.7.0.1
 */