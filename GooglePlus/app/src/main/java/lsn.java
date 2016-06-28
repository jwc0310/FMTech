import java.io.Writer;

final class lsn
  extends Writer
{
  private StringBuilder a = new StringBuilder();
  
  private final void a()
  {
    if (this.a.length() > 0) {
      this.a.delete(0, this.a.length());
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
        this.a.append(c);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lsn
 * JD-Core Version:    0.7.0.1
 */