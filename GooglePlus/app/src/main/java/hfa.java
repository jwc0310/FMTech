import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class hfa
{
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public boolean g;
  public boolean h;
  
  public hfa(Context paramContext, int paramInt)
  {
    this(paramContext, ((git)mbb.a(paramContext, git.class)).c(), paramInt);
  }
  
  public hfa(Context paramContext, int paramInt1, int paramInt2)
  {
    a(paramContext, paramInt1);
    Object localObject;
    if (paramInt2 == loh.b)
    {
      localObject = this;
      ((hfa)localObject).h = i;
      DisplayMetrics localDisplayMetrics2 = efj.K(paramContext);
      a(paramContext, localDisplayMetrics2.widthPixels, localDisplayMetrics2.heightPixels);
      return;
    }
    if (paramInt2 == loh.c) {}
    for (hfa localhfa = this;; localhfa = this)
    {
      localObject = localhfa;
      i = 0;
      break;
      DisplayMetrics localDisplayMetrics1 = efj.K(paramContext);
      int j = (int)paramContext.getResources().getDimension(ehr.ef);
      int k = localDisplayMetrics1.widthPixels - j * 2;
      int m = (int)paramContext.getResources().getDimension(ehr.ee);
      if ((Math.max(i, 1 + (k - m) / (j + m)) == i) && (this.g))
      {
        localObject = this;
        break;
      }
    }
  }
  
  public hfa(Context paramContext, int paramInt1, int paramInt2, byte paramByte)
  {
    a(paramContext, paramInt1, paramInt2);
  }
  
  public int a()
  {
    return this.b;
  }
  
  public int a(int paramInt)
  {
    if (this.h) {
      return this.b;
    }
    return paramInt * (this.e + this.d) - this.d;
  }
  
  public void a(Context paramContext, int paramInt)
  {
    this.g = ((lln)mbb.a(paramContext, lln.class)).g(paramInt);
  }
  
  public void a(Context paramContext, int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    Resources localResources = paramContext.getResources();
    if (this.h)
    {
      this.a = 1;
      this.d = 0;
      this.e = this.b;
      this.f = 0;
      return;
    }
    this.f = ((int)localResources.getDimension(ehr.ef));
    this.b -= 2 * this.f;
    this.d = ((int)localResources.getDimension(ehr.ef));
    int i = (int)localResources.getDimension(ehr.ee);
    this.a = Math.max(1, 1 + (this.b - i) / (i + this.d));
    if (this.b < i) {}
    for (int j = this.b;; j = (this.b - (-1 + this.a) * this.d) / this.a)
    {
      this.e = j;
      return;
    }
  }
  
  public int b(int paramInt)
  {
    if (this.h) {}
    for (;;)
    {
      return 1;
      int i = (this.e + this.d) * this.a - this.d;
      for (int j = this.a; j >= 2; j--)
      {
        if (paramInt > i) {
          return j;
        }
        i -= this.e + this.d;
      }
    }
  }
  
  public boolean b()
  {
    return this.h;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfa
 * JD-Core Version:    0.7.0.1
 */