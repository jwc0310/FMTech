import java.util.Arrays;

public final class lyx
  extends lyv
{
  public lyx()
  {
    super(Arrays.asList(arrayOflyu));
  }
  
  public final lyu a(lyu paramlyu)
  {
    lyu locallyu = super.a(paramlyu);
    if (locallyu == lyu.c) {
      locallyu = lyu.b;
    }
    return locallyu;
  }
  
  public final lyu c(lyu paramlyu)
  {
    if (paramlyu == lyu.c) {
      paramlyu = lyu.d;
    }
    return paramlyu;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lyx
 * JD-Core Version:    0.7.0.1
 */