import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;
import java.util.List;

public class ket
  implements Comparable<ket>
{
  kew A;
  private boolean B;
  private CharSequence a;
  private int b;
  private Drawable c;
  private boolean d = true;
  private boolean e;
  private String f;
  private Object g;
  private boolean h = true;
  private boolean i = true;
  private boolean j = true;
  private List<ket> k;
  public Context l;
  public kfk m;
  long n;
  public kex o;
  public key p;
  int q = 2147483647;
  public CharSequence r;
  public String s;
  public Intent t;
  String u;
  boolean v = true;
  public boolean w = true;
  int x = az.x;
  int y;
  boolean z = true;
  
  public ket(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ket(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, efj.Un);
  }
  
  public ket(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this.l = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, kfu.r, paramInt, 0);
    int i1 = localTypedArray.getIndexCount();
    if (i1 >= 0)
    {
      int i2 = localTypedArray.getIndex(i1);
      if (i2 == kfu.y) {
        this.b = localTypedArray.getResourceId(i2, 0);
      }
      for (;;)
      {
        i1--;
        break;
        if (i2 == kfu.z)
        {
          this.s = localTypedArray.getString(i2);
        }
        else if (i2 == kfu.G)
        {
          localTypedArray.getResourceId(i2, 0);
          this.r = localTypedArray.getString(i2);
        }
        else if (i2 == kfu.F)
        {
          this.a = localTypedArray.getString(i2);
        }
        else if (i2 == kfu.B)
        {
          this.q = localTypedArray.getInt(i2, this.q);
        }
        else if (i2 == kfu.x)
        {
          this.u = localTypedArray.getString(i2);
        }
        else if (i2 == kfu.A)
        {
          this.x = localTypedArray.getResourceId(i2, this.x);
        }
        else if (i2 == kfu.H)
        {
          this.y = localTypedArray.getResourceId(i2, this.y);
        }
        else if (i2 == kfu.w)
        {
          this.d = localTypedArray.getBoolean(i2, true);
        }
        else if (i2 == kfu.D)
        {
          this.v = localTypedArray.getBoolean(i2, true);
        }
        else if (i2 == kfu.C)
        {
          this.w = localTypedArray.getBoolean(i2, this.w);
        }
        else if (i2 == kfu.v)
        {
          this.f = localTypedArray.getString(i2);
        }
        else if (i2 == kfu.u)
        {
          this.g = a(localTypedArray, i2);
        }
        else if (i2 == kfu.E)
        {
          this.j = localTypedArray.getBoolean(i2, this.j);
        }
      }
    }
    localTypedArray.recycle();
    if (!getClass().getName().startsWith("com.google")) {
      this.z = false;
    }
  }
  
  private final void a(SharedPreferences.Editor paramEditor)
  {
    try
    {
      paramEditor.apply();
      return;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      paramEditor.commit();
    }
  }
  
  private final void a(View paramView, boolean paramBoolean)
  {
    paramView.setEnabled(paramBoolean);
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      for (int i1 = -1 + localViewGroup.getChildCount(); i1 >= 0; i1--) {
        a(localViewGroup.getChildAt(i1), paramBoolean);
      }
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.h == paramBoolean) {
      if (paramBoolean) {
        break label32;
      }
    }
    label32:
    for (boolean bool = true;; bool = false)
    {
      this.h = bool;
      d(e());
      g();
      return;
    }
  }
  
  private ket b(String paramString)
  {
    if ((TextUtils.isEmpty(paramString)) || (this.m == null)) {}
    kfk localkfk;
    do
    {
      return null;
      localkfk = this.m;
    } while (localkfk.c == null);
    return localkfk.c.c(paramString);
  }
  
  private boolean d()
  {
    if ((this.m != null) && (this.w))
    {
      if (!TextUtils.isEmpty(this.s)) {}
      for (int i1 = 1; i1 != 0; i1 = 0) {
        return true;
      }
    }
    return false;
  }
  
  public Parcelable a()
  {
    this.B = true;
    return keu.EMPTY_STATE;
  }
  
  public View a(ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = (LayoutInflater)this.l.getSystemService("layout_inflater");
    View localView = localLayoutInflater.inflate(this.x, paramViewGroup, false);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(da.aa);
    if (localViewGroup != null)
    {
      if (this.y != 0) {
        localLayoutInflater.inflate(this.y, localViewGroup);
      }
    }
    else {
      return localView;
    }
    localViewGroup.setVisibility(8);
    return localView;
  }
  
  public Object a(TypedArray paramTypedArray, int paramInt)
  {
    return null;
  }
  
  public String a(String paramString)
  {
    if (!d()) {
      return paramString;
    }
    return this.m.b().getString(this.s, paramString);
  }
  
  public final void a(Drawable paramDrawable)
  {
    if (((paramDrawable == null) && (this.c != null)) || ((paramDrawable != null) && (this.c != paramDrawable)))
    {
      this.c = paramDrawable;
      g();
    }
  }
  
  public void a(Parcelable paramParcelable)
  {
    this.B = true;
    if ((paramParcelable != keu.EMPTY_STATE) && (paramParcelable != null)) {
      throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
    }
  }
  
  public void a(View paramView)
  {
    TextView localTextView1 = (TextView)paramView.findViewById(da.Z);
    if (localTextView1 != null)
    {
      CharSequence localCharSequence2 = this.r;
      if (TextUtils.isEmpty(localCharSequence2)) {
        break label252;
      }
      localTextView1.setText(localCharSequence2);
      localTextView1.setVisibility(0);
      if ((this.v) && (!c())) {
        localTextView1.setTextColor(this.l.getResources().getColor(efj.Uq));
      }
    }
    TextView localTextView2 = (TextView)paramView.findViewById(da.X);
    if (localTextView2 != null)
    {
      CharSequence localCharSequence1 = f();
      if (TextUtils.isEmpty(localCharSequence1)) {
        break label261;
      }
      localTextView2.setText(localCharSequence1);
      localTextView2.setVisibility(0);
      if ((this.v) && (!c())) {
        localTextView2.setTextColor(this.l.getResources().getColor(efj.Uq));
      }
    }
    label142:
    ImageView localImageView = (ImageView)paramView.findViewById(da.R);
    int i1;
    if (localImageView != null)
    {
      if ((this.b != 0) || (this.c != null))
      {
        if (this.c == null) {
          this.c = this.l.getResources().getDrawable(this.b);
        }
        if (this.c != null) {
          localImageView.setImageDrawable(this.c);
        }
      }
      Drawable localDrawable = this.c;
      i1 = 0;
      if (localDrawable == null) {
        break label270;
      }
    }
    for (;;)
    {
      localImageView.setVisibility(i1);
      if (this.j) {
        a(paramView, c());
      }
      return;
      label252:
      localTextView1.setVisibility(8);
      break;
      label261:
      localTextView2.setVisibility(8);
      break label142;
      label270:
      i1 = 8;
    }
  }
  
  public void a(Object paramObject)
  {
    this.g = paramObject;
  }
  
  protected void a(kfk paramkfk)
  {
    this.m = paramkfk;
    this.n = paramkfk.a();
    if (d()) {
      if (this.m != null) {
        break label59;
      }
    }
    label59:
    for (SharedPreferences localSharedPreferences = null; !localSharedPreferences.contains(this.s); localSharedPreferences = this.m.b())
    {
      if (this.g != null) {
        a(false, this.g);
      }
      return;
    }
    a(true, null);
  }
  
  public void a(boolean paramBoolean, Object paramObject) {}
  
  public void a_(CharSequence paramCharSequence)
  {
    if (((paramCharSequence == null) && (this.a != null)) || ((paramCharSequence != null) && (!paramCharSequence.equals(this.a))))
    {
      this.a = paramCharSequence;
      g();
    }
  }
  
  public void b() {}
  
  public final void b(int paramInt)
  {
    if (paramInt != this.x) {
      this.z = false;
    }
    this.x = paramInt;
  }
  
  void b(Bundle paramBundle)
  {
    int i1;
    if (!TextUtils.isEmpty(this.s)) {
      i1 = 1;
    }
    while (i1 != 0)
    {
      this.B = false;
      Parcelable localParcelable = a();
      if (!this.B)
      {
        throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        i1 = 0;
      }
      else if (localParcelable != null)
      {
        paramBundle.putParcelable(this.s, localParcelable);
      }
    }
  }
  
  public final void b(CharSequence paramCharSequence)
  {
    if (((paramCharSequence == null) && (this.r != null)) || ((paramCharSequence != null) && (!paramCharSequence.equals(this.r))))
    {
      this.r = paramCharSequence;
      g();
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    if (this.d != paramBoolean)
    {
      this.d = paramBoolean;
      d(e());
      g();
    }
  }
  
  public final boolean b(Object paramObject)
  {
    return (this.o == null) || (this.o.a(this, paramObject));
  }
  
  void c(Bundle paramBundle)
  {
    if (!TextUtils.isEmpty(this.s)) {}
    for (int i1 = 1; i1 != 0; i1 = 0)
    {
      Parcelable localParcelable = paramBundle.getParcelable(this.s);
      if (localParcelable == null) {
        break;
      }
      this.B = false;
      a(localParcelable);
      if (this.B) {
        break;
      }
      throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    if (this.v)
    {
      this.v = false;
      g();
    }
  }
  
  public boolean c()
  {
    return (this.d) && (this.h) && (this.i);
  }
  
  public final void d(String paramString)
  {
    this.s = paramString;
    if (this.e)
    {
      int i1;
      if (!TextUtils.isEmpty(this.s)) {
        i1 = 1;
      }
      while (i1 == 0) {
        if (this.s == null)
        {
          throw new IllegalStateException("Preference does not have a key assigned.");
          i1 = 0;
        }
        else
        {
          this.e = true;
        }
      }
    }
  }
  
  public void d(boolean paramBoolean)
  {
    List localList = this.k;
    if (localList == null) {}
    for (;;)
    {
      return;
      int i1 = localList.size();
      for (int i2 = 0; i2 < i1; i2++) {
        ((ket)localList.get(i2)).a(paramBoolean);
      }
    }
  }
  
  public final void e(boolean paramBoolean)
  {
    if (this.i == paramBoolean) {
      if (paramBoolean) {
        break label32;
      }
    }
    label32:
    for (boolean bool = true;; bool = false)
    {
      this.i = bool;
      d(e());
      g();
      return;
    }
  }
  
  public boolean e()
  {
    return !c();
  }
  
  public final boolean e(String paramString)
  {
    if (d())
    {
      if (paramString == a(null)) {
        return true;
      }
      SharedPreferences.Editor localEditor = this.m.b().edit();
      localEditor.putString(this.s, paramString);
      a(localEditor);
      return true;
    }
    return false;
  }
  
  public CharSequence f()
  {
    return this.a;
  }
  
  protected final boolean f(boolean paramBoolean)
  {
    if (d())
    {
      boolean bool = false;
      if (!paramBoolean) {
        bool = true;
      }
      if (paramBoolean == g(bool)) {
        return true;
      }
      SharedPreferences.Editor localEditor = this.m.b().edit();
      localEditor.putBoolean(this.s, paramBoolean);
      a(localEditor);
      return true;
    }
    return false;
  }
  
  public final void g()
  {
    if (this.A != null) {
      this.A.a();
    }
  }
  
  protected final boolean g(boolean paramBoolean)
  {
    if (!d()) {
      return paramBoolean;
    }
    return this.m.b().getBoolean(this.s, paramBoolean);
  }
  
  public final void h()
  {
    if (this.A != null) {
      this.A.b();
    }
  }
  
  protected void i()
  {
    if (!TextUtils.isEmpty(this.f))
    {
      ket localket = b(this.f);
      if (localket != null)
      {
        if (localket.k == null) {
          localket.k = new ArrayList();
        }
        localket.k.add(this);
        a(localket.e());
      }
    }
    else
    {
      return;
    }
    String str1 = this.f;
    String str2 = this.s;
    String str3 = String.valueOf(this.r);
    throw new IllegalStateException(52 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + "Dependency \"" + str1 + "\" not found for preference \"" + str2 + "\" (title: \"" + str3 + "\"");
  }
  
  protected void j()
  {
    if (this.f != null)
    {
      ket localket = b(this.f);
      if ((localket != null) && (localket.k != null)) {
        localket.k.remove(this);
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    CharSequence localCharSequence1 = this.r;
    if (!TextUtils.isEmpty(localCharSequence1)) {
      localStringBuilder.append(localCharSequence1).append(' ');
    }
    CharSequence localCharSequence2 = f();
    if (!TextUtils.isEmpty(localCharSequence2)) {
      localStringBuilder.append(localCharSequence2).append(' ');
    }
    if (localStringBuilder.length() > 0) {
      localStringBuilder.setLength(-1 + localStringBuilder.length());
    }
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ket
 * JD-Core Version:    0.7.0.1
 */