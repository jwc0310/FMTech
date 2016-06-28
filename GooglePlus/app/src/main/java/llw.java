import android.text.TextUtils;

public final class llw
  extends mab
{
  public String a;
  public String b;
  public String c;
  public String d;
  public int e;
  public float f;
  public int g;
  public String h;
  public String i;
  public String j;
  public String k;
  public String l;
  public long m;
  
  public llw() {}
  
  public llw(qdm paramqdm, int paramInt, String paramString1, String paramString2, String paramString3, long paramLong)
  {
    this.a = paramqdm.b;
    StringBuilder localStringBuilder;
    if (paramqdm.d != null)
    {
      qea localqea = (qea)paramqdm.d.b(qea.a);
      if (localqea != null)
      {
        mfz localmfz = (mfz)mfx.a.get();
        localmfz.b = (1 + localmfz.b);
        if (localmfz.b != 1) {
          break label241;
        }
        localStringBuilder = localmfz.a;
        if (!TextUtils.isEmpty(localqea.c)) {
          localStringBuilder.append(localqea.c);
        }
        this.b = mfx.b(localStringBuilder);
        this.d = localqea.b;
      }
    }
    if (paramqdm.c != null) {
      this.c = paramqdm.c.a;
    }
    Float localFloat;
    float f1;
    if (paramqdm.g != null)
    {
      qcw localqcw = (qcw)paramqdm.g.b(qcw.a);
      if (localqcw != null)
      {
        this.e = efj.a(localqcw.b);
        localFloat = localqcw.c;
        f1 = 0.0F;
        if (localFloat != null) {
          break label256;
        }
      }
    }
    for (;;)
    {
      this.f = f1;
      this.g = paramInt;
      this.h = paramString1;
      this.i = paramqdm.e;
      this.j = paramqdm.f;
      this.k = paramString2;
      this.l = paramString3;
      this.m = paramLong;
      return;
      label241:
      localStringBuilder = new StringBuilder(256);
      break;
      label256:
      f1 = localFloat.floatValue();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     llw
 * JD-Core Version:    0.7.0.1
 */