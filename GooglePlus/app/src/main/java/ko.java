import java.io.Writer;

public final class ko
  extends Writer
{
  private final String a;
  private StringBuilder b = new StringBuilder(128);
  
  public ko(String paramString)
  {
    this.a = paramString;
  }
  
  private final void a()
  {
    if (this.b.length() > 0) {
      this.b.delete(0, this.b.length());
    }
  }
  
  public final void close()
  {
    a();
  }
  
  public final void flush()
  {
    a();
  }
  
  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    if (i < paramInt2)
    {
      char c = paramArrayOfChar[(paramInt1 + i)];
      if (c == '\n') {
        a();
      }
      for (;;)
      {
        i++;
        break;
        this.b.append(c);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ko
 * JD-Core Version:    0.7.0.1
 */