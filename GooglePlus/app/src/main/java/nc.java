import android.database.DataSetObservable;
import android.view.View;
import android.view.ViewGroup;

public abstract class nc
{
  public DataSetObservable a = new DataSetObservable();
  
  public int a(Object paramObject)
  {
    return -1;
  }
  
  public Object a(View paramView, int paramInt)
  {
    throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
  }
  
  public Object a(ViewGroup paramViewGroup, int paramInt)
  {
    return a(paramViewGroup, paramInt);
  }
  
  public void a() {}
  
  public void a(int paramInt, Object paramObject) {}
  
  public void a(View paramView, int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException("Required method destroyItem was not overridden");
  }
  
  public void a(ViewGroup paramViewGroup)
  {
    c();
  }
  
  public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    a(paramViewGroup, paramInt, paramObject);
  }
  
  public abstract boolean a(View paramView, Object paramObject);
  
  public abstract int b();
  
  public CharSequence b(int paramInt)
  {
    return null;
  }
  
  public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    a(paramInt, paramObject);
  }
  
  public void c() {}
  
  public void d()
  {
    this.a.notifyChanged();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nc
 * JD-Core Version:    0.7.0.1
 */