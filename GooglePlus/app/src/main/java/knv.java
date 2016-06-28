import java.io.IOException;

public final class knv
  extends knq
{
  protected final void a(ooa paramooa)
  {
    super.a(paramooa);
    onz[] arrayOfonz = paramooa.e;
    if ((arrayOfonz == null) || (arrayOfonz.length == 0)) {
      throw new IOException("empty media item");
    }
    onz localonz = arrayOfonz[0];
    if (localonz.a == null) {
      throw new IOException("missing image object");
    }
    String str1 = String.valueOf("https:");
    String str2 = String.valueOf(localonz.a);
    if (str2.length() != 0) {
      str1.concat(str2);
    }
    for (;;)
    {
      mfx.a(paramooa.c);
      return;
      new String(str1);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     knv
 * JD-Core Version:    0.7.0.1
 */