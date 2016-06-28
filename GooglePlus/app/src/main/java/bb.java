import android.os.Build.VERSION;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

public final class bb
  extends cl
  implements bx, Runnable
{
  private static boolean n;
  be a;
  int b;
  int c;
  int d;
  boolean e;
  String f;
  int g = -1;
  int h;
  CharSequence i;
  int j;
  CharSequence k;
  ArrayList<String> l;
  ArrayList<String> m;
  private bz o;
  private be p;
  private boolean q = true;
  private boolean r;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (boolean bool = true;; bool = false)
    {
      n = bool;
      return;
    }
  }
  
  public bb(bz parambz)
  {
    this.o = parambz;
  }
  
  private int a(boolean paramBoolean)
  {
    if (this.r) {
      throw new IllegalStateException("commit already called");
    }
    this.r = true;
    if (this.e) {}
    for (this.g = this.o.a(this);; this.g = -1)
    {
      this.o.a(this, paramBoolean);
      return this.g;
    }
  }
  
  private static Object a(Object paramObject, bk parambk, ArrayList<View> paramArrayList, kl<String, View> paramkl, View paramView)
  {
    if (paramObject != null)
    {
      View localView = parambk.N;
      if (paramObject != null)
      {
        efj.a(paramArrayList, localView);
        if (paramkl != null) {
          paramArrayList.removeAll(paramkl.values());
        }
        if (!paramArrayList.isEmpty()) {
          break label46;
        }
        paramObject = null;
      }
    }
    return paramObject;
    label46:
    paramArrayList.add(paramView);
    efj.b((Transition)paramObject, paramArrayList);
    return paramObject;
  }
  
  private static kl<String, View> a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, kl<String, View> paramkl)
  {
    if (paramkl.isEmpty()) {
      return paramkl;
    }
    kl localkl = new kl();
    int i1 = paramArrayList1.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = (View)paramkl.get(paramArrayList1.get(i2));
      if (localView != null) {
        localkl.put(paramArrayList2.get(i2), localView);
      }
    }
    return localkl;
  }
  
  private final kl<String, View> a(rhn paramrhn, bk parambk, boolean paramBoolean)
  {
    kl localkl = new kl();
    if (this.l != null)
    {
      efj.a(localkl, parambk.N);
      if (!paramBoolean) {
        break label59;
      }
      kr.a(localkl, this.m);
    }
    while (paramBoolean)
    {
      a(paramrhn, localkl, false);
      return localkl;
      label59:
      localkl = a(this.l, this.m, localkl);
    }
    b(paramrhn, localkl, false);
    return localkl;
  }
  
  private final rhn a(SparseArray<bk> paramSparseArray1, SparseArray<bk> paramSparseArray2, boolean paramBoolean)
  {
    rhn localrhn = new rhn(this);
    localrhn.e = new View(this.o.h.b);
    int i1 = 0;
    int i2 = 0;
    int i3 = paramSparseArray1.size();
    int i4 = 0;
    if (i1 < i3) {
      if (!a(paramSparseArray1.keyAt(i1), localrhn, paramBoolean, paramSparseArray1, paramSparseArray2)) {
        break label145;
      }
    }
    label145:
    for (int i6 = 1;; i6 = i2)
    {
      i1++;
      i2 = i6;
      break;
      while (i4 < paramSparseArray2.size())
      {
        int i5 = paramSparseArray2.keyAt(i4);
        if ((paramSparseArray1.get(i5) == null) && (a(i5, localrhn, paramBoolean, paramSparseArray1, paramSparseArray2))) {
          i2 = 1;
        }
        i4++;
      }
      if (i2 == 0) {
        localrhn = null;
      }
      return localrhn;
    }
  }
  
  private final void a(int paramInt1, bk parambk, String paramString, int paramInt2)
  {
    parambk.x = this.o;
    if (paramString != null)
    {
      if ((parambk.D != null) && (!paramString.equals(parambk.D))) {
        throw new IllegalStateException("Can't change tag of fragment " + parambk + ": was " + parambk.D + " now " + paramString);
      }
      parambk.D = paramString;
    }
    if (paramInt1 != 0)
    {
      if ((parambk.B != 0) && (parambk.B != paramInt1)) {
        throw new IllegalStateException("Can't change container ID of fragment " + parambk + ": was " + parambk.B + " now " + paramInt1);
      }
      parambk.B = paramInt1;
      parambk.C = paramInt1;
    }
    be localbe = new be();
    localbe.c = paramInt2;
    localbe.d = parambk;
    a(localbe);
  }
  
  private static void a(SparseArray<bk> paramSparseArray, bk parambk)
  {
    if (parambk != null)
    {
      int i1 = parambk.C;
      if ((i1 != 0) && (!parambk.E) && (parambk.i()) && (parambk.N != null) && (paramSparseArray.get(i1) == null)) {
        paramSparseArray.put(i1, parambk);
      }
    }
  }
  
  private static void a(kl<String, String> paramkl, String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null)) {}
    for (int i1 = 0; i1 < paramkl.size(); i1++) {
      if (paramString1.equals(paramkl.b[(1 + (i1 << 1))]))
      {
        paramkl.a(i1, paramString2);
        return;
      }
    }
    paramkl.put(paramString1, paramString2);
  }
  
  private final void a(rhn paramrhn, int paramInt, Object paramObject)
  {
    if (this.o.c != null)
    {
      int i1 = 0;
      if (i1 < this.o.c.size())
      {
        bk localbk = (bk)this.o.c.get(i1);
        if ((localbk.N != null) && (localbk.M != null) && (localbk.C == paramInt))
        {
          if (!localbk.E) {
            break label130;
          }
          if (!paramrhn.c.contains(localbk.N))
          {
            View localView2 = localbk.N;
            ((Transition)paramObject).excludeTarget(localView2, true);
            paramrhn.c.add(localbk.N);
          }
        }
        for (;;)
        {
          i1++;
          break;
          label130:
          View localView1 = localbk.N;
          ((Transition)paramObject).excludeTarget(localView1, false);
          paramrhn.c.remove(localbk.N);
        }
      }
    }
  }
  
  private final void a(rhn paramrhn, kl<String, View> paramkl, boolean paramBoolean)
  {
    int i1;
    int i2;
    label13:
    String str1;
    String str2;
    if (this.m == null)
    {
      i1 = 0;
      i2 = 0;
      if (i2 >= i1) {
        return;
      }
      str1 = (String)this.l.get(i2);
      View localView = (View)paramkl.get((String)this.m.get(i2));
      if (localView != null)
      {
        str2 = localView.getTransitionName();
        if (!paramBoolean) {
          break label100;
        }
        a(paramrhn.b, str1, str2);
      }
    }
    for (;;)
    {
      i2++;
      break label13;
      i1 = this.m.size();
      break;
      label100:
      a(paramrhn.b, str2, str1);
    }
  }
  
  private final boolean a(int paramInt, rhn paramrhn, boolean paramBoolean, SparseArray<bk> paramSparseArray1, SparseArray<bk> paramSparseArray2)
  {
    ViewGroup localViewGroup = (ViewGroup)this.o.i.a(paramInt);
    if (localViewGroup == null) {
      return false;
    }
    bk localbk1 = (bk)paramSparseArray2.get(paramInt);
    bk localbk2 = (bk)paramSparseArray1.get(paramInt);
    Object localObject2;
    TransitionSet localTransitionSet1;
    if (localbk1 == null)
    {
      localObject2 = null;
      if ((localbk1 != null) && (localbk2 != null)) {
        break label188;
      }
      localTransitionSet1 = null;
    }
    Object localObject4;
    ArrayList localArrayList1;
    kl localkl1;
    TransitionSet localTransitionSet2;
    for (;;)
    {
      if (localbk2 != null) {
        break label271;
      }
      localObject4 = null;
      localArrayList1 = new ArrayList();
      localkl1 = null;
      if (localTransitionSet1 == null) {
        break label365;
      }
      localkl1 = a(paramrhn, localbk2, paramBoolean);
      if (!localkl1.isEmpty()) {
        break label327;
      }
      localkl1 = null;
      localTransitionSet2 = null;
      if ((localObject2 != null) || (localTransitionSet2 != null) || (localObject4 != null)) {
        break label381;
      }
      return false;
      Object localObject1;
      if (paramBoolean) {
        if (localbk1.V == bk.e) {
          localObject1 = null;
        }
      }
      for (;;)
      {
        if (localObject1 != null) {
          localObject1 = ((Transition)localObject1).clone();
        }
        localObject2 = localObject1;
        break;
        localObject1 = localbk1.V;
        continue;
        localObject1 = null;
      }
      label188:
      Object localObject7;
      if (paramBoolean) {
        if (localbk2.W == bk.e) {
          localObject7 = null;
        }
      }
      for (;;)
      {
        if (localObject7 != null) {
          break label233;
        }
        localTransitionSet1 = null;
        break;
        localObject7 = localbk2.W;
        continue;
        localObject7 = null;
      }
      label233:
      Transition localTransition8 = (Transition)localObject7;
      if (localTransition8 == null)
      {
        localTransitionSet1 = null;
      }
      else
      {
        localTransitionSet1 = new TransitionSet();
        localTransitionSet1.addTransition(localTransition8);
      }
    }
    label271:
    Object localObject3;
    if (paramBoolean) {
      if (localbk2.U == bk.e) {
        localObject3 = null;
      }
    }
    for (;;)
    {
      if (localObject3 != null) {
        localObject3 = ((Transition)localObject3).clone();
      }
      localObject4 = localObject3;
      break;
      localObject3 = localbk2.U;
      continue;
      localObject3 = null;
    }
    label327:
    if (paramBoolean) {}
    for (;;)
    {
      localViewGroup.getViewTreeObserver().addOnPreDrawListener(new bc(this, localViewGroup, localTransitionSet1, localArrayList1, paramrhn, paramBoolean, localbk1, localbk2));
      label365:
      localTransitionSet2 = localTransitionSet1;
      break;
    }
    label381:
    ArrayList localArrayList2 = new ArrayList();
    View localView1 = paramrhn.e;
    Object localObject5 = a(localObject4, localbk2, localArrayList2, localkl1, localView1);
    if ((this.m != null) && (localkl1 != null))
    {
      Object localObject6 = this.m.get(0);
      View localView5 = (View)localkl1.get(localObject6);
      if (localView5 != null)
      {
        if (localObject5 != null) {
          efj.a(localObject5, localView5);
        }
        if (localTransitionSet2 != null) {
          efj.a(localTransitionSet2, localView5);
        }
      }
    }
    cr localcr = new cr(this, localbk1);
    ArrayList localArrayList3 = new ArrayList();
    kl localkl2 = new kl();
    if (localbk1 != null) {}
    Transition localTransition1 = (Transition)localObject2;
    Transition localTransition2 = (Transition)localObject5;
    Transition localTransition3 = (Transition)localTransitionSet2;
    if ((localTransition1 != null) && (localTransition2 != null)) {}
    TransitionSet localTransitionSet3 = new TransitionSet();
    if (localTransition1 != null) {
      localTransitionSet3.addTransition(localTransition1);
    }
    if (localTransition2 != null) {
      localTransitionSet3.addTransition(localTransition2);
    }
    if (localTransition3 != null) {
      localTransitionSet3.addTransition(localTransition3);
    }
    if (localTransitionSet3 != null)
    {
      View localView2 = paramrhn.e;
      cq localcq = paramrhn.d;
      kl localkl3 = paramrhn.b;
      efj.a(localObject2, localTransitionSet2, localViewGroup, localcr, localView2, localcq, localkl3, localArrayList3, localkl1, localkl2, localArrayList1);
      localViewGroup.getViewTreeObserver().addOnPreDrawListener(new bd(this, localViewGroup, paramrhn, paramInt, localTransitionSet3));
      View localView3 = paramrhn.e;
      ((Transition)localTransitionSet3).excludeTarget(localView3, true);
      a(paramrhn, paramInt, localTransitionSet3);
      TransitionManager.beginDelayedTransition(localViewGroup, (Transition)localTransitionSet3);
      View localView4 = paramrhn.e;
      ArrayList localArrayList4 = paramrhn.c;
      Transition localTransition4 = (Transition)localObject2;
      Transition localTransition5 = (Transition)localObject5;
      Transition localTransition6 = (Transition)localTransitionSet2;
      Transition localTransition7 = (Transition)localTransitionSet3;
      if (localTransition7 != null) {
        localViewGroup.getViewTreeObserver().addOnPreDrawListener(new cp(localViewGroup, localTransition4, localArrayList3, localTransition5, localArrayList2, localTransition6, localArrayList1, localkl2, localArrayList4, localTransition7, localView4));
      }
    }
    return localTransitionSet3 != null;
  }
  
  private final void b(SparseArray<bk> paramSparseArray1, SparseArray<bk> paramSparseArray2)
  {
    if (!this.o.i.a()) {}
    be localbe;
    do
    {
      return;
      localbe = this.a;
    } while (localbe == null);
    switch (localbe.c)
    {
    }
    for (;;)
    {
      localbe = localbe.a;
      break;
      b(paramSparseArray2, localbe.d);
      continue;
      bk localbk1 = localbe.d;
      bk localbk2;
      if (this.o.c != null)
      {
        localbk2 = localbk1;
        int i1 = 0;
        if (i1 < this.o.c.size())
        {
          bk localbk3 = (bk)this.o.c.get(i1);
          if ((localbk2 == null) || (localbk3.C == localbk2.C))
          {
            if (localbk3 != localbk2) {
              break label176;
            }
            localbk2 = null;
          }
          for (;;)
          {
            i1++;
            break;
            label176:
            a(paramSparseArray1, localbk3);
          }
        }
      }
      else
      {
        localbk2 = localbk1;
      }
      b(paramSparseArray2, localbk2);
      continue;
      a(paramSparseArray1, localbe.d);
      continue;
      a(paramSparseArray1, localbe.d);
      continue;
      b(paramSparseArray2, localbe.d);
      continue;
      a(paramSparseArray1, localbe.d);
      continue;
      b(paramSparseArray2, localbe.d);
    }
  }
  
  private static void b(SparseArray<bk> paramSparseArray, bk parambk)
  {
    if (parambk != null)
    {
      int i1 = parambk.C;
      if (i1 != 0) {
        paramSparseArray.put(i1, parambk);
      }
    }
  }
  
  private static void b(rhn paramrhn, kl<String, View> paramkl, boolean paramBoolean)
  {
    int i1 = paramkl.size();
    int i2 = 0;
    if (i2 < i1)
    {
      String str1 = (String)paramkl.b[(i2 << 1)];
      String str2 = ((View)paramkl.b[(1 + (i2 << 1))]).getTransitionName();
      if (paramBoolean) {
        a(paramrhn.b, str1, str2);
      }
      for (;;)
      {
        i2++;
        break;
        a(paramrhn.b, str2, str1);
      }
    }
  }
  
  public final cl a()
  {
    if (this.e) {
      throw new IllegalStateException("This transaction is already being added to the back stack");
    }
    this.q = false;
    return this;
  }
  
  public final cl a(int paramInt)
  {
    this.c = paramInt;
    return this;
  }
  
  public final cl a(int paramInt, bk parambk)
  {
    a(paramInt, parambk, null, 1);
    return this;
  }
  
  public final cl a(int paramInt, bk parambk, String paramString)
  {
    a(paramInt, parambk, paramString, 1);
    return this;
  }
  
  public final cl a(bk parambk)
  {
    be localbe = new be();
    localbe.c = 3;
    localbe.d = parambk;
    a(localbe);
    return this;
  }
  
  public final cl a(bk parambk, String paramString)
  {
    a(0, parambk, paramString, 1);
    return this;
  }
  
  public final cl a(String paramString)
  {
    if (!this.q) {
      throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }
    this.e = true;
    this.f = paramString;
    return this;
  }
  
  public final rhn a(boolean paramBoolean, rhn paramrhn, SparseArray<bk> paramSparseArray1, SparseArray<bk> paramSparseArray2)
  {
    if (n)
    {
      if (paramrhn != null) {
        break label157;
      }
      if ((paramSparseArray1.size() != 0) || (paramSparseArray2.size() != 0)) {
        paramrhn = a(paramSparseArray1, paramSparseArray2, true);
      }
    }
    label38:
    b(-1);
    int i1;
    label50:
    int i2;
    label57:
    be localbe;
    int i4;
    if (paramrhn != null)
    {
      i1 = 0;
      if (paramrhn == null) {
        break label241;
      }
      i2 = 0;
      localbe = this.p;
      if (localbe == null) {
        break label566;
      }
      if (paramrhn == null) {
        break label250;
      }
      i4 = 0;
      label75:
      if (paramrhn == null) {
        break label260;
      }
    }
    label260:
    for (int i5 = 0;; i5 = localbe.h) {
      switch (localbe.c)
      {
      default: 
        throw new IllegalArgumentException("Unknown cmd: " + localbe.c);
        label157:
        if (paramBoolean) {
          break label38;
        }
        ArrayList localArrayList1 = this.m;
        ArrayList localArrayList2 = this.l;
        if (localArrayList1 == null) {
          break label38;
        }
        for (int i7 = 0; i7 < localArrayList1.size(); i7++)
        {
          String str1 = (String)localArrayList1.get(i7);
          String str2 = (String)localArrayList2.get(i7);
          a(paramrhn.b, str1, str2);
        }
        i1 = this.d;
        break label50;
        label241:
        i2 = this.c;
        break label57;
        label250:
        i4 = localbe.g;
        break label75;
      }
    }
    bk localbk8 = localbe.d;
    localbk8.L = i5;
    this.o.a(localbk8, bz.c(i2), i1);
    for (;;)
    {
      localbe = localbe.b;
      break;
      bk localbk6 = localbe.d;
      if (localbk6 != null)
      {
        localbk6.L = i5;
        this.o.a(localbk6, bz.c(i2), i1);
      }
      if (localbe.i != null)
      {
        for (int i6 = 0; i6 < localbe.i.size(); i6++)
        {
          bk localbk7 = (bk)localbe.i.get(i6);
          localbk7.L = i4;
          this.o.a(localbk7, false);
        }
        bk localbk5 = localbe.d;
        localbk5.L = i4;
        this.o.a(localbk5, false);
        continue;
        bk localbk4 = localbe.d;
        localbk4.L = i4;
        this.o.c(localbk4, bz.c(i2), i1);
        continue;
        bk localbk3 = localbe.d;
        localbk3.L = i5;
        this.o.b(localbk3, bz.c(i2), i1);
        continue;
        bk localbk2 = localbe.d;
        localbk2.L = i4;
        this.o.e(localbk2, bz.c(i2), i1);
        continue;
        bk localbk1 = localbe.d;
        localbk1.L = i4;
        this.o.d(localbk1, bz.c(i2), i1);
      }
    }
    label566:
    if (paramBoolean)
    {
      this.o.a(this.o.g, bz.c(i2), i1, true);
      paramrhn = null;
    }
    bz localbz;
    int i3;
    if (this.g >= 0)
    {
      localbz = this.o;
      i3 = this.g;
    }
    try
    {
      localbz.e.set(i3, null);
      if (localbz.f == null) {
        localbz.f = new ArrayList();
      }
      localbz.f.add(Integer.valueOf(i3));
      this.g = -1;
      return paramrhn;
    }
    finally {}
  }
  
  public final void a(SparseArray<bk> paramSparseArray1, SparseArray<bk> paramSparseArray2)
  {
    if (!this.o.i.a()) {}
    be localbe;
    do
    {
      return;
      localbe = this.a;
    } while (localbe == null);
    switch (localbe.c)
    {
    }
    for (;;)
    {
      localbe = localbe.a;
      break;
      a(paramSparseArray1, localbe.d);
      continue;
      if (localbe.i != null) {
        for (int i1 = -1 + localbe.i.size(); i1 >= 0; i1--) {
          b(paramSparseArray2, (bk)localbe.i.get(i1));
        }
      }
      a(paramSparseArray1, localbe.d);
      continue;
      b(paramSparseArray2, localbe.d);
      continue;
      b(paramSparseArray2, localbe.d);
      continue;
      a(paramSparseArray1, localbe.d);
      continue;
      b(paramSparseArray2, localbe.d);
      continue;
      a(paramSparseArray1, localbe.d);
    }
  }
  
  final void a(be parambe)
  {
    if (this.a == null)
    {
      this.p = parambe;
      this.a = parambe;
    }
    for (;;)
    {
      parambe.e = 0;
      parambe.f = 0;
      parambe.g = 0;
      parambe.h = 0;
      this.b = (1 + this.b);
      return;
      parambe.b = this.p;
      this.p.a = parambe;
      this.p = parambe;
    }
  }
  
  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mName=");
    paramPrintWriter.print(this.f);
    paramPrintWriter.print(" mIndex=");
    paramPrintWriter.print(this.g);
    paramPrintWriter.print(" mCommitted=");
    paramPrintWriter.println(this.r);
    if (this.c != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTransition=#");
      paramPrintWriter.print(Integer.toHexString(this.c));
      paramPrintWriter.print(" mTransitionStyle=#");
      paramPrintWriter.println(Integer.toHexString(this.d));
    }
    if ((this.h != 0) || (this.i != null))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mBreadCrumbTitleRes=#");
      paramPrintWriter.print(Integer.toHexString(this.h));
      paramPrintWriter.print(" mBreadCrumbTitleText=");
      paramPrintWriter.println(this.i);
    }
    if ((this.j != 0) || (this.k != null))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
      paramPrintWriter.print(Integer.toHexString(this.j));
      paramPrintWriter.print(" mBreadCrumbShortTitleText=");
      paramPrintWriter.println(this.k);
    }
    if (this.a != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      String str1 = paramString + "    ";
      be localbe1 = this.a;
      int i1 = 0;
      be localbe2 = localbe1;
      while (localbe2 != null)
      {
        String str2;
        int i2;
        switch (localbe2.c)
        {
        default: 
          str2 = "cmd=" + localbe2.c;
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.print(str2);
          paramPrintWriter.print(" ");
          paramPrintWriter.println(localbe2.d);
          if ((localbe2.e != 0) || (localbe2.f != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("enterAnim=#");
            paramPrintWriter.print(Integer.toHexString(localbe2.e));
            paramPrintWriter.print(" exitAnim=#");
            paramPrintWriter.println(Integer.toHexString(localbe2.f));
          }
          if ((localbe2.g != 0) || (localbe2.h != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("popEnterAnim=#");
            paramPrintWriter.print(Integer.toHexString(localbe2.g));
            paramPrintWriter.print(" popExitAnim=#");
            paramPrintWriter.println(Integer.toHexString(localbe2.h));
          }
          if ((localbe2.i == null) || (localbe2.i.size() <= 0)) {
            break label683;
          }
          i2 = 0;
          label522:
          if (i2 >= localbe2.i.size()) {
            break label683;
          }
          paramPrintWriter.print(str1);
          if (localbe2.i.size() == 1) {
            paramPrintWriter.print("Removed: ");
          }
          break;
        }
        for (;;)
        {
          paramPrintWriter.println(localbe2.i.get(i2));
          i2++;
          break label522;
          str2 = "NULL";
          break;
          str2 = "ADD";
          break;
          str2 = "REPLACE";
          break;
          str2 = "REMOVE";
          break;
          str2 = "HIDE";
          break;
          str2 = "SHOW";
          break;
          str2 = "DETACH";
          break;
          str2 = "ATTACH";
          break;
          if (i2 == 0) {
            paramPrintWriter.println("Removed:");
          }
          paramPrintWriter.print(str1);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i2);
          paramPrintWriter.print(": ");
        }
        label683:
        localbe2 = localbe2.a;
        i1++;
      }
    }
  }
  
  public final int b()
  {
    return a(false);
  }
  
  public final cl b(int paramInt, bk parambk)
  {
    return b(paramInt, parambk, null);
  }
  
  public final cl b(int paramInt, bk parambk, String paramString)
  {
    if (paramInt == 0) {
      throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
    a(paramInt, parambk, paramString, 2);
    return this;
  }
  
  public final cl b(bk parambk)
  {
    be localbe = new be();
    localbe.c = 6;
    localbe.d = parambk;
    a(localbe);
    return this;
  }
  
  final void b(int paramInt)
  {
    if (!this.e) {}
    for (;;)
    {
      return;
      for (be localbe = this.a; localbe != null; localbe = localbe.a)
      {
        if (localbe.d != null)
        {
          bk localbk2 = localbe.d;
          localbk2.w = (paramInt + localbk2.w);
        }
        if (localbe.i != null) {
          for (int i1 = -1 + localbe.i.size(); i1 >= 0; i1--)
          {
            bk localbk1 = (bk)localbe.i.get(i1);
            localbk1.w = (paramInt + localbk1.w);
          }
        }
      }
    }
  }
  
  public final int c()
  {
    return a(true);
  }
  
  public final cl c(bk parambk)
  {
    be localbe = new be();
    localbe.c = 7;
    localbe.d = parambk;
    a(localbe);
    return this;
  }
  
  public final String d()
  {
    return this.f;
  }
  
  public final boolean e()
  {
    return this.b == 0;
  }
  
  public final void run()
  {
    if ((this.e) && (this.g < 0)) {
      throw new IllegalStateException("addToBackStack() called after commit()");
    }
    b(1);
    SparseArray localSparseArray1;
    SparseArray localSparseArray2;
    if (n)
    {
      localSparseArray1 = new SparseArray();
      localSparseArray2 = new SparseArray();
      b(localSparseArray1, localSparseArray2);
    }
    for (rhn localrhn = a(localSparseArray1, localSparseArray2, false);; localrhn = null)
    {
      int i1;
      label79:
      int i2;
      label87:
      be localbe;
      int i3;
      if (localrhn != null)
      {
        i1 = 0;
        if (localrhn == null) {
          break label198;
        }
        i2 = 0;
        localbe = this.a;
        if (localbe == null) {
          break label616;
        }
        if (localrhn == null) {
          break label207;
        }
        i3 = 0;
        label106:
        if (localrhn == null) {
          break label217;
        }
      }
      label198:
      label207:
      label217:
      for (int i4 = 0;; i4 = localbe.f) {
        switch (localbe.c)
        {
        default: 
          throw new IllegalArgumentException("Unknown cmd: " + localbe.c);
          i1 = this.d;
          break label79;
          i2 = this.c;
          break label87;
          i3 = localbe.e;
          break label106;
        }
      }
      bk localbk9 = localbe.d;
      localbk9.L = i3;
      this.o.a(localbk9, false);
      for (;;)
      {
        localbe = localbe.a;
        break;
        bk localbk6 = localbe.d;
        int i5 = localbk6.C;
        bk localbk7;
        if (this.o.c != null)
        {
          int i6 = 0;
          localbk7 = localbk6;
          if (i6 < this.o.c.size())
          {
            bk localbk8 = (bk)this.o.c.get(i6);
            if (localbk8.C == i5)
            {
              if (localbk8 != localbk7) {
                break label360;
              }
              localbe.d = null;
              localbk7 = null;
            }
            for (;;)
            {
              i6++;
              break;
              label360:
              if (localbe.i == null) {
                localbe.i = new ArrayList();
              }
              localbe.i.add(localbk8);
              localbk8.L = i4;
              if (this.e) {
                localbk8.w = (1 + localbk8.w);
              }
              this.o.a(localbk8, i2, i1);
            }
          }
        }
        else
        {
          localbk7 = localbk6;
        }
        if (localbk7 != null)
        {
          localbk7.L = i3;
          this.o.a(localbk7, false);
          continue;
          bk localbk5 = localbe.d;
          localbk5.L = i4;
          this.o.a(localbk5, i2, i1);
          continue;
          bk localbk4 = localbe.d;
          localbk4.L = i4;
          this.o.b(localbk4, i2, i1);
          continue;
          bk localbk3 = localbe.d;
          localbk3.L = i3;
          this.o.c(localbk3, i2, i1);
          continue;
          bk localbk2 = localbe.d;
          localbk2.L = i4;
          this.o.d(localbk2, i2, i1);
          continue;
          bk localbk1 = localbe.d;
          localbk1.L = i3;
          this.o.e(localbk1, i2, i1);
        }
      }
      label616:
      this.o.a(this.o.g, i2, i1, true);
      if (this.e)
      {
        bz localbz = this.o;
        if (localbz.d == null) {
          localbz.d = new ArrayList();
        }
        localbz.d.add(this);
        localbz.j();
      }
      return;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.g >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.g);
    }
    if (this.f != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.f);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bb
 * JD-Core Version:    0.7.0.1
 */