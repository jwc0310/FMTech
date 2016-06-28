import android.content.Context;
import android.graphics.Canvas;
import java.text.DecimalFormat;

public class iqn
{
  iqh a;
  final Context b;
  iph c;
  String d;
  iqh e;
  iqh f;
  iqh g;
  
  public iqn(Context paramContext)
  {
    this.b = paramContext;
  }
  
  String a(iph paramiph, int paramInt1, int paramInt2)
  {
    String str2;
    if (this.d != null)
    {
      str2 = this.d;
      return str2;
    }
    String str1;
    if (paramiph.k != null) {
      str1 = paramiph.k;
    }
    for (;;)
    {
      str2 = null;
      if (str1 == null) {
        break;
      }
      int k = paramInt1 + paramInt2;
      str2 = null;
      if (k == 0) {
        break;
      }
      this.d = (26 + String.valueOf(str1).length() + paramInt1 + "x" + paramInt2 + " / " + str1);
      return this.d;
      int i = ife.b(paramiph.p);
      int j = paramiph.k();
      if (i + j == 0)
      {
        str1 = null;
      }
      else
      {
        paramiph.k = (23 + i + "x" + j);
        str1 = paramiph.k;
      }
    }
  }
  
  public void a()
  {
    if (this.e != null)
    {
      this.e.a(null);
      this.f.a(null);
      this.a.a(null);
      this.g.a(null);
    }
  }
  
  public void a(Canvas paramCanvas, int paramInt1, int paramInt2)
  {
    if (this.e == null) {
      return;
    }
    iqh localiqh1 = this.e;
    iph localiph1 = this.c;
    String str1;
    label50:
    iqh localiqh2;
    iph localiph2;
    int i;
    String str8;
    if (localiph1.i == null)
    {
      localiph1.i = localiph1.m();
      if (localiph1.i == null)
      {
        str1 = "unknown";
        localiqh1.a(str1);
        this.e.measure(0, 0);
        localiqh2 = this.f;
        localiph2 = this.c;
        if (localiph2.j != null) {
          break label545;
        }
        i = localiph2.h;
        if (i > 0) {
          break label435;
        }
        str8 = null;
        localiph2.j = str8;
        if (localiph2.j != null) {
          break label545;
        }
      }
    }
    iph localiph3;
    String str3;
    label545:
    for (String str2 = "unknown";; str2 = localiph2.j)
    {
      localiqh2.a(str2);
      this.f.measure(0, 0);
      this.a.a(a(this.c, paramInt1, paramInt2));
      this.a.measure(0, 0);
      iqh localiqh3 = this.g;
      localiph3 = this.c;
      if (localiph3.l != null) {
        break label634;
      }
      if (localiph3.g != null) {
        break label555;
      }
      String str6 = localiph3.f;
      str3 = null;
      if (str6 != null) {
        break label555;
      }
      localiqh3.a(str3);
      this.g.measure(0, 0);
      if ((this.e.getMeasuredHeight() > paramInt2) || (this.e.getMeasuredWidth() > paramInt1)) {
        break;
      }
      this.e.draw(paramCanvas);
      if (this.e.getMeasuredWidth() + this.a.getMeasuredWidth() <= paramInt1)
      {
        paramCanvas.save();
        paramCanvas.translate(paramInt1 - this.a.getMeasuredWidth(), 0.0F);
        this.a.draw(paramCanvas);
        paramCanvas.restore();
      }
      if ((this.e.getMeasuredHeight() + this.f.getMeasuredHeight() > paramInt2) || (this.f.getMeasuredWidth() > paramInt1)) {
        break;
      }
      paramCanvas.save();
      paramCanvas.translate(0.0F, paramInt2 - this.f.getMeasuredHeight());
      this.f.draw(paramCanvas);
      paramCanvas.restore();
      if (this.f.getMeasuredWidth() + this.g.getMeasuredWidth() > paramInt1) {
        break;
      }
      paramCanvas.save();
      paramCanvas.translate(paramInt1 - this.g.getMeasuredWidth(), paramInt2 - this.g.getMeasuredHeight());
      this.g.draw(paramCanvas);
      paramCanvas.restore();
      return;
      str1 = localiph1.i;
      break label50;
      label435:
      double d1;
      String str7;
      if (i > 1048576)
      {
        d1 = i / 1048576.0D;
        str7 = "MB";
      }
      for (;;)
      {
        if (ife.a == null) {
          ife.a = new DecimalFormat("@@@");
        }
        str8 = ife.a.format(d1) + ' ' + str7;
        break;
        if (i > 1024)
        {
          d1 = i / 1024.0D;
          str7 = "kB";
        }
        else
        {
          d1 = i;
          str7 = "B";
        }
      }
    }
    label555:
    if ((localiph3.g != null) && (localiph3.f != null))
    {
      String str4 = localiph3.g;
      String str5 = localiph3.f;
      localiph3.l = (1 + String.valueOf(str4).length() + String.valueOf(str5).length() + str4 + "/" + str5);
    }
    for (;;)
    {
      label634:
      str3 = localiph3.l;
      break;
      if (localiph3.f != null) {
        localiph3.l = localiph3.f;
      }
    }
  }
  
  public void a(iph paramiph)
  {
    if (this.e == null)
    {
      this.e = new iqh(this.b);
      this.f = new iqh(this.b);
      this.a = new iqh(this.b);
      this.g = new iqh(this.b);
    }
    this.c = paramiph;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iqn
 * JD-Core Version:    0.7.0.1
 */