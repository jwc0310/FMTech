import android.content.Context;
import android.util.Log;

public final class bkw
  extends cun<myd, mye>
{
  private final String a;
  private final String b;
  private final boolean c;
  private final String d;
  private final String e;
  
  public bkw(Context paramContext, int paramInt, long paramLong, String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    super(paramContext, paramInt, "photosplusone", new myd(), new mye());
    this.a = Long.toString(paramLong);
    this.b = paramString1;
    this.c = paramBoolean;
    this.d = paramString2;
    this.e = paramString3;
  }
  
  private final void a(boolean paramBoolean, oks paramoks)
  {
    byte[] arrayOfByte = jrf.a(this.j, this.h, this.d, this.e, false);
    if (arrayOfByte == null) {
      return;
    }
    for (;;)
    {
      ojf localojf;
      try
      {
        localojf = (ojf)qat.b(new ojf(), arrayOfByte, 0, arrayOfByte.length);
        if (paramoks != null)
        {
          localojf.q = paramoks;
          okn localokn = new okn();
          localokn.a = this.d;
          okm localokm = new okm();
          localokm.b = localojf;
          localokn.a(okm.a, localokm);
          jrf.a(this.j, this.h, localokn, 0);
          return;
        }
      }
      catch (qas localqas)
      {
        Log.e("HttpOperation", "Unable to parse Photo from byte array.", localqas);
        return;
      }
      paramoks = localojf.q;
      if (paramoks == null)
      {
        if (paramBoolean)
        {
          paramoks = new oks();
          paramoks.c = Boolean.valueOf(true);
          paramoks.e = Integer.valueOf(1);
        }
        else
        {
          paramoks = null;
        }
      }
      else if (paramBoolean)
      {
        paramoks.c = Boolean.valueOf(true);
        paramoks.e = Integer.valueOf(1 + paramoks.e.intValue());
      }
      else
      {
        paramoks.c = Boolean.valueOf(false);
        if (paramoks.e.intValue() > 0) {
          paramoks.e = Integer.valueOf(-1 + paramoks.e.intValue());
        }
      }
    }
  }
  
  public final void a()
  {
    a(this.c, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bkw
 * JD-Core Version:    0.7.0.1
 */