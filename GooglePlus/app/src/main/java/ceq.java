import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.plus.phone.HomeActivity;
import com.google.android.libraries.social.ui.views.RecyclingViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class ceq
  extends hqf
{
  private ArrayList<hur> b;
  private huq c;
  private Cursor d;
  private int e;
  private boolean f;
  
  ceq(ceg paramceg, Context paramContext)
  {
    super(paramContext);
    if (ceg.ae.getCount() == 0) {
      ceg.ae.a(new Object[] { null });
    }
    this.f = (paramceg.f() instanceof HomeActivity);
    hqg localhqg1 = new hqg(false, false);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg8 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg8, 0, this.aO);
      this.aN = arrayOfhqg8;
    }
    hqg[] arrayOfhqg1 = this.aN;
    int i = this.aO;
    this.aO = (i + 1);
    arrayOfhqg1[i] = localhqg1;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg2 = new hqg(false, false);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg7 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg7, 0, this.aO);
      this.aN = arrayOfhqg7;
    }
    hqg[] arrayOfhqg2 = this.aN;
    int j = this.aO;
    this.aO = (j + 1);
    arrayOfhqg2[j] = localhqg2;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg3 = new hqg(false, true);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg6 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg6, 0, this.aO);
      this.aN = arrayOfhqg6;
    }
    hqg[] arrayOfhqg3 = this.aN;
    int k = this.aO;
    this.aO = (k + 1);
    arrayOfhqg3[k] = localhqg3;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg4 = new hqg(false, false);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg5 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg5, 0, this.aO);
      this.aN = arrayOfhqg5;
    }
    hqg[] arrayOfhqg4 = this.aN;
    int m = this.aO;
    this.aO = (m + 1);
    arrayOfhqg4[m] = localhqg4;
    this.aP = false;
    notifyDataSetChanged();
  }
  
  private static int[] a(Cursor paramCursor)
  {
    int i = -1;
    int j = 3;
    int k;
    if (paramCursor.isNull(2))
    {
      j = 2;
      k = i;
      if (!paramCursor.isNull(1)) {
        break label59;
      }
      j = 1;
    }
    for (;;)
    {
      if (!paramCursor.isNull(0)) {
        break label70;
      }
      throw new IllegalArgumentException();
      k = paramCursor.getInt(2);
      break;
      label59:
      i = paramCursor.getInt(1);
    }
    label70:
    int m = paramCursor.getInt(0);
    int[] arrayOfInt = new int[j];
    int n = 0;
    if (n < j)
    {
      switch (n)
      {
      }
      for (;;)
      {
        n++;
        break;
        arrayOfInt[0] = m;
        continue;
        arrayOfInt[1] = i;
        continue;
        arrayOfInt[2] = k;
      }
    }
    return arrayOfInt;
  }
  
  public final int a()
  {
    return 3;
  }
  
  protected final int a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    case 0: 
    default: 
      return -1;
    case 1: 
      return 0;
    case 2: 
      return 1;
    }
    return 2;
  }
  
  protected final View a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    switch (paramInt1)
    {
    default: 
      return null;
    case 0: 
      View localView = new View(paramContext);
      localView.setLayoutParams(new lxk(ceg.b(this.a).b, efj.y(paramContext)));
      return localView;
    case 1: 
      hvp localhvp = new hvp(paramContext);
      localhvp.a = this.a.am;
      localhvp.b = new hvl(localhvp.getContext(), localhvp.a, localhvp);
      localhvp.setLayoutParams(new lxk(ceg.b(this.a).b, -2));
      return localhvp;
    case 2: 
      dvo localdvo = new dvo(paramContext);
      localdvo.setLayoutParams(new lxk(ceg.b(this.a).b, -2));
      return localdvo;
    }
    TextView localTextView = new TextView(paramContext);
    localTextView.setText(aau.eB);
    localTextView.setGravity(17);
    localTextView.setTextSize(0, ceg.aa);
    localTextView.setBackgroundDrawable(paramContext.getResources().getDrawable(efj.sj));
    localTextView.setOnClickListener(new cer(this, paramContext));
    FrameLayout localFrameLayout = new FrameLayout(paramContext);
    localFrameLayout.setPadding(ceg.b(this.a).f, ceg.ab, ceg.b(this.a).f, ceg.ab);
    localFrameLayout.addView(localTextView, new FrameLayout.LayoutParams(this.e, ceg.ac));
    return localFrameLayout;
  }
  
  protected final View a(Context paramContext, int paramInt, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    if (paramInt == 2) {
      return new TextView(paramContext);
    }
    return super.a(paramContext, paramInt, paramCursor, paramViewGroup);
  }
  
  protected final void a(View paramView, int paramInt, Cursor paramCursor)
  {
    if (paramInt == 2)
    {
      TextView localTextView = (TextView)paramView;
      lxk locallxk = new lxk(-1, -2);
      locallxk.a = false;
      localTextView.setLayoutParams(locallxk);
      localTextView.setText(aau.hP);
      localTextView.setPadding(ceg.b(this.a).f + ceg.Z, ceg.d, ceg.b(this.a).f, 0);
      localTextView.setTextAppearance(this.a.bn, efj.yL);
    }
  }
  
  protected final void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    label85:
    hvp localhvp;
    huq localhuq;
    Resources localResources;
    label163:
    int j;
    label253:
    int m;
    label272:
    label343:
    int i2;
    hur localhur;
    int i7;
    switch (paramInt1)
    {
    case 3: 
    default: 
    case 1: 
      hvq localhvq1;
      hvq localhvq2;
      ArrayList localArrayList1;
      int i;
      do
      {
        return;
        localhvq1 = new hvq(paramCursor.getInt(0), paramCursor.getInt(1));
        if (paramCursor.isNull(2)) {
          break;
        }
        localhvq2 = new hvq(paramCursor.getInt(2), paramCursor.getInt(3));
        localhvp = (hvp)paramView;
        localhvp.setPadding(0, ceg.b(this.a).d, 0, 0);
        localArrayList1 = this.b;
        localhuq = this.c;
        jly localjly = this.a.ao;
        ceg localceg = this.a;
        String str = this.a.ap;
        localResources = localhvp.m.getResources();
        if (localhvq2 == null) {
          break label512;
        }
        i = 2;
        localhvp.q = i;
        localhvp.o = localceg;
        localhvp.p = localjly;
        localhvp.d = null;
        localhvp.e = null;
        localhvp.f = null;
        localhvp.g = null;
        localhvp.h = null;
        localhvp.i = null;
        localhvp.j = null;
        localhvp.k = null;
        localhvp.l = null;
        localhvp.r = str;
        localhvp.removeAllViews();
        j = 0;
      } while (j >= localhvp.q);
      hvq localhvq3;
      hur[] arrayOfhur;
      int n;
      if (j == 0)
      {
        localhvq3 = localhvq1;
        arrayOfhur = localhvp.c;
        int k = localhvq3.a;
        m = localhvq3.b;
        switch (k)
        {
        case 6: 
        case 7: 
        default: 
          n = -1;
          if (localArrayList1 != null) {
            break;
          }
        }
      }
      for (int i1 = 0;; i1 = localArrayList1.size())
      {
        i2 = 0;
        if (i2 >= i1) {
          break label586;
        }
        localhur = (hur)localArrayList1.get(i2);
        if ((n != localhur.a) || (localhur.c == null) || (localhur.c.isEmpty())) {
          break label1213;
        }
        i7 = m - 1;
        if (m != 0) {
          break label572;
        }
        label413:
        arrayOfhur[j] = localhur;
        switch (localhvq3.a)
        {
        case 9: 
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        default: 
          label500:
          j++;
          break label253;
          localhvq2 = null;
          break label85;
          label512:
          i = 1;
          break label163;
          localhvq3 = localhvq2;
          break label272;
          n = 7;
          break label343;
          n = 0;
          break label343;
          n = 1;
          break label343;
          n = 2;
          break label343;
          n = 3;
          break label343;
          n = 4;
          break label343;
        }
      }
    }
    label572:
    label1213:
    for (int i6 = i7;; i6 = m)
    {
      i2++;
      m = i6;
      break;
      label586:
      localhur = null;
      break label413;
      localhvp.d = localhvp.a(efj.La, efj.Lc, 0, localhvp.c[j], true);
      break label500;
      int i4 = localhvp.c[j].c.size();
      int i5 = efj.KX;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i4);
      localhvp.e = localhvp.a(localResources.getQuantityString(i5, i4, arrayOfObject), efj.Lc, 0, localhvp.c[j], true);
      break label500;
      localhvp.f = localhvp.a(efj.Le, 0, 0, localhvp.c[j], true);
      break label500;
      View localView2 = localhvp.a(localhvp.c[j].b.a, hvp.a(localhvp.c[j].b), null, localhvp.c[j], true);
      if (localView2 == null) {
        break label500;
      }
      if (localhvp.h == null) {
        localhvp.h = new ArrayList();
      }
      localhvp.h.add(localView2);
      efj.a(localView2, new gxq(pkf.b));
      efj.f(localView2);
      break label500;
      View localView1 = localhvp.a(localhvp.c[j].b.a, hvp.a(localhvp.c[j].b), null, localhvp.c[j], true);
      if (localView1 == null) {
        break label500;
      }
      if (localhvp.g == null) {
        localhvp.g = new ArrayList();
      }
      localhvp.g.add(localView1);
      efj.a(localView1, new gxq(pkf.a));
      efj.f(localView1);
      break label500;
      localhvp.i = localhvp.a(efj.Lb, 0, 0, localhvp.c[j], true);
      efj.a(localhvp.i, new gxq(pkf.u));
      efj.f(localhvp.i);
      break label500;
      localhvp.j = localhvp.n.inflate(efj.KU, null);
      localhvp.j.findViewById(ehr.ct).setOnClickListener(localhvp);
      localhvp.j.findViewById(ehr.cs).setOnClickListener(localhvp);
      localhvp.addView(localhvp.j);
      break label500;
      int i3 = efj.Ld;
      ArrayList localArrayList2 = localhuq.a;
      localhvp.k = localhvp.a(localhvp.m.getResources().getString(i3), null, null, localArrayList2, null, false, 7, null);
      efj.a(localhvp.k, new gxq(pkf.d));
      efj.f(localhvp.k);
      break label500;
      localhvp.l = localhvp.n.inflate(efj.KW, null);
      localhvp.l.findViewById(ehr.cA).setOnClickListener(localhvp);
      localhvp.addView(localhvp.l);
      break label500;
      dvo localdvo = (dvo)paramView;
      localdvo.setPadding(0, ceg.b(this.a).d, 0, 0);
      int[] arrayOfInt = a(paramCursor);
      localdvo.a(this.d, arrayOfInt, this.a);
      return;
    }
  }
  
  public final void a(cep paramcep)
  {
    f(false);
    if (this.f)
    {
      a(0, dfz.x());
      if (paramcep != null) {
        break label77;
      }
      this.b = null;
      this.c = null;
      a(1, null);
      this.d = null;
      this.e = 0;
      a(2, null);
      a(3, null);
    }
    for (;;)
    {
      f(true);
      return;
      a(0, null);
      break;
      label77:
      this.b = paramcep.c;
      this.c = paramcep.d;
      a(1, paramcep.a);
      this.d = paramcep.e;
      this.e = paramcep.f;
      a(2, paramcep.b);
      a(3, ceg.ae);
    }
  }
  
  public final void b()
  {
    if (this.b != null)
    {
      int i = this.b.size();
      for (int j = 0; j < i; j++)
      {
        hur localhur = (hur)this.b.get(j);
        localhur.d = new ArrayList(localhur.c);
        cll.a(localhur);
        if (localhur.c.isEmpty()) {
          this.a.am.setEnabled(true);
        }
      }
    }
    if (this.c != null)
    {
      Iterator localIterator = this.c.a.iterator();
      while (localIterator.hasNext())
      {
        String str = ((oso)localIterator.next()).a.a.c;
        if (cll.d.contains(str)) {
          localIterator.remove();
        }
      }
    }
    ceg.a(this.a);
  }
  
  public final boolean b(int paramInt1, int paramInt2)
  {
    return false;
  }
  
  public final int getCount()
  {
    return super.getCount();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ceq
 * JD-Core Version:    0.7.0.1
 */