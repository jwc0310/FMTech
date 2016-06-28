import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class bbx<T>
  extends mca
{
  public bby<T> c;
  public boolean d;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return null;
  }
  
  public final void a(T paramT)
  {
    this.d = false;
    if (this.c != null) {
      this.c.a(this, paramT);
    }
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    this.d = v();
  }
  
  public boolean v()
  {
    return false;
  }
  
  public void w() {}
  
  public final void x()
  {
    this.d = false;
    if (this.c != null) {
      this.c.a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bbx
 * JD-Core Version:    0.7.0.1
 */