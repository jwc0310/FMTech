import java.util.ArrayList;

public final class llv
  extends mab
{
  public String a;
  public ArrayList<String> b;
  public ArrayList<String> c;
  public ArrayList<String> d;
  public String e;
  public String f;
  public int g;
  public String h;
  public boolean i;
  public boolean j;
  
  public llv() {}
  
  public llv(qdg paramqdg)
  {
    if (paramqdg.d != null) {}
    for (this.a = paramqdg.d.a;; this.a = null)
    {
      this.b = new ArrayList();
      this.c = new ArrayList();
      this.d = new ArrayList();
      if (paramqdg.c == null) {
        break;
      }
      for (int m = 0; m < paramqdg.c.length; m++) {
        if ((paramqdg.c[m] != null) && (paramqdg.c[m].b(qdo.a) != null))
        {
          qdo localqdo = (qdo)paramqdg.c[m].b(qdo.a);
          this.b.add(localqdo.d);
          this.c.add(localqdo.c);
          this.d.add(localqdo.b);
        }
      }
    }
    this.e = paramqdg.f;
    this.g = paramqdg.e;
    this.f = paramqdg.b;
    boolean bool;
    if (paramqdg.h != null)
    {
      if (paramqdg.h.length == 0) {
        break label269;
      }
      bool = true;
      this.i = bool;
      if (this.i) {
        this.j = false;
      }
    }
    for (;;)
    {
      if (k < paramqdg.h.length)
      {
        if ("questions".equals(paramqdg.h[k])) {
          this.j = true;
        }
      }
      else
      {
        this.h = paramqdg.g;
        return;
        label269:
        bool = false;
        break;
      }
      k++;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     llv
 * JD-Core Version:    0.7.0.1
 */