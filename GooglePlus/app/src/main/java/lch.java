import android.os.CountDownTimer;
import android.widget.ListView;

final class lch
  extends CountDownTimer
{
  lch(lcg paramlcg, long paramLong1, long paramLong2)
  {
    super(9223372036854775807L, paramLong2);
  }
  
  public final void onFinish() {}
  
  public final void onTick(long paramLong)
  {
    this.a.a.post(new lci(this));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lch
 * JD-Core Version:    0.7.0.1
 */