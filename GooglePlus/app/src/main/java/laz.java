import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ListView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class laz
  extends mca
  implements cw<Cursor>, gzi, lat, lbe, lcf, luu
{
  private String Z;
  public boolean a;
  private ListView aa;
  private int ab;
  private lca ac;
  private git b;
  private ArrayList<odq> c;
  private lbz d;
  
  private void w()
  {
    if (this.c.isEmpty()) {
      x();
    }
    if (TextUtils.isEmpty(((odq)this.c.get(-1 + this.c.size())).a))
    {
      this.ac.f = false;
      return;
    }
    if (this.c.size() < 10)
    {
      x();
      this.ac.f = false;
      return;
    }
    this.ac.f = true;
  }
  
  private final void x()
  {
    odq localodq = new odq();
    localodq.b = "";
    localodq.a = "";
    this.c.add(localodq);
    this.d.notifyDataSetChanged();
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
    this.ab = paramInt;
    odq localodq = (odq)this.c.get(paramInt);
    int i;
    lbd locallbd;
    int k;
    if ((TextUtils.isEmpty(localodq.b)) && (TextUtils.isEmpty(localodq.a)))
    {
      i = 1;
      locallbd = new lbd().a(Boolean.valueOf(true));
      if (i == 0) {
        break label168;
      }
      k = ev.K;
    }
    label168:
    int j;
    for (String str1 = g().getString(k);; str1 = g().getString(j))
    {
      locallbd.a.putString("dialog_title", str1);
      String str2 = localodq.b;
      locallbd.a.putString("name_value", str2);
      String str3 = localodq.a;
      locallbd.a.putString("url_value", str3);
      lbb locallbb = locallbd.a();
      locallbb.n = this;
      locallbb.p = 0;
      locallbb.a(f().b.a.d, "editListItemDialogTag");
      return;
      i = 0;
      break;
      j = ev.s;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    odq localodq = (odq)this.c.get(paramInt1);
    this.c.remove(paramInt1);
    this.c.add(paramInt2, localodq);
    this.d.notifyDataSetChanged();
    this.a = true;
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.c = new ArrayList();
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("related_links"))
      {
        odr localodr = jht.c(paramBundle.getByteArray("related_links"));
        Collections.addAll(this.c, localodr.a);
      }
      this.ab = paramBundle.getInt("edit_position", 0);
      this.a = paramBundle.getBoolean("data_changed", false);
    }
    this.Z = this.m.getString("square_id");
    this.d = new lbz(this, f(), this.c);
    d(true);
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    ((lba)this.bo.a(lba.class)).f();
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
    this.aa.setItemsCanFocus(true);
    this.ac = new lca(this.aa, this, dl.Z, false);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    int i;
    if (paramhae.b != 200)
    {
      i = 1;
      if (i == 0)
      {
        if (!"GetSquareTask".equals(paramString)) {
          break label42;
        }
        f().finish();
      }
    }
    label42:
    while (!"EditSquareTask".equals(paramString))
    {
      return;
      i = 0;
      break;
    }
    f().finish();
  }
  
  public final void a(String paramString1, String paramString2, int paramInt, lbb paramlbb)
  {
    if (paramInt == -2) {
      return;
    }
    if (TextUtils.isEmpty(paramString1))
    {
      int k = ev.H;
      paramlbb.a(g().getString(k));
      return;
    }
    if (TextUtils.isEmpty(paramString2))
    {
      int j = ev.J;
      paramlbb.b(g().getString(j));
      return;
    }
    String str1 = URLUtil.guessUrl(paramString2);
    if ((Patterns.WEB_URL.matcher(str1).matches()) && ((URLUtil.isHttpUrl(str1)) || (URLUtil.isHttpsUrl(str1)))) {}
    for (String str2 = str1; str2 == null; str2 = null)
    {
      int i = ev.I;
      paramlbb.b(g().getString(i));
      return;
    }
    odq localodq1 = (odq)this.c.get(this.ab);
    if ((!mfx.a(localodq1.b, paramString1)) || (!mfx.a(localodq1.a, str2)))
    {
      this.c.remove(this.ab);
      odq localodq2 = new odq();
      localodq2.b = paramString1;
      localodq2.a = str2;
      this.c.add(this.ab, localodq2);
      w();
      this.d.notifyDataSetChanged();
      this.a = true;
    }
    paramlbb.d.dismiss();
  }
  
  public final boolean a_(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == dl.ab)
    {
      odp localodp = new odp();
      localodp.f = new odr();
      int i = this.c.size();
      localodp.f.a = ((odq[])this.c.toArray(new odq[i]));
      if ((i > 0) && (TextUtils.isEmpty(localodp.f.a[(i - 1)].a))) {
        localodp.f.a[(i - 1)] = null;
      }
      lby locallby = new lby(this.bn, this.b.c(), this.Z, localodp);
      ((gzj)this.bo.a(gzj.class)).c(locallby);
      return true;
    }
    return super.a_(paramMenuItem);
  }
  
  public final void b(int paramInt)
  {
    this.c.remove(paramInt);
    w();
    this.d.notifyDataSetChanged();
    this.a = true;
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void c(int paramInt)
  {
    Context localContext = aI_();
    odq localodq1 = (odq)this.d.getItem(paramInt);
    int i = this.d.getCount();
    SparseArray localSparseArray = new SparseArray();
    StringBuilder localStringBuilder = new StringBuilder();
    int j = 0;
    if (j < i)
    {
      odq localodq2 = (odq)this.d.getItem(j);
      if ((!TextUtils.equals(localodq2.b, localodq1.b)) && (!TextUtils.equals(localodq2.a, localodq1.a)) && (!TextUtils.isEmpty(localodq2.b)) && (!TextUtils.isEmpty(localodq2.a)))
      {
        CharSequence[] arrayOfCharSequence2 = new CharSequence[2];
        arrayOfCharSequence2[0] = localodq2.b;
        arrayOfCharSequence2[1] = localodq2.a;
        efj.a(localStringBuilder, arrayOfCharSequence2);
        if (j <= paramInt) {
          break label215;
        }
      }
      label215:
      for (int k = ev.w;; k = ev.x)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(j + 1);
        arrayOfObject[1] = localStringBuilder.toString();
        localSparseArray.put(j, localContext.getString(k, arrayOfObject));
        localStringBuilder.setLength(0);
        j++;
        break;
      }
    }
    CharSequence[] arrayOfCharSequence1 = new CharSequence[2];
    arrayOfCharSequence1[0] = localodq1.b;
    arrayOfCharSequence1[1] = localodq1.a;
    efj.a(localStringBuilder, arrayOfCharSequence1);
    String str = localStringBuilder.toString();
    lck locallck = new lck().a(paramInt, str, localSparseArray);
    locallck.n = this;
    locallck.p = 0;
    locallck.a(f().b.a.d, "reorderElementsDialogTag");
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b = ((git)this.bo.a(git.class));
    ((gzj)this.bo.a(gzj.class)).a.add(this);
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (paramBundle == null) {
      k().a(1, null, this);
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    odr localodr = new odr();
    localodr.a = new odq[this.c.size()];
    for (int i = 0; i < this.c.size(); i++) {
      localodr.a[i] = ((odq)this.c.get(i));
    }
    try
    {
      paramBundle.putByteArray("related_links", jht.a(localodr));
      paramBundle.putInt("edit_position", this.ab);
      paramBundle.putBoolean("data_changed", this.a);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Log.e("EditLinksFragment", "Unable to serialize relatedLinks");
      }
    }
  }
  
  public final void v()
  {
    mbf localmbf = this.bn;
    gxr localgxr = new gxr();
    gxq localgxq = new gxq(pjo.am);
    localgxr.b.add(localgxq);
    new gwz(30, localgxr.a(this.bn)).b(localmbf);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     laz
 * JD-Core Version:    0.7.0.1
 */