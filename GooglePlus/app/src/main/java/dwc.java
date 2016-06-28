import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import java.util.ArrayList;

public final class dwc
  extends dvm
{
  public static Drawable a;
  public static Drawable b;
  private static boolean g;
  private static int h;
  private static int i;
  private static int j;
  private static int k;
  private static int l;
  private static int m;
  private static int n;
  public ImageView c;
  public TextView d;
  public dvb e;
  public TextView f;
  
  public dwc(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void D_()
  {
    super.D_();
    this.c.setImageDrawable(null);
    this.d.setText(null);
    this.f.setText(null);
    dvb localdvb = this.e;
    localdvb.a.clear();
    int i1 = localdvb.b.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      AvatarView localAvatarView = (AvatarView)localdvb.b.get(i2);
      localAvatarView.setVisibility(8);
      localAvatarView.a();
      localAvatarView.setContentDescription(null);
      localdvb.removeView(localAvatarView);
    }
    localdvb.b.clear();
    localdvb.c = null;
  }
  
  public final String a(int paramInt, ArrayList<bqw> paramArrayList)
  {
    Resources localResources = getContext().getResources();
    String[] arrayOfString;
    switch (paramInt)
    {
    default: 
      arrayOfString = null;
    }
    while (arrayOfString != null) {
      if (paramArrayList.size() >= arrayOfString.length)
      {
        String str2 = arrayOfString[(-1 + arrayOfString.length)];
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(paramArrayList.size());
        return String.format(str2, arrayOfObject2);
        arrayOfString = localResources.getStringArray(efj.iM);
        continue;
        arrayOfString = localResources.getStringArray(efj.iN);
        continue;
        arrayOfString = localResources.getStringArray(efj.iO);
        continue;
        arrayOfString = localResources.getStringArray(efj.iL);
      }
      else
      {
        CharSequence[] arrayOfCharSequence = new CharSequence[paramArrayList.size()];
        int i1 = 0;
        if (i1 < arrayOfCharSequence.length)
        {
          bqw localbqw = (bqw)paramArrayList.get(i1);
          if (localbqw.numAdditionalGuests == 0) {}
          int i2;
          int i3;
          Object[] arrayOfObject1;
          for (String str1 = localbqw.name;; str1 = localResources.getQuantityString(i2, i3, arrayOfObject1))
          {
            arrayOfCharSequence[i1] = str1;
            i1++;
            break;
            i2 = efj.xv;
            i3 = localbqw.numAdditionalGuests;
            arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = localbqw.name;
            arrayOfObject1[1] = Integer.valueOf(localbqw.numAdditionalGuests);
          }
        }
        if (arrayOfCharSequence.length > 0) {
          return String.format(arrayOfString[(-1 + arrayOfCharSequence.length)], (Object[])arrayOfCharSequence);
        }
      }
    }
    return null;
  }
  
  protected final void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramContext, paramAttributeSet, paramInt);
    if (!g)
    {
      Resources localResources = paramContext.getResources();
      a = localResources.getDrawable(efj.qj);
      b = localResources.getDrawable(efj.qi);
      i = localResources.getDimensionPixelSize(efj.lr);
      h = localResources.getDimensionPixelSize(efj.ls);
      j = localResources.getDimensionPixelSize(efj.lt);
      k = localResources.getDimensionPixelSize(efj.lq);
      l = localResources.getDimensionPixelSize(efj.ll);
      m = localResources.getDimensionPixelSize(efj.lm);
      n = localResources.getDimensionPixelSize(efj.lk);
      g = true;
    }
    a(i, j, h, k);
    this.d = new TextView(paramContext, paramAttributeSet, paramInt);
    this.d.setLayoutParams(new dxa(-2, -2));
    this.d.setTextAppearance(paramContext, efj.yD);
    addView(this.d);
    this.c = new ImageView(paramContext, paramAttributeSet, paramInt);
    addView(this.c);
    this.e = new dvb(paramContext, paramAttributeSet, paramInt);
    addView(this.e);
    this.f = new TextView(paramContext, paramAttributeSet, paramInt);
    this.f.setLayoutParams(new dxa(-2, -2));
    addView(this.f);
  }
  
  protected final void measureChildren(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt2);
    int i3 = i1 + 0;
    int i4 = i2 + 0;
    this.c.measure(View.MeasureSpec.makeMeasureSpec(i1, -2147483648), View.MeasureSpec.makeMeasureSpec(i2, -2147483648));
    int i5 = this.c.getMeasuredWidth();
    a(this.c, 0, 0);
    int i6 = i1 - i5;
    this.d.measure(View.MeasureSpec.makeMeasureSpec(i6, -2147483648), View.MeasureSpec.makeMeasureSpec(i2, -2147483648));
    int i7 = this.d.getMeasuredWidth();
    int i8 = i3 - i7;
    a(this.d, i8, 0);
    int i9 = i6 - i7 - (l + m);
    this.e.measure(View.MeasureSpec.makeMeasureSpec(i9, -2147483648), View.MeasureSpec.makeMeasureSpec(i2, -2147483648));
    if (i5 > 0) {}
    for (int i10 = i5 + l;; i10 = 0)
    {
      int i11 = i10 + 0;
      a(this.e, i11, 0);
      View[] arrayOfView1 = new View[3];
      arrayOfView1[0] = this.e;
      arrayOfView1[1] = this.d;
      arrayOfView1[2] = this.c;
      int i12 = a(arrayOfView1);
      View[] arrayOfView2 = new View[3];
      arrayOfView2[0] = this.e;
      arrayOfView2[1] = this.d;
      arrayOfView2[2] = this.c;
      a(i12, arrayOfView2);
      int i13 = 0 + this.e.getMeasuredHeight() + n;
      a(this.f, 0, i13);
      this.f.measure(View.MeasureSpec.makeMeasureSpec(i1, -2147483648), View.MeasureSpec.makeMeasureSpec(i4 - i13, View.MeasureSpec.getMode(paramInt2)));
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwc
 * JD-Core Version:    0.7.0.1
 */