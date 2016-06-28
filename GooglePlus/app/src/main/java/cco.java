import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.libraries.social.actionbar.ActionBarSpinner;
import java.util.regex.Pattern;

public final class cco
  extends mca
  implements AdapterView.OnItemClickListener, cw<Cursor>, gpq, gpw, gxv
{
  static final String[] b = { "_id", "theme_id", "image_url", "placeholder_path" };
  private ListView Z;
  Pattern a;
  private hqi aa;
  private git ab;
  private ArrayAdapter<ccu> ac;
  private int ad;
  private boolean ae;
  private boolean af;
  private final hwq ag;
  int c;
  public cct d;
  
  public cco()
  {
    new gpk(this, this.bp, this);
    this.a = Pattern.compile("(\\d*[\\-|_]*)([\\w_\\-]+)\\.");
    hwq localhwq = new hwq(this.bp);
    int i = aau.gV;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    int j = aau.jn;
    localhwq.f = null;
    localhwq.e = j;
    localhwq.e();
    this.ag = localhwq;
    this.c = 0;
  }
  
  public cco(int paramInt)
  {
    new gpk(this, this.bp, this);
    this.a = Pattern.compile("(\\d*[\\-|_]*)([\\w_\\-]+)\\.");
    hwq localhwq = new hwq(this.bp);
    int i = aau.gV;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    int j = aau.jn;
    localhwq.f = null;
    localhwq.e = j;
    localhwq.e();
    this.ag = localhwq;
    this.c = 0;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.tG, paramViewGroup, false);
    this.Z = ((ListView)localView.findViewById(16908298));
    this.aa = new ccr(this, f(), null);
    this.Z.setAdapter(this.aa);
    this.Z.setOnItemClickListener(this);
    this.Z.setRecyclerListener(new ccp(this));
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    Context localContext = this.bn.getApplicationContext();
    int i = this.ab.c();
    switch (paramInt)
    {
    default: 
      return null;
    }
    return new ccq(this, this.bn, localContext, i);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ac = new ArrayAdapter(f(), efj.sw);
    this.ac.setDropDownViewResource(17367049);
    this.ac.add(new ccu(this.bn, 0));
    this.ac.add(new ccu(this.bn, 1));
    if (paramBundle != null) {
      this.c = paramBundle.getInt("filter");
    }
    k().a(0, null, this);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(gpr paramgpr) {}
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, false);
    int i = this.c;
    int j = -1 + this.ac.getCount();
    if (j >= 0) {
      if (((ccu)this.ac.getItem(j)).a != i) {}
    }
    for (int k = j;; k = -1)
    {
      this.ad = k;
      View localView = View.inflate(f(), efj.sv, null);
      ActionBarSpinner localActionBarSpinner = (ActionBarSpinner)localView.findViewById(aaw.hS);
      localActionBarSpinner.setAdapter(this.ac);
      localActionBarSpinner.setSelection(this.ad);
      localActionBarSpinner.a(this);
      paramtp.e(true);
      paramtp.d(false);
      paramtp.a(localView);
      return;
      j--;
      break;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final boolean a_(int paramInt)
  {
    if (this.ad == paramInt) {
      return false;
    }
    ccu localccu = (ccu)this.ac.getItem(paramInt);
    this.ad = paramInt;
    this.c = localccu.a;
    k().b(0, null, this);
    this.ae = true;
    return true;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp)
  {
    paramtp.a(null);
    paramtp.e(false);
    paramtp.d(true);
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
    this.ab = ((git)this.bo.a(git.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putInt("filter", this.c);
  }
  
  public final void m()
  {
    super.m();
  }
  
  public final void n()
  {
    super.n();
    if ((this.aa != null) && (this.aa.c != null)) {
      this.aa.c();
    }
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Cursor localCursor = (Cursor)this.aa.getItem(paramInt);
    int i = localCursor.getInt(1);
    String str = localCursor.getString(2);
    if (this.d != null) {
      this.d.a(i, str);
    }
  }
  
  public final gya r_()
  {
    return gya.C;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cco
 * JD-Core Version:    0.7.0.1
 */