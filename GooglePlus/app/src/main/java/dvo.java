import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class dvo
  extends ViewGroup
  implements View.OnClickListener, lxj
{
  private Context a;
  private int b;
  private dvp c;
  private dvn[] d;
  private int e;
  private int f;
  private int g;
  
  public dvo(Context paramContext)
  {
    this(paramContext, null);
    a(paramContext);
  }
  
  private dvo(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, null);
    a(paramContext);
  }
  
  private final void a(Context paramContext)
  {
    this.b = new hfa(paramContext, loh.a).d;
    this.a = paramContext;
  }
  
  public final void D_()
  {
    for (int i = 0; i < this.e; i++) {
      if (this.d[i] != null) {
        this.d[i].D_();
      }
    }
  }
  
  public final void a(Cursor paramCursor, int[] paramArrayOfInt, dvp paramdvp)
  {
    removeAllViews();
    this.c = paramdvp;
    this.e = paramArrayOfInt.length;
    this.d = new dvn[this.e];
    for (int i = 0; i < this.e; i++)
    {
      int j = paramArrayOfInt[i];
      if ((j != -1) && (paramCursor.moveToPosition(j)))
      {
        this.d[i] = new dvn(this.a);
        dvn localdvn = this.d[i];
        localdvn.a = paramCursor.getString(0);
        localdvn.b = paramCursor.getString(1);
        int k = paramCursor.getInt(3);
        localdvn.c.setText(localdvn.b);
        TextView localTextView = localdvn.c;
        Resources localResources = localdvn.getResources();
        int m = efj.xw;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = localdvn.b;
        arrayOfObject[1] = Integer.valueOf(k);
        localTextView.setContentDescription(localResources.getQuantityString(m, k, arrayOfObject));
        String str1 = paramCursor.getString(4);
        String str2 = hdo.b(paramCursor.getString(5));
        localdvn.d.a(jjf.c(str1), str2);
        AvatarView localAvatarView1;
        AvatarView localAvatarView2;
        boolean bool;
        label248:
        int n;
        if (str2 != null)
        {
          localAvatarView1 = localdvn.d;
          localAvatarView2 = localAvatarView1;
          bool = false;
          localAvatarView2.f = bool;
          localAvatarView2.invalidate();
          n = 1;
          label263:
          if (n > 4) {
            break label413;
          }
          int i1 = 4 + n * 2;
          String str4 = paramCursor.getString(i1);
          String str5 = hdo.b(paramCursor.getString(i1 + 1));
          localdvn.e[(n - 1)].a(jjf.c(str4), str5);
          if (str4 == null) {
            break label387;
          }
          AvatarView localAvatarView4 = localdvn.e[(n - 1)];
          localAvatarView4.f = false;
          localAvatarView4.invalidate();
        }
        for (;;)
        {
          n++;
          break label263;
          String str3 = paramCursor.getString(4);
          localAvatarView1 = localdvn.d;
          if (str3 != null) {
            break;
          }
          localAvatarView2 = localAvatarView1;
          bool = true;
          break label248;
          label387:
          AvatarView localAvatarView3 = localdvn.e[(n - 1)];
          localAvatarView3.f = true;
          localAvatarView3.invalidate();
        }
        label413:
        this.d[i].setOnClickListener(this);
        addView(this.d[i]);
      }
    }
  }
  
  public final void onClick(View paramView)
  {
    if (this.c != null)
    {
      dvn localdvn = (dvn)paramView;
      String str1 = localdvn.a;
      String str2 = localdvn.b;
      this.c.a(str1, str2);
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getPaddingTop();
    int j = i + this.g;
    int k = getPaddingLeft();
    for (int m = 0; m < this.e; m++) {
      if (this.d[m] != null)
      {
        this.d[m].layout(k, i, k + this.f, j);
        k += this.f + this.b;
      }
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.d != null) {}
    for (int i = this.d.length; i == 0; i = 0)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int j = View.MeasureSpec.getSize(paramInt1);
    this.f = ((j - getPaddingLeft() - getPaddingRight() - this.b * (-1 + this.e)) / this.e);
    for (int k = 0; k < this.e; k++) {
      if (this.d[k] != null) {
        this.d[k].measure(View.MeasureSpec.makeMeasureSpec(this.f, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
      }
    }
    this.g = this.d[0].getMeasuredHeight();
    setMeasuredDimension(j, this.g + getPaddingTop() + getPaddingBottom());
  }
  
  public final void requestLayout()
  {
    forceLayout();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvo
 * JD-Core Version:    0.7.0.1
 */