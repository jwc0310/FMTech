import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import java.util.ArrayList;
import java.util.Iterator;

public final class dvb
  extends dwz
  implements View.OnClickListener
{
  private static boolean d;
  private static int e;
  private static int f;
  private static float g;
  private static int h;
  ArrayList<bqw> a;
  ArrayList<AvatarView> b;
  dwb c;
  private int i;
  private TextView j;
  
  public dvb(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (!d)
    {
      Resources localResources = paramContext.getResources();
      e = localResources.getDimensionPixelSize(efj.lz);
      f = efj.i(paramContext);
      g = localResources.getDimension(efj.nK);
      h = localResources.getColor(efj.ko);
      d = true;
    }
    float f1 = g;
    int k = h;
    TextView localTextView = new TextView(paramContext, paramAttributeSet, paramInt);
    localTextView.setTextSize(0, f1);
    localTextView.setSingleLine(true);
    localTextView.setTextColor(k);
    localTextView.setEllipsize(TextUtils.TruncateAt.END);
    this.j = localTextView;
    addView(this.j);
    this.b = new ArrayList();
    this.a = new ArrayList();
  }
  
  public final void a(ArrayList<bqw> paramArrayList, dwb paramdwb, int paramInt)
  {
    this.a.clear();
    if (paramArrayList != null)
    {
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
      {
        bqw localbqw = (bqw)localIterator.next();
        this.a.add(localbqw);
      }
    }
    this.c = paramdwb;
    this.i = paramInt;
    requestLayout();
  }
  
  protected final void measureChildren(int paramInt1, int paramInt2)
  {
    int k = View.MeasureSpec.getSize(paramInt1);
    int m = f + e;
    int n = k / m;
    int i1 = this.a.size();
    int i5;
    if ((n < i1) || (this.i > i1))
    {
      int i4;
      do
      {
        int i2 = this.i - i1;
        Resources localResources = getContext().getResources();
        int i3 = efj.xt;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i2);
        String str1 = localResources.getQuantityString(i3, i2, arrayOfObject);
        this.j.setText(str1);
        this.j.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(f, -2147483648));
        i4 = k - i1 * m;
        if ((this.a.size() <= 1) || (i4 >= this.j.getMeasuredWidth())) {
          break;
        }
        i5 = 1;
        if (i5 != 0) {
          i1--;
        }
      } while (i5 != 0);
      this.j.measure(View.MeasureSpec.makeMeasureSpec(i4, -2147483648), View.MeasureSpec.makeMeasureSpec(f, -2147483648));
      this.j.setVisibility(0);
      a(this.j, m * i1, Math.max(0, (f - this.j.getMeasuredHeight()) / 2));
    }
    for (int i6 = i1;; i6 = i1)
    {
      for (int i7 = Math.max(0, i6 - this.b.size()); i7 > 0; i7--)
      {
        AvatarView localAvatarView1 = new AvatarView(getContext());
        localAvatarView1.setOnClickListener(this);
        localAvatarView1.a(1);
        localAvatarView1.e = 1;
        addView(localAvatarView1);
        this.b.add(localAvatarView1);
      }
      i5 = 0;
      break;
      this.j.setVisibility(8);
    }
    int i8 = this.b.size();
    int i9 = 0;
    int i10 = 0;
    if (i9 < i8)
    {
      AvatarView localAvatarView2 = (AvatarView)this.b.get(i9);
      int i12;
      label463:
      int i13;
      if (i9 < i6)
      {
        bqw localbqw = (bqw)this.a.get(i9);
        localAvatarView2.a(localbqw.gaiaId, localbqw.avatarUrl);
        String str2 = localbqw.name;
        if (!TextUtils.isEmpty(str2)) {
          localAvatarView2.setContentDescription(str2);
        }
        localAvatarView2.setVisibility(0);
        localAvatarView2.measure(View.MeasureSpec.makeMeasureSpec(f, 1073741824), View.MeasureSpec.makeMeasureSpec(f, 1073741824));
        if (i9 > 0)
        {
          i12 = e;
          i13 = i12 + i10;
          a(localAvatarView2, i13, 0);
        }
      }
      for (int i11 = i13 + f;; i11 = i10)
      {
        i9++;
        i10 = i11;
        break;
        i12 = 0;
        break label463;
        localAvatarView2.a();
        localAvatarView2.setVisibility(8);
      }
    }
  }
  
  public final void onClick(View paramView)
  {
    if (((paramView instanceof AvatarView)) && (this.c != null)) {
      this.c.b(((AvatarView)paramView).a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvb
 * JD-Core Version:    0.7.0.1
 */