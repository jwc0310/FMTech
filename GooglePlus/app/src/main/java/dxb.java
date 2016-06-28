import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.ExpandableListView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SectionIndexer;
import android.widget.TextView;

public class dxb
{
  private static int o = 4;
  private static final int[] p = { 16842919 };
  private static final int[] q = new int[0];
  private final Handler A = new Handler();
  private ListAdapter B;
  private SectionIndexer C;
  private final dxd D;
  public Drawable a;
  public Drawable b;
  public int c;
  public int d;
  public int e;
  public final AbsListView f;
  public final TextView g;
  public String h;
  public boolean i;
  public dxe j;
  public int k;
  public boolean l;
  public final View m;
  public final dxc n;
  private RectF r;
  private int s;
  private boolean t;
  private int u;
  private Paint v;
  private int w;
  private int x = -1;
  private boolean y;
  private Object[] z;
  
  public dxb(Context paramContext, AbsListView paramAbsListView, TextView paramTextView, View paramView, dxd paramdxd, dxc paramdxc)
  {
    this.f = paramAbsListView;
    this.g = paramTextView;
    this.m = paramView;
    if (paramdxd == null) {
      throw new NullPointerException();
    }
    this.D = ((dxd)paramdxd);
    if (paramdxc == null) {
      throw new NullPointerException();
    }
    this.n = ((dxc)paramdxc);
    Resources localResources = paramContext.getResources();
    TypedArray localTypedArray1 = paramContext.getTheme().obtainStyledAttributes(new int[] { 16843574, 16843577 });
    this.a = localResources.getDrawable(efj.oV);
    this.d = paramContext.getResources().getDimensionPixelSize(efj.lS);
    this.c = paramContext.getResources().getDimensionPixelSize(efj.lR);
    this.l = true;
    this.b = localResources.getDrawable(efj.oW);
    localTypedArray1.recycle();
    this.t = true;
    d();
    this.s = paramContext.getResources().getDimensionPixelSize(efj.lQ);
    this.r = new RectF();
    this.j = new dxe(this);
    this.v = new Paint();
    this.v.setAntiAlias(true);
    this.v.setTextAlign(Paint.Align.CENTER);
    this.v.setTextSize(this.s / 2);
    TypedArray localTypedArray2 = paramContext.getTheme().obtainStyledAttributes(new int[] { 16842806 });
    ColorStateList localColorStateList = localTypedArray2.getColorStateList(localTypedArray2.getIndex(0));
    localTypedArray2.recycle();
    int i1 = localColorStateList.getDefaultColor();
    this.v.setColor(i1);
    this.v.setStyle(Paint.Style.FILL_AND_STROKE);
    this.k = 0;
    h();
  }
  
  private boolean a(float paramFloat1, float paramFloat2)
  {
    return (paramFloat1 > f()) && (paramFloat1 < e()) && (paramFloat2 >= this.e) && (paramFloat2 <= this.e + this.c);
  }
  
  private final int e()
  {
    int i1 = this.m.getWidth();
    if (dxc.a.equals(this.n)) {
      i1 = this.d;
    }
    return i1;
  }
  
  private final int f()
  {
    int i1 = this.m.getWidth();
    if (dxc.a.equals(this.n)) {
      return 0;
    }
    return i1 - this.d;
  }
  
  private final void g()
  {
    this.a.setBounds(f(), 0, e(), this.c);
    this.a.setAlpha(255);
  }
  
  private final void h()
  {
    if (this.k == 2) {}
    for (int[] arrayOfInt = p;; arrayOfInt = q)
    {
      if ((this.a != null) && (this.a.isStateful())) {
        this.a.setState(arrayOfInt);
      }
      if ((this.b != null) && (this.b.isStateful())) {
        this.b.setState(arrayOfInt);
      }
      return;
    }
  }
  
