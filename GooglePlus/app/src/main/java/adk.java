import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public final class adk
  extends Spinner
  implements ne
{
  static final boolean a;
  private static final boolean e;
  private static final int[] f;
  adn b;
  int c;
  final Rect d;
  private zv g;
  private adc h;
  private Context i;
  private afi j;
  private SpinnerAdapter k;
  private boolean l;
  
  static
  {
    boolean bool1;
    if (Build.VERSION.SDK_INT >= 23)
    {
      bool1 = true;
      a = bool1;
      if (Build.VERSION.SDK_INT < 16) {
        break label45;
      }
    }
    label45:
    for (boolean bool2 = true;; bool2 = false)
    {
      e = bool2;
      f = new int[] { 16843505 };
      return;
      bool1 = false;
      break;
    }
  }
  
  public adk(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, aau.ab);
  }
  
  public adk(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }
  
  private adk(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this(paramContext, paramAttributeSet, paramInt1, -1, null);
  }
  
  /* Error */
  private adk(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, android.content.res.Resources.Theme paramTheme)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aload_0
    //   4: aload_1
    //   5: aload_2
    //   6: iload_3
    //   7: invokespecial 61	android/widget/Spinner:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   10: aload_0
    //   11: new 63	android/graphics/Rect
    //   14: dup
    //   15: invokespecial 65	android/graphics/Rect:<init>	()V
    //   18: putfield 67	adk:d	Landroid/graphics/Rect;
    //   21: aload_1
    //   22: aload_2
    //   23: getstatic 72	wb:bo	[I
    //   26: iload_3
    //   27: iconst_0
    //   28: invokestatic 77	zw:a	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lzw;
    //   31: astore 7
    //   33: aload_0
    //   34: aload 7
    //   36: invokevirtual 80	zw:a	()Lzv;
    //   39: putfield 82	adk:g	Lzv;
    //   42: aload_0
    //   43: new 84	adc
    //   46: dup
    //   47: aload_0
    //   48: aload_0
    //   49: getfield 82	adk:g	Lzv;
    //   52: invokespecial 87	adc:<init>	(Landroid/view/View;Lzv;)V
    //   55: putfield 89	adk:h	Ladc;
    //   58: getstatic 92	wb:bs	I
    //   61: istore 8
    //   63: aload 7
    //   65: getfield 95	zw:a	Landroid/content/res/TypedArray;
    //   68: iload 8
    //   70: iconst_0
    //   71: invokevirtual 101	android/content/res/TypedArray:getResourceId	(II)I
    //   74: istore 9
    //   76: iload 9
    //   78: ifeq +264 -> 342
    //   81: new 103	wt
    //   84: dup
    //   85: aload_1
    //   86: iload 9
    //   88: invokespecial 106	wt:<init>	(Landroid/content/Context;I)V
    //   91: astore 10
    //   93: aload_0
    //   94: astore 11
    //   96: aload 11
    //   98: aload 10
    //   100: putfield 108	adk:i	Landroid/content/Context;
    //   103: aload_0
    //   104: getfield 108	adk:i	Landroid/content/Context;
    //   107: ifnull +192 -> 299
    //   110: iload 4
    //   112: iconst_m1
    //   113: if_icmpne +59 -> 172
    //   116: getstatic 35	android/os/Build$VERSION:SDK_INT	I
    //   119: bipush 11
    //   121: if_icmplt +278 -> 399
    //   124: aload_1
    //   125: aload_2
    //   126: getstatic 42	adk:f	[I
    //   129: iload_3
    //   130: iconst_0
    //   131: invokevirtual 114	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   134: astore 20
    //   136: aload 20
    //   138: astore 19
    //   140: aload 19
    //   142: iconst_0
    //   143: invokevirtual 118	android/content/res/TypedArray:hasValue	(I)Z
    //   146: ifeq +16 -> 162
    //   149: aload 19
    //   151: iconst_0
    //   152: iconst_0
    //   153: invokevirtual 121	android/content/res/TypedArray:getInt	(II)I
    //   156: istore 23
    //   158: iload 23
    //   160: istore 4
    //   162: aload 19
    //   164: ifnull +8 -> 172
    //   167: aload 19
    //   169: invokevirtual 124	android/content/res/TypedArray:recycle	()V
    //   172: iload 4
    //   174: iconst_1
    //   175: if_icmpne +124 -> 299
    //   178: new 126	adn
    //   181: dup
    //   182: aload_0
    //   183: aload_0
    //   184: getfield 108	adk:i	Landroid/content/Context;
    //   187: aload_2
    //   188: iload_3
    //   189: invokespecial 129	adn:<init>	(Ladk;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   192: astore 12
    //   194: aload_0
    //   195: getfield 108	adk:i	Landroid/content/Context;
    //   198: aload_2
    //   199: getstatic 72	wb:bo	[I
    //   202: iload_3
    //   203: iconst_0
    //   204: invokestatic 77	zw:a	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lzw;
    //   207: astore 13
    //   209: getstatic 132	wb:bp	I
    //   212: istore 14
    //   214: aload_0
    //   215: aload 13
    //   217: getfield 95	zw:a	Landroid/content/res/TypedArray;
    //   220: iload 14
    //   222: bipush 254
    //   224: invokevirtual 135	android/content/res/TypedArray:getLayoutDimension	(II)I
    //   227: putfield 137	adk:c	I
    //   230: aload 13
    //   232: getstatic 140	wb:bq	I
    //   235: invokevirtual 143	zw:a	(I)Landroid/graphics/drawable/Drawable;
    //   238: astore 15
    //   240: aload 12
    //   242: getfield 148	afe:e	Landroid/widget/PopupWindow;
    //   245: aload 15
    //   247: invokevirtual 154	android/widget/PopupWindow:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   250: getstatic 157	wb:br	I
    //   253: istore 16
    //   255: aload 12
    //   257: aload 7
    //   259: getfield 95	zw:a	Landroid/content/res/TypedArray;
    //   262: iload 16
    //   264: invokevirtual 161	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   267: putfield 164	adn:a	Ljava/lang/CharSequence;
    //   270: aload 13
    //   272: getfield 95	zw:a	Landroid/content/res/TypedArray;
    //   275: invokevirtual 124	android/content/res/TypedArray:recycle	()V
    //   278: aload_0
    //   279: aload 12
    //   281: putfield 166	adk:b	Ladn;
    //   284: aload_0
    //   285: new 168	adl
    //   288: dup
    //   289: aload_0
    //   290: aload_0
    //   291: aload 12
    //   293: invokespecial 171	adl:<init>	(Ladk;Landroid/view/View;Ladn;)V
    //   296: putfield 173	adk:j	Lafi;
    //   299: aload 7
    //   301: getfield 95	zw:a	Landroid/content/res/TypedArray;
    //   304: invokevirtual 124	android/content/res/TypedArray:recycle	()V
    //   307: aload_0
    //   308: iconst_1
    //   309: putfield 175	adk:l	Z
    //   312: aload_0
    //   313: getfield 177	adk:k	Landroid/widget/SpinnerAdapter;
    //   316: ifnull +16 -> 332
    //   319: aload_0
    //   320: aload_0
    //   321: getfield 177	adk:k	Landroid/widget/SpinnerAdapter;
    //   324: invokevirtual 181	adk:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   327: aload_0
    //   328: aconst_null
    //   329: putfield 177	adk:k	Landroid/widget/SpinnerAdapter;
    //   332: aload_0
    //   333: getfield 89	adk:h	Ladc;
    //   336: aload_2
    //   337: iload_3
    //   338: invokevirtual 184	adc:a	(Landroid/util/AttributeSet;I)V
    //   341: return
    //   342: getstatic 37	adk:a	Z
    //   345: ifne +12 -> 357
    //   348: aload_1
    //   349: astore 10
    //   351: aload_0
    //   352: astore 11
    //   354: goto -258 -> 96
    //   357: aload_0
    //   358: astore 11
    //   360: aconst_null
    //   361: astore 10
    //   363: goto -267 -> 96
    //   366: astore 18
    //   368: aconst_null
    //   369: astore 19
    //   371: aload 19
    //   373: ifnull -201 -> 172
    //   376: aload 19
    //   378: invokevirtual 124	android/content/res/TypedArray:recycle	()V
    //   381: goto -209 -> 172
    //   384: astore 17
    //   386: aload 6
    //   388: ifnull +8 -> 396
    //   391: aload 6
    //   393: invokevirtual 124	android/content/res/TypedArray:recycle	()V
    //   396: aload 17
    //   398: athrow
    //   399: iconst_1
    //   400: istore 4
    //   402: goto -230 -> 172
    //   405: astore 22
    //   407: aload 19
    //   409: astore 6
    //   411: aload 22
    //   413: astore 17
    //   415: goto -29 -> 386
    //   418: astore 21
    //   420: goto -49 -> 371
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	423	0	this	adk
    //   0	423	1	paramContext	Context
    //   0	423	2	paramAttributeSet	AttributeSet
    //   0	423	3	paramInt1	int
    //   0	423	4	paramInt2	int
    //   0	423	5	paramTheme	android.content.res.Resources.Theme
    //   1	409	6	localObject1	java.lang.Object
    //   31	269	7	localzw1	zw
    //   61	8	8	m	int
    //   74	13	9	n	int
    //   91	271	10	localObject2	java.lang.Object
    //   94	265	11	localadk	adk
    //   192	100	12	localadn	adn
    //   207	64	13	localzw2	zw
    //   212	9	14	i1	int
    //   238	8	15	localDrawable	Drawable
    //   253	10	16	i2	int
    //   384	13	17	localObject3	java.lang.Object
    //   413	1	17	localObject4	java.lang.Object
    //   366	1	18	localException1	java.lang.Exception
    //   138	270	19	localTypedArray1	android.content.res.TypedArray
    //   134	3	20	localTypedArray2	android.content.res.TypedArray
    //   418	1	21	localException2	java.lang.Exception
    //   405	7	22	localObject5	java.lang.Object
    //   156	3	23	i3	int
    // Exception table:
    //   from	to	target	type
    //   124	136	366	java/lang/Exception
    //   124	136	384	finally
    //   140	158	405	finally
    //   140	158	418	java/lang/Exception
  }
  
  final int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    if (paramSpinnerAdapter == null) {
      return 0;
    }
    int m = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int n = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int i1 = Math.max(0, getSelectedItemPosition());
    int i2 = Math.min(paramSpinnerAdapter.getCount(), i1 + 15);
    int i3 = Math.max(0, i1 - (15 - (i2 - i1)));
    View localView1 = null;
    int i4 = 0;
    int i5 = 0;
    int i6;
    if (i3 < i2)
    {
      i6 = paramSpinnerAdapter.getItemViewType(i3);
      if (i6 == i5) {
        break label206;
      }
    }
    for (View localView2 = null;; localView2 = localView1)
    {
      localView1 = paramSpinnerAdapter.getView(i3, localView2, this);
      if (localView1.getLayoutParams() == null) {
        localView1.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      }
      localView1.measure(m, n);
      i4 = Math.max(i4, localView1.getMeasuredWidth());
      i3++;
      i5 = i6;
      break;
      if (paramDrawable != null)
      {
        paramDrawable.getPadding(this.d);
        return i4 + (this.d.left + this.d.right);
      }
      return i4;
      label206:
      i6 = i5;
    }
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.h != null) {
      this.h.a();
    }
  }
  
  public final int getDropDownHorizontalOffset()
  {
    if (this.b != null) {
      return this.b.h;
    }
    if (e) {
      return super.getDropDownHorizontalOffset();
    }
    return 0;
  }
  
  public final int getDropDownVerticalOffset()
  {
    if (this.b != null)
    {
      localadn = this.b;
      if (localadn.j) {}
    }
    while (!e)
    {
      adn localadn;
      return 0;
      return localadn.i;
    }
    return super.getDropDownVerticalOffset();
  }
  
  public final int getDropDownWidth()
  {
    if (this.b != null) {
      return this.c;
    }
    if (e) {
      return super.getDropDownWidth();
    }
    return 0;
  }
  
  public final Drawable getPopupBackground()
  {
    if (this.b != null) {
      return this.b.e.getBackground();
    }
    if (e) {
      return super.getPopupBackground();
    }
    return null;
  }
  
  public final Context getPopupContext()
  {
    if (this.b != null) {
      return this.i;
    }
    if (a) {
      return super.getPopupContext();
    }
    return null;
  }
  
  public final CharSequence getPrompt()
  {
    if (this.b != null) {
      return this.b.a;
    }
    return super.getPrompt();
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.b != null) && (this.b.e.isShowing())) {
      this.b.c();
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.b != null) && (View.MeasureSpec.getMode(paramInt1) == -2147483648)) {
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.j != null) && (this.j.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public final boolean performClick()
  {
    if ((this.b != null) && (!this.b.e.isShowing()))
    {
      this.b.b();
      return true;
    }
    return super.performClick();
  }
  
  public final void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    if (!this.l) {
      this.k = paramSpinnerAdapter;
    }
    do
    {
      return;
      super.setAdapter(paramSpinnerAdapter);
    } while (this.b == null);
    if (this.i == null) {}
    for (Context localContext = getContext();; localContext = this.i)
    {
      this.b.a(new adm(paramSpinnerAdapter, localContext.getTheme()));
      return;
    }
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.h != null) {
      this.h.b(null);
    }
  }
  
  public final void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.h != null) {
      this.h.a(paramInt);
    }
  }
  
  public final void setDropDownHorizontalOffset(int paramInt)
  {
    if (this.b != null) {
      this.b.h = paramInt;
    }
    while (!e) {
      return;
    }
    super.setDropDownHorizontalOffset(paramInt);
  }
  
  public final void setDropDownVerticalOffset(int paramInt)
  {
    if (this.b != null)
    {
      localadn = this.b;
      localadn.i = paramInt;
      localadn.j = true;
    }
    while (!e)
    {
      adn localadn;
      return;
    }
    super.setDropDownVerticalOffset(paramInt);
  }
  
  public final void setDropDownWidth(int paramInt)
  {
    if (this.b != null) {
      this.c = paramInt;
    }
    while (!e) {
      return;
    }
    super.setDropDownWidth(paramInt);
  }
  
  public final void setPopupBackgroundDrawable(Drawable paramDrawable)
  {
    if (this.b != null) {
      this.b.e.setBackgroundDrawable(paramDrawable);
    }
    while (!e) {
      return;
    }
    super.setPopupBackgroundDrawable(paramDrawable);
  }
  
  public final void setPopupBackgroundResource(int paramInt)
  {
    setPopupBackgroundDrawable(getPopupContext().getDrawable(paramInt));
  }
  
  public final void setPrompt(CharSequence paramCharSequence)
  {
    if (this.b != null)
    {
      this.b.a = paramCharSequence;
      return;
    }
    super.setPrompt(paramCharSequence);
  }
  
  public final void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.h != null) {
      this.h.a(paramColorStateList);
    }
  }
  
  public final void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.h != null) {
      this.h.a(paramMode);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     adk
 * JD-Core Version:    0.7.0.1
 */