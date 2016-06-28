import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.plus.settings.StreamSettingsActivity;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.stream.legacy.views.StreamAlbumViewGroup;

public final class dus
  extends eab
  implements gik, loi, lwq
{
  private llx V;
  private boolean W;
  private StreamAlbumViewGroup a;
  private boolean aa;
  private TextView ab;
  private boolean ac;
  private lwr ad;
  private llt b;
  
  public dus(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dus(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dus(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.C = -1;
    this.a = new StreamAlbumViewGroup(paramContext);
  }
  
  private final void a(Context paramContext)
  {
    if (this.ad != null)
    {
      ((git)mbb.b(paramContext).a(git.class)).c();
      if (!this.ad.b()) {
        break label54;
      }
    }
    label54:
    for (int i = aau.vU;; i = aau.vT)
    {
      this.ab.setText(paramContext.getString(i));
      return;
    }
  }
  
  protected final boolean C_()
  {
    return this.R != 2;
  }
  
  public final void D_()
  {
    super.D_();
    lwo.h(this.a);
    this.a.D_();
    this.b = null;
    this.V = null;
    this.C = -1;
    this.W = false;
    this.aa = false;
    this.ab = null;
    this.ac = false;
    this.ad = null;
  }
  
  public final void E_()
  {
    ((gil)mbb.a(getContext(), gil.class)).b(this);
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.B = paramInt1;
    this.C = paramInt2;
    int i = this.a.l;
    this.a.measure(View.MeasureSpec.makeMeasureSpec(paramInt3, 1073741824), View.MeasureSpec.makeMeasureSpec(i, 1073741824));
    int j = i + paramInt2;
    if (this.ab != null)
    {
      this.ab.measure(View.MeasureSpec.makeMeasureSpec(paramInt3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
      j += this.ab.getMeasuredHeight();
    }
    return j;
  }
  
  protected final int a(Canvas paramCanvas, int paramInt)
  {
    int i = paramInt + this.a.l;
    if (this.ab != null) {
      i += this.ab.getMeasuredHeight();
    }
    return i;
  }
  
  protected final void a(Cursor paramCursor)
  {
    long l = paramCursor.getLong(11);
    byte[] arrayOfByte = paramCursor.getBlob(26);
    if ((l & 0x40) != 0L)
    {
      this.b = llt.a(arrayOfByte);
      return;
    }
    this.V = llx.a(arrayOfByte);
  }
  
  protected final void a(StringBuilder paramStringBuilder)
  {
    Resources localResources = getResources();
    if (this.b != null)
    {
      i1 = this.b.a;
      i2 = 0;
      i3 = 0;
      i4 = 0;
      if (i2 < i1)
      {
        if (this.b.f[i2].m == ipm.d)
        {
          i7 = 1;
          label59:
          if (i7 == 0) {
            break label79;
          }
          i3++;
        }
        for (;;)
        {
          i2++;
          break;
          i7 = 0;
          break label59;
          label79:
          i4++;
        }
      }
      arrayOfCharSequence5 = new CharSequence[1];
      arrayOfCharSequence5[0] = this.b.e;
      efj.a(paramStringBuilder, arrayOfCharSequence5);
      if (i4 > 0)
      {
        arrayOfCharSequence7 = new CharSequence[1];
        i6 = efj.yc;
        arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = Integer.valueOf(i4);
        arrayOfCharSequence7[0] = localResources.getQuantityString(i6, i4, arrayOfObject5);
        efj.a(paramStringBuilder, arrayOfCharSequence7);
      }
      if (i3 > 0)
      {
        arrayOfCharSequence6 = new CharSequence[1];
        i5 = efj.xd;
        arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Integer.valueOf(i3);
        arrayOfCharSequence6[0] = localResources.getQuantityString(i5, i3, arrayOfObject4);
        efj.a(paramStringBuilder, arrayOfCharSequence6);
      }
    }
    while (this.V == null)
    {
      int i1;
      int i2;
      int i3;
      int i4;
      int i7;
      CharSequence[] arrayOfCharSequence5;
      CharSequence[] arrayOfCharSequence7;
      int i6;
      Object[] arrayOfObject5;
      CharSequence[] arrayOfCharSequence6;
      int i5;
      Object[] arrayOfObject4;
      return;
    }
    CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
    arrayOfCharSequence1[0] = this.V.a;
    efj.a(paramStringBuilder, arrayOfCharSequence1);
    if (this.V.m == ipm.b) {}
    for (int i = 1; i != 0; i = 0)
    {
      CharSequence[] arrayOfCharSequence4 = new CharSequence[1];
      int n = efj.yd;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(1);
      arrayOfCharSequence4[0] = localResources.getQuantityString(n, 1, arrayOfObject3);
      efj.a(paramStringBuilder, arrayOfCharSequence4);
      return;
    }
    if (this.V.m == ipm.d) {}
    for (int j = 1; j != 0; j = 0)
    {
      CharSequence[] arrayOfCharSequence3 = new CharSequence[1];
      int m = efj.xd;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(1);
      arrayOfCharSequence3[0] = localResources.getQuantityString(m, 1, arrayOfObject2);
      efj.a(paramStringBuilder, arrayOfCharSequence3);
      return;
    }
    CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
    int k = efj.yc;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(1);
    arrayOfCharSequence2[0] = localResources.getQuantityString(k, 1, arrayOfObject1);
    efj.a(paramStringBuilder, arrayOfCharSequence2);
  }
  
  protected final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    if (("TRUE".equalsIgnoreCase(dun.c.a())) && (this.H.aR >= 64)) {}
    for (int i = 1;; i = 0)
    {
      if ((i != 0) && (paramBoolean != this.W))
      {
        this.W = paramBoolean;
        if (this.a != null)
        {
          StreamAlbumViewGroup localStreamAlbumViewGroup = this.a;
          localStreamAlbumViewGroup.o = this.W;
          localStreamAlbumViewGroup.a(localStreamAlbumViewGroup.b(), localStreamAlbumViewGroup.o);
        }
      }
      return;
    }
  }
  
  public final boolean a(int paramInt)
  {
    int i = aaw.c;
    if (paramInt >= i)
    {
      int j = this.a.f;
      int k = paramInt - i;
      if ((k >= 0) && (k <= j - 1))
      {
        StreamAlbumViewGroup localStreamAlbumViewGroup = this.a;
        View localView2 = this.a.i.getView(k, null, null);
        if ((localView2 instanceof MediaView)) {}
        for (MediaView localMediaView = (MediaView)localView2;; localMediaView = null)
        {
          localStreamAlbumViewGroup.a(localMediaView);
          return true;
        }
      }
    }
    else if (paramInt == aaw.d)
    {
      View localView1 = this.a.h;
      if (localView1 != null)
      {
        this.a.a(localView1);
        return true;
      }
    }
    return super.a(paramInt);
  }
  
  protected final void a_(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    int i8;
    int i;
    int i9;
    int i10;
    if (this.b != null)
    {
      i8 = this.b.a;
      i = -2147483648;
      i9 = 0;
      if (i9 < i8)
      {
        i10 = this.b.f[i9].j;
        if (i10 <= i) {
          break label735;
        }
      }
    }
    for (;;)
    {
      i9++;
      i = i10;
      break;
      int j = i8;
      this.a.t = this;
      int k = Math.max(paramhfa.c, paramhfa.b);
      float f;
      if (i > k) {
        f = 1.0F * k / i;
      }
      label106:
      int m;
      for (;;)
      {
        if (this.b != null)
        {
          int i5 = 0;
          int i6 = 0;
          for (;;)
          {
            if (i5 < j)
            {
              int i7 = i6 + (int)(f * this.b.f[i5].i);
              i5++;
              i6 = i7;
              continue;
              i = this.V.j;
              j = 1;
              break;
              f = 1.0F;
              break label106;
            }
          }
          m = i6;
          if (j <= 1) {
            break label728;
          }
        }
      }
      label728:
      for (int n = (int)(0.9F * m);; n = m)
      {
        label228:
        int i1;
        Context localContext;
        boolean bool1;
        if (this.R == 1)
        {
          this.L = Math.min(2, paramhfa.a);
          this.K = this.L;
          i1 = a(paramhfa, this.K);
          removeView(this.a);
          localContext = getContext();
          bool1 = ((hyi)mbb.a(localContext, hyi.class)).b(bwb.b, q());
          if (this.b == null) {
            break label632;
          }
          StreamAlbumViewGroup localStreamAlbumViewGroup2 = this.a;
          llt localllt = this.b;
          int i4 = this.K;
          boolean bool4 = this.W;
          String str2 = this.N;
          boolean bool5 = this.r;
          localStreamAlbumViewGroup2.b = localllt;
          localStreamAlbumViewGroup2.f = localStreamAlbumViewGroup2.b.a;
          localStreamAlbumViewGroup2.g = i4;
          localStreamAlbumViewGroup2.o = bool4;
          localStreamAlbumViewGroup2.p = bool1;
          localStreamAlbumViewGroup2.q = str2;
          localStreamAlbumViewGroup2.r = bool5;
          localStreamAlbumViewGroup2.a(i1, k);
        }
        for (;;)
        {
          addView(this.a);
          if (this.R == 0)
          {
            this.ad = ((lwr)mbb.b(localContext, lwr.class));
            if ((this.ad != null) && (this.ad.c()))
            {
              Resources localResources = localContext.getResources();
              TextView localTextView = new TextView(localContext);
              localTextView.setTextAppearance(localContext, efj.yF);
              localTextView.setBackgroundColor(localResources.getColor(efj.ks));
              int i3 = localResources.getDimensionPixelSize(efj.on);
              localTextView.setPadding(i3, i3, i3, i3);
              localTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, efj.pK, 0);
              this.ab = localTextView;
              a(localContext);
              this.ab.setOnClickListener(this);
              addView(this.ab);
              if (!this.ac)
              {
                this.ac = true;
                gxx localgxx = (gxx)mbb.a(localContext, gxx.class);
                gxw localgxw = new gxw(localContext);
                localgxw.c = gxz.al;
                localgxx.a(localgxw);
              }
            }
          }
          return;
          m = (int)(f * this.V.i);
          break;
          this.L = paramhfa.b(n);
          this.K = Math.min(this.L, paramInt);
          break label228;
          label632:
          StreamAlbumViewGroup localStreamAlbumViewGroup1 = this.a;
          llx localllx = this.V;
          int i2 = this.K;
          boolean bool2 = this.W;
          String str1 = this.N;
          boolean bool3 = this.r;
          localStreamAlbumViewGroup1.d = localllx;
          localStreamAlbumViewGroup1.f = 1;
          localStreamAlbumViewGroup1.g = i2;
          localStreamAlbumViewGroup1.o = bool2;
          localStreamAlbumViewGroup1.p = bool1;
          localStreamAlbumViewGroup1.q = str1;
          localStreamAlbumViewGroup1.r = bool3;
          localStreamAlbumViewGroup1.a(i1, k);
        }
      }
      label735:
      i10 = i;
    }
  }
  
  public final void aw_()
  {
    if (this.ab != null) {
      a(getContext());
    }
  }
  
  public final void ax_() {}
  
  public final boolean f()
  {
    return this.R == 0;
  }
  
  public final la<Integer, String> g()
  {
    la localla = super.g();
    int i = aaw.c;
    int i2;
    int j;
    label39:
    jr localjr;
    String str1;
    label66:
    Resources localResources;
    String str3;
    String str4;
    label98:
    int k;
    label129:
    int m;
    label170:
    String str2;
    if (this.V != null) {
      if (this.V.m == ipm.b)
      {
        i2 = 1;
        if (i2 == 0) {
          break label219;
        }
        j = 1;
        localjr = jr.a();
        if ((this.V != null) && (this.V.a != null)) {
          break label224;
        }
        str1 = "";
        localResources = getResources();
        if (this.b != null)
        {
          str3 = this.b.e;
          if (str3 != null) {
            break label241;
          }
          str4 = "";
          localla.put(Integer.valueOf(aaw.d), localResources.getString(aau.aO, new Object[] { str4 }));
        }
        k = 0;
        if (k >= this.a.f) {
          return localla;
        }
        if (this.b == null) {
          break label259;
        }
        if (this.b.f[k].m != ipm.d) {
          break label253;
        }
        m = 1;
        if (j == 0) {
          break label284;
        }
        str2 = localResources.getString(aau.aU, new Object[] { str1 });
      }
    }
    for (;;)
    {
      localla.put(Integer.valueOf(i + k), str2);
      k++;
      break label129;
      i2 = 0;
      break;
      label219:
      j = 0;
      break label39;
      label224:
      str1 = localjr.a(this.V.a);
      break label66;
      label241:
      str4 = localjr.a(str3);
      break label98;
      label253:
      m = 0;
      break label170;
      label259:
      if (this.V.m == ipm.d)
      {
        m = 1;
        break label170;
      }
      m = 0;
      break label170;
      label284:
      if (m != 0)
      {
        int i1 = aau.aK;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(k + 1);
        str2 = localResources.getString(i1, arrayOfObject2);
      }
      else
      {
        int n = aau.aL;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(k + 1);
        str2 = localResources.getString(n, arrayOfObject1);
      }
    }
    return localla;
  }
  
  public final void onClick(View paramView)
  {
    if ((this.ab != null) && (paramView == this.ab))
    {
      Context localContext = getContext();
      int i = ((git)mbb.a(localContext, git.class)).c();
      Intent localIntent = new Intent(localContext, StreamSettingsActivity.class);
      localIntent.setAction("android.intent.action.VIEW");
      localIntent.putExtra("account_id", i);
      localContext.startActivity(localIntent);
      gxx localgxx = (gxx)mbb.a(localContext, gxx.class);
      gxw localgxw = new gxw(localContext);
      localgxw.c = gxz.am;
      localgxx.a(localgxw);
      return;
    }
    super.onClick(paramView);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i = this.a.l;
    if (this.C != -1)
    {
      i += this.C;
      if (this.C != i) {
        this.a.layout(this.B, this.C, this.B + this.a.getMeasuredWidth(), i);
      }
    }
    if (this.ab != null) {
      this.ab.layout(this.B, i, this.B + this.ab.getMeasuredWidth(), i + this.ab.getMeasuredHeight());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dus
 * JD-Core Version:    0.7.0.1
 */