import java.util.ArrayList;
import java.util.TimeZone;

public final class edw
{
  public int a = edu.a(this.i);
  public String b = edu.b(this.i);
  public String c = edu.c(this.i);
  public String d = edu.d(this.i);
  public int e = edu.e(this.i);
  public final x f;
  public final eyq g = new eyq();
  public boolean h = false;
  private ArrayList<Integer> j = null;
  
  public edw(edu paramedu, byte[] paramArrayOfByte)
  {
    this(paramedu, paramArrayOfByte, null);
  }
  
  private edw(edu paramedu, byte[] paramArrayOfByte, x paramx)
  {
    this.c = edu.c(paramedu);
    this.d = edu.d(paramedu);
    this.g.c = edu.f(paramedu).a();
    this.g.d = edu.f(paramedu).b();
    eyq localeyq = this.g;
    edu.g(paramedu);
    long l = this.g.c;
    localeyq.g = (TimeZone.getDefault().getOffset(l) / 1000);
    if (paramArrayOfByte != null) {
      this.g.f = paramArrayOfByte;
    }
    this.f = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     edw
 * JD-Core Version:    0.7.0.1
 */