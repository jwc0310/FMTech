import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;

public class hqi
  extends ra
{
  public hqi(Context paramContext, Cursor paramCursor)
  {
    super(paramContext, paramCursor, false);
  }
  
  public View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return null;
  }
  
  public void a(View paramView, Context paramContext, Cursor paramCursor) {}
  
  public void c() {}
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramInt >= getCount())
    {
      if (paramView == null) {
        paramView = a(this.d, this.c, paramViewGroup);
      }
      return paramView;
    }
    return super.getView(paramInt, paramView, paramViewGroup);
  }
  
  public boolean isEmpty()
  {
    if (this.c == null) {
      return true;
    }
    return super.isEmpty();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hqi
 * JD-Core Version:    0.7.0.1
 */