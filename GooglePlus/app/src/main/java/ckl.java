import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.discovery.views.PeopleListRowAsCardView;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;
import java.util.ArrayList;

final class ckl
  extends ckb
{
  ArrayList<odg> a;
  ArrayList<odg> b;
  private int c;
  private int d;
  private int e;
  private int f;
  private LayoutInflater g = this.h.a_(null);
  
  ckl(ckf paramckf)
  {
    super(paramckf);
  }
  
  private final int a(int paramInt)
  {
    if (paramInt < this.d) {
      return paramInt;
    }
    return paramInt - this.d;
  }
  
  private final Object a(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
    {
      if (paramInt1 == 0) {
        return "BULLHORN";
      }
      return "YMK";
    }
    if (paramInt1 == 0) {
      return this.a.get(paramInt2 - 1);
    }
    return this.b.get(paramInt2 - 1);
  }
  
  public final void a()
  {
    if (this.a != null) {
      cll.a(this.a);
    }
    if (this.b != null) {
      cll.a(this.b);
    }
    b();
    notifyDataSetChanged();
    ckf localckf = this.h;
    localckf.J();
  }
  
  final void b()
  {
    int i;
    int k;
    label28:
    int m;
    label45:
    int n;
    label61:
    int i2;
    if (this.a == null)
    {
      i = 0;
      this.c = i;
      int j = this.c;
      if (this.c <= 0) {
        break label96;
      }
      k = 1;
      this.d = (k + j);
      if (this.b != null) {
        break label101;
      }
      m = 0;
      this.e = m;
      if (this.c != 0) {
        break label113;
      }
      n = 0;
      int i1 = this.e;
      i2 = 0;
      if (i1 != 0) {
        break label119;
      }
    }
    for (;;)
    {
      this.f = (n + i2);
      return;
      i = this.a.size();
      break;
      label96:
      k = 0;
      break label28;
      label101:
      m = this.b.size();
      break label45;
      label113:
      n = 1;
      break label61;
      label119:
      i2 = 1;
    }
  }
  
  public final int getCount()
  {
    return this.c + this.e + this.f;
  }
  
  public final Object getItem(int paramInt)
  {
    if (paramInt < this.d) {}
    for (int i = 0;; i = 1) {
      return a(i, a(paramInt));
    }
  }
  
  public final long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public final int getItemViewType(int paramInt)
  {
    if (paramInt < this.d) {}
    for (int i = 0; a(paramInt) == 0; i = 1) {
      return 0;
    }
    if (i == 0) {
      return 1;
    }
    return 2;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 1;
    int j;
    int k;
    if (paramInt < this.d)
    {
      j = 0;
      k = a(paramInt);
      if (k != 0) {
        break label213;
      }
      if (paramView != null) {
        break label693;
      }
    }
    label550:
    label693:
    for (View localView3 = this.g.inflate(efj.vu, null);; localView3 = paramView)
    {
      PeopleListRowAsCardView localPeopleListRowAsCardView2 = (PeopleListRowAsCardView)localView3;
      localPeopleListRowAsCardView2.g.setBackgroundDrawable(PeopleListRowAsCardView.a);
      if (localPeopleListRowAsCardView2.i != null)
      {
        localPeopleListRowAsCardView2.i.setVisibility(8);
        localPeopleListRowAsCardView2.j.setText(PeopleListRowAsCardView.f);
      }
      Resources localResources = this.h.bn.getResources();
      TextView localTextView1 = (TextView)localView3.findViewById(aaw.aZ);
      TextView localTextView2 = (TextView)localView3.findViewById(aaw.aY);
      String str2;
      if (j == 0)
      {
        str2 = localResources.getString(aau.mD);
        localTextView2.setVisibility(8);
      }
      String str1;
      for (Object localObject2 = str2;; localObject2 = str1)
      {
        localTextView1.setText((CharSequence)localObject2);
        return localView3;
        j = i;
        break;
        str1 = localResources.getString(aau.hN);
        localTextView2.setVisibility(0);
        localTextView2.setText(localResources.getString(aau.hO));
      }
      label213:
      PeopleListRowAsCardView localPeopleListRowAsCardView1;
      int m;
      label337:
      gxt localgxt;
      label383:
      int n;
      label444:
      boolean bool;
      label455:
      label474:
      View localView2;
      if (paramView == null)
      {
        localPeopleListRowAsCardView1 = (PeopleListRowAsCardView)this.g.inflate(efj.vw, null);
        Object localObject1 = getItem(paramInt);
        PeopleListRowView localPeopleListRowView = (PeopleListRowView)localPeopleListRowAsCardView1.h;
        localPeopleListRowView.a(this.h, this.h.ag, i);
        localPeopleListRowView.k = i;
        localPeopleListRowView.a = i;
        localPeopleListRowView.a(a(j, k), this.h.ai, this.h.ak);
        localPeopleListRowView.setOnClickListener(this.h);
        odg localodg = (odg)localObject1;
        if (localodg.f != 0) {
          break label550;
        }
        m = 12;
        localPeopleListRowView.g = m;
        localPeopleListRowView.h = null;
        switch (m)
        {
        default: 
          localgxt = null;
          if (localgxt != null) {
            efj.a(localPeopleListRowAsCardView1, new gxq(localgxt));
          }
          efj.a(localPeopleListRowView, new kuo(pkf.z, localodg.d, Integer.valueOf(paramInt)));
          efj.f(localPeopleListRowView);
          if (j == 0)
          {
            n = this.c;
            if (k != n) {
              break label594;
            }
            bool = i;
            if ((localodg.g == null) || (!localodg.g.booleanValue())) {
              break label600;
            }
            if (!bool) {
              break label614;
            }
            localView2 = localPeopleListRowAsCardView1.g;
            if (i == 0) {
              break label606;
            }
          }
          break;
        }
      }
      label594:
      label600:
      label606:
      for (Drawable localDrawable2 = PeopleListRowAsCardView.e;; localDrawable2 = PeopleListRowAsCardView.d)
      {
        localView2.setBackgroundDrawable(localDrawable2);
        if (localPeopleListRowAsCardView1.i != null)
        {
          localPeopleListRowAsCardView1.i.setVisibility(8);
          localPeopleListRowAsCardView1.j.setText(PeopleListRowAsCardView.f);
        }
        return localPeopleListRowAsCardView1;
        localPeopleListRowAsCardView1 = (PeopleListRowAsCardView)paramView;
        break;
        if (k == 0)
        {
          m = 13;
          break label337;
        }
        m = 14;
        break label337;
        localgxt = pkf.x;
        break label383;
        localgxt = pkf.y;
        break label383;
        n = this.e;
        break label444;
        bool = false;
        break label455;
        i = 0;
        break label474;
      }
      label614:
      localPeopleListRowAsCardView1.setPadding(0, 0, 0, 0);
      View localView1 = localPeopleListRowAsCardView1.g;
      if (i != 0) {}
      for (Drawable localDrawable1 = PeopleListRowAsCardView.c;; localDrawable1 = PeopleListRowAsCardView.b)
      {
        localView1.setBackgroundDrawable(localDrawable1);
        if (localPeopleListRowAsCardView1.i != null)
        {
          localPeopleListRowAsCardView1.i.setVisibility(8);
          localPeopleListRowAsCardView1.j.setText(PeopleListRowAsCardView.f);
        }
        break;
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    return 3;
  }
  
  public final boolean isEmpty()
  {
    return (this.c == 0) && (this.e == 0);
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ckl
 * JD-Core Version:    0.7.0.1
 */