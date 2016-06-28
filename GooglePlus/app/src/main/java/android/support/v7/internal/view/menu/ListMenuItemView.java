package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import efj;
import wb;
import xp;
import yc;

public class ListMenuItemView
  extends LinearLayout
  implements yc
{
  public boolean a;
  public boolean b;
  private xp c;
  private ImageView d;
  private RadioButton e;
  private TextView f;
  private CheckBox g;
  private TextView h;
  private Drawable i;
  private int j;
  private Context k;
  private Context l;
  private LayoutInflater m;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.l = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, wb.aP, paramInt, 0);
    this.i = localTypedArray.getDrawable(wb.aQ);
    this.j = localTypedArray.getResourceId(wb.aR, -1);
    this.a = localTypedArray.getBoolean(wb.aS, false);
    this.k = paramContext;
    localTypedArray.recycle();
  }
  
  private final LayoutInflater c()
  {
    if (this.m == null) {
      this.m = LayoutInflater.from(this.l);
    }
    return this.m;
  }
  
  public final xp a()
  {
    return this.c;
  }
  
  public final void a(xp paramxp, int paramInt)
  {
    int n = 1;
    this.c = paramxp;
    int i1;
    label62:
    int i2;
    label102:
    Object localObject1;
    Object localObject2;
    label161:
    int i4;
    label186:
    label225:
    int i3;
    label254:
    char c1;
    String str;
    label332:
    Drawable localDrawable2;
    if (paramxp.isVisible())
    {
      i1 = 0;
      setVisibility(i1);
      CharSequence localCharSequence = paramxp.a(this);
      if (localCharSequence == null) {
        break label464;
      }
      this.f.setText(localCharSequence);
      if (this.f.getVisibility() != 0) {
        this.f.setVisibility(0);
      }
      boolean bool1 = paramxp.isCheckable();
      if ((bool1) || (this.e != null) || (this.g != null))
      {
        if ((0x4 & this.c.d) == 0) {
          break label488;
        }
        i2 = n;
        if (i2 == 0) {
          break label494;
        }
        if (this.e == null)
        {
          this.e = ((RadioButton)c().inflate(efj.aZ, this, false));
          addView(this.e);
        }
        RadioButton localRadioButton2 = this.e;
        CheckBox localCheckBox2 = this.g;
        localObject1 = localRadioButton2;
        localObject2 = localCheckBox2;
        if (!bool1) {
          break label558;
        }
        ((CompoundButton)localObject1).setChecked(this.c.isChecked());
        if (!bool1) {
          break label551;
        }
        i4 = 0;
        if (((CompoundButton)localObject1).getVisibility() != i4) {
          ((CompoundButton)localObject1).setVisibility(i4);
        }
        if ((localObject2 != null) && (((CompoundButton)localObject2).getVisibility() != 8)) {
          ((CompoundButton)localObject2).setVisibility(8);
        }
      }
      boolean bool2 = paramxp.d();
      paramxp.c();
      if ((!bool2) || (!this.c.d())) {
        break label593;
      }
      i3 = 0;
      if (i3 == 0)
      {
        TextView localTextView = this.h;
        c1 = this.c.c();
        if (c1 != 0) {
          break label600;
        }
        str = "";
        localTextView.setText(str);
      }
      if (this.h.getVisibility() != i3) {
        this.h.setVisibility(i3);
      }
      Drawable localDrawable1 = paramxp.getIcon();
      if (!this.b) {
        break label696;
      }
      if (((n != 0) || (this.a)) && ((this.d != null) || (localDrawable1 != null) || (this.a)))
      {
        if (this.d == null)
        {
          this.d = ((ImageView)c().inflate(efj.aX, this, false));
          addView(this.d, 0);
        }
        if ((localDrawable1 == null) && (!this.a)) {
          break label707;
        }
        ImageView localImageView = this.d;
        if (n == 0) {
          break label701;
        }
        localDrawable2 = localDrawable1;
        label423:
        localImageView.setImageDrawable(localDrawable2);
        if (this.d.getVisibility() != 0) {
          this.d.setVisibility(0);
        }
      }
    }
    for (;;)
    {
      setEnabled(paramxp.isEnabled());
      return;
      i1 = 8;
      break;
      label464:
      if (this.f.getVisibility() == 8) {
        break label62;
      }
      this.f.setVisibility(8);
      break label62;
      label488:
      i2 = 0;
      break label102;
      label494:
      if (this.g == null)
      {
        this.g = ((CheckBox)c().inflate(efj.aW, this, false));
        addView(this.g);
      }
      CheckBox localCheckBox1 = this.g;
      RadioButton localRadioButton1 = this.e;
      localObject1 = localCheckBox1;
      localObject2 = localRadioButton1;
      break label161;
      label551:
      i4 = 8;
      break label186;
      label558:
      if (this.g != null) {
        this.g.setVisibility(8);
      }
      if (this.e == null) {
        break label225;
      }
      this.e.setVisibility(8);
      break label225;
      label593:
      i3 = 8;
      break label254;
      label600:
      StringBuilder localStringBuilder = new StringBuilder(null);
      switch (c1)
      {
      default: 
        localStringBuilder.append(c1);
      }
      for (;;)
      {
        str = localStringBuilder.toString();
        break;
        localStringBuilder.append(null);
        continue;
        localStringBuilder.append(null);
        continue;
        localStringBuilder.append(null);
      }
      label696:
      n = 0;
      break label332;
      label701:
      localDrawable2 = null;
      break label423;
      label707:
      this.d.setVisibility(8);
    }
  }
  
  public final boolean b()
  {
    return false;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    setBackgroundDrawable(this.i);
    this.f = ((TextView)findViewById(efj.aK));
    if (this.j != -1) {
      this.f.setTextAppearance(this.k, this.j);
    }
    this.h = ((TextView)findViewById(efj.aG));
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.d != null) && (this.a))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.d.getLayoutParams();
      if ((localLayoutParams.height > 0) && (localLayoutParams1.width <= 0)) {
        localLayoutParams1.width = localLayoutParams.height;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ListMenuItemView
 * JD-Core Version:    0.7.0.1
 */