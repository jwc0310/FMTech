import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;

public final class kej
  extends kdx
{
  public CharSequence[] a;
  public CharSequence[] b;
  public String c;
  int d;
  private String e;
  private boolean f;
  
  public kej(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private kej(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, null);
    TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(null, kfu.o, 0, 0);
    this.a = localTypedArray1.getTextArray(kfu.p);
    this.b = localTypedArray1.getTextArray(kfu.q);
    localTypedArray1.recycle();
    TypedArray localTypedArray2 = paramContext.obtainStyledAttributes(null, kfu.r, 0, 0);
    this.e = localTypedArray2.getString(kfu.F);
    localTypedArray2.recycle();
  }
  
  private final int k()
  {
    return c(this.c);
  }
  
  protected final Parcelable a()
  {
    Parcelable localParcelable = super.a();
    if (this.w) {
      return localParcelable;
    }
    kel localkel = new kel(localParcelable);
    localkel.a = this.c;
    return localkel;
  }
  
  protected final Object a(TypedArray paramTypedArray, int paramInt)
  {
    return paramTypedArray.getString(paramInt);
  }
  
  public final void a(int paramInt)
  {
    if (this.b != null) {
      b(this.b[paramInt].toString());
    }
  }
  
  protected final void a(AlertDialog.Builder paramBuilder)
  {
    super.a(paramBuilder);
    if ((this.a == null) || (this.b == null)) {
      throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
    }
    this.d = k();
    paramBuilder.setSingleChoiceItems(this.a, this.d, new kek(this));
    paramBuilder.setPositiveButton(null, null);
  }
  
  protected final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable == null) || (!paramParcelable.getClass().equals(kel.class)))
    {
      super.a(paramParcelable);
      return;
    }
    kel localkel = (kel)paramParcelable;
    super.a(localkel.getSuperState());
    b(localkel.a);
  }
  
  protected final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    if ((paramBoolean) && (this.d >= 0) && (this.b != null))
    {
      String str = this.b[this.d].toString();
      if (b(str)) {
        b(str);
      }
    }
  }
  
  protected final void a(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {}
    for (String str = a(this.c);; str = (String)paramObject)
    {
      b(str);
      return;
    }
  }
  
  public final void a_(CharSequence paramCharSequence)
  {
    super.a_(paramCharSequence);
    if ((paramCharSequence == null) && (this.e != null)) {
      this.e = null;
    }
    while ((paramCharSequence == null) || (paramCharSequence.equals(this.e))) {
      return;
    }
    this.e = paramCharSequence.toString();
  }
  
  public final void b(String paramString)
  {
    if (!TextUtils.equals(this.c, paramString)) {}
    for (int i = 1;; i = 0)
    {
      if ((i != 0) || (!this.f))
      {
        this.c = paramString;
        this.f = true;
        e(paramString);
        if (i != 0) {
          g();
        }
      }
      return;
    }
  }
  
  public final int c(String paramString)
  {
    if ((paramString != null) && (this.b != null)) {
      for (int i = -1 + this.b.length; i >= 0; i--) {
        if (this.b[i].equals(paramString)) {
          return i;
        }
      }
    }
    return -1;
  }
  
  public final CharSequence f()
  {
    int i = c(this.c);
    if ((i >= 0) && (this.a != null)) {}
    for (CharSequence localCharSequence = this.a[i]; (this.e == null) || (localCharSequence == null); localCharSequence = null) {
      return super.f();
    }
    return String.format(this.e, new Object[] { localCharSequence });
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kej
 * JD-Core Version:    0.7.0.1
 */