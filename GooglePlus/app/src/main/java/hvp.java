import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;
import com.google.android.libraries.social.ui.views.RecyclingViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hvp
  extends ViewGroup
  implements View.OnClickListener, huv, hvn, lvw, lxj
{
  private static boolean s;
  private static int t;
  private static int u;
  private int A;
  private int[] B = new int[2];
  private int C = 0;
  private int D;
  private PeopleListRowView[] E;
  public RecyclingViewGroup a;
  public hvl b;
  public hur[] c = new hur[2];
  public View d;
  public View e;
  public View f;
  public ArrayList<View> g;
  public ArrayList<View> h;
  public View i;
  public View j;
  public View k;
  public View l;
  public Context m;
  public LayoutInflater n;
  public hvr o;
  public jly p;
  public int q;
  public String r;
  private ArrayList<View> v = new ArrayList();
  private ArrayList<View> w = new ArrayList();
  private ArrayList<View> x = new ArrayList();
  private hgg y;
  private int z;
  
  public hvp(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private hvp(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private hvp(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.m = paramContext;
    this.n = ((LayoutInflater)this.m.getSystemService("layout_inflater"));
    if (!s)
    {
      t = paramContext.getResources().getDimensionPixelOffset(efj.KS);
      u = new hfa(paramContext, loh.a).d;
      s = true;
    }
    if (this.y == null) {
      this.y = ((hgg)mbb.a(getContext(), hgg.class));
    }
  }
  
  private final int a(int paramInt)
  {
    if (this.q == 1) {}
    while (paramInt != getPaddingLeft()) {
      return 0;
    }
    return paramInt + this.z + u;
  }
  
  private final int a(int paramInt1, int paramInt2)
  {
    if (this.q == 1) {
      return paramInt1 + paramInt2 + t;
    }
    if (this.D == 0)
    {
      this.D = paramInt2;
      return paramInt1;
    }
    int i1 = Math.max(this.D, paramInt2);
    this.D = 0;
    return i1 + paramInt1 + t;
  }
  
  private static String a(Object paramObject)
  {
    String str;
    if ((paramObject instanceof odg)) {
      str = ((odg)paramObject).a.a.c;
    }
    boolean bool;
    do
    {
      return str;
      if ((paramObject instanceof oso)) {
        return ((oso)paramObject).a.a.c;
      }
      bool = paramObject instanceof ors;
      str = null;
    } while (!bool);
    return ((ors)paramObject).a.c;
  }
  
  public static String a(ori paramori)
  {
    int i1 = 1;
    StringBuilder localStringBuilder = new StringBuilder();
    int i2;
    if (paramori.c != null)
    {
      i2 = i1;
      if (paramori.d == null) {
        break label69;
      }
      label26:
      if ((i2 == 0) || (i1 == 0)) {
        break label74;
      }
      localStringBuilder.append(paramori.c);
      localStringBuilder.append(" - ");
      localStringBuilder.append(paramori.d);
    }
    for (;;)
    {
      return localStringBuilder.toString();
      i2 = 0;
      break;
      label69:
      i1 = 0;
      break label26;
      label74:
      if (i2 != 0) {
        localStringBuilder.append(paramori.c);
      } else if (i1 != 0) {
        localStringBuilder.append(paramori.d);
      }
    }
  }
  
  private final void a(int paramInt, boolean paramBoolean)
  {
    int[] arrayOfInt1 = this.B;
    int i1 = this.C;
    this.C = (i1 + 1);
    arrayOfInt1[i1] = paramInt;
    if ((this.C == this.q) || (paramBoolean))
    {
      this.A += Math.max(this.B[0], this.B[1]);
      int[] arrayOfInt2 = this.B;
      int[] arrayOfInt3 = this.B;
      this.C = 0;
      arrayOfInt3[1] = 0;
      arrayOfInt2[0] = 0;
    }
  }
  
  private final void a(List<huu> paramList, View paramView1, View paramView2)
  {
    if ((paramView1 != null) && (paramView2 != null) && (this.E != null)) {
      for (PeopleListRowView localPeopleListRowView : this.E) {
        if ((localPeopleListRowView != null) && (lwo.a(localPeopleListRowView, paramView2))) {
          paramList.add(new huu(localPeopleListRowView.c, localPeopleListRowView.f, hvj.b(localPeopleListRowView.g)));
        }
      }
    }
  }
  
  public final void D_()
  {
    this.c[0] = null;
    this.c[1] = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = null;
    this.h = null;
    this.i = null;
    this.k = null;
    this.l = null;
    this.o = null;
    Iterator localIterator = this.x.iterator();
    while (localIterator.hasNext())
    {
      View localView = (View)localIterator.next();
      Integer localInteger = (Integer)localView.getTag(ehr.cB);
      if ((localInteger != null) && (localInteger.intValue() == 1)) {
        this.w.add(localView);
      } else {
        this.v.add(localView);
      }
    }
    this.x.clear();
    this.b.a();
  }
  
  public final void R() {}
  
  public final View a(int paramInt1, int paramInt2, int paramInt3, hur paramhur, boolean paramBoolean)
  {
    return a(this.m.getResources().getString(paramInt1), paramInt2, 0, paramhur, paramBoolean);
  }
  
  public final View a(String paramString, int paramInt1, int paramInt2, hur paramhur, boolean paramBoolean)
  {
    Resources localResources = this.m.getResources();
    String str1;
    if (paramInt1 != 0)
    {
      str1 = localResources.getString(paramInt1);
      if (paramInt2 == 0) {
        break label53;
      }
    }
    label53:
    for (String str2 = localResources.getString(paramInt2);; str2 = localResources.getString(efj.Lf))
    {
      return a(paramString, str1, str2, paramhur, paramBoolean);
      str1 = null;
      break;
    }
  }
  
  public final View a(String paramString1, String paramString2, String paramString3, hur paramhur, boolean paramBoolean)
  {
    if ((paramhur == null) || (paramhur.c == null) || (paramhur.c.isEmpty())) {
      return null;
    }
    ArrayList localArrayList1 = paramhur.c;
    ArrayList localArrayList2 = paramhur.d;
    int i1;
    switch (paramhur.a)
    {
    case 5: 
    case 6: 
    default: 
      i1 = -1;
    }
    for (;;)
    {
      return a(paramString1, paramString2, paramString3, localArrayList1, localArrayList2, paramBoolean, i1, paramhur);
      i1 = 8;
      continue;
      i1 = 1;
      continue;
      i1 = 2;
      continue;
      i1 = 3;
      continue;
      i1 = 4;
      continue;
      i1 = 5;
    }
  }
  
  public final View a(String paramString1, String paramString2, String paramString3, ArrayList paramArrayList1, ArrayList paramArrayList2, boolean paramBoolean, int paramInt, Object paramObject)
  {
    Object localObject1;
    TextView localTextView;
    if (paramInt == 1) {
      if (this.w.size() > 1)
      {
        localObject1 = (View)this.w.remove(0);
        this.x.add(localObject1);
        ((TextView)((View)localObject1).findViewById(ehr.cn)).setText(paramString1);
        localTextView = (TextView)((View)localObject1).findViewById(ehr.cm);
        if (TextUtils.isEmpty(paramString2)) {
          break label269;
        }
        localTextView.setText(paramString2);
        localTextView.setVisibility(0);
      }
    }
    for (;;)
    {
      this.E = new PeopleListRowView[3];
      this.E[0] = ((PeopleListRowView)((View)localObject1).findViewById(ehr.cD));
      this.E[1] = ((PeopleListRowView)((View)localObject1).findViewById(ehr.cE));
      this.E[2] = ((PeopleListRowView)((View)localObject1).findViewById(ehr.cF));
      for (int i1 = 0; i1 < this.E.length; i1++)
      {
        this.E[i1].a(this, this.p, paramBoolean);
        this.E[i1].setVisibility(0);
      }
      View localView2 = this.n.inflate(efj.KV, null);
      localView2.setTag(ehr.cB, Integer.valueOf(paramInt));
      localObject1 = localView2;
      break;
      if (this.v.size() > 1)
      {
        localObject1 = (View)this.v.remove(0);
        break;
      }
      localObject1 = this.n.inflate(efj.KV, null);
      break;
      label269:
      localTextView.setText(null);
      localTextView.setVisibility(8);
    }
    int i2 = Math.min(3, paramArrayList1.size());
    int i3 = -1;
    int i4 = 0;
    if (i4 < i2)
    {
      Object localObject2 = paramArrayList1.get(i4);
      if ((paramArrayList2 != null) && (i3 == -1))
      {
        Object localObject3 = paramArrayList2.get(i4);
        if (!TextUtils.equals(a(localObject2), a(localObject3))) {
          i3 = i4;
        }
      }
      int i6;
      label368:
      PeopleListRowView localPeopleListRowView1;
      String str;
      if (paramInt != 7)
      {
        i6 = 1;
        if (i6 != 0) {
          this.E[i4].a = true;
        }
        localPeopleListRowView1 = this.E[i4];
        str = this.r;
        if (i6 == 0) {
          break label467;
        }
      }
      label467:
      for (hvl localhvl2 = this.b;; localhvl2 = null)
      {
        localPeopleListRowView1.a(localObject2, str, localhvl2);
        this.E[i4].setOnClickListener(this);
        PeopleListRowView localPeopleListRowView2 = this.E[i4];
        localPeopleListRowView2.g = paramInt;
        localPeopleListRowView2.h = paramObject;
        i4++;
        break;
        i6 = 0;
        break label368;
      }
    }
    for (;;)
    {
      int i5;
      if (i5 < 3)
      {
        this.E[i5].a(null, null, null);
        this.E[i5].setOnClickListener(null);
        this.E[i5].setClickable(false);
        this.E[i5].a = true;
        if (this.q == 1) {
          this.E[i5].setVisibility(8);
        }
        i5++;
      }
      else
      {
        if (i3 != -1)
        {
          hvl localhvl1 = this.b;
          RecyclingViewGroup localRecyclingViewGroup = this.a;
          PeopleListRowView[] arrayOfPeopleListRowView = this.E;
          ViewTreeObserver localViewTreeObserver = localRecyclingViewGroup.getViewTreeObserver();
          localViewTreeObserver.addOnPreDrawListener(new hvm(localhvl1, localViewTreeObserver, i3, i2, arrayOfPeopleListRowView, this));
        }
        View localView1 = ((View)localObject1).findViewById(ehr.cH);
        localView1.setOnClickListener(this);
        localView1.setTag(ehr.cB, Integer.valueOf(paramInt));
        localView1.setTag(ehr.cz, paramObject);
        localView1.setVisibility(0);
        if (paramString3 == null) {
          paramString3 = this.m.getResources().getString(efj.Lf);
        }
        ((TextView)((View)localObject1).findViewById(ehr.cI)).setText(paramString3);
        addView((View)localObject1);
        return localObject1;
        i5 = i4;
      }
    }
  }
  
  public final List<huu> a(View paramView)
  {
    ArrayList localArrayList = new ArrayList();
    if (this.d != null) {
      a(localArrayList, this.d, paramView);
    }
    if (this.e != null) {
      a(localArrayList, this.e, paramView);
    }
    if (this.f != null) {
      a(localArrayList, this.f, paramView);
    }
    if (this.g != null)
    {
      Iterator localIterator2 = this.g.iterator();
      while (localIterator2.hasNext()) {
        a(localArrayList, (View)localIterator2.next(), paramView);
      }
    }
    if (this.h != null)
    {
      Iterator localIterator1 = this.h.iterator();
      while (localIterator1.hasNext()) {
        a(localArrayList, (View)localIterator1.next(), paramView);
      }
    }
    if (this.i != null) {
      a(localArrayList, this.i, paramView);
    }
    a(localArrayList, this.k, paramView);
    return localArrayList;
  }
  
  public final void a(PeopleListRowView paramPeopleListRowView, String paramString)
  {
    paramPeopleListRowView.a(paramPeopleListRowView.findViewById(ehr.cG), paramPeopleListRowView.getWidth(), 300L, true);
  }
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle, int paramInt, hvo paramhvo)
  {
    if (this.o != null) {
      this.o.a(paramString1, paramString2, paramInt, paramhvo);
    }
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    if (this.o != null) {
      this.o.a(paramString1, paramString2, paramString3, paramInt);
    }
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean, String paramString3, int paramInt)
  {
    if (this.o != null) {
      this.o.a(paramString1, paramString2, paramBoolean, paramString3, paramInt);
    }
  }
  
  public final void a(String paramString, boolean paramBoolean)
  {
    if (this.o != null) {
      this.o.a(paramString, paramBoolean);
    }
  }
  
  public final void a(boolean paramBoolean) {}
  
  public final boolean b(String paramString1, String paramString2, boolean paramBoolean, String paramString3, int paramInt)
  {
    if (this.o != null) {
      return this.o.b(paramString1, paramString2, paramBoolean, paramString3, paramInt);
    }
    return false;
  }
  
  public final void b_(View paramView)
  {
    PeopleListRowView localPeopleListRowView = (PeopleListRowView)paramView.getParent();
    if (this.o != null) {
      this.o.a(localPeopleListRowView.c, localPeopleListRowView.f, localPeopleListRowView.g, localPeopleListRowView.h);
    }
  }
  
  public final void onClick(View paramView)
  {
    if (this.o == null) {}
    int i1;
    do
    {
      return;
      i1 = paramView.getId();
      Integer localInteger = (Integer)paramView.getTag(ehr.cB);
      if ((i1 == ehr.cD) || (i1 == ehr.cE) || (i1 == ehr.cF))
      {
        PeopleListRowView localPeopleListRowView = (PeopleListRowView)paramView;
        int i2 = hvj.b(localInteger.intValue());
        this.o.a(localPeopleListRowView.c, localPeopleListRowView.f, i2, new hvo(localPeopleListRowView.d, localPeopleListRowView.e));
        return;
      }
      if (i1 == ehr.cH)
      {
        switch (localInteger.intValue())
        {
        case 6: 
        default: 
          return;
        case 1: 
          this.o.B();
          return;
        case 8: 
          this.o.A();
          return;
        case 2: 
          this.o.C();
          return;
        case 4: 
          hur localhur2 = (hur)paramView.getTag(ehr.cz);
          this.o.a(localhur2);
          return;
        case 3: 
          hur localhur1 = (hur)paramView.getTag(ehr.cz);
          this.o.b(localhur1);
          return;
        case 5: 
          this.o.E();
          return;
        }
        this.o.z();
        return;
      }
      if (i1 == ehr.ct)
      {
        this.o.y();
        return;
      }
      if (i1 == ehr.cs)
      {
        this.o.x();
        return;
      }
    } while (i1 != ehr.cA);
    this.o.F();
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    int i2 = getPaddingLeft();
    int i3 = getPaddingTop();
    this.D = 0;
    if (this.d != null)
    {
      int i20 = this.d.getMeasuredHeight();
      this.d.layout(i2, i3, i2 + this.z, i3 + i20);
      i2 = a(i2);
      i3 = a(i3, i20);
    }
    if (this.e != null)
    {
      int i19 = this.e.getMeasuredHeight();
      this.e.layout(i2, i3, i2 + this.z, i3 + i19);
      i2 = a(i2);
      i3 = a(i3, i19);
    }
    if (this.f != null)
    {
      int i18 = this.f.getMeasuredHeight();
      this.f.layout(i2, i3, i2 + this.z, i3 + i18);
      i2 = a(i2);
      i3 = a(i3, i18);
    }
    if (this.g != null)
    {
      int i13 = this.g.size();
      int i14 = 0;
      int i15 = i2;
      int i16 = i3;
      while (i14 < i13)
      {
        View localView2 = (View)this.g.get(i14);
        int i17 = localView2.getMeasuredHeight();
        localView2.layout(i15, i16, i15 + this.z, i16 + i17);
        i15 = a(i15);
        i16 = a(i16, i17);
        i14++;
      }
      i3 = i16;
      i2 = i15;
    }
    if (this.h != null)
    {
      int i9 = this.h.size();
      int i10 = i2;
      int i11 = i3;
      while (i1 < i9)
      {
        View localView1 = (View)this.h.get(i1);
        int i12 = localView1.getMeasuredHeight();
        localView1.layout(i10, i11, i10 + this.z, i11 + i12);
        i10 = a(i10);
        i11 = a(i11, i12);
        i1++;
      }
      i3 = i11;
      i2 = i10;
    }
    if (this.i != null)
    {
      int i8 = this.i.getMeasuredHeight();
      this.i.layout(i2, i3, i2 + this.z, i3 + i8);
      i2 = a(i2);
      i3 = a(i3, i8);
    }
    if (this.k != null)
    {
      int i7 = this.k.getMeasuredHeight();
      this.k.layout(i2, i3, i2 + this.z, i3 + i7);
      i2 = a(i2);
      i3 = a(i3, i7);
    }
    if (this.j != null)
    {
      int i6 = this.j.getMeasuredHeight();
      this.j.layout(i2, i3, i2 + this.z, i3 + i6);
      i2 = a(i2);
      i3 = a(i3, i6);
    }
    if (this.l != null)
    {
      int i4 = this.l.getMeasuredHeight();
      int i5 = this.l.getMeasuredWidth();
      this.l.layout(i2, i3, i5 + i2, i3 + i4);
      a(i2);
      a(i3, i4);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = i1 - getPaddingLeft() - getPaddingRight();
    this.A = (getPaddingTop() + getPaddingBottom());
    int[] arrayOfInt1 = this.B;
    int[] arrayOfInt2 = this.B;
    this.C = 0;
    arrayOfInt2[1] = 0;
    arrayOfInt1[0] = 0;
    if (this.q == 1) {}
    int i3;
    int i4;
    for (;;)
    {
      this.z = i2;
      i3 = View.MeasureSpec.makeMeasureSpec(this.z, 1073741824);
      i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
      if (this.d != null)
      {
        this.d.measure(i3, i4);
        a(this.d.getMeasuredHeight(), false);
      }
      if (this.e != null)
      {
        this.e.measure(i3, i4);
        a(this.e.getMeasuredHeight(), false);
      }
      if (this.f != null)
      {
        this.f.measure(i3, i4);
        a(this.f.getMeasuredHeight(), false);
      }
      if (this.g == null) {
        break;
      }
      int i8 = this.g.size();
      for (int i9 = 0; i9 < i8; i9++)
      {
        View localView2 = (View)this.g.get(i9);
        localView2.measure(i3, i4);
        a(localView2.getMeasuredHeight(), false);
      }
      i2 = (i2 - u) / 2;
    }
    if (this.h != null)
    {
      int i6 = this.h.size();
      for (int i7 = 0; i7 < i6; i7++)
      {
        View localView1 = (View)this.h.get(i7);
        localView1.measure(i3, i4);
        a(localView1.getMeasuredHeight(), false);
      }
    }
    if (this.i != null)
    {
      this.i.measure(i3, i4);
      a(this.i.getMeasuredHeight(), false);
    }
    if (this.j != null)
    {
      this.j.measure(i3, i4);
      a(this.j.getMeasuredHeight(), false);
    }
    if (this.k != null)
    {
      this.k.measure(i3, i4);
      a(this.k.getMeasuredHeight(), false);
    }
    if (this.l != null)
    {
      this.z = (i1 - getPaddingLeft() - getPaddingRight());
      int i5 = View.MeasureSpec.makeMeasureSpec(this.z, 1073741824);
      this.l.measure(i5, i4);
      a(this.l.getMeasuredHeight(), false);
    }
    a(0, true);
    setMeasuredDimension(i1, this.A);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hvp
 * JD-Core Version:    0.7.0.1
 */