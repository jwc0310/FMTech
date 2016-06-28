import java.io.Serializable;

public class dmx
  implements Serializable
{
  private static final long serialVersionUID = 8874316054258000122L;
  private String a;
  public int c;
  public Exception d;
  
  public dmx()
  {
    this(200, "Ok", null);
  }
  
  public dmx(int paramInt, String paramString, Exception paramException)
  {
    this.c = paramInt;
    this.a = paramString;
    this.d = paramException;
  }
  
  public dmx(kbw paramkbw)
  {
    this.c = paramkbw.o;
    this.a = paramkbw.p;
    this.d = paramkbw.q;
  }
  
  public dmx(boolean paramBoolean) {}
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.c);
    arrayOfObject[1] = this.a;
    arrayOfObject[2] = this.d;
    return String.format("ServiceResult(errorCode=%d, reasonPhrase=%s, exception=%s)", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dmx
 * JD-Core Version:    0.7.0.1
 */