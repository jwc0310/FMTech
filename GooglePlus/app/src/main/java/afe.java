import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.Locale;

public class afe
{
  private static Method a;
  private Context b;
  private ListAdapter c;
  private int d = -2;
  public PopupWindow e;
  public afh f;
  int g = -2;
  int h;
  int i;
  boolean j;
  public int k = 0;
  int l = 2147483647;
  int m = 0;
  public View n;
  public AdapterView.OnItemClickListener o;
  final afp p = new afp(this);
  Handler q = new Handler();
  public boolean r;
  private boolean s = false;
  private boolean t = false;
  private DataSetObserver u;
  private final afo v = new afo(this);
  private final afn w = new afn(this);
  private final afl x = new afl(this);
  private Rect y = new Rect();
  
  static
  {
    try
    {
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = Boolean.TYPE;
      a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", arrayOfClass);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}
  }
  
  public afe(Context paramContext)
  {
    this(paramContext, null, aau.V);
  }
  
  public afe(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public afe(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this.b = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, wb.an, paramInt1, paramInt2);
    this.h = localTypedArray.getDimensionPixelOffset(wb.ao, 0);
    this.i = localTypedArray.getDimensionPixelOffset(wb.ap, 0);
    if (this.i != 0) {
      this.j = true;
    }
    localTypedArray.recycle();
    this.e = new zb(paramContext, paramAttributeSet, paramInt1);
    this.e.setInputMethodMode(1);
    Locale localLocale = this.b.getResources().getConfiguration().locale;
    ki.a.a(localLocale);
  }
  
  public final void a(int paramInt)
  {
    Drawable localDrawable = this.e.getBackground();
    if (localDrawable != null)
    {
      localDrawable.getPadding(this.y);
      this.g = (paramInt + (this.y.left + this.y.right));
      return;
    }
    this.g = paramInt;
  }
  
  public void a(ListAdapter paramListAdapter)
  {
    if (this.u == null) {
      this.u = new afm(this);
    }
    for (;;)
    {
      this.c = paramListAdapter;
      if (this.c != null) {
        paramListAdapter.registerDataSetObserver(this.u);
      }
      if (this.f != null) {
        this.f.setAdapter(this.c);
      }
      return;
      if (this.c != null) {
        this.c.unregisterDataSetObserver(this.u);
      }
    }
  }
  
  public void b()
  {
    boolean bool2;
    label126:
    int i1;
    if (this.f == null)
    {
      Context localContext = this.b;
      new aff(this);
      if (!this.r)
      {
        bool2 = true;
        this.f = new afh(localContext, bool2);
        this.f.setAdapter(this.c);
        this.f.setOnItemClickListener(this.o);
        this.f.setFocusable(true);
        this.f.setFocusableInTouchMode(true);
        this.f.setOnItemSelectedListener(new afg(this));
        this.f.setOnScrollListener(this.w);
        afh localafh2 = this.f;
        this.e.setContentView(localafh2);
        Drawable localDrawable1 = this.e.getBackground();
        if (localDrawable1 == null) {
          break label344;
        }
        localDrawable1.getPadding(this.y);
        i1 = this.y.top + this.y.bottom;
        if (!this.j) {
          this.i = (-this.y.top);
        }
      }
    }
    int i2;
    int i15;
    int i21;
    int i22;
    label265:
    int i24;
    for (;;)
    {
      this.e.getInputMethodMode();
      i2 = this.e.getMaxAvailableHeight(this.n, this.i);
      if (this.d != -1) {
        break label356;
      }
      i15 = i1 + i2;
      boolean bool1 = e();
      if (!this.e.isShowing()) {
        break label844;
      }
      if (this.g != -1) {
        break label743;
      }
      i21 = -1;
      if (this.d != -1) {
        break label819;
      }
      if (!bool1) {
        break label773;
      }
      i22 = i15;
      if (!bool1) {
        break label785;
      }
      PopupWindow localPopupWindow4 = this.e;
      if (this.g != -1) {
        break label779;
      }
      i24 = -1;
      label287:
      localPopupWindow4.setWindowLayoutMode(i24, 0);
      label295:
      this.e.setOutsideTouchable(true);
      this.e.update(this.n, this.h, this.i, i21, i22);
      label326:
      return;
      bool2 = false;
      break;
      this.e.getContentView();
      break label126;
      label344:
      this.y.setEmpty();
      i1 = 0;
    }
    label356:
    int i3;
    switch (this.g)
    {
    default: 
      i3 = View.MeasureSpec.makeMeasureSpec(this.g, 1073741824);
    }
    afh localafh1;
    int i4;
    int i5;
    int i6;
    Drawable localDrawable2;
    ListAdapter localListAdapter;
    label461:
    int i14;
    for (;;)
    {
      localafh1 = this.f;
      i4 = localafh1.getListPaddingTop();
      i5 = localafh1.getListPaddingBottom();
      localafh1.getListPaddingLeft();
      localafh1.getListPaddingRight();
      i6 = localafh1.getDividerHeight();
      localDrawable2 = localafh1.getDivider();
      localListAdapter = localafh1.getAdapter();
      if (localListAdapter != null) {
        break label561;
      }
      i7 = i5 + i4;
      if (i7 <= 0) {
        break label1124;
      }
      i14 = i1 + 0;
      label471:
      i15 = i14 + i7;
      break;
      i3 = View.MeasureSpec.makeMeasureSpec(this.b.getResources().getDisplayMetrics().widthPixels - (this.y.left + this.y.right), -2147483648);
      continue;
      i3 = View.MeasureSpec.makeMeasureSpec(this.b.getResources().getDisplayMetrics().widthPixels - (this.y.left + this.y.right), 1073741824);
    }
    label561:
    int i7 = i5 + i4;
    label578:
    View localView1;
    int i10;
    label596:
    View localView2;
    label628:
    int i12;
    if ((i6 > 0) && (localDrawable2 != null))
    {
      localView1 = null;
      int i8 = 0;
      int i9 = localListAdapter.getCount();
      i10 = 0;
      if (i10 >= i9) {
        break label741;
      }
      int i11 = localListAdapter.getItemViewType(i10);
      if (i11 == i8) {
        break label1130;
      }
      localView2 = null;
      i8 = i11;
      localView1 = localListAdapter.getView(i10, localView2, localafh1);
      ViewGroup.LayoutParams localLayoutParams = localView1.getLayoutParams();
      if ((localLayoutParams == null) || (localLayoutParams.height <= 0)) {
        break label727;
      }
      i12 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
      label676:
      localView1.measure(i3, i12);
      if (i10 <= 0) {
        break label1137;
      }
    }
    label727:
    label741:
    label743:
    label1130:
    label1137:
    for (int i13 = i7 + i6;; i13 = i7)
    {
      for (;;)
      {
        i7 = i13 + localView1.getMeasuredHeight();
        if (i7 >= i2)
        {
          i7 = i2;
          break label461;
          i6 = 0;
          break label578;
          i12 = View.MeasureSpec.makeMeasureSpec(0, 0);
          break label676;
        }
        i10++;
        break label596;
        break label461;
        if (this.g == -2)
        {
          i21 = this.n.getWidth();
          break;
        }
        i21 = this.g;
        break;
        i22 = -1;
        break label265;
        i24 = 0;
        break label287;
        PopupWindow localPopupWindow3 = this.e;
        if (this.g == -1) {}
        for (int i23 = -1;; i23 = 0)
        {
          localPopupWindow3.setWindowLayoutMode(i23, -1);
          break;
        }
        if (this.d == -2)
        {
          i22 = i15;
          break label295;
        }
        i22 = this.d;
        break label295;
        int i16;
        int i17;
        if (this.g == -1)
        {
          i16 = -1;
          if (this.d != -1) {
            break label1078;
          }
          i17 = -1;
          this.e.setWindowLayoutMode(i16, i17);
          if (a == null) {}
        }
        try
        {
          Method localMethod = a;
          PopupWindow localPopupWindow2 = this.e;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Boolean.valueOf(true);
          localMethod.invoke(localPopupWindow2, arrayOfObject);
          this.e.setOutsideTouchable(true);
          this.e.setTouchInterceptor(this.v);
          PopupWindow localPopupWindow1 = this.e;
          View localView3 = this.n;
          int i18 = this.h;
          int i19 = this.i;
          int i20 = this.k;
          sh.a.a(localPopupWindow1, localView3, i18, i19, i20);
          this.f.setSelection(-1);
          if ((!this.r) || (this.f.isInTouchMode())) {
            d();
          }
          if (this.r) {
            break label326;
          }
          this.q.post(this.x);
          return;
          if (this.g == -2)
          {
            this.e.setWidth(this.n.getWidth());
            i16 = 0;
            break label855;
          }
          this.e.setWidth(this.g);
          i16 = 0;
          break label855;
          if (this.d == -2)
          {
            this.e.setHeight(i15);
            i17 = 0;
            break label866;
          }
          this.e.setHeight(this.d);
          i17 = 0;
        }
        catch (Exception localException)
        {
          break label918;
        }
      }
      i14 = 0;
      break label471;
      localView2 = localView1;
      break label628;
    }
  }
  
  public final void c()
  {
    this.e.dismiss();
    this.e.setContentView(null);
    this.f = null;
    this.q.removeCallbacks(this.p);
  }
  
  public final void d()
  {
    afh localafh = this.f;
    if (localafh != null)
    {
      localafh.b = true;
      localafh.requestLayout();
    }
  }
  
  public final boolean e()
  {
    return this.e.getInputMethodMode() == 2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afe
 * JD-Core Version:    0.7.0.1
 */