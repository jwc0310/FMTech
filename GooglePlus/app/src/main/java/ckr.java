import java.util.HashSet;

final class ckr
  implements Runnable
{
  ckr(ckm paramckm, cw paramcw) {}
  
  public final void run()
  {
    if (!this.b.d()) {
      return;
    }
    this.b.u.add(Integer.valueOf(this.b.t));
    this.b.a.b(this.b.t, null, this.a);
    this.b.d(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ckr
 * JD-Core Version:    0.7.0.1
 */