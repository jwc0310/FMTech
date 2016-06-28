import java.util.Arrays;

public final class lpu
{
  public int a;
  public int b;
  public int c;
  public int[] d;
  
  public lpu(int paramInt)
  {
    this.d = new int[paramInt];
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("column=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", height=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", span=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", topMargins=");
    localStringBuilder.append(Arrays.toString(this.d));
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpu
 * JD-Core Version:    0.7.0.1
 */