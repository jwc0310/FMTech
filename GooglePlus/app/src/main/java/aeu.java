import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class aeu
  extends ViewGroup
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private float f;
  public boolean g;
  public boolean h;
  public int i;
  private int[] j;
  private int[] k;
  private Drawable l;
  private int m;
  private int n;
  private int o;
  
  public aeu(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public aeu(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public aeu(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.g = bool1;
    this.a = -1;
    this.b = 0;
    this.d = 8388659;
    zw localzw = zw.a(paramContext, paramAttributeSet, wb.aa, paramInt, 0);
    int i1 = wb.ah;
    int i2 = localzw.a.getInt(i1, -1);
    if ((i2 >= 0) && (this.c != i2))
    {
      this.c = i2;
      requestLayout();
    }
    int i3 = wb.ag;
    int i4 = localzw.a.getInt(i3, -1);
    if (i4 >= 0) {
      b(i4);
    }
    int i5 = wb.ae;
    boolean bool2 = localzw.a.getBoolean(i5, bool1);
    if (!bool2) {
      this.g = bool2;
    }
    int i6 = wb.ai;
    this.f = localzw.a.getFloat(i6, -1.0F);
    int i7 = wb.af;
    this.a = localzw.a.getInt(i7, -1);
    int i8 = wb.al;
    this.h = localzw.a.getBoolean(i8, false);
    Drawable localDrawable = localzw.a(wb.aj);
    if (localDrawable != this.l)
    {
      this.l = localDrawable;
      if (localDrawable == null) {
        break label318;
      }
      this.i = localDrawable.getIntrinsicWidth();
      this.m = localDrawable.getIntrinsicHeight();
      if (localDrawable != null) {
        break label331;
      }
    }
    for (;;)
    {
      setWillNotDraw(bool1);
      requestLayout();
      int i9 = wb.am;
      this.n = localzw.a.getInt(i9, 0);
      int i10 = wb.ak;
      this.o = localzw.a.getDimensionPixelSize(i10, 0);
      localzw.a.recycle();
      return;
      label318:
      this.i = 0;
      this.m = 0;
      break;
      label331:
      bool1 = false;
    }
  }
  
  private final void a(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    for (int i2 = 0; i2 < paramInt1; i2++)
    {
      View localView = getChildAt(i2);
      if (localView.getVisibility() != 8)
      {
        aev localaev = (aev)localView.getLayoutParams();
        if (localaev.width == -1)
        {
          int i3 = localaev.height;
          localaev.height = localView.getMeasuredHeight();
          measureChildWithMargins(localView, i1, 0, paramInt2, 0);
          localaev.height = i3;
        }
      }
    }
  }
  
  private void a(Canvas paramCanvas, int paramInt)
  {
    this.l.setBounds(getPaddingLeft() + this.o, paramInt, getWidth() - getPaddingRight() - this.o, paramInt + this.m);
    this.l.draw(paramCanvas);
  }
  
  private boolean a(int paramInt)
  {
    if (paramInt == 0) {
      if ((0x1 & this.n) == 0) {}
    }
    do
    {
      return true;
      return false;
      if (paramInt != getChildCount()) {
        break;
      }
    } while ((0x4 & this.n) != 0);
    return false;
    if ((0x2 & this.n) != 0) {
      for (int i1 = paramInt - 1;; i1--)
      {
        if (i1 < 0) {
          break label74;
        }
        if (getChildAt(i1).getVisibility() != 8) {
          break;
        }
      }
    }
    return false;
    label74:
    return false;
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    this.e = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 1;
    float f1 = 0.0F;
    int i6 = getChildCount();
    int i7 = View.MeasureSpec.getMode(paramInt1);
    int i8 = View.MeasureSpec.getMode(paramInt2);
    int i9 = 0;
    int i10 = 0;
    if ((this.j == null) || (this.k == null))
    {
      this.j = new int[4];
      this.k = new int[4];
    }
    int[] arrayOfInt1 = this.j;
    int[] arrayOfInt2 = this.k;
    arrayOfInt1[3] = -1;
    arrayOfInt1[2] = -1;
    arrayOfInt1[1] = -1;
    arrayOfInt1[0] = -1;
    arrayOfInt2[3] = -1;
    arrayOfInt2[2] = -1;
    arrayOfInt2[1] = -1;
    arrayOfInt2[0] = -1;
    boolean bool1 = this.g;
    boolean bool2 = this.h;
    if (i7 == 1073741824) {}
    int i12;
    int i13;
    View localView6;
    int i66;
    for (int i11 = 1;; i11 = 0)
    {
      i12 = -2147483648;
      for (i13 = 0;; i13 = i66 + 1)
      {
        if (i13 >= i6) {
          break label891;
        }
        localView6 = getChildAt(i13);
        if (localView6 != null) {
          break;
        }
        this.e = this.e;
        i66 = i13;
      }
    }
    aev localaev4;
    float f7;
    label304:
    int i72;
    int i73;
    label333:
    int i63;
    int i74;
    label355:
    int i75;
    int i76;
    int i65;
    int i85;
    label429:
    int i78;
    int i79;
    label501:
    int i81;
    label520:
    float f6;
    int i60;
    int i62;
    int i59;
    int i64;
    int i61;
    int i58;
    if (localView6.getVisibility() != 8)
    {
      if (a(i13)) {
        this.e += this.i;
      }
      localaev4 = (aev)localView6.getLayoutParams();
      f7 = f1 + localaev4.g;
      if ((i7 == 1073741824) && (localaev4.width == 0) && (localaev4.g > 0.0F)) {
        if (i11 != 0)
        {
          this.e += localaev4.leftMargin + localaev4.rightMargin;
          if (!bool1) {
            break label635;
          }
          int i88 = View.MeasureSpec.makeMeasureSpec(0, 0);
          localView6.measure(i88, i88);
          i72 = i12;
          i73 = i10;
          if ((i8 == 1073741824) || (localaev4.height != -1)) {
            break label2321;
          }
          i63 = 1;
          i74 = 1;
          i75 = localaev4.topMargin + localaev4.bottomMargin;
          i76 = i75 + localView6.getMeasuredHeight();
          int i77 = nj.a.d(localView6);
          i65 = aab.a(i2, i77);
          if (bool1)
          {
            int i84 = localView6.getBaseline();
            if (i84 != -1)
            {
              if (localaev4.h >= 0) {
                break label816;
              }
              i85 = this.d;
              int i86 = (0xFFFFFFFE & (i85 & 0x70) >> 4) >> 1;
              arrayOfInt1[i86] = Math.max(arrayOfInt1[i86], i84);
              arrayOfInt2[i86] = Math.max(arrayOfInt2[i86], i76 - i84);
            }
          }
          i78 = Math.max(i1, i76);
          if ((i5 == 0) || (localaev4.height != -1)) {
            break label826;
          }
          i79 = 1;
          if (localaev4.g <= 0.0F) {
            break label839;
          }
          if (i74 == 0) {
            break label832;
          }
          i81 = i75;
          int i82 = Math.max(i4, i81);
          f6 = f7;
          i60 = i79;
          i62 = i3;
          i59 = i73;
          i64 = i78;
          int i83 = i72;
          i61 = i82;
          i58 = i83;
        }
      }
    }
    for (;;)
    {
      i10 = i59;
      i5 = i60;
      i4 = i61;
      i3 = i62;
      i2 = i65;
      i1 = i64;
      i9 = i63;
      i12 = i58;
      f1 = f6;
      i66 = i13;
      break;
      int i87 = this.e;
      this.e = Math.max(i87, i87 + localaev4.leftMargin + localaev4.rightMargin);
      break label304;
      label635:
      i72 = i12;
      i73 = 1;
      break label333;
      int i67 = -2147483648;
      if ((localaev4.width == 0) && (localaev4.g > 0.0F))
      {
        i67 = 0;
        localaev4.width = -2;
      }
      int i68 = i67;
      int i69;
      label694:
      int i70;
      if (f7 == 0.0F)
      {
        i69 = this.e;
        measureChildWithMargins(localView6, paramInt1, i69, paramInt2, 0);
        if (i68 != -2147483648) {
          localaev4.width = i68;
        }
        i70 = localView6.getMeasuredWidth();
        if (i11 == 0) {
          break label781;
        }
        this.e += i70 + localaev4.leftMargin + localaev4.rightMargin;
      }
      for (;;)
      {
        if (bool2)
        {
          i72 = Math.max(i70, i12);
          i73 = i10;
          break;
          i69 = 0;
          break label694;
          label781:
          int i71 = this.e;
          this.e = Math.max(i71, i71 + i70 + localaev4.leftMargin + localaev4.rightMargin);
          continue;
          label816:
          i85 = localaev4.h;
          break label429;
          label826:
          i79 = 0;
          break label501;
          label832:
          i81 = i76;
          break label520;
          label839:
          if (i74 != 0) {}
          for (;;)
          {
            int i80 = Math.max(i3, i75);
            f6 = f7;
            i60 = i79;
            i62 = i80;
            i59 = i73;
            i58 = i72;
            i61 = i4;
            i64 = i78;
            break;
            i75 = i76;
          }
          label891:
          if ((this.e > 0) && (a(i6))) {
            this.e += this.i;
          }
          int i14;
          if ((arrayOfInt1[1] != -1) || (arrayOfInt1[0] != -1) || (arrayOfInt1[2] != -1) || (arrayOfInt1[3] != -1)) {
            i14 = Math.max(arrayOfInt1[3], Math.max(arrayOfInt1[0], Math.max(arrayOfInt1[1], arrayOfInt1[2]))) + Math.max(arrayOfInt2[3], Math.max(arrayOfInt2[0], Math.max(arrayOfInt2[1], arrayOfInt2[2])));
          }
          for (int i15 = Math.max(i1, i14);; i15 = i1)
          {
            if ((bool2) && ((i7 == -2147483648) || (i7 == 0)))
            {
              this.e = 0;
              int i55 = 0;
              if (i55 < i6)
              {
                View localView5 = getChildAt(i55);
                int i57;
                if (localView5 == null)
                {
                  this.e = this.e;
                  i57 = i55;
                }
                for (;;)
                {
                  i55 = i57 + 1;
                  break;
                  if (localView5.getVisibility() == 8)
                  {
                    i57 = i55;
                  }
                  else
                  {
                    aev localaev3 = (aev)localView5.getLayoutParams();
                    if (i11 != 0)
                    {
                      this.e += i12 + localaev3.leftMargin + localaev3.rightMargin;
                      i57 = i55;
                    }
                    else
                    {
                      int i56 = this.e;
                      this.e = Math.max(i56, i56 + i12 + localaev3.leftMargin + localaev3.rightMargin);
                      i57 = i55;
                    }
                  }
                }
              }
            }
            this.e += getPaddingLeft() + getPaddingRight();
            int i16 = Math.max(this.e, getSuggestedMinimumWidth());
            int i17 = nj.a.a(i16, paramInt1, 0);
            int i18 = (0xFFFFFF & i17) - this.e;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            View localView2;
            aev localaev2;
            int i50;
            View localView3;
            label1480:
            int i38;
            float f4;
            int i37;
            label1521:
            int i40;
            label1552:
            label1571:
            int i42;
            int i44;
            label1612:
            int i46;
            label1638:
            int i48;
            label1670:
            float f2;
            int i33;
            int i35;
            int i34;
            int i36;
            int i32;
            if ((i10 != 0) || ((i18 != 0) && (f1 > 0.0F)))
            {
              if (this.f > 0.0F) {
                f1 = this.f;
              }
              arrayOfInt1[3] = -1;
              arrayOfInt1[2] = -1;
              arrayOfInt1[1] = -1;
              arrayOfInt1[0] = -1;
              arrayOfInt2[3] = -1;
              arrayOfInt2[2] = -1;
              arrayOfInt2[1] = -1;
              arrayOfInt2[0] = -1;
              this.e = 0;
              i19 = 0;
              i20 = i5;
              i21 = i3;
              i22 = -1;
              i23 = i2;
              if (i19 < i6)
              {
                localView2 = getChildAt(i19);
                if ((localView2 == null) || (localView2.getVisibility() == 8)) {
                  break label2288;
                }
                localaev2 = (aev)localView2.getLayoutParams();
                float f3 = localaev2.g;
                if (f3 <= 0.0F) {
                  break label2273;
                }
                i50 = (int)(f3 * i18 / f1);
                float f5 = f1 - f3;
                int i51 = i18 - i50;
                int i52 = getChildMeasureSpec(paramInt2, getPaddingTop() + getPaddingBottom() + localaev2.topMargin + localaev2.bottomMargin, localaev2.height);
                if ((localaev2.width != 0) || (i7 != 1073741824))
                {
                  i50 += localView2.getMeasuredWidth();
                  if (i50 < 0) {
                    i50 = 0;
                  }
                  localView3 = localView2;
                  localView3.measure(View.MeasureSpec.makeMeasureSpec(i50, 1073741824), i52);
                  i38 = aab.a(i23, 0xFF000000 & nj.a.d(localView2));
                  f4 = f5;
                  i37 = i51;
                  if (i11 == 0) {
                    break label1793;
                  }
                  this.e += localView2.getMeasuredWidth() + localaev2.leftMargin + localaev2.rightMargin;
                  if ((i8 == 1073741824) || (localaev2.height != -1)) {
                    break label1831;
                  }
                  i40 = 1;
                  int i41 = localaev2.topMargin + localaev2.bottomMargin;
                  i42 = i41 + localView2.getMeasuredHeight();
                  int i43 = Math.max(i22, i42);
                  if (i40 == 0) {
                    break label1837;
                  }
                  i44 = i41;
                  int i45 = Math.max(i21, i44);
                  if ((i20 == 0) || (localaev2.height != -1)) {
                    break label1844;
                  }
                  i46 = 1;
                  if (bool1)
                  {
                    int i47 = localView2.getBaseline();
                    if (i47 != -1)
                    {
                      if (localaev2.h >= 0) {
                        break label1850;
                      }
                      i48 = this.d;
                      int i49 = (0xFFFFFFFE & (i48 & 0x70) >> 4) >> 1;
                      arrayOfInt1[i49] = Math.max(arrayOfInt1[i49], i47);
                      arrayOfInt2[i49] = Math.max(arrayOfInt2[i49], i42 - i47);
                    }
                  }
                  f2 = f4;
                  i33 = i45;
                  i35 = i38;
                  i34 = i46;
                  i36 = i43;
                  i32 = i37;
                }
              }
            }
            for (;;)
            {
              i19++;
              i20 = i34;
              i21 = i33;
              i22 = i36;
              i23 = i35;
              f1 = f2;
              i18 = i32;
              break;
              if (i50 > 0)
              {
                localView3 = localView2;
                break label1480;
              }
              localView3 = localView2;
              i50 = 0;
              break label1480;
              label1793:
              int i39 = this.e;
              this.e = Math.max(i39, i39 + localView2.getMeasuredWidth() + localaev2.leftMargin + localaev2.rightMargin);
              break label1552;
              label1831:
              i40 = 0;
              break label1571;
              label1837:
              i44 = i42;
              break label1612;
              label1844:
              i46 = 0;
              break label1638;
              label1850:
              i48 = localaev2.h;
              break label1670;
              this.e += getPaddingLeft() + getPaddingRight();
              if ((arrayOfInt1[1] != -1) || (arrayOfInt1[0] != -1) || (arrayOfInt1[2] != -1) || (arrayOfInt1[3] != -1)) {
                i22 = Math.max(i22, Math.max(arrayOfInt1[3], Math.max(arrayOfInt1[0], Math.max(arrayOfInt1[1], arrayOfInt1[2]))) + Math.max(arrayOfInt2[3], Math.max(arrayOfInt2[0], Math.max(arrayOfInt2[1], arrayOfInt2[2]))));
              }
              int i24 = i21;
              i2 = i23;
              int i25 = i22;
              i5 = i20;
              for (;;)
              {
                if ((i5 == 0) && (i8 != 1073741824)) {}
                int i53;
                for (;;)
                {
                  int i26 = Math.max(i24 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
                  int i27 = i17 | 0xFF000000 & i2;
                  int i28 = i2 << 16;
                  setMeasuredDimension(i27, nj.a.a(i26, paramInt2, i28));
                  if (i9 != 0)
                  {
                    int i29 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                    int i30 = 0;
                    while (i30 < i6)
                    {
                      View localView1 = getChildAt(i30);
                      if (localView1.getVisibility() != 8)
                      {
                        aev localaev1 = (aev)localView1.getLayoutParams();
                        if (localaev1.height == -1)
                        {
                          int i31 = localaev1.width;
                          localaev1.width = localView1.getMeasuredWidth();
                          measureChildWithMargins(localView1, paramInt1, 0, i29, 0);
                          localaev1.width = i31;
                        }
                      }
                      i30++;
                      continue;
                      i53 = Math.max(i3, i4);
                      if ((!bool2) || (i7 == 1073741824)) {
                        break label2262;
                      }
                      for (int i54 = 0; i54 < i6; i54++)
                      {
                        View localView4 = getChildAt(i54);
                        if ((localView4 != null) && (localView4.getVisibility() != 8) && (((aev)localView4.getLayoutParams()).g > 0.0F)) {
                          localView4.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(localView4.getMeasuredHeight(), 1073741824));
                        }
                      }
                    }
                  }
                  return;
                  i24 = i25;
                }
                label2262:
                i24 = i53;
                i25 = i15;
              }
              label2273:
              i37 = i18;
              i38 = i23;
              f4 = f1;
              break label1521;
              label2288:
              f2 = f1;
              i32 = i18;
              i33 = i21;
              i34 = i20;
              i35 = i23;
              i36 = i22;
            }
          }
          label2321:
          i63 = i9;
          i74 = 0;
          break label355;
        }
      }
      i72 = i12;
      i73 = i10;
      break label333;
      i58 = i12;
      i59 = i10;
      f6 = f1;
      i60 = i5;
      i61 = i4;
      i62 = i3;
      i63 = i9;
      i64 = i1;
      i65 = i2;
    }
  }
  
  private void b(Canvas paramCanvas, int paramInt)
  {
    this.l.setBounds(paramInt, getPaddingTop() + this.o, paramInt + this.i, getHeight() - getPaddingBottom() - this.o);
    this.l.draw(paramCanvas);
  }
  
  public aev a(AttributeSet paramAttributeSet)
  {
    return new aev(getContext(), paramAttributeSet);
  }
  
  public aev b(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new aev(paramLayoutParams);
  }
  
  public final void b(int paramInt)
  {
    if (this.d != paramInt) {
      if ((0x800007 & paramInt) != 0) {
        break label44;
      }
    }
    label44:
    for (int i1 = 0x800003 | paramInt;; i1 = paramInt)
    {
      if ((i1 & 0x70) == 0) {
        i1 |= 0x30;
      }
      this.d = i1;
      requestLayout();
      return;
    }
  }
  
  public aev c()
  {
    if (this.c == 0) {
      return new aev(-2, -2);
    }
    if (this.c == 1) {
      return new aev(-1, -2);
    }
    return null;
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof aev;
  }
  
  public int getBaseline()
  {
    int i1 = -1;
    if (this.a < 0) {
      i1 = super.getBaseline();
    }
    View localView;
    int i2;
    do
    {
      return i1;
      if (getChildCount() <= this.a) {
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
      }
      localView = getChildAt(this.a);
      i2 = localView.getBaseline();
      if (i2 != i1) {
        break;
      }
    } while (this.a == 0);
    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    int i3 = this.b;
    int i5;
    if (this.c == 1)
    {
      i5 = 0x70 & this.d;
      if (i5 == 48) {}
    }
    int i4;
    switch (i5)
    {
    default: 
      i4 = i3;
    }
    for (;;)
    {
      return i2 + (i4 + ((aev)localView.getLayoutParams()).topMargin);
      i4 = getBottom() - getTop() - getPaddingBottom() - this.e;
      continue;
      i4 = i3 + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - this.e) / 2;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.l == null) {}
    int i1;
    boolean bool;
    label266:
    do
    {
      int i5;
      do
      {
        return;
        if (this.c != 1) {
          break;
        }
        i5 = getChildCount();
        for (int i6 = 0; i6 < i5; i6++)
        {
          View localView4 = getChildAt(i6);
          if ((localView4 != null) && (localView4.getVisibility() != 8) && (a(i6)))
          {
            aev localaev4 = (aev)localView4.getLayoutParams();
            a(paramCanvas, localView4.getTop() - localaev4.topMargin - this.m);
          }
        }
      } while (!a(i5));
      View localView3 = getChildAt(i5 - 1);
      if (localView3 == null) {}
      aev localaev3;
      for (int i7 = getHeight() - getPaddingBottom() - this.m;; i7 = localView3.getBottom() + localaev3.bottomMargin)
      {
        a(paramCanvas, i7);
        return;
        localaev3 = (aev)localView3.getLayoutParams();
      }
      i1 = getChildCount();
      bool = aab.a(this);
      int i2 = 0;
      if (i2 < i1)
      {
        View localView2 = getChildAt(i2);
        aev localaev2;
        if ((localView2 != null) && (localView2.getVisibility() != 8) && (a(i2)))
        {
          localaev2 = (aev)localView2.getLayoutParams();
          if (!bool) {
            break label266;
          }
        }
        for (int i4 = localView2.getRight() + localaev2.rightMargin;; i4 = localView2.getLeft() - localaev2.leftMargin - this.i)
        {
          b(paramCanvas, i4);
          i2++;
          break;
        }
      }
    } while (!a(i1));
    View localView1 = getChildAt(i1 - 1);
    int i3;
    if (localView1 == null) {
      if (bool) {
        i3 = getPaddingLeft();
      }
    }
    for (;;)
    {
      b(paramCanvas, i3);
      return;
      i3 = getWidth() - getPaddingRight() - this.i;
      continue;
      aev localaev1 = (aev)localView1.getLayoutParams();
      if (bool) {
        i3 = localView1.getLeft() - localaev1.leftMargin - this.i;
      } else {
        i3 = localView1.getRight() + localaev1.rightMargin;
      }
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(aeu.class.getName());
    }
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(aeu.class.getName());
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i24;
    int i26;
    int i27;
    int i30;
    int i31;
    int i32;
    int i33;
    label109:
    View localView2;
    int i34;
    if (this.c == 1)
    {
      i24 = getPaddingLeft();
      int i25 = paramInt3 - paramInt1;
      i26 = i25 - getPaddingRight();
      i27 = i25 - i24 - getPaddingRight();
      int i28 = getChildCount();
      int i29 = 0x70 & this.d;
      i30 = 0x800007 & this.d;
      switch (i29)
      {
      default: 
        i31 = getPaddingTop();
        i32 = 0;
        i33 = i31;
        if (i32 < i28)
        {
          localView2 = getChildAt(i32);
          if (localView2 == null) {
            i34 = i32;
          }
        }
        break;
      }
    }
    for (;;)
    {
      i32 = i34 + 1;
      break label109;
      i31 = paramInt4 + getPaddingTop() - paramInt2 - this.e;
      break;
      i31 = getPaddingTop() + (paramInt4 - paramInt2 - this.e) / 2;
      break;
      if (localView2.getVisibility() != 8)
      {
        int i35 = localView2.getMeasuredWidth();
        int i36 = localView2.getMeasuredHeight();
        aev localaev2 = (aev)localView2.getLayoutParams();
        int i37 = localaev2.h;
        if (i37 < 0) {
          i37 = i30;
        }
        int i38 = nj.a.t(this);
        int i39;
        switch (0x7 & lt.a.a(i37, i38))
        {
        default: 
          i39 = i24 + localaev2.leftMargin;
        }
        for (;;)
        {
          if (a(i32)) {
            i33 += this.m;
          }
          int i40 = i33 + localaev2.topMargin;
          localView2.layout(i39, i40, i35 + i39, i40 + i36);
          i33 = i40 + (i36 + localaev2.bottomMargin);
          i34 = i32;
          break;
          i39 = i24 + (i27 - i35) / 2 + localaev2.leftMargin - localaev2.rightMargin;
          continue;
          i39 = i26 - i35 - localaev2.rightMargin;
        }
        boolean bool1 = aab.a(this);
        int i1 = getPaddingTop();
        int i2 = paramInt4 - paramInt2;
        int i3 = i2 - getPaddingBottom();
        int i4 = i2 - i1 - getPaddingBottom();
        int i5 = getChildCount();
        int i6 = 0x800007 & this.d;
        int i7 = 0x70 & this.d;
        boolean bool2 = this.g;
        int[] arrayOfInt1 = this.j;
        int[] arrayOfInt2 = this.k;
        int i8 = nj.a.t(this);
        int i9;
        int i11;
        int i10;
        switch (lt.a.a(i6, i8))
        {
        default: 
          i9 = getPaddingLeft();
          if (bool1)
          {
            i11 = i5 - 1;
            i10 = -1;
          }
          break;
        }
        for (;;)
        {
          int i12 = 0;
          label555:
          int i13;
          View localView1;
          int i14;
          if (i12 < i5)
          {
            i13 = i11 + i10 * i12;
            localView1 = getChildAt(i13);
            if (localView1 == null) {
              i14 = i12;
            }
          }
          for (;;)
          {
            i12 = i14 + 1;
            break label555;
            i9 = paramInt3 + getPaddingLeft() - paramInt1 - this.e;
            break;
            i9 = getPaddingLeft() + (paramInt3 - paramInt1 - this.e) / 2;
            break;
            if (localView1.getVisibility() != 8)
            {
              int i15 = localView1.getMeasuredWidth();
              int i16 = localView1.getMeasuredHeight();
              int i17 = -1;
              aev localaev1 = (aev)localView1.getLayoutParams();
              if ((bool2) && (localaev1.height != -1)) {
                i17 = localView1.getBaseline();
              }
              int i18 = localaev1.h;
              if (i18 < 0) {
                i18 = i7;
              }
              int i20;
              switch (i18 & 0x70)
              {
              default: 
                i20 = i1;
              }
              for (;;)
              {
                label756:
                if (a(i13)) {}
                int i19;
                for (int i21 = i9 + this.i;; i21 = i9)
                {
                  int i22 = i21 + localaev1.leftMargin;
                  localView1.layout(i22, i20, i22 + i15, i20 + i16);
                  i9 = i22 + (i15 + localaev1.rightMargin);
                  i14 = i12;
                  break;
                  i19 = i1 + localaev1.topMargin;
                  if (i17 == -1) {
                    break label933;
                  }
                  i20 = i19 + (arrayOfInt1[1] - i17);
                  break label756;
                  i20 = i1 + (i4 - i16) / 2 + localaev1.topMargin - localaev1.bottomMargin;
                  break label756;
                  i19 = i3 - i16 - localaev1.bottomMargin;
                  if (i17 == -1) {
                    break label933;
                  }
                  int i23 = localView1.getMeasuredHeight() - i17;
                  i20 = i19 - (arrayOfInt2[2] - i23);
                  break label756;
                  return;
                }
                label933:
                i20 = i19;
              }
            }
            i14 = i12;
          }
          i10 = 1;
          i11 = 0;
        }
      }
      i34 = i32;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    float f1;
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    boolean bool;
    int i12;
    int i13;
    int i53;
    float f6;
    int i59;
    int i60;
    label227:
    int i50;
    int i61;
    label439:
    int i62;
    int i63;
    int i64;
    int i52;
    int i66;
    label506:
    int i68;
    label525:
    float f5;
    int i47;
    int i49;
    int i46;
    int i51;
    int i48;
    int i45;
    if (this.c == 1)
    {
      this.e = 0;
      i1 = 0;
      i2 = 0;
      i3 = 0;
      i4 = 0;
      i5 = 1;
      f1 = 0.0F;
      i6 = getChildCount();
      i7 = View.MeasureSpec.getMode(paramInt1);
      i8 = View.MeasureSpec.getMode(paramInt2);
      i9 = 0;
      i10 = 0;
      int i11 = this.a;
      bool = this.h;
      i12 = -2147483648;
      i13 = 0;
      for (;;)
      {
        if (i13 < i6)
        {
          View localView5 = getChildAt(i13);
          if (localView5 == null)
          {
            this.e = this.e;
            i53 = i13;
            i13 = i53 + 1;
          }
          else
          {
            if (localView5.getVisibility() == 8) {
              break label1612;
            }
            if (a(i13)) {
              this.e += this.m;
            }
            aev localaev3 = (aev)localView5.getLayoutParams();
            f6 = f1 + localaev3.g;
            if ((i8 == 1073741824) && (localaev3.height == 0) && (localaev3.g > 0.0F))
            {
              int i71 = this.e;
              this.e = Math.max(i71, i71 + localaev3.topMargin + localaev3.bottomMargin);
              i59 = i12;
              i60 = 1;
              if ((i11 >= 0) && (i11 == i13 + 1)) {
                this.b = this.e;
              }
              if ((i13 < i11) && (localaev3.g > 0.0F)) {
                throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
              }
            }
            else
            {
              int i54 = -2147483648;
              if ((localaev3.height == 0) && (localaev3.g > 0.0F))
              {
                i54 = 0;
                localaev3.height = -2;
              }
              int i55 = i54;
              if (f6 == 0.0F) {}
              for (int i56 = this.e;; i56 = 0)
              {
                measureChildWithMargins(localView5, paramInt1, 0, paramInt2, i56);
                if (i55 != -2147483648) {
                  localaev3.height = i55;
                }
                int i57 = localView5.getMeasuredHeight();
                int i58 = this.e;
                this.e = Math.max(i58, i58 + i57 + localaev3.topMargin + localaev3.bottomMargin);
                if (!bool) {
                  break label1601;
                }
                i59 = Math.max(i57, i12);
                i60 = i10;
                break;
              }
            }
            if ((i7 == 1073741824) || (localaev3.width != -1)) {
              break label1591;
            }
            i50 = 1;
            i61 = 1;
            i62 = localaev3.leftMargin + localaev3.rightMargin;
            i63 = i62 + localView5.getMeasuredWidth();
            i64 = Math.max(i1, i63);
            int i65 = nj.a.d(localView5);
            i52 = aab.a(i2, i65);
            if ((i5 != 0) && (localaev3.width == -1))
            {
              i66 = 1;
              if (localaev3.g <= 0.0F) {
                break label621;
              }
              if (i61 == 0) {
                break label614;
              }
              i68 = i62;
              int i69 = Math.max(i4, i68);
              f5 = f6;
              i47 = i66;
              i49 = i3;
              i46 = i60;
              i51 = i64;
              int i70 = i59;
              i48 = i69;
              i45 = i70;
            }
          }
        }
      }
    }
    for (;;)
    {
      i10 = i46;
      i5 = i47;
      i4 = i48;
      i3 = i49;
      i2 = i52;
      i1 = i51;
      i9 = i50;
      i12 = i45;
      f1 = f5;
      i53 = i13;
      break;
      i66 = 0;
      break label506;
      label614:
      i68 = i63;
      break label525;
      label621:
      if (i61 != 0) {}
      for (;;)
      {
        int i67 = Math.max(i3, i62);
        f5 = f6;
        i47 = i66;
        i49 = i67;
        i46 = i60;
        i45 = i59;
        i48 = i4;
        i51 = i64;
        break;
        i62 = i63;
      }
      if ((this.e > 0) && (a(i6))) {
        this.e += this.m;
      }
      if ((bool) && ((i8 == -2147483648) || (i8 == 0)))
      {
        this.e = 0;
        int i42 = 0;
        if (i42 < i6)
        {
          View localView4 = getChildAt(i42);
          int i44;
          if (localView4 == null)
          {
            this.e = this.e;
            i44 = i42;
          }
          for (;;)
          {
            i42 = i44 + 1;
            break;
            if (localView4.getVisibility() == 8)
            {
              i44 = i42;
            }
            else
            {
              aev localaev2 = (aev)localView4.getLayoutParams();
              int i43 = this.e;
              this.e = Math.max(i43, i43 + i12 + localaev2.topMargin + localaev2.bottomMargin);
              i44 = i42;
            }
          }
        }
      }
      this.e += getPaddingTop() + getPaddingBottom();
      int i14 = Math.max(this.e, getSuggestedMinimumHeight());
      int i15 = nj.a.a(i14, paramInt2, 0);
      int i16 = (0xFFFFFF & i15) - this.e;
      int i17;
      int i18;
      int i19;
      int i20;
      int i21;
      View localView1;
      int i36;
      View localView2;
      label1089:
      int i28;
      int i29;
      float f2;
      label1134:
      int i30;
      int i31;
      int i33;
      label1185:
      label1190:
      int i25;
      label1216:
      int i26;
      int i27;
      if ((i10 != 0) || ((i16 != 0) && (f1 > 0.0F)))
      {
        if (this.f > 0.0F) {
          f1 = this.f;
        }
        this.e = 0;
        i17 = 0;
        i18 = i5;
        i19 = i3;
        i20 = i2;
        i21 = i1;
        if (i17 < i6)
        {
          localView1 = getChildAt(i17);
          if (localView1.getVisibility() == 8) {
            break label1564;
          }
          aev localaev1 = (aev)localView1.getLayoutParams();
          float f3 = localaev1.g;
          if (f3 <= 0.0F) {
            break label1549;
          }
          i36 = (int)(f3 * i16 / f1);
          float f4 = f1 - f3;
          int i37 = i16 - i36;
          int i38 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localaev1.leftMargin + localaev1.rightMargin, localaev1.width);
          if ((localaev1.height != 0) || (i8 != 1073741824))
          {
            i36 += localView1.getMeasuredHeight();
            if (i36 < 0) {
              i36 = 0;
            }
            localView2 = localView1;
            localView2.measure(i38, View.MeasureSpec.makeMeasureSpec(i36, 1073741824));
            int i39 = aab.a(i20, 0xFFFFFF00 & nj.a.d(localView1));
            i28 = i37;
            i29 = i39;
            f2 = f4;
            i30 = localaev1.leftMargin + localaev1.rightMargin;
            i31 = i30 + localView1.getMeasuredWidth();
            int i32 = Math.max(i21, i31);
            if ((i7 == 1073741824) || (localaev1.width != -1)) {
              break label1311;
            }
            i33 = 1;
            if (i33 == 0) {
              break label1317;
            }
            int i34 = Math.max(i19, i30);
            if ((i18 == 0) || (localaev1.width != -1)) {
              break label1324;
            }
            i25 = 1;
            int i35 = this.e;
            this.e = Math.max(i35, i35 + localView1.getMeasuredHeight() + localaev1.topMargin + localaev1.bottomMargin);
            i26 = i34;
            i27 = i32;
          }
        }
      }
      for (;;)
      {
        i17++;
        i18 = i25;
        i19 = i26;
        i20 = i29;
        i21 = i27;
        i16 = i28;
        f1 = f2;
        break;
        if (i36 > 0)
        {
          localView2 = localView1;
          break label1089;
        }
        localView2 = localView1;
        i36 = 0;
        break label1089;
        label1311:
        i33 = 0;
        break label1185;
        label1317:
        i30 = i31;
        break label1190;
        label1324:
        i25 = 0;
        break label1216;
        this.e += getPaddingTop() + getPaddingBottom();
        int i22 = i19;
        i2 = i20;
        int i23 = i21;
        i5 = i18;
        for (;;)
        {
          if ((i5 == 0) && (i7 != 1073741824)) {}
          int i40;
          for (;;)
          {
            int i24 = Math.max(i22 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth());
            setMeasuredDimension(nj.a.a(i24, paramInt1, i2), i15);
            if (i9 != 0) {
              a(i6, paramInt2);
            }
            return;
            i40 = Math.max(i3, i4);
            if ((!bool) || (i8 == 1073741824)) {
              break;
            }
            for (int i41 = 0; i41 < i6; i41++)
            {
              View localView3 = getChildAt(i41);
              if ((localView3 != null) && (localView3.getVisibility() != 8) && (((aev)localView3.getLayoutParams()).g > 0.0F)) {
                localView3.measure(View.MeasureSpec.makeMeasureSpec(localView3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
              }
            }
            b(paramInt1, paramInt2);
            return;
            i22 = i23;
          }
          i22 = i40;
          i23 = i1;
        }
        label1549:
        f2 = f1;
        i28 = i16;
        i29 = i20;
        break label1134;
        label1564:
        f2 = f1;
        i25 = i18;
        i26 = i19;
        i27 = i21;
        i28 = i16;
        i29 = i20;
      }
      label1591:
      i50 = i9;
      i61 = 0;
      break label439;
      label1601:
      i59 = i12;
      i60 = i10;
      break label227;
      label1612:
      i45 = i12;
      i46 = i10;
      f5 = f1;
      i47 = i5;
      i48 = i4;
      i49 = i3;
      i50 = i9;
      i51 = i1;
      i52 = i2;
    }
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aeu
 * JD-Core Version:    0.7.0.1
 */