import android.view.ViewGroup.MarginLayoutParams;

public final class lpt
  extends ViewGroup.MarginLayoutParams
{
  public int a = 1;
  public int b = -1;
  public int c = -1;
  public long d;
  
  public lpt(int paramInt)
  {
    super(-1, paramInt);
    if (this.height == -1) {
      this.height = -2;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpt
 * JD-Core Version:    0.7.0.1
 */