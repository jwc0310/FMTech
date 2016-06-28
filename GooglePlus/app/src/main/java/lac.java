import android.app.Dialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import java.util.ArrayList;

public final class lac
  extends mby
  implements AdapterView.OnItemClickListener, cw<Cursor>, gzi
{
  private static final String[] Z = { "square_streams" };
  private git aa;
  private gzj ab;
  private kym ac;
  private lhp ag;
  private kzc[] ah;
  private boolean ai = false;
  private View aj;
  private ArrayAdapter<String> ak;
  
  public static bj a(lhp paramlhp)
  {
    if (paramlhp == null) {
      return null;
    }
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("square_target", paramlhp);
    lac locallac = new lac();
    locallac.f(localBundle);
    return locallac;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Invalid Loader Id");
    }
    return new kzo(this.ad, this.aa.c(), this.ag.a, Z);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("GetSquareTask".equals(paramString)) {
      if (paramhae.b == 200) {
        break label32;
      }
    }
    label32:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        v();
      }
      return;
    }
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    this.ag = ((lhp)this.m.getParcelable("square_target"));
    un localun = new un(this.ad);
    String str = this.ad.getString(efj.WC);
    localun.a.e = str;
    this.aj = new ProgressBar(this.ad);
    localun.a(this.aj);
    return localun.a();
  }
  
  protected final void h(Bundle paramBundle)
  {
    super.h(paramBundle);
    this.aa = ((git)this.ae.a(git.class));
    this.ac = ((kym)this.ae.a(kym.class));
    gzj localgzj = (gzj)this.ae.a(gzj.class);
    localgzj.a.add(this);
    this.ab = localgzj;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.ac != null) {
      this.ac.aM_();
    }
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((this.ac == null) || (this.ah == null) || (paramInt < 0) || (paramInt > this.ah.length)) {
      return;
    }
    this.ac.a(new lhp(this.ag.a, this.ag.b, this.ah[paramInt].a, this.ah[paramInt].b, this.ag.e));
  }
  
  public final void p_()
  {
    super.p_();
    k().a(1, null, this);
  }
  
  public final void v()
  {
    if (this.ah == null) {
      if (!this.ai)
      {
        this.ai = true;
        kzg localkzg = new kzg(this.ad, this.aa.c(), this.ag.a);
        this.ab.b(localkzg);
      }
    }
    for (;;)
    {
      return;
      Log.e("SquareCategoryPickerDialog", "Unknown Square or Missing Streams");
      this.ac.aM_();
      a(false);
      return;
      if (this.ah.length == 1)
      {
        this.ac.a(new lhp(this.ag.a, this.ag.b, this.ah[0].a, this.ah[0].b, this.ag.e));
        a(false);
        return;
      }
      if (this.ak == null)
      {
        ListView localListView = new ListView(this.ad);
        this.ak = new ArrayAdapter(this.ad, 17367043, 16908308, new ArrayList());
        localListView.setAdapter(this.ak);
        localListView.setOnItemClickListener(this);
        ViewGroup localViewGroup = (ViewGroup)this.aj.getParent();
        int i = localViewGroup.indexOfChild(this.aj);
        localViewGroup.removeView(this.aj);
        this.aj = localListView;
        localViewGroup.addView(this.aj, i);
      }
      this.ak.clear();
      for (kzc localkzc : this.ah) {
        this.ak.add(localkzc.b);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lac
 * JD-Core Version:    0.7.0.1
 */