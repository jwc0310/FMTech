import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public final class lhw
  extends loa
  implements View.OnClickListener, huv, lor
{
  private lnu a;
  private loc d;
  private TextView e;
  private boolean f = false;
  private lol g;
  private int h;
  private final int i;
  
  public lhw(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    this.i = getResources().getColor(efj.Yv);
    this.d = new loc(localContext);
    this.e = new TextView(localContext);
    this.e.setTextAppearance(localContext, eyg.bN);
    this.e.setText(aau.CH);
    efj.a(this.e, new gxq(pjo.aT));
    this.e.setOnClickListener(new gxn(this));
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = aaw.qy;
    TypedArray localTypedArray = localContext.obtainStyledAttributes(arrayOfInt);
    this.e.setBackgroundResource(localTypedArray.getResourceId(0, 0));
    localTypedArray.recycle();
    this.e.setPadding(this.H.m, this.H.m, this.H.m, this.H.m);
    this.g = new lol(this);
  }
  
  private final int k()
  {
    int j = 0;
    int k = View.MeasureSpec.makeMeasureSpec(this.P, 1073741824);
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    int n = getChildCount();
    int i1 = 0;
    while (j < n)
    {
      View localView = getChildAt(j);
      localView.measure(k, m);
      i1 += localView.getMeasuredHeight();
      j++;
    }
    return i1;
  }
  
  public final void D_()
  {
    super.D_();
    lwo.e(this);
    removeAllViews();
    this.g.D_();
    this.a = null;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return paramInt2 + k();
  }
  
  protected final int a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    return paramInt5 + getHeight();
  }
  
  public final View a(int paramInt, boolean paramBoolean)
  {
    lhv locallhv = new lhv(getContext());
    String str = this.N;
    lob locallob = this.b;
    lnt locallnt = (lnt)this.a.a.get(paramInt);
    int j = this.c;
    locallhv.f = str;
    locallhv.e = locallnt;
    locallhv.g = j;
    locallhv.b = locallob;
    locallhv.c = lhv.a(locallhv.getContext());
    if (locallhv.e.i)
    {
      locallhv.d = locallhv.a.al;
      return locallhv;
    }
    locallhv.d = locallhv.a.aj;
    return locallhv;
  }
  
  public final List<huu> a(View paramView)
  {
    ArrayList localArrayList = new ArrayList();
    int j = getChildCount();
    int k = 0;
    if (k < j)
    {
      View localView = getChildAt(k);
      lhv locallhv;
      String str1;
      if (((localView instanceof lhv)) && (lwo.a(localView, paramView)))
      {
        locallhv = (lhv)localView;
        str1 = String.valueOf(locallhv.e.a);
        if (str1.length() == 0) {
          break label117;
        }
      }
      label117:
      for (String str2 = "g:".concat(str1);; str2 = new String("g:"))
      {
        localArrayList.add(new huu(str2, locallhv.e.g, 110));
        k++;
        break;
      }
    }
    return localArrayList;
  }
  
  protected final void a(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    super.a(paramCursor, paramhfa, paramInt);
    this.a = lnu.a(paramCursor.getBlob(30));
    this.h = Math.min(2, this.a.a.size());
    this.g.a(this.a.a, this.h);
    if (this.c == 7) {}
    for (boolean bool = true;; bool = false)
    {
      this.f = bool;
      efj.i(this);
      return;
    }
  }
  
  protected final void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.a(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int j = this.M.top;
    int k = 0;
    int m = getChildCount();
    while (k < m)
    {
      View localView = getChildAt(k);
      int n = localView.getMeasuredHeight();
      localView.layout(this.M.left, j, this.M.left + this.P, j + n);
      j += n;
      k++;
    }
  }
  
  public final void f()
  {
    Context localContext = getContext();
    if (this.c == 7) {}
    for (int j = aau.CI;; j = aau.CJ)
    {
      String str = localContext.getString(j);
      this.d.a(this.i, str, this.H.ak);
      setContentDescription(str);
      addView(this.d);
      return;
    }
  }
  
  public final void g()
  {
    addView(this.e);
  }
  
  public final int h()
  {
    return this.h;
  }
  
  public final int i()
  {
    return lhv.a(getContext());
  }
  
  public final lol j()
  {
    return this.g;
  }
  
  public final void onClick(View paramView)
  {
    if ((paramView == this.e) && (this.b != null)) {
      this.b.ak();
    }
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.g.b(paramMotionEvent);
  }
  
  @TargetApi(18)
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if ((Build.VERSION.SDK_INT < 18) || (isInLayout())) {
      k();
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.g.a(paramMotionEvent);
  }
  
  public final gxq v()
  {
    return new gxq(pkh.n);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lhw
 * JD-Core Version:    0.7.0.1
 */