  void a()
  {
    if (this.D.equals(dxd.a)) {
      a(1);
    }
  }
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
    case 0: 
    case 1: 
    case 2: 
      for (;;)
      {
        this.k = paramInt;
        h();
        return;
        this.A.removeCallbacks(this.j);
        this.m.invalidate();
        continue;
        if (this.k != 1) {
          g();
        }
        this.A.removeCallbacks(this.j);
        if ((this.g != null) && (this.g.getVisibility() == 0))
        {
          this.g.setVisibility(4);
          AlphaAnimation localAlphaAnimation2 = new AlphaAnimation(1.0F, 0.0F);
          localAlphaAnimation2.setDuration(2000L);
          localAlphaAnimation2.setStartOffset(0L);
          this.g.setAnimation(localAlphaAnimation2);
          continue;
          this.A.removeCallbacks(this.j);
          if (this.g != null) {
            this.g.setVisibility(0);
          }
          AlphaAnimation localAlphaAnimation1 = new AlphaAnimation(0.0F, 1.0F);
          localAlphaAnimation1.setDuration(2000L);
          localAlphaAnimation1.setStartOffset(0L);
          if (this.g != null) {
            this.g.setAnimation(localAlphaAnimation1);
          }
        }
      }
    }
    View localView = this.m;
    int i1 = this.m.getWidth();
    boolean bool = dxc.a.equals(this.n);
    int i2 = 0;
    if (bool) {}
    for (;;)
    {
      int i3 = this.e;
      int i4 = this.m.getWidth();
      if (dxc.a.equals(this.n)) {
        i4 = this.d;
      }
      localView.invalidate(i2, i3, i4, this.e + this.c);
      break;
      i2 = i1 - this.d;
    }
  }
  
  public void a(Canvas paramCanvas, String paramString)
  {
    if (this.g == null)
    {
      Paint localPaint = this.v;
      float f1 = localPaint.descent();
      RectF localRectF = this.r;
      paramCanvas.drawText(paramString, (int)(localRectF.left + localRectF.right) / 2, (int)(localRectF.bottom + localRectF.top) / 2 + this.s / 4 - f1, localPaint);
    }
  }
  
  void a(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool;
    if ((this.x != paramInt3) && (paramInt2 > 0))
    {
      this.x = paramInt3;
      if (this.x / paramInt2 >= o)
      {
        bool = true;
        this.y = bool;
      }
    }
    else
    {
      if (this.y) {
        break label66;
      }
      if (this.k != 0) {
        a(0);
      }
    }
    label66:
    do
    {
      do
      {
        do
        {
          return;
          bool = false;
          break;
          if ((paramInt3 - paramInt2 > 0) && (this.k != 2))
          {
            int i1 = this.e;
            this.e = (paramInt1 * (this.f.getHeight() - this.c) / (paramInt3 - paramInt2));
            if (this.l)
            {
              g();
              this.l = false;
            }
            if (this.e != i1) {
              this.m.invalidate();
            }
          }
          this.t = true;
        } while (paramInt1 == this.u);
        this.u = paramInt1;
      } while (this.k == 2);
      a(1);
    } while (!this.D.equals(dxd.b));
    this.A.postDelayed(this.j, 2500L);
  }
  
  boolean a(MotionEvent paramMotionEvent)
  {
    if ((this.k > 0) && (paramMotionEvent.getAction() == 0) && (a(paramMotionEvent.getX(), paramMotionEvent.getY())))
    {
      a(2);
      return true;
    }
    return false;
  }
  
  void b()
  {
    a(0);
  }
  
  boolean b(MotionEvent paramMotionEvent)
  {
    if (this.k == 0) {
      return false;
    }
    int i1 = paramMotionEvent.getAction();
    float f1;
    int i4;
    float f2;
    Object[] arrayOfObject;
    int i8;
    int i9;
    int i10;
    int i11;
    if (i1 == 0)
    {
      if (a(paramMotionEvent.getX(), paramMotionEvent.getY()))
      {
        a(2);
        if ((this.B == null) && (this.f != null)) {
          d();
        }
        MotionEvent localMotionEvent = MotionEvent.obtain(0L, 0L, 3, 0.0F, 0.0F, 0);
        this.f.onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
        return true;
      }
    }
    else if (i1 == 1)
    {
      if (this.k == 2)
      {
        a(1);
        Handler localHandler = this.A;
        localHandler.removeCallbacks(this.j);
        if (this.D.equals(dxd.b)) {
          localHandler.postDelayed(this.j, 1000L);
        }
        return true;
      }
    }
    else if ((i1 == 2) && (this.k == 2))
    {
      int i2 = this.f.getHeight();
      int i3 = 10 + ((int)paramMotionEvent.getY() - this.c);
      if (i3 < 0) {
        i3 = 0;
      }
      while (Math.abs(this.e - i3) < 2)
      {
        return true;
        if (i3 + this.c > i2) {
          i3 = i2 - this.c;
        }
      }
      this.e = i3;
      if (this.t)
      {
        f1 = this.e / (i2 - this.c);
        i4 = this.f.getCount();
        this.t = false;
        f2 = 1.0F / i4 / 8.0F;
        arrayOfObject = this.z;
        if ((arrayOfObject != null) && (arrayOfObject.length > 1))
        {
          i8 = arrayOfObject.length;
          i9 = (int)(f1 * i8);
          if (i9 >= i8) {
            i9 = i8 - 1;
          }
          i10 = this.C.getPositionForSection(i9);
          i11 = i9 + 1;
          if (i9 >= i8 - 1) {
            break label884;
          }
        }
      }
    }
    label426:
    label559:
    label692:
    label826:
    label847:
    label884:
    for (int i12 = this.C.getPositionForSection(i9 + 1);; i12 = i4)
    {
      int i13;
      int i17;
      int i18;
      int i19;
      int i14;
      int i6;
      if (i12 == i10)
      {
        i13 = i10;
        i17 = i9;
        if (i17 > 0)
        {
          i18 = i17 - 1;
          i19 = this.C.getPositionForSection(i18);
          if (i19 != i10)
          {
            i14 = i18;
            i6 = i18;
            i13 = i19;
            if (i6 == 0) {
              i6 = this.C.getSectionForPosition(0);
            }
          }
        }
      }
      for (;;)
      {
        int i15 = i11 + 1;
        for (;;)
        {
          if ((i15 < i8) && (this.C.getPositionForSection(i15) == i12))
          {
            i15++;
            i11++;
            continue;
            if (i18 != 0) {
              break label847;
            }
            i14 = i9;
            i13 = i19;
            i6 = 0;
            break;
          }
        }
        float f3 = i14 / i8;
        float f4 = i11 / i8;
        int i16;
        int i7;
        if ((i14 == i9) && (f1 - f3 < f2))
        {
          i16 = i13;
          if (i16 > i4 - 1) {
            i16 = i4 - 1;
          }
          i7 = i16;
          if (!(this.f instanceof ExpandableListView)) {
            break label692;
          }
          ExpandableListView localExpandableListView = (ExpandableListView)this.f;
          localExpandableListView.setSelectionFromTop(localExpandableListView.getFlatListPosition(ExpandableListView.getPackedPositionForGroup(i7 + this.w)), 0);
        }
        boolean bool;
        for (;;)
        {
          if (i6 >= 0)
          {
            if (arrayOfObject == null)
            {
              throw new AssertionError(70 + "sectionIndex=" + i6 + " for null sections. This should be impossible.");
              i16 = i13 + (int)((i12 - i13) * (f1 - f3) / (f4 - f3));
              break;
              int i5 = (int)(f1 * i4);
              i6 = -1;
              i7 = i5;
              break label559;
              if ((this.f instanceof ListView))
              {
                ((ListView)this.f).setSelectionFromTop(i7 + this.w, 0);
                continue;
              }
              this.f.setSelection(i7 + this.w);
              continue;
            }
            String str = arrayOfObject[i6].toString();
            this.h = str;
            if (((str.length() != 1) || (str.charAt(0) != ' ')) && (i6 < arrayOfObject.length))
            {
              bool = true;
              this.i = bool;
              if (this.g != null)
              {
                if (!this.i) {
                  break label826;
                }
                this.g.setText(this.h);
              }
            }
          }
        }
        for (;;)
        {
          return true;
          bool = false;
          break;
          this.g.setText(null);
          continue;
          this.i = false;
        }
        return false;
        i17 = i18;
        i13 = i19;
        break;
        i14 = i9;
        i6 = i9;
        break label426;
        i13 = i10;
        i6 = i9;
        i14 = i9;
      }
    }
  }
  
  boolean c()
  {
    return this.k != 0;
  }
  
  final void d()
  {
    ListAdapter localListAdapter = (ListAdapter)this.f.getAdapter();
    this.C = null;
    if ((localListAdapter instanceof HeaderViewListAdapter))
    {
      this.w = ((HeaderViewListAdapter)localListAdapter).getHeadersCount();
      localListAdapter = ((HeaderViewListAdapter)localListAdapter).getWrappedAdapter();
    }
    this.B = localListAdapter;
    if ((localListAdapter instanceof SectionIndexer))
    {
      this.C = ((SectionIndexer)localListAdapter);
      this.z = this.C.getSections();
      return;
    }
    this.z = new String[] { " " };
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dxb
 * JD-Core Version:    0.7.0.1
 */