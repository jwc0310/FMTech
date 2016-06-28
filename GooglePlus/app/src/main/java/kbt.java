import java.io.IOException;

public final class kbt
  extends IOException
{
  public final int a;
  
  public kbt(int paramInt, String paramString)
  {
    super(13 + String.valueOf(paramString).length() + paramInt + ": " + paramString);
    this.a = paramInt;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kbt
 * JD-Core Version:    0.7.0.1
 */