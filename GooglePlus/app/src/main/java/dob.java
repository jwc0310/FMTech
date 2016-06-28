import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class dob
  extends kdx
{
  CharSequence[] b;
  CharSequence[] c;
  CharSequence[] d;
  String e;
  int f;
  LayoutInflater g;
  
  public dob(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dob(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, null);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(null, bgl.c, 0, 0);
    this.b = localTypedArray.getTextArray(bgl.d);
    this.c = localTypedArray.getTextArray(bgl.e);
    this.d = localTypedArray.getTextArray(bgl.f);
    localTypedArray.recycle();
    this.g = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
  
  private final int k()
  {
    String str = this.e;
    if ((str != null) && (this.c != null)) {
      for (int i = -1 + this.c.length; i >= 0; i--) {
        if (this.c[i].equals(str)) {
          return i;
        }
      }
    }
    return -1;
  }
  
  protected final Parcelable a()
  {
    Parcelable localParcelable = super.a();
    if (this.w) {
      return localParcelable;
    }
    doe localdoe = new doe(localParcelable);
    localdoe.a = this.e;
    return localdoe;
  }
  
  protected final Object a(TypedArray paramTypedArray, int paramInt)
  {
    return paramTypedArray.getString(paramInt);
  }
  
  protected final void a(AlertDialog.Builder paramBuilder)
  {
    super.a(paramBuilder);
    if ((this.b == null) || (this.c == null) || (this.d == null)) {
      throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
    }
    this.f = k();
    paramBuilder.setSingleChoiceItems(new doc(this), this.f, new dod(this));
    paramBuilder.setPositiveButton(null, null);
  }
  
  protected final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable == null) || (!paramParcelable.getClass().equals(doe.class)))
    {
      super.a(paramParcelable);
      return;
    }
    doe localdoe = (doe)paramParcelable;
    super.a(localdoe.getSuperState());
    String str = localdoe.a;
    this.e = str;
    e(str);
  }
  
  protected final void a(View paramView)
  {
    TextView localTextView = (TextView)paramView.findViewById(16908304);
    if (localTextView != null) {
      localTextView.setAutoLinkMask(0);
    }
    super.a(paramView);
  }
  
  protected void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    if ((paramBoolean) && (this.f >= 0) && (this.c != null))
    {
      String str = this.c[this.f].toString();
      if (b(str))
      {
        this.e = str;
        e(str);
      }
    }
  }
  
  protected final void a(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {}
    for (String str = a(this.e);; str = (String)paramObject)
    {
      this.e = str;
      e(str);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dob
 * JD-Core Version:    0.7.0.1
 */