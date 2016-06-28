import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.libraries.social.accountswitcher.AccountSwitcherView;
import com.google.android.libraries.social.navdrawer.TouchInterceptorLinearLayout;
import java.util.Collection;
import java.util.List;

public final class ctw
  extends mca
  implements hru
{
  private static final String[] ad = { "GPlusTopNavigationItems", "CirclesNavigation", "GPlusBottomNavigationItems" };
  private static final String[] ae = { "PagePicker", "AddAccountAction", "RemoveAccountAction", "ManageAccountsAction" };
  git Z;
  public iwj a;
  giz aa;
  jno ab;
  public rl ac;
  public ctr b;
  boolean c;
  Parcelable d;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    iwj localiwj1 = this.a;
    View localView = paramLayoutInflater.inflate(efj.Qb, paramViewGroup, false);
    localiwj1.i = ((TouchInterceptorLinearLayout)localView);
    localiwj1.j = ((TextView)localView.findViewById(aau.Ap));
    localiwj1.k = ((ListView)localView.findViewById(aau.Ao));
    localiwj1.l = ((AccountSwitcherView)localView.findViewById(aau.An));
    localiwj1.o = localiwj1.a(paramViewGroup);
    if (localiwj1.o != null) {
      localiwj1.o.g = localiwj1.p;
    }
    localiwj1.j.setOnClickListener(new iwk(localiwj1));
    localiwj1.h();
    if (this.ac != null)
    {
      iwj localiwj2 = this.a;
      rl localrl = this.ac;
      iwi localiwi = localiwj2.p;
      if (!localiwi.a.contains(localrl)) {
        localiwi.a.add(localrl);
      }
      this.ac = null;
    }
    if (this.d != null) {
      a(this.d);
    }
    return localView;
  }
  
  public final void a(int paramInt, Parcelable paramParcelable)
  {
    if (paramInt == hrv.a) {
      this.b.v();
    }
  }
  
  public final void a(Integer paramInteger, Collection<Parcelable> paramCollection)
  {
    if (paramInteger == hrv.a) {
      this.b.v();
    }
  }
  
  public final boolean a(Parcelable paramParcelable)
  {
    int i;
    if ((this.a != null) && (this.c)) {
      i = 1;
    }
    while (i != 0)
    {
      this.d = null;
      if ((paramParcelable instanceof cts))
      {
        iwj localiwj = this.a;
        localiwj.e.a();
        if (localiwj.h != null) {
          localiwj.h.notifyDataSetChanged();
        }
        ctr localctr = this.b;
        int j = ((cts)paramParcelable).a;
        switch (j)
        {
        default: 
          if (Log.isLoggable("NavigationBottomBarFragment", 4)) {
            new StringBuilder(31).append("Unhandled selection ").append(j);
          }
          return false;
          i = 0;
          break;
        case 1: 
          localctr.a(localctr.b, j);
        case 2: 
        case 3: 
        case 4: 
          for (;;)
          {
            return true;
            localctr.a(localctr.d, j);
            continue;
            localctr.a(localctr.c, j);
            continue;
            localctr.a(localctr.Z, j);
            localctr.aa.setImageDrawable(localctr.ac);
          }
        }
      }
      else
      {
        this.b.v();
        this.a.a(paramParcelable);
        return true;
      }
    }
    this.d = paramParcelable;
    return true;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.Z = ((git)this.bo.a(git.class));
    this.aa = ((giz)this.bo.a(giz.class));
    this.ab = ((jno)this.bo.a(jno.class));
    this.bo.a(jnn.class, new ctx(this));
    iwj localiwj = new iwj(this, this.bp, ad, ae);
    mbb localmbb = this.bo;
    localmbb.a(iwj.class, localiwj);
    localmbb.a(gmi.class, localiwj.f);
    localmbb.a(glk.class, localiwj.d);
    localmbb.a(hrs.class, localiwj.e);
    localmbb.a(gle.class, new glf(localiwj.c));
    localmbb.a(gld.class, new gld(localiwj.c));
    localmbb.a(gmd.class, new iwh(localiwj));
    localmbb.b(gky.class, new gkx(localiwj.c));
    localmbb.b(gmh.class, localiwj);
    this.a = localiwj;
    ((hrw)this.a.e).a(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ctw
 * JD-Core Version:    0.7.0.1
 */