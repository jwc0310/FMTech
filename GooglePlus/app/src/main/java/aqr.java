import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public final class aqr
  extends BaseAdapter
  implements SectionIndexer, cmi<ipf>
{
  public View.OnLongClickListener a;
  cyr b;
  public boolean c;
  public Cursor d;
  public final Context e;
  public final aqv f;
  public String g;
  public String h;
  public final String i;
  public atq j;
  public boolean k = true;
  public final arc l = new arc(this);
  public cpu m;
  public det n;
  public List<atq> o = new ArrayList();
  private aqu p;
  private final int q;
  private final gya r;
  
  public aqr(Context paramContext, int paramInt, String paramString, aqv paramaqv, aqu paramaqu, gya paramgya)
  {
    this.e = paramContext;
    this.f = paramaqv;
    this.q = paramInt;
    this.i = paramString;
    this.r = paramgya;
    this.n = new det(new aqs(this));
    this.p = paramaqu;
    if ("TRUE".equalsIgnoreCase(dun.h.a())) {
      this.b = new cyr(paramContext);
    }
  }
  
  public static int a(Cursor paramCursor)
  {
    int i1 = 2;
    int i2 = 1;
    if (paramCursor.getInt(i1) == 4) {}
    for (int i3 = i2; (i3 != 0) || (b(paramCursor)); i3 = 0)
    {
      i1 = i2;
      return i1;
    }
    int i4;
    if (paramCursor.getInt(i1) == 110)
    {
      i4 = i2;
      label52:
      if (i4 != 0) {
        break label84;
      }
      if (paramCursor.getInt(i1) != 666) {
        break label86;
      }
    }
    label84:
    label86:
    for (int i5 = i2;; i5 = 0)
    {
      if (i5 == 0) {
        break label92;
      }
      return 3;
      i4 = 0;
      break label52;
      break;
    }
    label92:
    int i6;
    if (paramCursor.getInt(i1) == i1)
    {
      i6 = i2;
      if ((i6 == 0) || ((0x400000 & paramCursor.getInt(15)) == 0L)) {
        break label141;
      }
    }
    for (;;)
    {
      if (i2 == 0) {
        break label146;
      }
      return 4;
      i6 = 0;
      break;
      label141:
      i2 = 0;
    }
    label146:
    return 0;
  }
  
  public static Integer a(Cursor paramCursor, int paramInt)
  {
    if (paramCursor.isNull(paramInt)) {
      return null;
    }
    return Integer.valueOf(paramCursor.getInt(paramInt));
  }
  
  public static ArrayList<? extends jpx> a(atq paramatq)
  {
    aqt localaqt = new aqt();
    paramatq.a(localaqt);
    arh localarh;
    if (localaqt.a != null)
    {
      localarh = localaqt.a;
      if (localarh.l != null) {}
    }
    else
    {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i1 = localarh.l.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      ari localari = (ari)localarh.l.get(i2);
      localArrayList.add(new jpu(localari.a, localari.d.c, localari.c, localari.g, localari.h));
    }
    return localArrayList;
  }
  
  public static List<atq> a(Context paramContext, aqv paramaqv, arh paramarh, boolean paramBoolean, List<ari> paramList, arc paramarc)
  {
    ArrayList localArrayList1 = new ArrayList();
    jrh localjrh = new jrh(paramContext);
    int i1 = paramList.size();
    int i2;
    int i3;
    label69:
    int i4;
    ArrayList localArrayList2;
    int i5;
    int i6;
    label92:
    int i9;
    if (paramaqv.a > 0)
    {
      i2 = Math.min(i1, paramaqv.a * localjrh.a);
      if (i2 >= Math.max(i1, paramarh.d)) {
        break label232;
      }
      i3 = 1;
      i4 = localjrh.a;
      localArrayList2 = new ArrayList();
      i5 = 0;
      i6 = i3;
      if (i5 >= i2) {
        break label250;
      }
      ark localark = new ark(false, false);
      ArrayList localArrayList3 = new ArrayList(paramList.subList(i5, Math.min(i2, i5 + i4)));
      if ((paramaqv.b) && (i5 != 0))
      {
        int i8 = localArrayList3.size();
        if (i6 == 0) {
          break label238;
        }
        i9 = 1;
        label165:
        if (i9 + i8 < localjrh.a) {
          break label244;
        }
      }
      localArrayList2.add(new arj(paramarh, localArrayList3, localark, (i5 + 1) / (i1 + 1)));
    }
    label232:
    label238:
    label244:
    for (int i7 = i6;; i7 = 1)
    {
      i5 += i4;
      i6 = i7;
      break label92;
      i2 = i1;
      break;
      i3 = 0;
      break label69;
      i9 = 0;
      break label165;
    }
    label250:
    int i10 = localArrayList2.size();
    ArrayList localArrayList4 = new ArrayList();
    int i11 = 0;
    if (i11 < i10)
    {
      Object localObject = (arj)localArrayList2.get(i11);
      aqz localaqz = new aqz(paramContext, (arj)localObject, localjrh, paramarc);
      localArrayList1.add(new atm(localaqz, 1, paramaqv.c, localjrh.a));
      if (i11 + 1 == i10)
      {
        if ((i6 != 0) && (!((arj)localObject).b()))
        {
          if ((!paramaqv.b) && (((arj)localObject).c() >= localjrh.a)) {
            break label428;
          }
          ((arj)localObject).b.a = true;
        }
        label382:
        if (paramBoolean)
        {
          if (((arj)localObject).c() >= localjrh.a) {
            break label499;
          }
          ((arj)localObject).b.b = true;
        }
      }
      for (;;)
      {
        localArrayList4.addAll(localaqz.a(536870912L));
        i11++;
        break;
        label428:
        arj localarj = new arj(paramarh, null, new ark(true, false), ((arj)localObject).d);
        localArrayList1.add(new atm(new aqz(paramContext, localarj, localjrh, paramarc), 1, paramaqv.c, localjrh.a));
        localObject = localarj;
        break label382;
        label499:
        localArrayList1.add(new atm(new aqz(paramContext, new arj(paramarh, null, new ark(false, true), ((arj)localObject).d), localjrh, paramarc), 1, paramaqv.c, localjrh.a));
      }
    }
    paramarh.l = localArrayList4;
    return localArrayList1;
  }
  
  public static boolean b(Cursor paramCursor)
  {
    return paramCursor.getInt(2) == 101;
  }
  
  public final int a(float paramFloat)
  {
    int i1 = 0;
    int i2 = this.o.size();
    aqx localaqx = new aqx();
    int i3 = 0;
    if (i1 < i2)
    {
      ((atq)this.o.get(i1)).a(localaqx);
      if ((0.0F <= localaqx.a) && (localaqx.a <= paramFloat)) {}
      for (int i4 = i1;; i4 = i3)
      {
        i1++;
        i3 = i4;
        break;
        if (localaqx.a > paramFloat) {
          break label99;
        }
      }
    }
    label99:
    return i3;
  }
  
  public final int a(Uri paramUri)
  {
    if ((this.o == null) || (this.o.isEmpty())) {
      return 0;
    }
    int i1 = this.o.size();
    aqw localaqw = new aqw();
    for (int i2 = 0; i2 < i1; i2++)
    {
      ((atq)this.o.get(i2)).a(localaqw);
      if (localaqw.a != null)
      {
        Iterator localIterator = localaqw.a.iterator();
        while (localIterator.hasNext())
        {
          ipf localipf = (ipf)localIterator.next();
          if (localipf.d != null) {}
          for (int i3 = 1; (i3 != 0) && (localipf.d.equals(paramUri)); i3 = 0) {
            return i2;
          }
        }
      }
    }
    return 0;
  }
  
  public final List<ipf> a(int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    aqw localaqw = new aqw();
    while (paramInt1 < paramInt2)
    {
      ((atq)this.o.get(paramInt1)).a(localaqw);
      if ((localaqw.a != null) && (!localaqw.a.isEmpty())) {
        localArrayList.addAll(localaqw.a);
      }
      paramInt1++;
    }
    return localArrayList;
  }
  
  public final void a()
  {
    SparseArray localSparseArray = new SparseArray();
    Object localObject1 = null;
    Object localObject2 = Calendar.getInstance();
    aqy localaqy = new aqy();
    int i1 = 0;
    long l1 = 0L;
    long l3;
    Object localObject4;
    Object localObject3;
    if (i1 < this.o.size())
    {
      localaqy.a = 0L;
      ((atq)this.o.get(i1)).a(localaqy);
      if ((localaqy.a <= 0L) || ((l1 != 0L) && (localaqy.a >= l1))) {
        break label182;
      }
      ((Calendar)localObject2).setTimeInMillis(localaqy.a);
      if ((localObject1 != null) && (localObject1.a((Calendar)localObject2))) {
        break label182;
      }
      l3 = localaqy.a;
      localObject4 = new deu(this.e, (Calendar)localObject2);
      localSparseArray.put(i1, localObject4);
      localObject3 = Calendar.getInstance();
    }
    for (;;)
    {
      i1++;
      localObject2 = localObject3;
      long l4 = l3;
      localObject1 = localObject4;
      l1 = l4;
      break;
      this.n.a(localSparseArray);
      return;
      label182:
      long l2 = l1;
      localObject3 = localObject2;
      localObject4 = localObject1;
      l3 = l2;
    }
  }
  
  public final void a(View paramView)
  {
    if ((this.j != null) && (this.o != null)) {
      this.o.remove(this.j);
    }
    if (paramView != null)
    {
      this.j = new aph(paramView, 2);
      if (this.o != null) {
        this.o.add(0, this.j);
      }
    }
    for (;;)
    {
      notifyDataSetChanged();
      return;
      this.j = null;
    }
  }
  
  public final int getCount()
  {
    if (this.o != null) {
      return this.o.size();
    }
    return 0;
  }
  
  public final Object getItem(int paramInt)
  {
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    return ((atq)this.o.get(paramInt)).a();
  }
  
  public final int getPositionForSection(int paramInt)
  {
    return this.n.getPositionForSection(paramInt);
  }
  
  public final int getSectionForPosition(int paramInt)
  {
    return this.n.getSectionForPosition(paramInt);
  }
  
  public final Object[] getSections()
  {
    return this.n.getSections();
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((this.k) && (this.g != null) && (this.o.size() - paramInt < 100) && (!TextUtils.equals(this.h, this.g)))
    {
      this.h = this.g;
      if (this.p != null) {
        this.p.a(this.g);
      }
    }
    return ((atq)this.o.get(paramInt)).a(paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return 5;
  }
  
  public final boolean isEmpty()
  {
    return (this.o == null) || (this.o.isEmpty());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aqr
 * JD-Core Version:    0.7.0.1
 */