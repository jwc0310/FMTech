import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class lws
  extends ViewGroup
  implements Checkable, CompoundButton.OnCheckedChangeListener
{
  public static final StyleSpan A = new StyleSpan(1);
  private final Drawable a;
  private boolean b;
  private final gxq c = new gxq(pkf.g);
  private final gxq d = new gxq(pkf.k);
  public final int v;
  public final ForegroundColorSpan w;
  public boolean x;
  public CheckBox y;
  public lwt z;
  
  public lws(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Resources localResources = paramContext.getApplicationContext().getResources();
    this.a = localResources.getDrawable(da.aX);
    this.w = new ForegroundColorSpan(localResources.getColor(efj.Zo));
    this.v = ((int)localResources.getDimension(efj.Zs));
  }
  
  public void a(Canvas paramCanvas, Drawable paramDrawable)
  {
    paramDrawable.setBounds(0, 0, getWidth(), getHeight());
    paramDrawable.draw(paramCanvas);
  }
  
  public final void c(boolean paramBoolean)
  {
    this.x = paramBoolean;
    if (this.x)
    {
      if (this.y == null)
      {
        this.y = new CheckBox(getContext());
        this.y.setOnCheckedChangeListener(this);
        this.y.setFocusable(false);
        this.y.setClickable(false);
        addView(this.y);
      }
      this.y.setVisibility(0);
    }
    while (this.y == null) {
      return;
    }
    this.y.setVisibility(8);
  }
  
  public boolean isChecked()
  {
    if (this.x) {
      return this.y.isChecked();
    }
    return this.b;
  }
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    this.z.a(this, this.y.isChecked());
    CheckBox localCheckBox = this.y;
    if (paramBoolean) {}
    for (gxq localgxq = this.d;; localgxq = this.c)
    {
      efj.a(localCheckBox, localgxq);
      gwz.a(this.y, 4);
      return;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if ((!this.x) && (this.b)) {
      a(paramCanvas, this.a);
    }
    super.onDraw(paramCanvas);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    if (this.x) {
      this.y.setChecked(paramBoolean);
    }
    while (paramBoolean == this.b) {
      return;
    }
    this.b = paramBoolean;
    if (!paramBoolean) {}
    for (boolean bool = true;; bool = false)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
    }
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.y.setEnabled(paramBoolean);
  }
  
  public void toggle()
  {
    if ((this.x) && (this.y.isEnabled()))
    {
      this.y.toggle();
      return;
    }
    if (!this.b) {}
    for (boolean bool = true;; bool = false)
    {
      this.b = bool;
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lws
 * JD-Core Version:    0.7.0.1
 */