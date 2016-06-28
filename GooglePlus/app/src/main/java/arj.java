import java.util.List;

public final class arj
{
  public final List<ari> a;
  public final ark b;
  public final arh c;
  public final float d;
  
  public arj(arh paramarh, List<ari> paramList, ark paramark, float paramFloat)
  {
    this.c = paramarh;
    this.a = paramList;
    this.b = paramark;
    this.d = paramFloat;
  }
  
  public final boolean a()
  {
    if (this.a == null) {
      return false;
    }
    int i = this.a.size();
    if (i > 0)
    {
      if (101 == ((ari)this.a.get(i - 1)).i) {}
      for (int j = 1; j != 0; j = 0) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean b()
  {
    return (a()) || (this.b.a);
  }
  
  public final int c()
  {
    int i;
    if (this.a != null)
    {
      i = this.a.size();
      if ((i <= 0) || (((ari)this.a.get(i - 1)).i == 101) || (!this.b.a)) {
        break label84;
      }
    }
    label84:
    for (int j = i + 1;; j = i)
    {
      if (this.b.b) {}
      for (int k = 1;; k = 0)
      {
        return j + k;
        i = 0;
        break;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     arj
 * JD-Core Version:    0.7.0.1
 */