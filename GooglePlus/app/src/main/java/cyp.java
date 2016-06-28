import android.widget.ListAdapter;

public final class cyp
  extends dgi
{
  public cyp(ListAdapter paramListAdapter)
  {
    super(paramListAdapter);
  }
  
  protected final int a(int paramInt)
  {
    return paramInt + 1;
  }
  
  public final int getCount()
  {
    return Math.max(0, -1 + super.getCount());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cyp
 * JD-Core Version:    0.7.0.1
 */