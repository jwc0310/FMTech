import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import java.util.Calendar;
import java.util.TimeZone;

public final class dwi
  extends dvl
{
  public dwf j = new dwf(this);
  public hxj k;
  private boolean l;
  
  public dwi(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dwi(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dwi(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.i = false;
    setFocusable(true);
  }
  
  public final void D_()
  {
    super.D_();
    this.j.a();
    this.k = null;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    dwf localdwf = this.j;
    boolean bool1 = this.l;
    if ((localdwf.D == null) || (!localdwf.z)) {
      return 0;
    }
    localdwf.ad = bool1;
    int i = dwf.c;
    int m = i * 2;
    int n = dwf.d;
    int i1 = bqo.a(paramInt3);
    if (((localdwf.G.width() != paramInt3) || (localdwf.G.height() != i1) || (localdwf.G.top != paramInt2) || (localdwf.G.left != paramInt1)) && (localdwf.B != null)) {
      localdwf.G.set(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + i1);
    }
    int i2 = dwf.a;
    int i3 = paramInt1 + i;
    int i4 = paramInt2 + i1 - m;
    localdwf.H.a(i3, i4, i3 + i2, i4 + i2);
    int i5 = i + (i2 + i3);
    int i6 = paramInt2 + i1;
    int i7 = paramInt1 + paramInt3 - i5 - m;
    Context localContext = localdwf.D.getContext();
    int i14;
    int i18;
    qdj localqdj;
    int i19;
    label494:
    String str3;
    label589:
    int i24;
    if (!localdwf.A.g())
    {
      i14 = 0;
      int i15 = i + (i14 + i6);
      localdwf.R = localdwf.a(i5, i15, i7, localdwf.A.b(), localdwf.S, dwf.h, true);
      int i16 = i15 + localdwf.R.getHeight();
      if (localdwf.Z != null)
      {
        int i25 = i16 + n;
        localdwf.aa = localdwf.a(i5, i25, i7, localdwf.Z, localdwf.ab, dwf.i, false);
        i16 = i25 + localdwf.aa.getHeight();
      }
      int i17 = i16 + n;
      qdc localqdc = localdwf.A.i();
      TimeZone localTimeZone1 = null;
      if (localqdc != null)
      {
        String str7 = localqdc.c;
        localTimeZone1 = null;
        if (str7 != null) {
          localTimeZone1 = hxk.a(localqdc.c);
        }
      }
      Calendar localCalendar1 = Calendar.getInstance();
      boolean bool2 = efj.a(localCalendar1.getTimeInMillis(), localCalendar1.getTimeZone(), localqdc.b.longValue(), localTimeZone1, true);
      localdwf.T = localdwf.a(i5, i17, i7, efj.a(localdwf.D.getContext(), localqdc, false, null, bool2), localdwf.U, dwf.i, true);
      i18 = i17 + localdwf.T.getHeight();
      localqdj = localdwf.A.b;
      if (localqdj == null) {
        break label1350;
      }
      i19 = 1;
      Calendar localCalendar2 = Calendar.getInstance();
      localCalendar2.setTimeInMillis(localqdc.b.longValue());
      String str2 = localqdc.c;
      TimeZone localTimeZone2 = hxk.a(str2);
      TimeZone localTimeZone3 = localCalendar2.getTimeZone();
      if (localTimeZone2 == null) {
        break label1356;
      }
      long l1 = hxk.a(localTimeZone3, localCalendar2);
      long l2 = hxk.a(localTimeZone2, localCalendar2);
      if ((!hxk.a(localTimeZone2.getID(), str2)) || ((i19 == 0) && (l1 == l2))) {
        break label1356;
      }
      str3 = localTimeZone2.getDisplayName();
      if (str3 == null) {
        break label1400;
      }
      i24 = i18 + n;
      localdwf.V = localdwf.a(i5, i24, i7, str3, localdwf.W, dwf.i, true);
    }
    label941:
    label963:
    label1350:
    label1356:
    label1386:
    label1400:
    for (int i20 = i24 + localdwf.V.getHeight();; i20 = i18)
    {
      int i23;
      if (bqo.d(localqdj))
      {
        i23 = i20 + n;
        localdwf.ac = new dvr(localdwf.D.getContext(), null, dwf.x, dwf.n, dwf.w, dwf.w, null, i5, i23);
      }
      for (int i21 = i23 + localdwf.ac.a.height();; i21 = i20)
      {
        qdq localqdq = localdwf.A.l();
        mio localmio = localdwf.A.f().g;
        String str5;
        qea localqea;
        if (localqdq != null)
        {
          str5 = localqdq.b;
          if ((!TextUtils.isEmpty(str5)) || (localqdq.d == null)) {
            break label1386;
          }
          localqea = (qea)localqdq.d.b(qea.a);
          if (localqea == null) {
            break label1386;
          }
        }
        for (String str6 = localqea.c;; str6 = str5)
        {
          localdwf.P = dwf.r;
          String str4 = str6;
          for (;;)
          {
            if (str4 != null)
            {
              int i22 = i21 + n;
              localdwf.X = localdwf.ae.a(i5, i22, i7, 0, localdwf.P, localdwf.O, i, str4, localdwf.Y, dwf.i, true);
              i21 = i22 + localdwf.X.getHeight();
            }
            return i6 + (i21 - i6) - paramInt2;
            int i27;
            String str1;
            TextPaint localTextPaint;
            int i8;
            int i10;
            int i11;
            switch (bqo.a(localdwf.A))
            {
            case 5: 
            default: 
              if (!localdwf.C)
              {
                i27 = aau.cW;
                str1 = localContext.getString(i27);
                localTextPaint = dwf.j;
                localdwf.M = dwf.t;
                i8 = Math.round(dwf.b * localdwf.M.getHeight());
                int i9 = i6 - i8;
                localdwf.N.set(i5 + i7 - localdwf.M.getWidth(), i9, i5 + i7, i9 + localdwf.M.getHeight());
                i10 = i7 - localdwf.N.width() - i;
                localdwf.K = localdwf.ae.a(i5, i6 + i, i10, 0, localdwf.I, localdwf.J, i, str1, localdwf.L, localTextPaint, true);
                i11 = localdwf.L.y + localdwf.K.getHeight() - i6;
                if (localdwf.I == null) {
                  break label1344;
                }
              }
              break;
            }
            for (int i12 = localdwf.J.bottom - i6;; i12 = 0)
            {
              int i13 = i + (i6 + Math.max(i11, i12));
              localdwf.Q[0] = i5;
              localdwf.Q[1] = i13;
              localdwf.Q[2] = (i10 + i5);
              localdwf.Q[3] = i13;
              i14 = Math.max(i13 - i6, localdwf.N.height() - i8);
              break;
              if (!localdwf.C) {}
              for (int i26 = aau.cU;; i26 = aau.cV)
              {
                str1 = localContext.getString(i26);
                localTextPaint = dwf.m;
                localdwf.I = dwf.o;
                localdwf.M = dwf.u;
                break;
              }
              str1 = localContext.getString(aau.cT);
              localTextPaint = dwf.l;
              localdwf.I = dwf.p;
              localdwf.M = dwf.v;
              break label963;
              str1 = localContext.getString(aau.cY);
              localTextPaint = dwf.k;
              localdwf.I = dwf.q;
              localdwf.M = dwf.t;
              break label963;
              i27 = aau.cX;
              break label941;
            }
            i19 = 0;
            break label494;
            str3 = null;
            break label589;
            str4 = null;
            if (localmio != null)
            {
              str4 = dwf.y;
              localdwf.P = dwf.s;
            }
          }
        }
      }
    }
  }
  
  protected final int a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    dwf localdwf = this.j;
    int i = paramInt2 + (paramInt2 + paramInt4);
    if (localdwf.z)
    {
      if (localdwf.F != null)
      {
        Bitmap localBitmap2 = (Bitmap)localdwf.F.p;
        if ((localBitmap2 != null) && ((localdwf.G.bottom <= i) || (localdwf.ad))) {
          paramCanvas.drawBitmap(localBitmap2, null, localdwf.G, dwf.f);
        }
      }
      if ((localdwf.H != null) && ((localdwf.H.a.bottom <= i) || (localdwf.ad)))
      {
        Bitmap localBitmap1 = localdwf.H.d();
        if (localBitmap1 == null) {
          localBitmap1 = dwf.e;
        }
        paramCanvas.drawBitmap(localBitmap1, null, localdwf.H.a, dwf.f);
        if (localdwf.H.c) {
          localdwf.H.a(paramCanvas);
        }
      }
      if ((localdwf.K != null) && ((Math.max(localdwf.N.bottom, Math.max(localdwf.J.bottom, localdwf.L.y + localdwf.K.getHeight())) <= i) || (localdwf.ad)))
      {
        paramCanvas.drawBitmap(localdwf.M, null, localdwf.N, null);
        dwf.a(localdwf.K, localdwf.L, paramCanvas);
        if (localdwf.I != null) {
          paramCanvas.drawBitmap(localdwf.I, null, localdwf.J, null);
        }
        paramCanvas.drawLines(localdwf.Q, dwf.g);
      }
      if ((localdwf.S.y + localdwf.R.getHeight() <= i) || (localdwf.ad)) {
        dwf.a(localdwf.R, localdwf.S, paramCanvas);
      }
      int m = localdwf.U.y + localdwf.T.getHeight();
      if ((m <= i) || (localdwf.ad))
      {
        dwf.a(localdwf.T, localdwf.U, paramCanvas);
        paramInt2 = m;
      }
      if (localdwf.V != null)
      {
        int i3 = localdwf.W.y + localdwf.V.getHeight();
        if ((i3 <= i) || (localdwf.ad))
        {
          dwf.a(localdwf.V, localdwf.W, paramCanvas);
          paramInt2 = i3;
        }
      }
      if (localdwf.ac != null)
      {
        int i2 = localdwf.ac.a.bottom;
        if ((i2 <= i) || (localdwf.ad))
        {
          localdwf.ac.a(paramCanvas);
          paramInt2 = i2;
        }
      }
      if (localdwf.X != null)
      {
        int i1 = Math.max(localdwf.O.bottom, localdwf.X.getHeight() + localdwf.Y.y);
        if ((i1 <= i) || (localdwf.ad))
        {
          dwf.a(localdwf.X, localdwf.Y, paramCanvas);
          paramCanvas.drawBitmap(localdwf.P, null, localdwf.O, null);
          paramInt2 = i1;
        }
      }
      if (localdwf.Z != null)
      {
        int n = localdwf.ab.y + localdwf.aa.getHeight();
        if ((n <= i) || (localdwf.ad))
        {
          dwf.a(localdwf.aa, localdwf.ab, paramCanvas);
          paramInt2 = n;
        }
      }
    }
    return paramInt2;
  }
  
  protected final void d()
  {
    super.d();
    this.j.d();
  }
  
  protected final void e()
  {
    this.j.e();
    super.e();
  }
  
  public final CharSequence getContentDescription()
  {
    Resources localResources = getResources();
    StringBuilder localStringBuilder = new StringBuilder();
    CharSequence[] arrayOfCharSequence = new CharSequence[1];
    arrayOfCharSequence[0] = this.k.b();
    efj.a(localStringBuilder, arrayOfCharSequence);
    Context localContext = getContext();
    qdc localqdc = this.k.i();
    efj.q(localContext);
    long l1 = localqdc.b.longValue();
    efj.a(localStringBuilder, new CharSequence[] { String.format("%s %s", new Object[] { efj.b(localContext, l1), efj.c(localContext, l1) }) });
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(this.k.i().b.longValue());
    boolean bool = bqo.b(this.k);
    String str1 = this.k.i().c;
    TimeZone localTimeZone1 = hxk.a(str1);
    TimeZone localTimeZone2 = localCalendar.getTimeZone();
    String str2;
    qdq localqdq;
    String str4;
    label292:
    String str3;
    if (localTimeZone1 != null)
    {
      long l2 = hxk.a(localTimeZone2, localCalendar);
      long l3 = hxk.a(localTimeZone1, localCalendar);
      if ((hxk.a(localTimeZone1.getID(), str1)) && ((bool) || (l2 != l3)))
      {
        str2 = localTimeZone1.getDisplayName();
        efj.a(localStringBuilder, new CharSequence[] { str2 });
        localqdq = this.k.l();
        if ((localqdq != null) && (localqdq.d != null))
        {
          qea localqea = (qea)localqdq.d.b(qea.a);
          int i1 = aau.gx;
          Object[] arrayOfObject4 = new Object[1];
          if (localqea == null) {
            break label397;
          }
          str4 = localqea.c;
          arrayOfObject4[0] = str4;
          efj.a(localStringBuilder, new CharSequence[] { localResources.getString(i1, arrayOfObject4) });
        }
        switch (bqo.a(this.k))
        {
        case 5: 
        default: 
          str3 = localResources.getString(aau.cW);
        }
      }
    }
    for (;;)
    {
      efj.a(localStringBuilder, new CharSequence[] { str3 });
      return localStringBuilder.toString();
      str2 = null;
      break;
      label397:
      str4 = localqdq.b;
      break label292;
      int n = aau.gL;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = localResources.getString(aau.cU);
      str3 = localResources.getString(n, arrayOfObject3);
      continue;
      int m = aau.gL;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localResources.getString(aau.cT);
      str3 = localResources.getString(m, arrayOfObject2);
      continue;
      int i = aau.gL;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localResources.getString(aau.cY);
      str3 = localResources.getString(i, arrayOfObject1);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getSize(paramInt2);
    boolean bool;
    if (View.MeasureSpec.getMode(paramInt2) == 0)
    {
      bool = true;
      this.l = bool;
      if (!this.l) {
        break label122;
      }
    }
    label122:
    for (int n = i;; n = m)
    {
      int i1 = a(a, c, i - (a + b), n - (c + d));
      if (this.l) {
        n = i1 + c + d + e;
      }
      setMeasuredDimension(i, n);
      this.h.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
      return;
      bool = false;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwi
 * JD-Core Version:    0.7.0.1
 */