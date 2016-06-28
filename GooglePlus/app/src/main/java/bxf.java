import java.util.Iterator;
import java.util.List;

public class bxf
{
  public boolean a;
  
  public bxf(bem parambem) {}
  
  public void a(int paramInt)
  {
    int i = 1;
    if ((paramInt == i) || (paramInt == 2)) {
      if (i != this.a) {
        break label26;
      }
    }
    for (;;)
    {
      return;
      i = 0;
      break;
      label26:
      this.a = i;
      if (this.a)
      {
        Iterator localIterator2 = this.b.c.iterator();
        while (localIterator2.hasNext()) {
          ((bex)localIterator2.next()).c();
        }
      }
      else
      {
        Iterator localIterator1 = this.b.c.iterator();
        while (localIterator1.hasNext()) {
          ((bex)localIterator1.next()).d();
        }
      }
    }
  }
  
  public boolean a()
  {
    return !this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxf
 * JD-Core Version:    0.7.0.1
 */