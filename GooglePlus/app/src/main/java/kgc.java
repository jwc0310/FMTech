import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class kgc
  extends ket
{
  private CharSequence a;
  public boolean b;
  public boolean c;
  public boolean d;
  private CharSequence e;
  private boolean f;
  
  public kgc(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final Parcelable a()
  {
    Parcelable localParcelable = super.a();
    if (this.w) {
      return localParcelable;
    }
    kgd localkgd = new kgd(localParcelable);
    localkgd.a = this.b;
    return localkgd;
  }
  
  protected final Object a(TypedArray paramTypedArray, int paramInt)
  {
    return Boolean.valueOf(paramTypedArray.getBoolean(paramInt, false));
  }
  
  protected final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable == null) || (!paramParcelable.getClass().equals(kgd.class)))
    {
      super.a(paramParcelable);
      return;
    }
    kgd localkgd = (kgd)paramParcelable;
    super.a(localkgd.getSuperState());
    a(localkgd.a);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.b != paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      if ((i != 0) || (!this.f))
      {
        this.b = paramBoolean;
        this.f = true;
        f(paramBoolean);
        if (i != 0)
        {
          d(e());
          g();
        }
      }
      return;
    }
  }
  
  protected final void a(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {}
    for (boolean bool = g(this.b);; bool = ((Boolean)paramObject).booleanValue())
    {
      a(bool);
      return;
    }
  }
  
  protected final void b()
  {
    super.b();
    if (!this.b) {}
    for (boolean bool = true;; bool = false)
    {
      this.c = true;
      if (b(Boolean.valueOf(bool))) {
        break;
      }
      return;
    }
    a(bool);
  }
  
  public final void b(View paramView)
  {
    TextView localTextView = (TextView)paramView.findViewById(da.X);
    int i;
    if (localTextView != null)
    {
      i = 1;
      if ((!this.b) || (TextUtils.isEmpty(this.a))) {
        break label95;
      }
      localTextView.setText(this.a);
      i = 0;
      if (i == 0) {
        break label132;
      }
      CharSequence localCharSequence = f();
      if (TextUtils.isEmpty(localCharSequence)) {
        break label132;
      }
      localTextView.setText(localCharSequence);
    }
    label132:
    for (int j = 0;; j = i)
    {
      int k = 0;
      if (j == 0) {}
      for (;;)
      {
        if (k != localTextView.getVisibility()) {
          localTextView.setVisibility(k);
        }
        return;
        label95:
        if ((this.b) || (TextUtils.isEmpty(this.e))) {
          break;
        }
        localTextView.setText(this.e);
        i = 0;
        break;
        k = 8;
      }
    }
  }
  
  public final void c(CharSequence paramCharSequence)
  {
    this.a = paramCharSequence;
    if (this.b) {
      g();
    }
  }
  
  public final void d(CharSequence paramCharSequence)
  {
    this.e = paramCharSequence;
    if (!this.b) {
      g();
    }
  }
  
  public final boolean e()
  {
    boolean bool1;
    if (this.d) {
      bool1 = this.b;
    }
    for (;;)
    {
      boolean bool2;
      if (!bool1)
      {
        boolean bool3 = super.e();
        bool2 = false;
        if (!bool3) {}
      }
      else
      {
        bool2 = true;
      }
      return bool2;
      if (!this.b) {
        bool1 = true;
      } else {
        bool1 = false;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kgc
 * JD-Core Version:    0.7.0.1
 */