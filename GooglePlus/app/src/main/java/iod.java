import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

final class iod
  extends BaseAdapter
  implements View.OnClickListener, gjh, mbo, mdz, mew, mez, mfd
{
  static Drawable a;
  static Drawable b;
  static Drawable c;
  static Drawable d;
  iof e;
  private List<ioh> f = new ArrayList();
  private Activity g;
  private LayoutInflater h;
  private giz i;
  private String j;
  private String k;
  
  public iod(mek parammek)
  {
    parammek.a(this);
  }
  
  private void a()
  {
    this.f.clear();
    List localList = this.i.a();
    int m = localList.size();
    int n = 0;
    int i1 = 0;
    int i2;
    label87:
    int i3;
    label100:
    int i4;
    int i5;
    int i6;
    label252:
    boolean bool1;
    label339:
    int i9;
    label421:
    int i10;
    label482:
    boolean bool2;
    if (n < m)
    {
      int i12 = ((Integer)localList.get(n)).intValue();
      gjb localgjb4 = this.i.a(i12);
      if (!a(localgjb4)) {
        break label616;
      }
      if (localgjb4.c("gplus_skinny_page"))
      {
        i2 = 1;
        this.j = null;
        this.k = null;
        i3 = 0;
        if (i3 >= localList.size()) {
          break label605;
        }
        Integer localInteger = (Integer)localList.get(i3);
        gjb localgjb1 = this.i.a(localInteger.intValue());
        if (!a(localgjb1)) {
          break label599;
        }
        String str1 = localgjb1.b("account_name");
        if (i2 != 0)
        {
          ioe localioe = new ioe(this);
          localioe.e = str1;
          localioe.f = localgjb1.b("display_name");
          localioe.g = localgjb1.b("profile_photo_url");
          this.f.add(localioe);
        }
        i4 = localgjb1.a("page_count", 0);
        for (i5 = 0;; i5++)
        {
          if (i5 >= i4) {
            break label599;
          }
          if (i4 != 1) {
            break;
          }
          i6 = 0;
          gjb localgjb2 = localgjb1.d("page").d(Integer.toString(i5));
          String str2 = localgjb2.b("gaia_id");
          int i7 = this.i.b(str1, str2);
          if ((i7 == -1) || (!this.i.a(i7).a())) {
            break label610;
          }
          this.j = str1;
          this.k = str2;
          bool1 = true;
          iog localiog = new iog(this);
          localiog.a = i6;
          localiog.e = str1;
          localiog.b = str2;
          localiog.f = localgjb2.b("display_name");
          localiog.g = localgjb2.b("avatar_url");
          localiog.c = bool1;
          if (!bool1) {
            break label593;
          }
          int i8 = localList.size();
          i9 = 0;
          if (i9 >= i8) {
            break label587;
          }
          int i11 = ((Integer)localList.get(i9)).intValue();
          gjb localgjb3 = this.i.a(i11);
          if ((localgjb3.c("is_managed_account")) || (!localgjb3.a())) {
            break label581;
          }
          i10 = 1;
          if (i10 == 0) {
            break label593;
          }
          bool2 = true;
          label490:
          localiog.d = bool2;
          this.f.add(localiog);
        }
      }
    }
    label581:
    label587:
    label593:
    label599:
    label605:
    label610:
    label616:
    for (int i13 = i1 + 1;; i13 = i1)
    {
      n++;
      i1 = i13;
      break;
      if (i1 > 1)
      {
        i2 = 1;
        break label87;
      }
      i2 = 0;
      break label87;
      if (i5 == 0)
      {
        i6 = 1;
        break label252;
      }
      if (i5 == i4 - 1)
      {
        i6 = 3;
        break label252;
      }
      i6 = 2;
      break label252;
      i9++;
      break label421;
      i10 = 0;
      break label482;
      bool2 = false;
      break label490;
      i3++;
      break label100;
      notifyDataSetChanged();
      return;
      bool1 = false;
      break label339;
    }
  }
  
  private static boolean a(gjb paramgjb)
  {
    int m = paramgjb.a("page_count", 0);
    boolean bool1 = false;
    if (m > 0)
    {
      boolean bool2 = paramgjb.c("logged_out");
      bool1 = false;
      if (!bool2) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final void a(Activity paramActivity)
  {
    this.g = paramActivity;
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.h = LayoutInflater.from(new ContextThemeWrapper(this.g, aaw.oQ));
    this.i = ((giz)parammbb.a(giz.class));
    if (a == null)
    {
      Resources localResources = this.g.getResources();
      a = localResources.getDrawable(efj.OF);
      b = localResources.getDrawable(efj.OI);
      c = localResources.getDrawable(efj.OG);
      d = localResources.getDrawable(efj.OH);
    }
  }
  
  public final boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public final void az_()
  {
    a();
  }
  
  public final void b()
  {
    this.i.a(this);
    a();
  }
  
  public final void c()
  {
    this.i.b(this);
  }
  
  public final int getCount()
  {
    return this.f.size();
  }
  
  public final Object getItem(int paramInt)
  {
    return this.f.get(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    return ((ioh)this.f.get(paramInt)).a();
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ioh localioh = (ioh)this.f.get(paramInt);
    if (paramView == null) {
      paramView = localioh.a(this.h, paramViewGroup);
    }
    localioh.a(paramView, paramInt);
    return paramView;
  }
  
  public final int getViewTypeCount()
  {
    return 2;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return false;
  }
  
  public final void onClick(View paramView)
  {
    int m = paramView.getId();
    if (m == aw.aI)
    {
      i1 = ((Integer)paramView.getTag()).intValue();
      localiog2 = (iog)this.f.get(i1);
      if ((!TextUtils.equals(this.j, localiog2.e)) || (!TextUtils.equals(this.k, localiog2.b))) {
        this.e.a(localiog2.e, localiog2.b);
      }
    }
    while (m != aw.aJ)
    {
      int i1;
      iog localiog2;
      return;
    }
    int n = ((Integer)paramView.getTag()).intValue();
    iog localiog1 = (iog)this.f.get(n);
    this.e.b(localiog1.e, localiog1.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iod
 * JD-Core Version:    0.7.0.1
 */