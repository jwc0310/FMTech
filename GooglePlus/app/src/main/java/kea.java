import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;

public final class kea
  extends kdx
{
  private EditText a;
  private String b;
  
  public kea(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private kea(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, efj.Uk);
  }
  
  private kea(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = new EditText(paramContext, paramAttributeSet);
    this.a.setId(da.P);
    this.a.setEnabled(true);
  }
  
  private void b(String paramString)
  {
    boolean bool1 = e();
    this.b = paramString;
    e(paramString);
    boolean bool2 = e();
    if (bool2 != bool1) {
      d(bool2);
    }
  }
  
  protected final Parcelable a()
  {
    Parcelable localParcelable = super.a();
    if (this.w) {
      return localParcelable;
    }
    keb localkeb = new keb(localParcelable);
    localkeb.a = this.b;
    return localkeb;
  }
  
  protected final Object a(TypedArray paramTypedArray, int paramInt)
  {
    return paramTypedArray.getString(paramInt);
  }
  
  protected final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable == null) || (!paramParcelable.getClass().equals(keb.class)))
    {
      super.a(paramParcelable);
      return;
    }
    keb localkeb = (keb)paramParcelable;
    super.a(localkeb.getSuperState());
    b(localkeb.a);
  }
  
  protected final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    if (paramBoolean)
    {
      String str = this.a.getText().toString();
      if (b(str)) {
        b(str);
      }
    }
  }
  
  protected final void a(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {}
    for (String str = a(this.b);; str = (String)paramObject)
    {
      b(str);
      return;
    }
  }
  
  protected final boolean at_()
  {
    return true;
  }
  
  protected final void b(View paramView)
  {
    super.b(paramView);
    EditText localEditText = this.a;
    localEditText.setText(this.b);
    ViewParent localViewParent = localEditText.getParent();
    if (localViewParent != paramView)
    {
      if (localViewParent != null) {
        ((ViewGroup)localViewParent).removeView(localEditText);
      }
      ViewGroup localViewGroup = (ViewGroup)paramView.findViewById(da.Q);
      if (localViewGroup != null) {
        localViewGroup.addView(localEditText, -1, -2);
      }
    }
  }
  
  public final boolean e()
  {
    return (TextUtils.isEmpty(this.b)) || (super.e());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kea
 * JD-Core Version:    0.7.0.1
 */