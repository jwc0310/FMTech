import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class bz
  extends bw
  implements mh
{
  private static Interpolator A;
  static boolean a = false;
  private static boolean l;
  private static Interpolator z;
  ArrayList<bk> b;
  ArrayList<bk> c;
  ArrayList<bb> d;
  ArrayList<bb> e;
  ArrayList<Integer> f;
  int g = 0;
  bv h;
  bt i;
  boolean j;
  String k;
  private ArrayList<Runnable> m;
  private Runnable[] n;
  private boolean o;
  private ArrayList<Integer> p;
  private ArrayList<bk> q;
  private ArrayList<by> r;
  private bk s;
  private boolean t;
  private boolean u;
  private boolean v;
  private Bundle w = null;
  private SparseArray<Parcelable> x = null;
  private Runnable y = new ca(this);
  
  static
  {
    int i1 = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i1 >= 11) {
      bool = true;
    }
    l = bool;
    z = new DecelerateInterpolator(2.5F);
    A = new DecelerateInterpolator(1.5F);
    new AccelerateInterpolator(2.5F);
    new AccelerateInterpolator(1.5F);
  }
  
  private static Animation a(float paramFloat1, float paramFloat2)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat1, paramFloat2);
    localAlphaAnimation.setInterpolator(A);
    localAlphaAnimation.setDuration(220L);
    return localAlphaAnimation;
  }
  
  private static Animation a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    localScaleAnimation.setInterpolator(z);
    localScaleAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localScaleAnimation);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat3, paramFloat4);
    localAlphaAnimation.setInterpolator(A);
    localAlphaAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localAlphaAnimation);
    return localAnimationSet;
  }
  
  private Animation a(bk parambk, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    bk.l();
    if (parambk.L != 0)
    {
      Animation localAnimation = AnimationUtils.loadAnimation(this.h.b, parambk.L);
      if (localAnimation != null) {
        return localAnimation;
      }
    }
    if (paramInt1 == 0) {
      return null;
    }
    int i1 = -1;
    switch (paramInt1)
    {
    }
    while (i1 < 0)
    {
      return null;
      if (paramBoolean)
      {
        i1 = 1;
      }
      else
      {
        i1 = 2;
        continue;
        if (paramBoolean)
        {
          i1 = 3;
        }
        else
        {
          i1 = 4;
          continue;
          if (paramBoolean) {
            i1 = 5;
          } else {
            i1 = 6;
          }
        }
      }
    }
    switch (i1)
    {
    default: 
      if ((paramInt2 == 0) && (this.h.e())) {
        paramInt2 = this.h.f();
      }
      if (paramInt2 == 0) {
        return null;
      }
      break;
    case 1: 
      return a(1.125F, 1.0F, 0.0F, 1.0F);
    case 2: 
      return a(1.0F, 0.975F, 1.0F, 0.0F);
    case 3: 
      return a(0.975F, 1.0F, 0.0F, 1.0F);
    case 4: 
      return a(1.0F, 1.075F, 1.0F, 0.0F);
    case 5: 
      return a(0.0F, 1.0F);
    case 6: 
      return a(1.0F, 0.0F);
    }
    return null;
  }
  
  private bk a(Bundle paramBundle, String paramString)
  {
    int i1 = paramBundle.getInt(paramString, -1);
    bk localbk;
    if (i1 == -1) {
      localbk = null;
    }
    do
    {
      return localbk;
      if (i1 >= this.b.size()) {
        a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
      }
      localbk = (bk)this.b.get(i1);
    } while (localbk != null);
    a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
    return localbk;
  }
  
  /* Error */
  private void a(int paramInt, bb parambb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 208	bz:e	Ljava/util/ArrayList;
    //   6: ifnonnull +14 -> 20
    //   9: aload_0
    //   10: new 172	java/util/ArrayList
    //   13: dup
    //   14: invokespecial 209	java/util/ArrayList:<init>	()V
    //   17: putfield 208	bz:e	Ljava/util/ArrayList;
    //   20: aload_0
    //   21: getfield 208	bz:e	Ljava/util/ArrayList;
    //   24: invokevirtual 175	java/util/ArrayList:size	()I
    //   27: istore 4
    //   29: iload_1
    //   30: iload 4
    //   32: if_icmpge +16 -> 48
    //   35: aload_0
    //   36: getfield 208	bz:e	Ljava/util/ArrayList;
    //   39: iload_1
    //   40: aload_2
    //   41: invokevirtual 213	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   44: pop
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: iload 4
    //   50: iload_1
    //   51: if_icmpge +49 -> 100
    //   54: aload_0
    //   55: getfield 208	bz:e	Ljava/util/ArrayList;
    //   58: aconst_null
    //   59: invokevirtual 217	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   62: pop
    //   63: aload_0
    //   64: getfield 219	bz:f	Ljava/util/ArrayList;
    //   67: ifnonnull +14 -> 81
    //   70: aload_0
    //   71: new 172	java/util/ArrayList
    //   74: dup
    //   75: invokespecial 209	java/util/ArrayList:<init>	()V
    //   78: putfield 219	bz:f	Ljava/util/ArrayList;
    //   81: aload_0
    //   82: getfield 219	bz:f	Ljava/util/ArrayList;
    //   85: iload 4
    //   87: invokestatic 225	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   90: invokevirtual 217	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   93: pop
    //   94: iinc 4 1
    //   97: goto -49 -> 48
    //   100: aload_0
    //   101: getfield 208	bz:e	Ljava/util/ArrayList;
    //   104: aload_2
    //   105: invokevirtual 217	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   108: pop
    //   109: goto -64 -> 45
    //   112: astore_3
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_3
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	bz
    //   0	117	1	paramInt	int
    //   0	117	2	parambb	bb
    //   112	4	3	localObject	Object
    //   27	68	4	i1	int
    // Exception table:
    //   from	to	target	type
    //   2	20	112	finally
    //   20	29	112	finally
    //   35	45	112	finally
    //   45	47	112	finally
    //   54	81	112	finally
    //   81	94	112	finally
    //   100	109	112	finally
    //   113	115	112	finally
  }
  
  private final void a(RuntimeException paramRuntimeException)
  {
    Log.e("FragmentManager", paramRuntimeException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter localPrintWriter = new PrintWriter(new ko("FragmentManager"));
    if (this.h != null) {}
    for (;;)
    {
      try
      {
        this.h.a("  ", null, localPrintWriter, new String[0]);
        throw paramRuntimeException;
      }
      catch (Exception localException2)
      {
        Log.e("FragmentManager", "Failed dumping state", localException2);
        continue;
      }
      try
      {
        a("  ", null, localPrintWriter, new String[0]);
      }
      catch (Exception localException1)
      {
        Log.e("FragmentManager", "Failed dumping state", localException1);
      }
    }
  }
  
  static boolean a(View paramView, Animation paramAnimation)
  {
    int i1 = nj.a.c(paramView);
    boolean bool1 = false;
    int i2;
    if (i1 == 0)
    {
      boolean bool2 = nj.a.s(paramView);
      bool1 = false;
      if (bool2)
      {
        if (!(paramAnimation instanceof AlphaAnimation)) {
          break label51;
        }
        i2 = 1;
      }
    }
    for (;;)
    {
      bool1 = false;
      if (i2 != 0) {
        bool1 = true;
      }
      return bool1;
      label51:
      if ((paramAnimation instanceof AnimationSet))
      {
        List localList = ((AnimationSet)paramAnimation).getAnimations();
        for (int i3 = 0;; i3++)
        {
          if (i3 >= localList.size()) {
            break label109;
          }
          if ((localList.get(i3) instanceof AlphaAnimation))
          {
            i2 = 1;
            break;
          }
        }
      }
      label109:
      i2 = 0;
    }
  }
  
  private static void b(View paramView, Animation paramAnimation)
  {
    if ((paramView == null) || (paramAnimation == null)) {}
    while (!a(paramView, paramAnimation)) {
      return;
    }
    paramAnimation.setAnimationListener(new ce(paramView, paramAnimation));
  }
  
  public static int c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 4097: 
      return 8194;
    case 8194: 
      return 4097;
    }
    return 4099;
  }
  
  private void c(bk parambk)
  {
    if (parambk.O == null) {
      return;
    }
    if (this.x == null) {
      this.x = new SparseArray();
    }
    for (;;)
    {
      parambk.O.saveHierarchyState(this.x);
      if (this.x.size() <= 0) {
        break;
      }
      parambk.j = this.x;
      this.x = null;
      return;
      this.x.clear();
    }
  }
  
  private Bundle d(bk parambk)
  {
    if (this.w == null) {
      this.w = new Bundle();
    }
    parambk.g(this.w);
    Bundle localBundle;
    if (!this.w.isEmpty())
    {
      localBundle = this.w;
      this.w = null;
    }
    for (;;)
    {
      if (parambk.N != null) {
        c(parambk);
      }
      if (parambk.j != null)
      {
        if (localBundle == null) {
          localBundle = new Bundle();
        }
        localBundle.putSparseParcelableArray("android:view_state", parambk.j);
      }
      if (!parambk.Q)
      {
        if (localBundle == null) {
          localBundle = new Bundle();
        }
        localBundle.putBoolean("android:user_visible_hint", parambk.Q);
      }
      return localBundle;
      localBundle = null;
    }
  }
  
  private final void n()
  {
    if (this.j) {
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    if (this.k != null) {
      throw new IllegalStateException("Can not perform this action inside of " + this.k);
    }
  }
  
  public final int a(bb parambb)
  {
    try
    {
      if ((this.f == null) || (this.f.size() <= 0))
      {
        if (this.e == null) {
          this.e = new ArrayList();
        }
        int i1 = this.e.size();
        this.e.add(parambb);
        return i1;
      }
      int i2 = ((Integer)this.f.remove(-1 + this.f.size())).intValue();
      this.e.set(i2, parambb);
      return i2;
    }
    finally {}
  }
  
  public final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString)) {
      return null;
    }
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, cf.a);
    if (str1 == null) {}
    for (String str2 = localTypedArray.getString(0);; str2 = str1)
    {
      int i1 = localTypedArray.getResourceId(1, -1);
      String str3 = localTypedArray.getString(2);
      localTypedArray.recycle();
      if (!bk.b(this.h.b, str2)) {
        return null;
      }
      if (paramView != null) {}
      for (int i2 = paramView.getId(); (i2 == -1) && (i1 == -1) && (str3 == null); i2 = 0) {
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
      }
      bk localbk1;
      int i3;
      label239:
      bk localbk2;
      if (i1 != -1)
      {
        localbk1 = a(i1);
        if ((localbk1 == null) && (str3 != null)) {
          localbk1 = a(str3);
        }
        if ((localbk1 == null) && (i2 != -1)) {
          localbk1 = a(i2);
        }
        if (localbk1 != null) {
          break label373;
        }
        bk localbk3 = bk.a(paramContext, str2);
        localbk3.t = true;
        if (i1 == 0) {
          break label366;
        }
        i3 = i1;
        localbk3.B = i3;
        localbk3.C = i2;
        localbk3.D = str3;
        localbk3.u = true;
        localbk3.x = this;
        localbk3.a(paramAttributeSet, localbk3.i);
        a(localbk3, true);
        localbk2 = localbk3;
        label295:
        if ((this.g > 0) || (!localbk2.t)) {
          break label492;
        }
        a(localbk2, 1, 0, 0, false);
      }
      for (;;)
      {
        if (localbk2.N != null) {
          break label508;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
        localbk1 = null;
        break;
        label366:
        i3 = i2;
        break label239;
        label373:
        if (localbk1.u) {
          throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(i1) + ", tag " + str3 + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + str2);
        }
        localbk1.u = true;
        if (!localbk1.H) {
          localbk1.a(paramAttributeSet, localbk1.i);
        }
        localbk2 = localbk1;
        break label295;
        label492:
        a(localbk2, this.g, 0, 0, false);
      }
      label508:
      if (i1 != 0) {
        localbk2.N.setId(i1);
      }
      if (localbk2.N.getTag() == null) {
        localbk2.N.setTag(str3);
      }
      return localbk2.N;
    }
  }
  
  public final bk a(int paramInt)
  {
    bk localbk;
    if (this.c != null) {
      for (int i2 = -1 + this.c.size(); i2 >= 0; i2--)
      {
        localbk = (bk)this.c.get(i2);
        if ((localbk != null) && (localbk.B == paramInt)) {
          return localbk;
        }
      }
    }
    if (this.b != null) {
      for (int i1 = -1 + this.b.size();; i1--)
      {
        if (i1 < 0) {
          break label107;
        }
        localbk = (bk)this.b.get(i1);
        if ((localbk != null) && (localbk.B == paramInt)) {
          break;
        }
      }
    }
    label107:
    return null;
  }
  
  public final bk a(String paramString)
  {
    bk localbk;
    if ((this.c != null) && (paramString != null)) {
      for (int i2 = -1 + this.c.size(); i2 >= 0; i2--)
      {
        localbk = (bk)this.c.get(i2);
        if ((localbk != null) && (paramString.equals(localbk.D))) {
          return localbk;
        }
      }
    }
    if ((this.b != null) && (paramString != null)) {
      for (int i1 = -1 + this.b.size();; i1--)
      {
        if (i1 < 0) {
          break label121;
        }
        localbk = (bk)this.b.get(i1);
        if ((localbk != null) && (paramString.equals(localbk.D))) {
          break;
        }
      }
    }
    label121:
    return null;
  }
  
  public final bn a(bk parambk)
  {
    if (parambk.k < 0) {
      a(new IllegalStateException("Fragment " + parambk + " is not currently in the FragmentManager"));
    }
    int i1 = parambk.f;
    bn localbn = null;
    if (i1 > 0)
    {
      Bundle localBundle = d(parambk);
      localbn = null;
      if (localBundle != null) {
        localbn = new bn(localBundle);
      }
    }
    return localbn;
  }
  
  public final cl a()
  {
    return new bb(this);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      throw new IllegalArgumentException("Bad id: " + paramInt1);
    }
    a(new cc(this, paramInt1, 1), false);
  }
  
  final void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if ((this.h == null) && (paramInt1 != 0)) {
      throw new IllegalStateException("No host");
    }
    if ((!paramBoolean) && (this.g == paramInt1)) {}
    do
    {
      return;
      this.g = paramInt1;
    } while (this.b == null);
    int i1 = 0;
    boolean bool1 = false;
    label54:
    bk localbk;
    if (i1 < this.b.size())
    {
      localbk = (bk)this.b.get(i1);
      if (localbk == null) {
        break label170;
      }
      a(localbk, paramInt1, paramInt2, paramInt3, false);
      if (localbk.R == null) {
        break label170;
      }
    }
    label170:
    for (boolean bool2 = bool1 | localbk.R.a();; bool2 = bool1)
    {
      i1++;
      bool1 = bool2;
      break label54;
      if (!bool1) {
        h();
      }
      if ((!this.t) || (this.h == null) || (this.g != 5)) {
        break;
      }
      this.h.d();
      this.t = false;
      return;
    }
  }
  
  public final void a(Configuration paramConfiguration)
  {
    if (this.c != null) {
      for (int i1 = 0; i1 < this.c.size(); i1++)
      {
        bk localbk = (bk)this.c.get(i1);
        if (localbk != null)
        {
          localbk.onConfigurationChanged(paramConfiguration);
          if (localbk.z != null) {
            localbk.z.a(paramConfiguration);
          }
        }
      }
    }
  }
  
  final void a(Parcelable paramParcelable, List<bk> paramList)
  {
    int i1 = 0;
    if (paramParcelable == null) {}
    for (;;)
    {
      return;
      cg localcg = (cg)paramParcelable;
      if (localcg.a != null)
      {
        if (paramList != null) {
          for (int i5 = 0; i5 < paramList.size(); i5++)
          {
            bk localbk5 = (bk)paramList.get(i5);
            cj localcj2 = localcg.a[localbk5.k];
            localcj2.k = localbk5;
            localbk5.j = null;
            localbk5.w = 0;
            localbk5.u = false;
            localbk5.q = false;
            localbk5.n = null;
            if (localcj2.j != null)
            {
              localcj2.j.setClassLoader(this.h.b.getClassLoader());
              localbk5.j = localcj2.j.getSparseParcelableArray("android:view_state");
              localbk5.i = localcj2.j;
            }
          }
        }
        this.b = new ArrayList(localcg.a.length);
        if (this.p != null) {
          this.p.clear();
        }
        int i2 = 0;
        if (i2 < localcg.a.length)
        {
          cj localcj1 = localcg.a[i2];
          bv localbv;
          bk localbk3;
          bk localbk4;
          if (localcj1 != null)
          {
            localbv = this.h;
            localbk3 = this.s;
            if (localcj1.k != null)
            {
              localbk4 = localcj1.k;
              label247:
              this.b.add(localbk4);
              localcj1.k = null;
            }
          }
          for (;;)
          {
            i2++;
            break;
            Context localContext = localbv.b;
            if (localcj1.i != null) {
              localcj1.i.setClassLoader(localContext.getClassLoader());
            }
            localcj1.k = bk.a(localContext, localcj1.a, localcj1.i);
            if (localcj1.j != null)
            {
              localcj1.j.setClassLoader(localContext.getClassLoader());
              localcj1.k.i = localcj1.j;
            }
            localcj1.k.a(localcj1.b, localbk3);
            localcj1.k.t = localcj1.c;
            localcj1.k.v = true;
            localcj1.k.B = localcj1.d;
            localcj1.k.C = localcj1.e;
            localcj1.k.D = localcj1.f;
            localcj1.k.G = localcj1.g;
            localcj1.k.F = localcj1.h;
            localcj1.k.x = localbv.d;
            localbk4 = localcj1.k;
            break label247;
            this.b.add(null);
            if (this.p == null) {
              this.p = new ArrayList();
            }
            this.p.add(Integer.valueOf(i2));
          }
        }
        if (paramList != null)
        {
          int i4 = 0;
          if (i4 < paramList.size())
          {
            bk localbk2 = (bk)paramList.get(i4);
            if (localbk2.o >= 0) {
              if (localbk2.o >= this.b.size()) {
                break label603;
              }
            }
            for (localbk2.n = ((bk)this.b.get(localbk2.o));; localbk2.n = null)
            {
              i4++;
              break;
              label603:
              new StringBuilder("Re-attaching retained fragment ").append(localbk2).append(" target no longer exists: ").append(localbk2.o);
            }
          }
        }
        if (localcg.b != null)
        {
          this.c = new ArrayList(localcg.b.length);
          for (int i3 = 0; i3 < localcg.b.length; i3++)
          {
            bk localbk1 = (bk)this.b.get(localcg.b[i3]);
            if (localbk1 == null) {
              a(new IllegalStateException("No instantiated fragment for index #" + localcg.b[i3]));
            }
            localbk1.q = true;
            if (this.c.contains(localbk1)) {
              throw new IllegalStateException("Already added!");
            }
            this.c.add(localbk1);
          }
        }
        this.c = null;
        if (localcg.c == null) {
          break;
        }
        this.d = new ArrayList(localcg.c.length);
        while (i1 < localcg.c.length)
        {
          bb localbb = localcg.c[i1].a(this);
          this.d.add(localbb);
          if (localbb.g >= 0) {
            a(localbb.g, localbb);
          }
          i1++;
        }
      }
    }
    this.d = null;
  }
  
  public final void a(bk parambk, int paramInt1, int paramInt2)
  {
    int i1;
    int i2;
    if (parambk.w > 0)
    {
      i1 = 1;
      if (i1 != 0) {
        break label100;
      }
      i2 = 1;
      label18:
      if ((!parambk.F) || (i2 != 0))
      {
        if (this.c != null) {
          this.c.remove(parambk);
        }
        if ((parambk.I) && (parambk.J)) {
          this.t = true;
        }
        parambk.q = false;
        parambk.r = true;
        if (i2 == 0) {
          break label106;
        }
      }
    }
    label100:
    label106:
    for (int i3 = 0;; i3 = 1)
    {
      a(parambk, i3, paramInt1, paramInt2, false);
      return;
      i1 = 0;
      break;
      i2 = 0;
      break label18;
    }
  }
  
  final void a(bk parambk, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (((!parambk.q) || (parambk.F)) && (paramInt1 > 1)) {
      paramInt1 = 1;
    }
    if ((parambk.r) && (paramInt1 > parambk.f)) {
      paramInt1 = parambk.f;
    }
    if ((parambk.P) && (parambk.f < 4) && (paramInt1 > 3)) {
      paramInt1 = 3;
    }
    label387:
    label399:
    ViewGroup localViewGroup;
    if (parambk.f < paramInt1)
    {
      if ((parambk.t) && (!parambk.u)) {
        return;
      }
      if (parambk.g != null)
      {
        parambk.g = null;
        a(parambk, parambk.h, 0, 0, true);
      }
      switch (parambk.f)
      {
      default: 
        parambk.f = paramInt1;
        return;
      case 0: 
        if (parambk.i != null)
        {
          parambk.i.setClassLoader(this.h.b.getClassLoader());
          parambk.j = parambk.i.getSparseParcelableArray("android:view_state");
          parambk.n = a(parambk.i, "android:target_state");
          if (parambk.n != null) {
            parambk.p = parambk.i.getInt("android:target_req_state", 0);
          }
          parambk.Q = parambk.i.getBoolean("android:user_visible_hint", true);
          if (!parambk.Q)
          {
            parambk.P = true;
            if (paramInt1 > 3) {
              paramInt1 = 3;
            }
          }
        }
        parambk.y = this.h;
        parambk.A = this.s;
        bz localbz4;
        if (this.s != null)
        {
          localbz4 = this.s.z;
          parambk.x = localbz4;
          parambk.K = false;
          parambk.K = true;
          if (parambk.y != null) {
            break label387;
          }
        }
        for (Activity localActivity = null;; localActivity = parambk.y.a)
        {
          if (localActivity != null)
          {
            parambk.K = false;
            parambk.a(localActivity);
          }
          if (parambk.K) {
            break label399;
          }
          throw new fd("Fragment " + parambk + " did not call through to super.onAttach()");
          localbz4 = this.h.d;
          break;
        }
        if (parambk.A == null) {
          this.h.a(parambk);
        }
        if (!parambk.H)
        {
          Bundle localBundle2 = parambk.i;
          if (parambk.z != null) {
            parambk.z.noteStateNotSaved();
          }
          parambk.K = false;
          parambk.a(localBundle2);
          if (!parambk.K) {
            throw new fd("Fragment " + parambk + " did not call through to super.onCreate()");
          }
          if (localBundle2 != null)
          {
            Parcelable localParcelable = localBundle2.getParcelable("android:support:fragments");
            if (localParcelable != null)
            {
              if (parambk.z == null) {
                parambk.q();
              }
              parambk.z.a(localParcelable, null);
              bz localbz5 = parambk.z;
              localbz5.j = false;
              localbz5.a(1, 0, 0, false);
            }
          }
        }
        parambk.H = false;
        if (parambk.t)
        {
          parambk.N = parambk.b(parambk.a_(parambk.i), null, parambk.i);
          if (parambk.N == null) {
            break label987;
          }
          parambk.O = parambk.N;
          if (Build.VERSION.SDK_INT < 11) {
            break label973;
          }
          View localView3 = parambk.N;
          nj.a.a(localView3, false);
          if (parambk.E) {
            parambk.N.setVisibility(8);
          }
          parambk.a(parambk.N, parambk.i);
        }
      case 1: 
        label651:
        if (paramInt1 > 1) {
          if (!parambk.t)
          {
            if (parambk.C == 0) {
              break label1991;
            }
            localViewGroup = (ViewGroup)this.i.a(parambk.C);
            if ((localViewGroup == null) && (!parambk.v)) {
              a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(parambk.C) + " (" + parambk.g().getResourceName(parambk.C) + ") for fragment " + parambk));
            }
          }
        }
        break;
      }
    }
    for (;;)
    {
      parambk.M = localViewGroup;
      parambk.N = parambk.b(parambk.a_(parambk.i), localViewGroup, parambk.i);
      if (parambk.N != null)
      {
        parambk.O = parambk.N;
        if (Build.VERSION.SDK_INT >= 11)
        {
          View localView2 = parambk.N;
          nj.a.a(localView2, false);
          label828:
          if (localViewGroup != null)
          {
            Animation localAnimation2 = a(parambk, paramInt2, true, paramInt3);
            if (localAnimation2 != null)
            {
              b(parambk.N, localAnimation2);
              parambk.N.startAnimation(localAnimation2);
            }
            localViewGroup.addView(parambk.N);
          }
          if (parambk.E) {
            parambk.N.setVisibility(8);
          }
          parambk.a(parambk.N, parambk.i);
        }
      }
      for (;;)
      {
        Bundle localBundle1 = parambk.i;
        if (parambk.z != null) {
          parambk.z.noteStateNotSaved();
        }
        parambk.K = false;
        parambk.d(localBundle1);
        if (parambk.K) {
          break label1017;
        }
        throw new fd("Fragment " + parambk + " did not call through to super.onActivityCreated()");
        label973:
        parambk.N = dc.a(parambk.N);
        break;
        label987:
        parambk.O = null;
        break label651;
        parambk.N = dc.a(parambk.N);
        break label828;
        parambk.O = null;
      }
      label1017:
      if (parambk.z != null)
      {
        bz localbz3 = parambk.z;
        localbz3.j = false;
        localbz3.a(2, 0, 0, false);
      }
      if (parambk.N != null)
      {
        if (parambk.j != null)
        {
          parambk.O.restoreHierarchyState(parambk.j);
          parambk.j = null;
        }
        parambk.K = false;
        parambk.K = true;
        if (!parambk.K) {
          throw new fd("Fragment " + parambk + " did not call through to super.onViewStateRestored()");
        }
      }
      parambk.i = null;
      if (paramInt1 > 3)
      {
        if (parambk.z != null)
        {
          parambk.z.noteStateNotSaved();
          parambk.z.i();
        }
        parambk.K = false;
        parambk.p_();
        if (!parambk.K) {
          throw new fd("Fragment " + parambk + " did not call through to super.onStart()");
        }
        if (parambk.z != null)
        {
          bz localbz2 = parambk.z;
          localbz2.j = false;
          localbz2.a(4, 0, 0, false);
        }
        if (parambk.R != null) {
          parambk.R.f();
        }
      }
      if (paramInt1 <= 4) {
        break;
      }
      parambk.s = true;
      if (parambk.z != null)
      {
        parambk.z.noteStateNotSaved();
        parambk.z.i();
      }
      parambk.K = false;
      parambk.m();
      if (!parambk.K) {
        throw new fd("Fragment " + parambk + " did not call through to super.onResume()");
      }
      if (parambk.z != null)
      {
        bz localbz1 = parambk.z;
        localbz1.j = false;
        localbz1.a(5, 0, 0, false);
        parambk.z.i();
      }
      parambk.i = null;
      parambk.j = null;
      break;
      if (parambk.f <= paramInt1) {
        break;
      }
      switch (parambk.f)
      {
      default: 
        break;
      case 1: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
        label1427:
        do
        {
          if (paramInt1 > 0) {
            break;
          }
          if ((this.u) && (parambk.g != null))
          {
            View localView1 = parambk.g;
            parambk.g = null;
            localView1.clearAnimation();
          }
          if (parambk.g == null) {
            break label1663;
          }
          parambk.h = paramInt1;
          paramInt1 = 1;
          break;
          if (paramInt1 < 5)
          {
            parambk.r();
            parambk.s = false;
          }
          if (paramInt1 < 4) {
            parambk.s();
          }
          if (paramInt1 < 3) {
            parambk.t();
          }
        } while (paramInt1 >= 2);
        if ((parambk.N != null) && (this.h.b()) && (parambk.j == null)) {
          c(parambk);
        }
        parambk.u();
        if ((parambk.N != null) && (parambk.M != null)) {
          if ((this.g <= 0) || (this.u)) {
            break label1985;
          }
        }
        label1985:
        for (Animation localAnimation1 = a(parambk, paramInt2, false, paramInt3);; localAnimation1 = null)
        {
          if (localAnimation1 != null)
          {
            parambk.g = parambk.N;
            parambk.h = paramInt1;
            localAnimation1.setAnimationListener(new cd(this, parambk.N, localAnimation1, parambk));
            parambk.N.startAnimation(localAnimation1);
          }
          parambk.M.removeView(parambk.N);
          parambk.M = null;
          parambk.N = null;
          parambk.O = null;
          break label1427;
          label1663:
          if (!parambk.H)
          {
            if (parambk.z != null) {
              parambk.z.l();
            }
            parambk.K = false;
            parambk.o();
            if (!parambk.K) {
              throw new fd("Fragment " + parambk + " did not call through to super.onDestroy()");
            }
          }
          parambk.K = false;
          parambk.f_();
          if (!parambk.K) {
            throw new fd("Fragment " + parambk + " did not call through to super.onDetach()");
          }
          if (paramBoolean) {
            break;
          }
          if (!parambk.H)
          {
            if (parambk.k < 0) {
              break;
            }
            this.b.set(parambk.k, null);
            if (this.p == null) {
              this.p = new ArrayList();
            }
            this.p.add(Integer.valueOf(parambk.k));
            this.h.a(parambk.l);
            parambk.k = -1;
            parambk.l = null;
            parambk.q = false;
            parambk.r = false;
            parambk.s = false;
            parambk.t = false;
            parambk.u = false;
            parambk.v = false;
            parambk.w = 0;
            parambk.x = null;
            parambk.z = null;
            parambk.y = null;
            parambk.B = 0;
            parambk.C = 0;
            parambk.D = null;
            parambk.E = false;
            parambk.F = false;
            parambk.H = false;
            parambk.R = null;
            parambk.S = false;
            parambk.T = false;
            break;
          }
          parambk.y = null;
          parambk.A = null;
          parambk.x = null;
          parambk.z = null;
          break;
        }
        label1991:
        localViewGroup = null;
      }
    }
  }
  
  public final void a(bk parambk, boolean paramBoolean)
  {
    if (this.c == null) {
      this.c = new ArrayList();
    }
    if (parambk.k < 0)
    {
      if ((this.p != null) && (this.p.size() > 0)) {
        break label127;
      }
      if (this.b == null) {
        this.b = new ArrayList();
      }
      parambk.a(this.b.size(), this.s);
      this.b.add(parambk);
    }
    while (!parambk.F) {
      if (this.c.contains(parambk))
      {
        throw new IllegalStateException("Fragment already added: " + parambk);
        label127:
        parambk.a(((Integer)this.p.remove(-1 + this.p.size())).intValue(), this.s);
        this.b.set(parambk.k, parambk);
      }
      else
      {
        this.c.add(parambk);
        parambk.q = true;
        parambk.r = false;
        if ((parambk.I) && (parambk.J)) {
          this.t = true;
        }
        if (paramBoolean) {
          a(parambk, this.g, 0, 0, false);
        }
      }
    }
  }
  
  public final void a(bv parambv, bt parambt, bk parambk)
  {
    if (this.h != null) {
      throw new IllegalStateException("Already attached");
    }
    this.h = parambv;
    this.i = parambt;
    this.s = parambk;
  }
  
  public final void a(by paramby)
  {
    if (this.r == null) {
      this.r = new ArrayList();
    }
    this.r.add(paramby);
  }
  
  /* Error */
  public final void a(Runnable paramRunnable, boolean paramBoolean)
  {
    // Byte code:
    //   0: iload_2
    //   1: ifne +7 -> 8
    //   4: aload_0
    //   5: invokespecial 842	bz:n	()V
    //   8: aload_0
    //   9: monitorenter
    //   10: aload_0
    //   11: getfield 790	bz:u	Z
    //   14: ifne +10 -> 24
    //   17: aload_0
    //   18: getfield 137	bz:h	Lbv;
    //   21: ifnonnull +19 -> 40
    //   24: new 177	java/lang/IllegalStateException
    //   27: dup
    //   28: ldc_w 844
    //   31: invokespecial 198	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   34: athrow
    //   35: astore_3
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_3
    //   39: athrow
    //   40: aload_0
    //   41: getfield 846	bz:m	Ljava/util/ArrayList;
    //   44: ifnonnull +14 -> 58
    //   47: aload_0
    //   48: new 172	java/util/ArrayList
    //   51: dup
    //   52: invokespecial 209	java/util/ArrayList:<init>	()V
    //   55: putfield 846	bz:m	Ljava/util/ArrayList;
    //   58: aload_0
    //   59: getfield 846	bz:m	Ljava/util/ArrayList;
    //   62: aload_1
    //   63: invokevirtual 217	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   66: pop
    //   67: aload_0
    //   68: getfield 846	bz:m	Ljava/util/ArrayList;
    //   71: invokevirtual 175	java/util/ArrayList:size	()I
    //   74: iconst_1
    //   75: if_icmpne +32 -> 107
    //   78: aload_0
    //   79: getfield 137	bz:h	Lbv;
    //   82: getfield 849	bv:c	Landroid/os/Handler;
    //   85: aload_0
    //   86: getfield 92	bz:y	Ljava/lang/Runnable;
    //   89: invokevirtual 855	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   92: aload_0
    //   93: getfield 137	bz:h	Lbv;
    //   96: getfield 849	bv:c	Landroid/os/Handler;
    //   99: aload_0
    //   100: getfield 92	bz:y	Ljava/lang/Runnable;
    //   103: invokevirtual 859	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   106: pop
    //   107: aload_0
    //   108: monitorexit
    //   109: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	this	bz
    //   0	110	1	paramRunnable	Runnable
    //   0	110	2	paramBoolean	boolean
    //   35	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   10	24	35	finally
    //   24	35	35	finally
    //   36	38	35	finally
    //   40	58	35	finally
    //   58	107	35	finally
    //   107	109	35	finally
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i1 = 0;
    String str = paramString + "    ";
    if (this.b != null)
    {
      int i11 = this.b.size();
      if (i11 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        for (int i12 = 0; i12 < i11; i12++)
        {
          bk localbk3 = (bk)this.b.get(i12);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i12);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localbk3);
          if (localbk3 != null) {
            localbk3.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          }
        }
      }
    }
    if (this.c != null)
    {
      int i9 = this.c.size();
      if (i9 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Added Fragments:");
        for (int i10 = 0; i10 < i9; i10++)
        {
          bk localbk2 = (bk)this.c.get(i10);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i10);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localbk2.toString());
        }
      }
    }
    if (this.q != null)
    {
      int i7 = this.q.size();
      if (i7 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        for (int i8 = 0; i8 < i7; i8++)
        {
          bk localbk1 = (bk)this.q.get(i8);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i8);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localbk1.toString());
        }
      }
    }
    if (this.d != null)
    {
      int i5 = this.d.size();
      if (i5 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        for (int i6 = 0; i6 < i5; i6++)
        {
          bb localbb2 = (bb)this.d.get(i6);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i6);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localbb2.toString());
          localbb2.a(str, paramPrintWriter);
        }
      }
    }
    try
    {
      if (this.e != null)
      {
        int i3 = this.e.size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          for (int i4 = 0; i4 < i3; i4++)
          {
            bb localbb1 = (bb)this.e.get(i4);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i4);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(localbb1);
          }
        }
      }
      if ((this.f != null) && (this.f.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(this.f.toArray()));
      }
      if (this.m != null)
      {
        int i2 = this.m.size();
        if (i2 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Pending Actions:");
          while (i1 < i2)
          {
            Runnable localRunnable = (Runnable)this.m.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(localRunnable);
            i1++;
          }
        }
      }
      paramPrintWriter.print(paramString);
    }
    finally {}
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mHost=");
    paramPrintWriter.println(this.h);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    paramPrintWriter.println(this.i);
    if (this.s != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      paramPrintWriter.println(this.s);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    paramPrintWriter.print(this.g);
    paramPrintWriter.print(" mStateSaved=");
    paramPrintWriter.print(this.j);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.u);
    if (this.t)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNeedMenuInvalidate=");
      paramPrintWriter.println(this.t);
    }
    if (this.k != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      paramPrintWriter.println(this.k);
    }
    if ((this.p != null) && (this.p.size() > 0))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mAvailIndices: ");
      paramPrintWriter.println(Arrays.toString(this.p.toArray()));
    }
  }
  
  public final boolean a(Menu paramMenu)
  {
    int i1;
    boolean bool1;
    boolean bool2;
    if (this.c != null)
    {
      i1 = 0;
      bool1 = false;
      if (i1 >= this.c.size()) {
        break label110;
      }
      bk localbk = (bk)this.c.get(i1);
      if (localbk != null)
      {
        if (localbk.E) {
          break label118;
        }
        if ((!localbk.I) || (!localbk.J)) {
          break label112;
        }
        localbk.a(paramMenu);
        bool2 = true;
        label73:
        if (localbk.z != null) {
          bool2 |= localbk.z.a(paramMenu);
        }
      }
    }
    for (;;)
    {
      if (bool2) {
        bool1 = true;
      }
      i1++;
      break;
      bool1 = false;
      label110:
      return bool1;
      label112:
      bool2 = false;
      break label73;
      label118:
      bool2 = false;
    }
  }
  
  public final boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    ArrayList localArrayList1 = null;
    int i2;
    boolean bool1;
    bk localbk2;
    boolean bool3;
    if (this.c != null)
    {
      i2 = 0;
      bool1 = false;
      if (i2 >= this.c.size()) {
        break label143;
      }
      localbk2 = (bk)this.c.get(i2);
      if (localbk2 == null) {
        break label213;
      }
      if (localbk2.E) {
        break label226;
      }
      if ((!localbk2.I) || (!localbk2.J)) {
        break label220;
      }
      localbk2.a(paramMenu, paramMenuInflater);
      bool3 = true;
      label80:
      if (localbk2.z != null) {
        bool3 |= localbk2.z.a(paramMenu, paramMenuInflater);
      }
    }
    for (;;)
    {
      if (bool3)
      {
        if (localArrayList1 == null) {
          localArrayList1 = new ArrayList();
        }
        localArrayList1.add(localbk2);
      }
      label143:
      label213:
      for (boolean bool2 = true;; bool2 = bool1)
      {
        i2++;
        bool1 = bool2;
        break;
        bool1 = false;
        ArrayList localArrayList2 = this.q;
        int i1 = 0;
        if (localArrayList2 != null) {
          while (i1 < this.q.size())
          {
            bk localbk1 = (bk)this.q.get(i1);
            if ((localArrayList1 == null) || (!localArrayList1.contains(localbk1))) {
              bk.p();
            }
            i1++;
          }
        }
        this.q = localArrayList1;
        return bool1;
      }
      label220:
      bool3 = false;
      break label80;
      label226:
      bool3 = false;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    ArrayList localArrayList = this.c;
    boolean bool = false;
    if (localArrayList != null) {}
    for (int i1 = 0;; i1++)
    {
      int i2 = this.c.size();
      bool = false;
      bk localbk;
      int i3;
      if (i1 < i2)
      {
        localbk = (bk)this.c.get(i1);
        if (localbk == null) {
          continue;
        }
        if (localbk.E) {
          break label122;
        }
        if ((!localbk.I) || (!localbk.J) || (!localbk.a_(paramMenuItem))) {
          break label96;
        }
        i3 = 1;
      }
      while (i3 != 0)
      {
        bool = true;
        return bool;
        label96:
        if ((localbk.z != null) && (localbk.z.a(paramMenuItem))) {
          i3 = 1;
        } else {
          label122:
          i3 = 0;
        }
      }
    }
  }
  
  final boolean a(String paramString, int paramInt1, int paramInt2)
  {
    if (this.d == null) {}
    int i1;
    do
    {
      int i6;
      do
      {
        int i7;
        do
        {
          return false;
          if ((paramInt1 >= 0) || ((paramInt2 & 0x1) != 0)) {
            break;
          }
          i7 = -1 + this.d.size();
        } while (i7 < 0);
        bb localbb4 = (bb)this.d.remove(i7);
        SparseArray localSparseArray3 = new SparseArray();
        SparseArray localSparseArray4 = new SparseArray();
        localbb4.a(localSparseArray3, localSparseArray4);
        localbb4.a(true, null, localSparseArray3, localSparseArray4);
        j();
        return true;
        i1 = -1;
        if (paramInt1 < 0) {
          break;
        }
        for (i6 = -1 + this.d.size(); i6 >= 0; i6--)
        {
          bb localbb3 = (bb)this.d.get(i6);
          if ((paramInt1 >= 0) && (paramInt1 == localbb3.g)) {
            break;
          }
        }
      } while (i6 < 0);
      if ((paramInt2 & 0x1) != 0)
      {
        i6--;
        while (i6 >= 0)
        {
          bb localbb2 = (bb)this.d.get(i6);
          if ((paramInt1 < 0) || (paramInt1 != localbb2.g)) {
            break;
          }
          i6--;
        }
      }
      i1 = i6;
    } while (i1 == -1 + this.d.size());
    ArrayList localArrayList = new ArrayList();
    for (int i2 = -1 + this.d.size(); i2 > i1; i2--) {
      localArrayList.add(this.d.remove(i2));
    }
    int i3 = -1 + localArrayList.size();
    SparseArray localSparseArray1 = new SparseArray();
    SparseArray localSparseArray2 = new SparseArray();
    for (int i4 = 0; i4 <= i3; i4++) {
      ((bb)localArrayList.get(i4)).a(localSparseArray1, localSparseArray2);
    }
    Object localObject = null;
    int i5 = 0;
    label334:
    bb localbb1;
    if (i5 <= i3)
    {
      localbb1 = (bb)localArrayList.get(i5);
      if (i5 != i3) {
        break label388;
      }
    }
    label388:
    for (boolean bool = true;; bool = false)
    {
      rhn localrhn = localbb1.a(bool, (rhn)localObject, localSparseArray1, localSparseArray2);
      i5++;
      localObject = localrhn;
      break label334;
      break;
    }
  }
  
  public final bx b(int paramInt)
  {
    return (bx)this.d.get(paramInt);
  }
  
  public final void b(Menu paramMenu)
  {
    if (this.c != null) {
      for (int i1 = 0; i1 < this.c.size(); i1++)
      {
        bk localbk = (bk)this.c.get(i1);
        if ((localbk != null) && (!localbk.E) && (localbk.z != null)) {
          localbk.z.b(paramMenu);
        }
      }
    }
  }
  
  public final void b(bk parambk)
  {
    if (parambk.P)
    {
      if (this.o) {
        this.v = true;
      }
    }
    else {
      return;
    }
    parambk.P = false;
    a(parambk, this.g, 0, 0, false);
  }
  
  public final void b(bk parambk, int paramInt1, int paramInt2)
  {
    if (!parambk.E)
    {
      parambk.E = true;
      if (parambk.N != null)
      {
        Animation localAnimation = a(parambk, paramInt1, false, paramInt2);
        if (localAnimation != null)
        {
          b(parambk.N, localAnimation);
          parambk.N.startAnimation(localAnimation);
        }
        parambk.N.setVisibility(8);
      }
      if ((parambk.q) && (parambk.I) && (parambk.J)) {
        this.t = true;
      }
      bk.j();
    }
  }
  
  public final void b(by paramby)
  {
    if (this.r != null) {
      this.r.remove(paramby);
    }
  }
  
  public final boolean b()
  {
    return i();
  }
  
  public final boolean b(MenuItem paramMenuItem)
  {
    ArrayList localArrayList = this.c;
    boolean bool = false;
    if (localArrayList != null) {}
    for (int i1 = 0;; i1++)
    {
      int i2 = this.c.size();
      bool = false;
      bk localbk;
      int i3;
      if (i1 < i2)
      {
        localbk = (bk)this.c.get(i1);
        if (localbk == null) {
          continue;
        }
        if (localbk.E) {
          break label106;
        }
        if (!localbk.b(paramMenuItem)) {
          break label80;
        }
        i3 = 1;
      }
      while (i3 != 0)
      {
        bool = true;
        return bool;
        label80:
        if ((localbk.z != null) && (localbk.z.b(paramMenuItem))) {
          i3 = 1;
        } else {
          label106:
          i3 = 0;
        }
      }
    }
  }
  
  public final void c()
  {
    a(new cb(this), false);
  }
  
  public final void c(bk parambk, int paramInt1, int paramInt2)
  {
    if (parambk.E)
    {
      parambk.E = false;
      if (parambk.N != null)
      {
        Animation localAnimation = a(parambk, paramInt1, true, paramInt2);
        if (localAnimation != null)
        {
          b(parambk.N, localAnimation);
          parambk.N.startAnimation(localAnimation);
        }
        parambk.N.setVisibility(0);
      }
      if ((parambk.q) && (parambk.I) && (parambk.J)) {
        this.t = true;
      }
      bk.j();
    }
  }
  
  public final void d(bk parambk, int paramInt1, int paramInt2)
  {
    if (!parambk.F)
    {
      parambk.F = true;
      if (parambk.q)
      {
        if (this.c != null) {
          this.c.remove(parambk);
        }
        if ((parambk.I) && (parambk.J)) {
          this.t = true;
        }
        parambk.q = false;
        a(parambk, 1, paramInt1, paramInt2, false);
      }
    }
  }
  
  public final boolean d()
  {
    n();
    i();
    return a(null, -1, 0);
  }
  
  public final int e()
  {
    if (this.d != null) {
      return this.d.size();
    }
    return 0;
  }
  
  public final void e(bk parambk, int paramInt1, int paramInt2)
  {
    if (parambk.F)
    {
      parambk.F = false;
      if (!parambk.q)
      {
        if (this.c == null) {
          this.c = new ArrayList();
        }
        if (this.c.contains(parambk)) {
          throw new IllegalStateException("Fragment already added: " + parambk);
        }
        this.c.add(parambk);
        parambk.q = true;
        if ((parambk.I) && (parambk.J)) {
          this.t = true;
        }
        a(parambk, this.g, paramInt1, paramInt2, false);
      }
    }
  }
  
  public final List<bk> f()
  {
    return this.b;
  }
  
  public final boolean g()
  {
    return this.u;
  }
  
  final void h()
  {
    if (this.b == null) {}
    for (;;)
    {
      return;
      for (int i1 = 0; i1 < this.b.size(); i1++)
      {
        bk localbk = (bk)this.b.get(i1);
        if (localbk != null) {
          b(localbk);
        }
      }
    }
  }
  
  public final boolean i()
  {
    if (this.o) {
      throw new IllegalStateException("Recursive entry to executePendingTransactions");
    }
    if (Looper.myLooper() != this.h.c.getLooper()) {
      throw new IllegalStateException("Must be called from main thread of process");
    }
    boolean bool2;
    for (boolean bool1 = false;; bool1 = true) {
      try
      {
        if ((this.m == null) || (this.m.size() == 0))
        {
          if (!this.v) {
            return bool1;
          }
          int i1 = 0;
          bool2 = false;
          while (i1 < this.b.size())
          {
            bk localbk = (bk)this.b.get(i1);
            if ((localbk != null) && (localbk.R != null)) {
              bool2 |= localbk.R.a();
            }
            i1++;
          }
        }
        int i2 = this.m.size();
        if ((this.n == null) || (this.n.length < i2)) {
          this.n = new Runnable[i2];
        }
        this.m.toArray(this.n);
        this.m.clear();
        this.h.c.removeCallbacks(this.y);
        this.o = true;
        for (int i3 = 0; i3 < i2; i3++)
        {
          this.n[i3].run();
          this.n[i3] = null;
        }
        this.o = false;
      }
      finally {}
    }
    if (!bool2)
    {
      this.v = false;
      h();
    }
    return bool1;
  }
  
  final void j()
  {
    if (this.r != null) {
      for (int i1 = 0; i1 < this.r.size(); i1++) {
        ((by)this.r.get(i1)).P_();
      }
    }
  }
  
  final Parcelable k()
  {
    i();
    if (l) {
      this.j = true;
    }
    if ((this.b == null) || (this.b.size() <= 0)) {
      return null;
    }
    int i1 = this.b.size();
    cj[] arrayOfcj = new cj[i1];
    int i2 = 0;
    int i3 = 0;
    label54:
    bk localbk1;
    cj localcj;
    int i8;
    if (i2 < i1)
    {
      localbk1 = (bk)this.b.get(i2);
      if (localbk1 == null) {
        break label618;
      }
      if (localbk1.k < 0) {
        a(new IllegalStateException("Failure saving state: active " + localbk1 + " has cleared index: " + localbk1.k));
      }
      localcj = new cj(localbk1);
      arrayOfcj[i2] = localcj;
      if ((localbk1.f > 0) && (localcj.j == null))
      {
        localcj.j = d(localbk1);
        if (localbk1.n == null) {
          break label373;
        }
        if (localbk1.n.k < 0) {
          a(new IllegalStateException("Failure saving state: " + localbk1 + " has target not in fragment manager: " + localbk1.n));
        }
        if (localcj.j == null) {
          localcj.j = new Bundle();
        }
        Bundle localBundle = localcj.j;
        bk localbk2 = localbk1.n;
        if (localbk2.k < 0) {
          a(new IllegalStateException("Fragment " + localbk2 + " is not currently in the FragmentManager"));
        }
        localBundle.putInt("android:target_state", localbk2.k);
        if (localbk1.p == 0) {
          break label373;
        }
        localcj.j.putInt("android:target_req_state", localbk1.p);
        i8 = 1;
      }
    }
    for (;;)
    {
      i2++;
      i3 = i8;
      break label54;
      localcj.j = localbk1.i;
      label373:
      i8 = 1;
      continue;
      if (i3 == 0) {
        break;
      }
      if (this.c != null)
      {
        int i6 = this.c.size();
        if (i6 > 0)
        {
          arrayOfInt = new int[i6];
          for (int i7 = 0; i7 < i6; i7++)
          {
            arrayOfInt[i7] = ((bk)this.c.get(i7)).k;
            if (arrayOfInt[i7] < 0) {
              a(new IllegalStateException("Failure saving state: active " + this.c.get(i7) + " has cleared index: " + arrayOfInt[i7]));
            }
          }
        }
      }
      int[] arrayOfInt = null;
      ArrayList localArrayList = this.d;
      bf[] arrayOfbf = null;
      if (localArrayList != null)
      {
        int i4 = this.d.size();
        arrayOfbf = null;
        if (i4 > 0)
        {
          arrayOfbf = new bf[i4];
          for (int i5 = 0; i5 < i4; i5++) {
            arrayOfbf[i5] = new bf((bb)this.d.get(i5));
          }
        }
      }
      cg localcg = new cg();
      localcg.a = arrayOfcj;
      localcg.b = arrayOfInt;
      localcg.c = arrayOfbf;
      return localcg;
      label618:
      i8 = i3;
    }
  }
  
  public final void l()
  {
    this.u = true;
    i();
    a(0, 0, 0, false);
    this.h = null;
    this.i = null;
    this.s = null;
  }
  
  public final void m()
  {
    if (this.c != null) {
      for (int i1 = 0; i1 < this.c.size(); i1++)
      {
        bk localbk = (bk)this.c.get(i1);
        if (localbk != null)
        {
          localbk.onLowMemory();
          if (localbk.z != null) {
            localbk.z.m();
          }
        }
      }
    }
  }
  
  public final void noteStateNotSaved()
  {
    this.j = false;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    if (this.s != null) {
      efj.a(this.s, localStringBuilder);
    }
    for (;;)
    {
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
      efj.a(this.h, localStringBuilder);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bz
 * JD-Core Version:    0.7.0.1
 */