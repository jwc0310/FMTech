import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.discovery.views.PeopleListRowAsCardView;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;
import java.util.Set;

public final class cla
  extends ckm
  implements View.OnClickListener
{
  private static hqr A;
  private View.OnClickListener B;
  private hvl C;
  private kpn D;
  hvn z;
  
  public cla(Context paramContext, bw parambw, cv paramcv, int paramInt, hvl paramhvl)
  {
    super(paramContext, parambw, paramcv, paramInt);
    if (A == null)
    {
      hqr localhqr = new hqr(new String[] { "_id" }, 1);
      A = localhqr;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(0);
      localhqr.a(arrayOfObject);
    }
    this.C = paramhvl;
    this.D = ((kpn)mbb.a(paramContext, kpn.class));
  }
  
  public final boolean J_()
  {
    return false;
  }
  
  public final int a()
  {
    return 4;
  }
  
  protected final int a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return 1;
    case 2: 
      return 0;
    case 6: 
      return 2;
    }
    return 3;
  }
  
  protected final View a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    switch (paramInt1)
    {
    default: 
      PeopleListRowAsCardView localPeopleListRowAsCardView2 = (PeopleListRowAsCardView)localLayoutInflater.inflate(efj.vw, null);
      PeopleListRowView localPeopleListRowView = (PeopleListRowView)localPeopleListRowAsCardView2.h;
      if (!this.D.a()) {
        localPeopleListRowView.i = false;
      }
      return localPeopleListRowAsCardView2;
    case 6: 
      return localLayoutInflater.inflate(efj.vC, paramViewGroup, false);
    case 2: 
      PeopleListRowAsCardView localPeopleListRowAsCardView1 = (PeopleListRowAsCardView)localLayoutInflater.inflate(efj.vB, null);
      ((PeopleListRowView)localPeopleListRowAsCardView1.h).i = false;
      return localPeopleListRowAsCardView1;
    }
    return localLayoutInflater.inflate(efj.vx, paramViewGroup, false);
  }
  
  protected final void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    PeopleListRowAsCardView localPeopleListRowAsCardView;
    label351:
    label365:
    PeopleListRowView localPeopleListRowView2;
    label459:
    label465:
    boolean bool1;
    label517:
    String str3;
    switch (paramInt1)
    {
    case 4: 
    default: 
      localPeopleListRowAsCardView = null;
    case 2: 
    case 0: 
      for (;;)
      {
        if (localPeopleListRowAsCardView != null)
        {
          g(paramInt1);
          localPeopleListRowAsCardView.a();
        }
        return;
        localPeopleListRowAsCardView = (PeopleListRowAsCardView)paramView;
        PeopleListRowView localPeopleListRowView4 = (PeopleListRowView)localPeopleListRowAsCardView.h;
        localPeopleListRowView4.a(this.z, this.c, false);
        String str15 = paramCursor.getString(1);
        String str16 = paramCursor.getString(2);
        String str17 = Integer.toString(paramCursor.getInt(6));
        localPeopleListRowView4.k = false;
        String str18 = String.valueOf(str15);
        if (str18.length() != 0) {}
        for (String str19 = "f:".concat(str18);; str19 = new String("f:"))
        {
          localPeopleListRowView4.a(str19, null, null, str16, str17, false, null, null, false, false, this.C);
          localPeopleListRowView4.setTag(aaw.hl, Integer.valueOf(1));
          localPeopleListRowView4.setTag(aaw.hf, str15);
          localPeopleListRowView4.setTag(aaw.hg, str16);
          localPeopleListRowView4.setOnClickListener(this);
          break;
        }
        TextView localTextView = (TextView)paramView.findViewById(aaw.ma);
        Resources localResources = paramView.getResources();
        int n = aau.mx;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.o;
        localTextView.setText(localResources.getString(n, arrayOfObject));
        localTextView.setOnClickListener(this.B);
        localPeopleListRowAsCardView = null;
      }
    case 1: 
      localPeopleListRowAsCardView = (PeopleListRowAsCardView)paramView;
      PeopleListRowView localPeopleListRowView3 = (PeopleListRowView)localPeopleListRowAsCardView.h;
      localPeopleListRowView3.a(this.z, this.c, false);
      String str10 = paramCursor.getString(2);
      boolean bool6;
      boolean bool7;
      String str11;
      String str12;
      String str13;
      if (paramCursor.getInt(8) != 0)
      {
        bool6 = true;
        if (paramCursor.getInt(9) == 0) {
          break label459;
        }
        bool7 = true;
        str11 = paramCursor.getString(1);
        str12 = hdo.b(paramCursor.getString(4));
        str13 = paramCursor.getString(3);
        if (!bool6) {
          break label465;
        }
      }
      for (String str14 = this.p;; str14 = null)
      {
        localPeopleListRowView3.a(str11, str10, str12, str13, str14, null, false, paramCursor.getString(5), null, bool6, bool7, a(paramCursor), this.C);
        localPeopleListRowView3.setOnClickListener(this);
        break;
        bool6 = false;
        break label351;
        bool7 = false;
        break label365;
      }
    case 5: 
      localPeopleListRowAsCardView = (PeopleListRowAsCardView)paramView;
      localPeopleListRowView2 = (PeopleListRowView)localPeopleListRowAsCardView.h;
      int m = paramCursor.getInt(4);
      hvn localhvn = this.z;
      jly localjly = this.c;
      if (m != 2)
      {
        bool1 = true;
        localPeopleListRowView2.a(localhvn, localjly, bool1);
        str3 = paramCursor.getString(11);
        if (str3 != null) {
          break label1053;
        }
        str3 = paramCursor.getString(7);
        if (str3 != null) {
          break label1053;
        }
      }
      break;
    }
    label654:
    label1053:
    for (String str4 = paramCursor.getString(8);; str4 = str3)
    {
      String str5 = paramCursor.getString(2);
      String str6;
      label595:
      boolean bool2;
      label609:
      boolean bool3;
      label623:
      boolean bool4;
      cla localcla;
      if (this.w.contains(str5))
      {
        str6 = "15";
        if (paramCursor.getInt(12) == 0) {
          break label815;
        }
        bool2 = true;
        if (paramCursor.getInt(13) == 0) {
          break label821;
        }
        bool3 = true;
        if (this.b.a(this.d).b("gaia_id").equals(str5)) {
          break label827;
        }
        bool4 = true;
        localPeopleListRowView2.k = bool4;
        String str7 = paramCursor.getString(0);
        String str8 = hdo.b(paramCursor.getString(5));
        String str9 = paramCursor.getString(3);
        if (bool2) {
          str4 = this.p;
        }
        localPeopleListRowView2.a(str7, str5, str8, str9, str4, null, true, str6, null, bool2, bool3, a(paramCursor), this.C);
        if ((str5 == null) && (str6 == null)) {
          break label833;
        }
        localcla = this;
        label748:
        localPeopleListRowView2.setOnClickListener(localcla);
        if ((str5 == null) && (str6 == null)) {
          break label839;
        }
      }
      label815:
      label821:
      label827:
      label833:
      label839:
      for (boolean bool5 = true;; bool5 = false)
      {
        localPeopleListRowView2.setClickable(bool5);
        if (paramInt2 < -5 + paramCursor.getCount()) {
          break;
        }
        e();
        break;
        bool1 = false;
        break label517;
        str6 = paramCursor.getString(6);
        break label595;
        bool2 = false;
        break label609;
        bool3 = false;
        break label623;
        bool4 = false;
        break label654;
        localcla = null;
        break label748;
      }
      localPeopleListRowAsCardView = (PeopleListRowAsCardView)paramView;
      PeopleListRowView localPeopleListRowView1 = (PeopleListRowView)localPeopleListRowAsCardView.h;
      localPeopleListRowView1.a(this.z, this.c, true);
      String str1 = String.valueOf(this.o);
      if (str1.length() != 0) {}
      for (String str2 = "e:".concat(str1);; str2 = new String("e:"))
      {
        localPeopleListRowView1.a(str2, null, null, null, null, false, null, null, false, false, null);
        localPeopleListRowView1.setOnClickListener(null);
        localPeopleListRowView1.setClickable(false);
        break;
      }
      int i = 8;
      int j = 8;
      int k = 8;
      switch (paramCursor.getInt(0))
      {
      }
      for (;;)
      {
        paramView.findViewById(aaw.eH).setVisibility(i);
        paramView.findViewById(aaw.gc).setVisibility(j);
        paramView.findViewById(aaw.dk).setVisibility(k);
        break;
        i = 0;
        continue;
        j = 0;
        continue;
        k = 0;
      }
    }
  }
  
  protected final boolean b(int paramInt1, int paramInt2)
  {
    return false;
  }
  
  public final void e(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      a(0, A);
      this.B = new clb(this);
      return;
    }
    a(0, null);
    this.B = null;
  }
  
  public final void onClick(View paramView)
  {
    Integer localInteger;
    int i;
    if (paramView.getId() == aaw.jj)
    {
      localInteger = (Integer)paramView.getTag(aaw.hl);
      if (localInteger != null) {
        break label87;
      }
      i = 0;
      if (i != 1) {
        break label95;
      }
      str1 = (String)paramView.getTag(aaw.hf);
      str2 = (String)paramView.getTag(aaw.hg);
      j = this.d;
      localIntent = efj.a(this.aM, j, str1, str2);
      this.aM.startActivity(localIntent);
    }
    label87:
    label95:
    while ((this.z == null) || (!(paramView instanceof PeopleListRowView)))
    {
      String str1;
      String str2;
      int j;
      Intent localIntent;
      return;
      i = localInteger.intValue();
      break;
    }
    PeopleListRowView localPeopleListRowView = (PeopleListRowView)paramView;
    this.z.a(localPeopleListRowView.c, localPeopleListRowView.f, localPeopleListRowView.n, hvj.b(localPeopleListRowView.g), new hvo(localPeopleListRowView.d, localPeopleListRowView.e));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cla
 * JD-Core Version:    0.7.0.1
 */