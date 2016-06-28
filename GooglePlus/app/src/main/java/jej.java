import java.util.List;

public final class jej<T>
  implements jeo<T>
{
  final jep<T> a = new jep();
  final T b;
  boolean c;
  private final hue d;
  
  public jej(T paramT, hue paramhue)
  {
    this.b = paramT;
    this.d = paramhue;
  }
  
  public final void a()
  {
    
    if (!this.c)
    {
      this.c = true;
      this.d.a(new jel(this));
    }
  }
  
  public final void a(jer<? super T> paramjer)
  {
    efj.k();
    this.a.a.remove(paramjer);
  }
  
  public final void a(jer<? super T> paramjer, boolean paramBoolean)
  {
    efj.k();
    this.a.a(paramjer);
    if (paramBoolean) {
      this.d.a(new jek(this, paramjer));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jej
 * JD-Core Version:    0.7.0.1
 */