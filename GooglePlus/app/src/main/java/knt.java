import java.io.IOException;
import java.util.LinkedList;

public final class knt
  extends knq
{
  private LinkedList<String> f = new LinkedList();
  
  protected final void a(ooa paramooa)
  {
    super.a(paramooa);
    this.f.clear();
    onz[] arrayOfonz = paramooa.e;
    if ((arrayOfonz == null) || (arrayOfonz.length == 0)) {
      throw new IOException("empty media item");
    }
    int i = arrayOfonz.length;
    for (int j = 0; j < i; j++)
    {
      onz localonz = arrayOfonz[j];
      this.f.add(localonz.a);
    }
    mfx.a(paramooa.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     knt
 * JD-Core Version:    0.7.0.1
 */