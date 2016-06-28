import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.libraries.social.help.TooltipView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.nio.ByteBuffer;
import java.util.List;

public final class lou
  extends loa
  implements View.OnClickListener, iek
{
  private static int a;
  private static int d;
  private static int e;
  private loc f;
  private lnv g;
  private int h;
  private iee i;
  private TooltipView j;
  
  public lou(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private lou(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private lou(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.f = new loc(paramContext, paramAttributeSet, 0);
    this.i = ((iee)mbb.a(paramContext, iee.class));
    setClickable(false);
    a = (int)getResources().getDimension(ehr.fz);
    e = (int)getResources().getDimension(ehr.fy);
  }
  
  public final void D_()
  {
    super.D_();
    lwo.e(this);
    removeAllViews();
    this.g = null;
    this.j = null;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k = 0;
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    int n = View.MeasureSpec.makeMeasureSpec(this.P, 1073741824);
    this.f.measure(n, m);
    int i1 = a << 1;
    d = (this.P - i1) / 3;
    int i2 = paramInt2 + this.f.getMeasuredHeight();
    int i3 = View.MeasureSpec.makeMeasureSpec(d, 1073741824);
    int i4 = -1 + getChildCount();
    if (this.j != null) {}
    int i7;
    for (int i5 = 1;; i5 = 0)
    {
      int i6 = i4 - i5;
      i7 = i2;
      while (k < i6)
      {
        View localView = getChildAt(k + 1);
        localView.measure(i3, i3);
        if (k % 3 == 0) {
          i7 += localView.getMeasuredHeight();
        }
        k++;
      }
    }
    int i8 = -1 + this.h;
    if (this.j != null)
    {
      this.j.measure(View.MeasureSpec.makeMeasureSpec(2 * d, -2147483648), m);
      int i9 = this.f.getMeasuredWidth() / 4;
      this.j.b(i9);
    }
    return i7 + i8 * a;
  }
  
  protected final int a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    return paramInt5 + getHeight();
  }
  
  protected final void a(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    super.a(paramCursor, paramhfa, paramInt);
    Context localContext1 = getContext();
    Resources localResources = getResources();
    byte[] arrayOfByte = paramCursor.getBlob(30);
    lnv locallnv;
    String str1;
    int i1;
    label156:
    lqe locallqe;
    String str2;
    String str3;
    Context localContext2;
    if (arrayOfByte == null)
    {
      locallnv = null;
      this.g = locallnv;
      int n = this.g.a.length;
      this.h = ((int)Math.ceil(n / 3.0F));
      str1 = localContext1.getString(do.aE);
      this.f.a(0, str1, this.H.i);
      this.f.b = ((int)localResources.getDimension(ehr.fw));
      this.f.c = ((int)localResources.getDimension(ehr.fx));
      this.f.a = aw.eg;
      this.f.d = true;
      addView(this.f);
      i1 = 0;
      if (i1 >= n) {
        break label735;
      }
      locallqe = new lqe(localContext1);
      str2 = this.g.a[i1];
      str3 = this.g.c[i1];
      if (locallqe.a != null)
      {
        locallqe.removeView(locallqe.a);
        locallqe.a.setText(null);
        locallqe.a.setContentDescription("");
      }
      if (locallqe.b != null)
      {
        locallqe.removeView(locallqe.b);
        locallqe.b.a(null);
        locallqe.b.p = null;
        locallqe.b.r = null;
        locallqe.b.q = null;
      }
      locallqe.d = false;
      if (TextUtils.isEmpty(str2)) {
        break label724;
      }
      localContext2 = locallqe.getContext();
      if (locallqe.b == null)
      {
        locallqe.b = new MediaView(localContext2);
        locallqe.b.s = 5;
      }
      if ((i1 & 0x1) != 0) {
        break label716;
      }
    }
    label716:
    for (int i2 = da.az;; i2 = da.ay)
    {
      locallqe.c.setColor(i2);
      locallqe.b.p = locallqe.c;
      locallqe.b.r = locallqe.c;
      locallqe.b.q = locallqe.c;
      if (!TextUtils.isEmpty(str3)) {
        locallqe.b.a(ipf.a(localContext2, str3, ipm.a));
      }
      locallqe.addView(locallqe.b);
      if (locallqe.a == null)
      {
        locallqe.a = new TextView(localContext2);
        locallqe.a.setTextAppearance(localContext2, aw.em);
        locallqe.a.setEllipsize(TextUtils.TruncateAt.END);
        locallqe.a.setSingleLine();
        locallqe.a.setMaxLines(1);
        locallqe.a.setTag(Integer.valueOf(i1));
        int i3 = (int)localContext2.getResources().getDimension(ehr.fA);
        locallqe.a.setPadding(i3, i3, i3, i3);
        locallqe.a.setGravity(80);
      }
      locallqe.a.setContentDescription(str2);
      locallqe.a.setText(str2);
      locallqe.addView(locallqe.a);
      locallqe.d = true;
      locallqe.setOnClickListener(this);
      addView(locallqe);
      i1++;
      break label156;
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      locallnv = new lnv();
      int k = localByteBuffer.getInt();
      locallnv.a = new String[k];
      locallnv.b = new String[k];
      locallnv.c = new String[k];
      for (int m = 0; m < k; m++)
      {
        locallnv.a[m] = lnv.d(localByteBuffer);
        locallnv.b[m] = lnv.d(localByteBuffer);
        locallnv.c[m] = lnv.d(localByteBuffer);
      }
      break;
    }
    label724:
    throw new IllegalStateException("TopicId cannot be null or empty.");
    label735:
    if (this.i != null)
    {
      String str4 = getResources().getString(do.as);
      String str5 = getResources().getString(do.aw);
      ied localied = new ied(((git)mbb.a(getContext(), git.class)).c(), pkh.O, str4, str5, 1);
      if (this.i.a(localied))
      {
        this.j = new TooltipView(localContext1);
        this.j.a(localied);
        this.j.e.add(this);
        this.j.a(0);
        addView(this.j);
        this.i.c(this.j);
      }
    }
    setContentDescription(str1);
  }
  
  public final void a(TooltipView paramTooltipView)
  {
    if (this.j != null) {
      this.j = null;
    }
  }
  
  public final void a(TooltipView paramTooltipView, boolean paramBoolean)
  {
    if (this.j != null) {
      removeView(this.j);
    }
  }
  
  protected final void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k = 0;
    super.a(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int m = this.M.top;
    int n = this.f.getMeasuredHeight();
    this.f.layout(this.M.left, m, this.M.left + this.P, m + n);
    int i1 = -1 + getChildCount();
    int i2;
    int i3;
    if (this.j != null)
    {
      i2 = 1;
      i3 = i1 - i2;
      if (i3 != 0) {
        break label102;
      }
    }
    label102:
    do
    {
      return;
      i2 = 0;
      break;
      int i4 = m + n;
      while (k < i3)
      {
        View localView = getChildAt(k + 1);
        int i9 = k % 3;
        int i10 = this.M.left + i9 * (d + a);
        localView.layout(i10, i4, i10 + localView.getMeasuredWidth(), i4 + localView.getMeasuredHeight());
        if (i9 == 2) {
          i4 += localView.getMeasuredHeight() + a;
        }
        k++;
      }
    } while (this.j == null);
    int i5 = this.f.getLeft();
    int i6 = this.f.getBottom() - e;
    int i7 = i5 + this.j.getMeasuredWidth();
    int i8 = i6 + this.j.getMeasuredHeight();
    this.j.layout(i5, i6, i7, i8);
  }
  
  public final void onClick(View paramView)
  {
    if (this.j != null) {
      this.j.a(true);
    }
    Integer localInteger = (Integer)paramView.getTag();
    if ((this.b != null) && (localInteger != null))
    {
      lob locallob = this.b;
      lnv locallnv = this.g;
      int k = localInteger.intValue();
      locallob.n(locallnv.b[k]);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lou
 * JD-Core Version:    0.7.0.1
 */