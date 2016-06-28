import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.Switch;

public final class kfx
  extends kgc
{
  private final kfy a = new kfy(this);
  private CharSequence e;
  private CharSequence f;
  
  public kfx(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private kfx(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, efj.Up);
  }
  
  private kfx(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  private kfx(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, kfu.M, paramInt1, 0);
    c(localTypedArray.getString(kfu.P));
    d(localTypedArray.getString(kfu.O));
    this.e = localTypedArray.getString(kfu.R);
    g();
    this.f = localTypedArray.getString(kfu.Q);
    g();
    this.d = localTypedArray.getBoolean(kfu.N, false);
    localTypedArray.recycle();
  }
  
  protected final void a(View paramView)
  {
    super.a(paramView);
    View localView = paramView.findViewById(da.Y);
    if ((localView != null) && ((localView instanceof Checkable)))
    {
      if ((localView instanceof Switch)) {
        ((Switch)localView).setOnCheckedChangeListener(null);
      }
      ((Checkable)localView).setChecked(this.b);
      if ((localView instanceof Switch))
      {
        Switch localSwitch = (Switch)localView;
        localSwitch.setTextOn(this.e);
        localSwitch.setTextOff(this.f);
        localSwitch.setOnCheckedChangeListener(this.a);
      }
    }
    b(paramView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kfx
 * JD-Core Version:    0.7.0.1
 */