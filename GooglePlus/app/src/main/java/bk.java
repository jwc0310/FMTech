import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class bk
  implements ComponentCallbacks, View.OnCreateContextMenuListener
{
  private static final la<String, Class<?>> a = new la();
  static final Object e = new Object();
  public bk A;
  public int B;
  int C;
  public String D;
  boolean E;
  public boolean F;
  boolean G;
  boolean H;
  boolean I;
  boolean J = true;
  boolean K;
  int L;
  ViewGroup M;
  public View N;
  View O;
  boolean P;
  boolean Q = true;
  cx R;
  boolean S;
  boolean T;
  Object U = e;
  Object V = e;
  Object W = e;
  fc X = null;
  fc Y = null;
  private Object b = null;
  private Object c = null;
  private Object d = null;
  int f = 0;
  View g;
  int h;
  Bundle i;
  SparseArray<Parcelable> j;
  int k = -1;
  String l;
  public Bundle m;
  public bk n;
  int o = -1;
  public int p;
  boolean q;
  public boolean r;
  public boolean s;
  boolean t;
  boolean u;
  boolean v;
  int w;
  public bz x;
  bv y;
  bz z;
  
  public static bk a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, null);
  }
  
  public static bk a(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      Class localClass = (Class)a.get(paramString);
      if (localClass == null)
      {
        localClass = paramContext.getClassLoader().loadClass(paramString);
        a.put(paramString, localClass);
      }
      bk localbk = (bk)localClass.newInstance();
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(localbk.getClass().getClassLoader());
        localbk.m = paramBundle;
      }
      return localbk;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new bm("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", localClassNotFoundException);
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new bm("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new bm("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", localIllegalAccessException);
    }
  }
  
  static boolean b(Context paramContext, String paramString)
  {
    try
    {
      Class localClass = (Class)a.get(paramString);
      if (localClass == null)
      {
        localClass = paramContext.getClassLoader().loadClass(paramString);
        a.put(paramString, localClass);
      }
      boolean bool = bk.class.isAssignableFrom(localClass);
      return bool;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return false;
  }
  
  public static void j() {}
  
  public static Animation l()
  {
    return null;
  }
  
  public static void p() {}
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return null;
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  final void a(int paramInt, bk parambk)
  {
    this.k = paramInt;
    if (parambk != null)
    {
      this.l = (parambk.l + ":" + this.k);
      return;
    }
    this.l = ("android:fragment:" + this.k);
  }
  
  public void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt) {}
  
  @Deprecated
  public void a(Activity paramActivity)
  {
    this.K = true;
  }
  
  @Deprecated
  public void a(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    this.K = true;
  }
  
  public final void a(Intent paramIntent)
  {
    if (this.y == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    this.y.a(this, paramIntent, -1);
  }
  
  public final void a(Intent paramIntent, int paramInt)
  {
    if (this.y == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    this.y.a(this, paramIntent, paramInt);
  }
  
  public void a(Bundle paramBundle)
  {
    this.K = true;
  }
  
  public final void a(AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    this.K = true;
    if (this.y == null) {}
    for (Activity localActivity = null;; localActivity = this.y.a)
    {
      if (localActivity != null)
      {
        this.K = false;
        a(localActivity, paramAttributeSet, paramBundle);
      }
      return;
    }
  }
  
  public void a(Menu paramMenu) {}
  
  public void a(Menu paramMenu, MenuInflater paramMenuInflater) {}
  
  public void a(View paramView, Bundle paramBundle) {}
  
  public final void a(bn parambn)
  {
    if (this.k >= 0) {
      throw new IllegalStateException("Fragment already active");
    }
    if ((parambn != null) && (parambn.a != null)) {}
    for (Bundle localBundle = parambn.a;; localBundle = null)
    {
      this.i = localBundle;
      return;
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    paramPrintWriter.print(Integer.toHexString(this.B));
    paramPrintWriter.print(" mContainerId=#");
    paramPrintWriter.print(Integer.toHexString(this.C));
    paramPrintWriter.print(" mTag=");
    paramPrintWriter.println(this.D);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    paramPrintWriter.print(this.f);
    paramPrintWriter.print(" mIndex=");
    paramPrintWriter.print(this.k);
    paramPrintWriter.print(" mWho=");
    paramPrintWriter.print(this.l);
    paramPrintWriter.print(" mBackStackNesting=");
    paramPrintWriter.println(this.w);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    paramPrintWriter.print(this.q);
    paramPrintWriter.print(" mRemoving=");
    paramPrintWriter.print(this.r);
    paramPrintWriter.print(" mResumed=");
    paramPrintWriter.print(this.s);
    paramPrintWriter.print(" mFromLayout=");
    paramPrintWriter.print(this.t);
    paramPrintWriter.print(" mInLayout=");
    paramPrintWriter.println(this.u);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    paramPrintWriter.print(this.E);
    paramPrintWriter.print(" mDetached=");
    paramPrintWriter.print(this.F);
    paramPrintWriter.print(" mMenuVisible=");
    paramPrintWriter.print(this.J);
    paramPrintWriter.print(" mHasMenu=");
    paramPrintWriter.println(this.I);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    paramPrintWriter.print(this.G);
    paramPrintWriter.print(" mRetaining=");
    paramPrintWriter.print(this.H);
    paramPrintWriter.print(" mUserVisibleHint=");
    paramPrintWriter.println(this.Q);
    if (this.x != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      paramPrintWriter.println(this.x);
    }
    if (this.y != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHost=");
      paramPrintWriter.println(this.y);
    }
    if (this.A != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mParentFragment=");
      paramPrintWriter.println(this.A);
    }
    if (this.m != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      paramPrintWriter.println(this.m);
    }
    if (this.i != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      paramPrintWriter.println(this.i);
    }
    if (this.j != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      paramPrintWriter.println(this.j);
    }
    if (this.n != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      paramPrintWriter.print(this.n);
      paramPrintWriter.print(" mTargetRequestCode=");
      paramPrintWriter.println(this.p);
    }
    if (this.L != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mNextAnim=");
      paramPrintWriter.println(this.L);
    }
    if (this.M != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      paramPrintWriter.println(this.M);
    }
    if (this.N != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      paramPrintWriter.println(this.N);
    }
    if (this.O != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mInnerView=");
      paramPrintWriter.println(this.N);
    }
    if (this.g != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      paramPrintWriter.println(this.g);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStateAfterAnimating=");
      paramPrintWriter.println(this.h);
    }
    if (this.R != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loader Manager:");
      this.R.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    if (this.z != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Child " + this.z + ":");
      this.z.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public Context aI_()
  {
    if (this.y == null) {
      return null;
    }
    return this.y.b;
  }
  
  public LayoutInflater a_(Bundle paramBundle)
  {
    LayoutInflater localLayoutInflater = this.y.c();
    h();
    bz localbz = this.z;
    mb.a.a(localLayoutInflater, localbz);
    return localLayoutInflater;
  }
  
  public boolean a_(MenuItem paramMenuItem)
  {
    return false;
  }
  
  final View b(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.z != null) {
      this.z.noteStateNotSaved();
    }
    return a(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public boolean b(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void c(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.A != null)) {
      throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
    }
    this.G = paramBoolean;
  }
  
  public void d(Bundle paramBundle)
  {
    this.K = true;
  }
  
  public final void d(boolean paramBoolean)
  {
    if (this.I != true)
    {
      this.I = true;
      if ((i()) && (!this.E)) {
        this.y.d();
      }
    }
  }
  
  public void d_()
  {
    this.K = true;
  }
  
  public void e(Bundle paramBundle) {}
  
  public final void e(boolean paramBoolean)
  {
    if (this.J != paramBoolean)
    {
      this.J = paramBoolean;
      if ((this.I) && (i()) && (!this.E)) {
        this.y.d();
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  public final bp f()
  {
    if (this.y == null) {
      return null;
    }
    return (bp)this.y.a;
  }
  
  public void f(Bundle paramBundle)
  {
    if (this.k >= 0) {
      throw new IllegalStateException("Fragment already active");
    }
    this.m = paramBundle;
  }
  
  public void f(boolean paramBoolean)
  {
    if ((!this.Q) && (paramBoolean) && (this.f < 4)) {
      this.x.b(this);
    }
    this.Q = paramBoolean;
    if (!paramBoolean) {}
    for (boolean bool = true;; bool = false)
    {
      this.P = bool;
      return;
    }
  }
  
  public void f_()
  {
    this.K = true;
  }
  
  public final Resources g()
  {
    if (this.y == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    return this.y.b.getResources();
  }
  
  final void g(Bundle paramBundle)
  {
    e(paramBundle);
    if (this.z != null)
    {
      Parcelable localParcelable = this.z.k();
      if (localParcelable != null) {
        paramBundle.putParcelable("android:support:fragments", localParcelable);
      }
    }
  }
  
  public final bw h()
  {
    if (this.z == null)
    {
      q();
      if (this.f < 5) {
        break label45;
      }
      bz localbz4 = this.z;
      localbz4.j = false;
      localbz4.a(5, 0, 0, false);
    }
    for (;;)
    {
      return this.z;
      label45:
      if (this.f >= 4)
      {
        bz localbz3 = this.z;
        localbz3.j = false;
        localbz3.a(4, 0, 0, false);
      }
      else if (this.f >= 2)
      {
        bz localbz2 = this.z;
        localbz2.j = false;
        localbz2.a(2, 0, 0, false);
      }
      else if (this.f > 0)
      {
        bz localbz1 = this.z;
        localbz1.j = false;
        localbz1.a(1, 0, 0, false);
      }
    }
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
  
  public final boolean i()
  {
    return (this.y != null) && (this.q);
  }
  
  public final cv k()
  {
    if (this.R != null) {
      return this.R;
    }
    if (this.y == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    this.T = true;
    this.R = this.y.a(this.l, this.S, true);
    return this.R;
  }
  
  public void m()
  {
    this.K = true;
  }
  
  public void n()
  {
    this.K = true;
  }
  
  public void o()
  {
    this.K = true;
    if (!this.T)
    {
      this.T = true;
      this.R = this.y.a(this.l, this.S, false);
    }
    if (this.R != null) {
      this.R.g();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    this.K = true;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    f().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public void onLowMemory()
  {
    this.K = true;
  }
  
  public void p_()
  {
    this.K = true;
    if (!this.S)
    {
      this.S = true;
      if (!this.T)
      {
        this.T = true;
        this.R = this.y.a(this.l, this.S, false);
      }
      if (this.R != null) {
        this.R.b();
      }
    }
  }
  
  final void q()
  {
    this.z = new bz();
    this.z.a(this.y, new bl(this), this);
  }
  
  public void q_()
  {
    this.K = true;
  }
  
  final void r()
  {
    if (this.z != null) {
      this.z.a(4, 0, 0, false);
    }
    this.K = false;
    n();
    if (!this.K) {
      throw new fd("Fragment " + this + " did not call through to super.onPause()");
    }
  }
  
  final void s()
  {
    if (this.z != null)
    {
      bz localbz = this.z;
      localbz.j = true;
      localbz.a(3, 0, 0, false);
    }
    this.K = false;
    q_();
    if (!this.K) {
      throw new fd("Fragment " + this + " did not call through to super.onStop()");
    }
  }
  
  final void t()
  {
    if (this.z != null) {
      this.z.a(2, 0, 0, false);
    }
    if (this.S)
    {
      this.S = false;
      if (!this.T)
      {
        this.T = true;
        this.R = this.y.a(this.l, this.S, false);
      }
      if (this.R != null)
      {
        if (this.H) {
          break label84;
        }
        this.R.c();
      }
    }
    return;
    label84:
    this.R.d();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    efj.a(this, localStringBuilder);
    if (this.k >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.k);
    }
    if (this.B != 0)
    {
      localStringBuilder.append(" id=0x");
      localStringBuilder.append(Integer.toHexString(this.B));
    }
    if (this.D != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.D);
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  final void u()
  {
    if (this.z != null) {
      this.z.a(1, 0, 0, false);
    }
    this.K = false;
    d_();
    if (!this.K) {
      throw new fd("Fragment " + this + " did not call through to super.onDestroyView()");
    }
    if (this.R != null) {
      this.R.e();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bk
 * JD-Core Version:    0.7.0.1
 */